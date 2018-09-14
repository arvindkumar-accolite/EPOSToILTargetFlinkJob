package com.pru.constant;

import java.io.File;

public class IntegrationConstants {
	private IntegrationConstants() {

	}
	public static final String RESOURCE_PATH = "path";
	public static final String IL_TAG_CLNTNUM = "CLNTNUM";
	public static final String IL_TAG_CHDRSEL = "CHDRSEL";
	public static final String BOOTSTRAP_SERVER = "bootstrap.servers";
	public static final String ZOOKEEPER_CONNECT = "zookeeper.connect";
	public static final String GROUP_ID = "group.id";
	public static final String NEW_BUSS_PROPOSAL_TOPIC_NAME = "newbusiness.proposal.topic.name";
	public static final String FORMAT_LENGTH_2 = "%02d";
	public static final String CLTDOBX_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS";
	public static final String DATE_FORMAT_YYYYMMDD = "yyyyMMdd";
	public static final String CUSTOM_CONVERTER_ID = "createClientIdValue";
	public static final String IL_FIELD_CLTDOBX = "CLTDOBX";
	public static final String FOLDERNAME_XSL = "/xsl/";
	public static final String CLIENT_CREATE_REQUEST_PARAMETER_VALUE = "U";
	public static final String CLIENT_CREATE_REQUEST_PARAMETER_NAME = "COMPANY";
	public static final String NBS_XSLT_FILE_NAME = File.separator+"src"+File.separator+"main"+File.separator+"resources"+File.separator+"newbusiness-mapper"+File.separator+"newBusinessProposal.xsl";
	public static final String CLI_XSLT_FILE_NAME = File.separator+"src"+File.separator+"main"+File.separator+"resources"+File.separator+"client-mapper"+File.separator+"createClient.xsl";
	public static final String FLINK_KAFKA_CONFIG_LOCATION = File.separator+"src"+File.separator+"main"+File.separator+"resources"+File.separator+"flink-config"+File.separator+"flink-kafka-config.properties";
	public static final String CLIENT_URL = "http://10.163.177.100:9081/FSUWebSrv/CLIService";
	public static final String NEW_BUSINESS_URL = "http://10.163.177.100:9081/LiFEWebServices/NBSService";

	public static final String IL_CONFIG_PROP_LOCATION = File.separator+"src"+File.separator+"main"+File.separator+"resources"+File.separator+"il-config"+File.separator+"il-config.properties";
	public static final String PROPOSAL_TO_CLIENT_PROP_LOCATION = File.separator+"src"+File.separator+"main"+File.separator+"resources"+File.separator+"client-mapper"+File.separator+"proposal-to-client-mapping.properties";
	public static final String PROPOSAL_TO_NEWBIZMAPPING_PROP_LOCATION = File.separator+"src"+File.separator+"main"+File.separator+"resources"+File.separator+"newbusiness-mapper"+File.separator+"proposal-to-newbusiness-mapping.properties";

	public static final String PROPOSAL_TO_CLIENT_CUSTOM_PROP_LOCATION = File.separator+"src"+File.separator+"main"+File.separator+"resources"+File.separator+"client-mapper"+File.separator+"proposal-to-client-custom-mapping.properties";
	public static final String PROPOSAL_TO_NEWBIZMAPPING_CUSTOM_PROP_LOCATION = File.separator+"src"+File.separator+"main"+File.separator+"resources"+File.separator+"newbusiness-mapper"+File.separator+"proposal-to-newbusiness-custom-mapping.properties";
}
