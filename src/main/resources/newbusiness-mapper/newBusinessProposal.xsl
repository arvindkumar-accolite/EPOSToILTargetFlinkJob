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
	<xsl:template match="NBSCRTI_CONTRACT_HDR_DETAILS">
		<xsl:copy-of select="." />
		<DATIME>
			<DATIME />
		</DATIME>
	</xsl:template>
	<xsl:template match="NBSCRTI_LIVES">
		<xsl:copy-of select="." />
		<NBSCRTI_JOINT_LIVES>
			<JOINT_LIFE_ENTID />
			<JOINT_LIFE_PARENT />
			<JOINT_LIFE_PARTY />
			<ANBAGE>00</ANBAGE>
			<DOBN262675>
				<CCYY>9999</CCYY>
				<MM>99</MM>
				<DD>99</DD>
			</DOBN262675>
			<OCCUP />
			<RELATION />
			<SELECTION />
			<SEX />
			<SMOKING />
			<HEIGHT>170</HEIGHT>
			<WEIGHT>60</WEIGHT>
		</NBSCRTI_JOINT_LIVES>
	</xsl:template>
	<!-- <xsl:template match="RIDER_PARENT">
		<xsl:copy-of select="." />
		<COVR_MORTCLS></COVR_MORTCLS>
		<COVR_PCESSAGE>00</COVR_PCESSAGE>
		<COVR_PCESSTRM>00</COVR_PCESSTRM>
		<COVR_RCESSAGE>00</COVR_RCESSAGE>
		<COVR_RCESSTRM>00</COVR_RCESSTRM>
		<COVR_SUMIN>0</COVR_SUMIN>
		<COVR_INSTPRM>0</COVR_INSTPRM>
		<COVR_CRTABLE></COVR_CRTABLE>
	</xsl:template> -->
	<xsl:template match="FOLLOW_UPS_ENTID">
		<xsl:copy-of select="." />
		<ZDOCTOR />
		<NBSCRTI_FUPS>
			<FUPCDE />
			<FUPDT>
				<CCYY>9999</CCYY>
				<MM>99</MM>
				<DD>99</DD>
			</FUPDT>
			<FUPNO>0</FUPNO>
			<FUPSTS />
			<LIFENO>01</LIFENO>
			<JLIFENO>00</JLIFENO>
			<FUPTYPE />
		</NBSCRTI_FUPS>
	</xsl:template>
	<xsl:template match="NBSCRTI_PAYER_DETAILS">
		<xsl:copy-of select="." />
		<SPECIAL_TERMS>
			<!--1 to 16 repetitions: -->
			<NBSCRTI_SPECIAL_TERMS>
				<SPEC_TERMS_ENTID />
				<SPEC_TERMS_PARENT />
				<AGERATE>0</AGERATE>
				<ECESTRM>0</ECESTRM>
				<INSPRM>0</INSPRM>
				<OPCDA />
				<OPPC>0</OPPC>
				<REASIND />
				<SELECT />
			</NBSCRTI_SPECIAL_TERMS>
		</SPECIAL_TERMS>
		<NBSCRTI_FUND_DETAILS>
			<FUND_ENTID />
			<FUND_PARENT />
			<FNDSPL />
			<PRCAMTIND />
			<UALPRC01>0</UALPRC01>
			<UALPRC02>0</UALPRC02>
			<UALPRC03>0</UALPRC03>
			<UALPRC04>0</UALPRC04>
			<UALPRC05>0</UALPRC05>
			<UALPRC06>0</UALPRC06>
			<UALPRC07>0</UALPRC07>
			<UALPRC08>0</UALPRC08>
			<UALPRC09>0</UALPRC09>
			<UALPRC10>0</UALPRC10>
			<VRTFND01 />
			<VRTFND02 />
			<VRTFND03 />
			<VRTFND04 />
			<VRTFND05 />
			<VRTFND06 />
			<VRTFND07 />
			<VRTFND08 />
			<VRTFND09 />
			<VRTFND10 />
			<INTERATE01>0</INTERATE01>
			<MONTHS01>0</MONTHS01>
			<YRSINF01>0</YRSINF01>
			<INTERATE02>0</INTERATE02>
			<MONTHS02>0</MONTHS02>
			<YRSINF02>0</YRSINF02>
			<INTERATE03>0</INTERATE03>
			<MONTHS03>0</MONTHS03>
			<YRSINF03>0</YRSINF03>
			<INTERATE04>0</INTERATE04>
			<MONTHS04>0</MONTHS04>
			<YRSINF04>0</YRSINF04>
			<INTERATE05>0</INTERATE05>
			<MONTHS05>0</MONTHS05>
			<YRSINF05>0</YRSINF05>
			<INTERATE06>0</INTERATE06>
			<MONTHS06>0</MONTHS06>
			<YRSINF06>0</YRSINF06>
			<INTERATE07>0</INTERATE07>
			<MONTHS07>0</MONTHS07>
			<YRSINF07>0</YRSINF07>
			<INTERATE08>0</INTERATE08>
			<MONTHS08>0</MONTHS08>
			<YRSINF08>0</YRSINF08>
			<INTERATE09>0</INTERATE09>
			<MONTHS09>0</MONTHS09>
			<YRSINF09>0</YRSINF09>
			<INTERATE10>0</INTERATE10>
			<MONTHS10>0</MONTHS10>
			<YRSINF10>0</YRSINF10>
		</NBSCRTI_FUND_DETAILS>
	</xsl:template>
	<xsl:template match="TRANDATEX">
		<xsl:copy-of select="." />
		<SFL>
			<ENTITY />
			<ORIGAMT>0</ORIGAMT>
			<SACSCODE />
			<SACSTYPW />
		</SFL>
	</xsl:template>
	<xsl:template match="NBSCRTI_APPLY_CASH">
		<xsl:copy-of select="." />
		<!-- <NBSCRTI_QUESTION>
			<QUESTION_ENTID />
			<QUESTION_PARENT />
			<ANSWER />
		</NBSCRTI_QUESTION> -->
		<NBSCRTI_DOCTOR>
			<DOCTOR_ENTID />
			<DOCTOR_PARENT />
			<DOCTOR_PARTY />
			<DOCTTYPE />
		</NBSCRTI_DOCTOR>
	</xsl:template>
</xsl:stylesheet>