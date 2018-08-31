package com.prud.app.start;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;

import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.api.common.serialization.DeserializationSchema;
import org.apache.flink.api.common.serialization.SerializationSchema;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import org.apache.flink.api.java.typeutils.TypeExtractor;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.DataStreamUtils;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer010;

import com.prud.constant.IntegrationConstants;
import com.prud.service.ILService;
import com.prud.service.impl.ILServiceImpl;

public class NewBusinessProposalFlinkJob {
	static Properties propConfig;

	static {
		propConfig = new Properties();
		InputStream input = null;
		try {
			input = new FileInputStream(IntegrationConstants.FLINK_KAFKA_CONFIG_LOCATION);
			propConfig.load(input);
			input.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		System.out.println("kafka reader");
		StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
		env.setParallelism(1);
		Properties prop = new Properties();
		prop.setProperty(IntegrationConstants.BOOTSTRAP_SERVER, propConfig.getProperty(IntegrationConstants.BOOTSTRAP_SERVER));
		prop.setProperty(IntegrationConstants.ZOOKEEPER_CONNECT, propConfig.getProperty(IntegrationConstants.ZOOKEEPER_CONNECT));
		prop.setProperty(IntegrationConstants.GROUP_ID, propConfig.getProperty(IntegrationConstants.GROUP_ID));

		FlinkKafkaConsumer010<String> flinkKafkaConsumer = new FlinkKafkaConsumer010<>(
				propConfig.getProperty(IntegrationConstants.NEW_BUSS_PROPOSAL_TOPIC_NAME), new SimpleStringSchema(), prop);
		DataStream<String> messageStream = env.addSource(flinkKafkaConsumer);
		ILService iLService = new ILServiceImpl();;
		Iterator<String> myOutput = DataStreamUtils.collect(messageStream);
		String json;
		if (myOutput.hasNext()) {
			System.out.println("inside iterator");
			json = myOutput.next();
			System.out.println(json);
			iLService.serviceRequest(json);
		}

		env.execute();
		// messageStream.map(new MapFunction<String, String>() {
		// @Override
		// public String map(String value) throws Exception {
		// // TODO Auto-generated method stub
		// return null;
		// }
		// });
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
