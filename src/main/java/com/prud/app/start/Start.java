package com.prud.app.start;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.api.common.serialization.DeserializationSchema;
import org.apache.flink.api.common.serialization.SerializationSchema;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import org.apache.flink.api.java.typeutils.TypeExtractor;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer010;

import com.prud.constant.IntegrationConstants;

public class Start {
	static Properties propConfig;

	static {
		propConfig = new Properties();
		InputStream input = null;
		try {
			input = new FileInputStream(Object.class.getResource("/config.properties").getFile());
			propConfig.load(input);
			input.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.out.println("kafka reader");
		StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
		env.setParallelism(1);

		FlinkKafkaConsumer010<String> flinkKafkaConsumer = new FlinkKafkaConsumer010<>(IntegrationConstants.TOPIC_NAME,
				new SimpleStringSchema(), propConfig);
		DataStream<String> messageStream = env.addSource(flinkKafkaConsumer);
		messageStream.map(new MapFunction<String, String>() {
			@Override
			public String map(String value) throws Exception {
				// TODO Auto-generated method stub
				return null;
			}
		});
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
