<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="xml" indent="yes"
		omit-xml-declaration="yes"></xsl:output>
	<xsl:template match="/">
		<soapenv:Envelope
			xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/">
			<soapenv:Header />
			<soapenv:Body>
				<xsl:apply-templates />
			</soapenv:Body>
		</soapenv:Envelope>
	</xsl:template>
	<!-- standard copy template -->
	<xsl:template match="@*|node()">
		<xsl:copy>
			<xsl:apply-templates select="@*" />
			<xsl:apply-templates />
		</xsl:copy>
	</xsl:template>
	<xsl:template match="MM">
		<MM>
			<xsl:value-of select="format-number(.,'00')"></xsl:value-of>
		</MM>
	</xsl:template>
</xsl:stylesheet>