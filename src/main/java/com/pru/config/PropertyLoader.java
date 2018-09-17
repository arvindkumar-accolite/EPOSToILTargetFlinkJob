package com.pru.config;

import java.io.IOException;

import org.apache.flink.api.java.utils.ParameterTool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pru.constant.IntegrationConstants;

public class PropertyLoader {
	private final static Logger logger = LoggerFactory.getLogger(PropertyLoader.class);
	
	private static ParameterTool newBizProposalPropConfig;
	private static ParameterTool createClientPropConfig;
	private static ParameterTool ilPropConfig;
	private static ParameterTool newBizProposalCustomPropConfig;
	private static ParameterTool createClientCustomPropConfig;
	private static ParameterTool newBizProposalFlinkPropConfig;
	private static String basePath;

	public PropertyLoader(String path) {
		basePath = path;
		loadProperties(path);
	}

	private void loadProperties(String path) {
		logger.info("PropertyLoader start");
		try {
			newBizProposalFlinkPropConfig = ParameterTool
					.fromPropertiesFile(path + IntegrationConstants.FLINK_KAFKA_CONFIG_LOCATION);
			newBizProposalPropConfig = ParameterTool
					.fromPropertiesFile(path + IntegrationConstants.PROPOSAL_TO_NEWBIZMAPPING_PROP_LOCATION);
			createClientPropConfig = ParameterTool
					.fromPropertiesFile(path + IntegrationConstants.PROPOSAL_TO_CLIENT_PROP_LOCATION);
			ilPropConfig = ParameterTool.fromPropertiesFile(path + IntegrationConstants.IL_CONFIG_PROP_LOCATION);
			createClientCustomPropConfig = ParameterTool
					.fromPropertiesFile(path + IntegrationConstants.PROPOSAL_TO_CLIENT_CUSTOM_PROP_LOCATION);
			newBizProposalCustomPropConfig = ParameterTool
					.fromPropertiesFile(path + IntegrationConstants.PROPOSAL_TO_NEWBIZMAPPING_CUSTOM_PROP_LOCATION);
		} catch (IOException e) {
			logger.error("Error while loading property in PropertyLoader :: {}",e);
		}
		logger.info("PropertyLoader end");
	}

	/**
	 * @return the newBizProposalPropConfig
	 */
	public static ParameterTool getNewBizProposalPropConfig() {
		return newBizProposalPropConfig;
	}

	/**
	 * @return the createClientPropConfig
	 */
	public static ParameterTool getCreateClientPropConfig() {
		return createClientPropConfig;
	}

	/**
	 * @return the ilPropConfig
	 */
	public static ParameterTool getIlPropConfig() {
		return ilPropConfig;
	}

	/**
	 * @return the newBizProposalCustomPropConfig
	 */
	public static ParameterTool getNewBizProposalCustomPropConfig() {
		return newBizProposalCustomPropConfig;
	}

	/**
	 * @return the createClientCustomPropConfig
	 */
	public static ParameterTool getCreateClientCustomPropConfig() {
		return createClientCustomPropConfig;
	}

	/**
	 * @return the newBizProposalFlinkPropConfig
	 */
	public static ParameterTool getNewBizProposalFlinkPropConfig() {
		return newBizProposalFlinkPropConfig;
	}

	/**
	 * @return the basePath
	 */
	public static String getBasePath() {
		return basePath;
	}

}
