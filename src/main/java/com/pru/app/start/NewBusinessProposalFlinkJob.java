package com.pru.app.start;

import java.util.Properties;

import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.api.common.serialization.DeserializationSchema;
import org.apache.flink.api.common.serialization.SerializationSchema;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import org.apache.flink.api.java.typeutils.TypeExtractor;
import org.apache.flink.api.java.utils.ParameterTool;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.sink.PrintSinkFunction;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer010;
import org.apache.flink.util.Collector;

import com.pru.config.PropertyLoader;
import com.pru.constant.IntegrationConstants;
import com.pru.service.ILService;
import com.pru.service.impl.ILServiceImpl;

public class NewBusinessProposalFlinkJob {
	static ParameterTool flinkPropConfig;
	static String path;

	private static void loadPath(String[] args) {
		final ParameterTool params = ParameterTool.fromArgs(args);
		path = params.get(IntegrationConstants.RESOURCE_PATH);
	}

	public static void main(String[] args) throws Exception {
		System.out.println("kafka reader started");
		loadPath(args);
		new PropertyLoader(path);
		flinkPropConfig = PropertyLoader.getNewBizProposalFlinkPropConfig();
		StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
		env.setParallelism(1);
		Properties prop = new Properties();
		prop.setProperty(IntegrationConstants.BOOTSTRAP_SERVER,
				flinkPropConfig.get(IntegrationConstants.BOOTSTRAP_SERVER));
		prop.setProperty(IntegrationConstants.ZOOKEEPER_CONNECT,
				flinkPropConfig.get(IntegrationConstants.ZOOKEEPER_CONNECT));
		prop.setProperty(IntegrationConstants.GROUP_ID, flinkPropConfig.get(IntegrationConstants.GROUP_ID));
		FlinkKafkaConsumer010<String> flinkKafkaConsumer = new FlinkKafkaConsumer010<>(
				flinkPropConfig.get(IntegrationConstants.NEW_BUSS_PROPOSAL_TOPIC_NAME), new SimpleStringSchema(), prop);
		DataStream<String> messageStream = env.addSource(flinkKafkaConsumer);
		messageStream.flatMap(new FlatMapFunction<String, String>() {
			@Override
			public void flatMap(String value, Collector<String> out) throws Exception {
				ILService iLService = new ILServiceImpl();
				out.collect(iLService.serviceRequest(value));
			}
		}).addSink(new PrintSinkFunction<>());
		env.execute();
	}

	public static class SimpleStringSchema implements DeserializationSchema<String>, SerializationSchema<String> {
		private static final long serialVersionUID = 1L;

		public SimpleStringSchema() {
		}

		public String deserialize(byte[] message) {
			return new String(message);
		}

		public boolean isEndOfStream(String nextElement) {
			return false;
		}

		public byte[] serialize(String element) {
			return element.getBytes();
		}

		public TypeInformation<String> getProducedType() {
			return TypeExtractor.getForClass(String.class);
		}

	}
}
