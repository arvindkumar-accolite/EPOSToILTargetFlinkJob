package com.prud.constant;

public class IntegrationConstants {
	private IntegrationConstants() {

	}
	public static final String BOOTSTRAP_SERVER = "bootstrap.servers";
	public static final String ZOOKEEPER_CONNECT = "zookeeper.connect";
	public static final String GROUP_ID = "group.id";
	public static final String TOPIC_NAME = "topic.name";
	
	public static final String CLTDOBX_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS";
	public static final String OPERATION_NAME_CONTRYNAME = "CountryName";
	public static final String OPERATION_NAMESPACE_COUNTRYINFO = "http://www.oorsprong.org/websamples.countryinfo";
	public static final String URL_COUNTRY_NAME = "cxf:bean:serviceEndpoint?defaultOperationName=CountryName";
	public static final String CUSTOM_CONVERTER_ID = "createClientIdValue";
	public static final String IL_FIELD_CLTDOBX = "CLTDOBX";
	public static final String EPOS_FIELD_DATE_OF_BIRTH = "dateOfBirth";
	public static final String FOLDERNAME_XSL = "/xsl/";
	public static final String CLIENT_CREATE_REQUEST_PARAMETER_VALUE = "U";
	public static final String CLIENT_CREATE_REQUEST_PARAMETER_NAME = "COMPANY";
	public static final String XSLT_FILE_NAME = "createclient.xsl";
}
