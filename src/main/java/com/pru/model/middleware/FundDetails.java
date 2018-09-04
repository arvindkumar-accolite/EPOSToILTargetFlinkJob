
package com.pru.model.middleware;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fundId",
    "fundParent",
    "virtualFundSplitMethod",
    "percentageOfAmountIndicator",
    "amount01",
    "amount02",
    "amount03",
    "amount04",
    "amount05",
    "amount06",
    "amount07",
    "amount08",
    "amount09",
    "amount10",
    "unitLinkedFund01",
    "unitLinkedFund02",
    "unitLinkedFund03",
    "unitLinkedFund04",
    "unitLinkedFund05",
    "unitLinkedFund06",
    "unitLinkedFund07",
    "unitLinkedFund08",
    "unitLinkedFund09",
    "unitLinkedFund10",
    "interateRate01",
    "renewalMonths01",
    "yearsInForce01",
    "interateRate02",
    "renewalMonths02",
    "yearsInForce02",
    "interateRate03",
    "renewalMonths03",
    "yearsInForce03",
    "interateRate04",
    "renewalMonths04",
    "yearsInForce04",
    "interateRate05",
    "renewalMonths05",
    "yearsInForce05",
    "interateRate06",
    "renewalMonths06",
    "yearsInForce06",
    "interateRate07",
    "renewalMonths07",
    "yearsInForce07",
    "interateRate08",
    "renewalMonths08",
    "yearsInForce08",
    "interateRate09",
    "renewalMonths09",
    "yearsInForce09",
    "interateRate10",
    "renewalMonths10",
    "yearsInForce10"
})
public class FundDetails {

    @JsonProperty("fundId")
    private String fundId;
    @JsonProperty("fundParent")
    private String fundParent;
    @JsonProperty("virtualFundSplitMethod")
    private String virtualFundSplitMethod;
    @JsonProperty("percentageOfAmountIndicator")
    private String percentageOfAmountIndicator;
    @JsonProperty("amount01")
    private BigDecimal amount01;
    @JsonProperty("amount02")
    private BigDecimal amount02;
    @JsonProperty("amount03")
    private BigDecimal amount03;
    @JsonProperty("amount04")
    private BigDecimal amount04;
    @JsonProperty("amount05")
    private BigDecimal amount05;
    @JsonProperty("amount06")
    private BigDecimal amount06;
    @JsonProperty("amount07")
    private BigDecimal amount07;
    @JsonProperty("amount08")
    private BigDecimal amount08;
    @JsonProperty("amount09")
    private BigDecimal amount09;
    @JsonProperty("amount10")
    private BigDecimal amount10;
    @JsonProperty("unitLinkedFund01")
    private String unitLinkedFund01;
    @JsonProperty("unitLinkedFund02")
    private String unitLinkedFund02;
    @JsonProperty("unitLinkedFund03")
    private String unitLinkedFund03;
    @JsonProperty("unitLinkedFund04")
    private String unitLinkedFund04;
    @JsonProperty("unitLinkedFund05")
    private String unitLinkedFund05;
    @JsonProperty("unitLinkedFund06")
    private String unitLinkedFund06;
    @JsonProperty("unitLinkedFund07")
    private String unitLinkedFund07;
    @JsonProperty("unitLinkedFund08")
    private String unitLinkedFund08;
    @JsonProperty("unitLinkedFund09")
    private String unitLinkedFund09;
    @JsonProperty("unitLinkedFund10")
    private String unitLinkedFund10;
    @JsonProperty("interateRate01")
    private BigDecimal interateRate01;
    @JsonProperty("renewalMonths01")
    private BigInteger renewalMonths01;
    @JsonProperty("yearsInForce01")
    private BigInteger yearsInForce01;
    @JsonProperty("interateRate02")
    private BigDecimal interateRate02;
    @JsonProperty("renewalMonths02")
    private BigInteger renewalMonths02;
    @JsonProperty("yearsInForce02")
    private BigInteger yearsInForce02;
    @JsonProperty("interateRate03")
    private BigDecimal interateRate03;
    @JsonProperty("renewalMonths03")
    private BigInteger renewalMonths03;
    @JsonProperty("yearsInForce03")
    private BigInteger yearsInForce03;
    @JsonProperty("interateRate04")
    private BigDecimal interateRate04;
    @JsonProperty("renewalMonths04")
    private BigInteger renewalMonths04;
    @JsonProperty("yearsInForce04")
    private BigInteger yearsInForce04;
    @JsonProperty("interateRate05")
    private BigDecimal interateRate05;
    @JsonProperty("renewalMonths05")
    private BigInteger renewalMonths05;
    @JsonProperty("yearsInForce05")
    private BigInteger yearsInForce05;
    @JsonProperty("interateRate06")
    private BigDecimal interateRate06;
    @JsonProperty("renewalMonths06")
    private BigInteger renewalMonths06;
    @JsonProperty("yearsInForce06")
    private BigInteger yearsInForce06;
    @JsonProperty("interateRate07")
    private BigDecimal interateRate07;
    @JsonProperty("renewalMonths07")
    private BigInteger renewalMonths07;
    @JsonProperty("yearsInForce07")
    private BigInteger yearsInForce07;
    @JsonProperty("interateRate08")
    private BigDecimal interateRate08;
    @JsonProperty("renewalMonths08")
    private BigInteger renewalMonths08;
    @JsonProperty("yearsInForce08")
    private BigInteger yearsInForce08;
    @JsonProperty("interateRate09")
    private BigDecimal interateRate09;
    @JsonProperty("renewalMonths09")
    private BigInteger renewalMonths09;
    @JsonProperty("yearsInForce09")
    private BigInteger yearsInForce09;
    @JsonProperty("interateRate10")
    private BigDecimal interateRate10;
    @JsonProperty("renewalMonths10")
    private BigInteger renewalMonths10;
    @JsonProperty("yearsInForce10")
    private BigInteger yearsInForce10;
    
    @JsonProperty("fundId")
    public String getFundId() {
        return fundId;
    }

    @JsonProperty("fundId")
    public void setFundId(String fundId) {
        this.fundId = fundId;
    }

    @JsonProperty("fundParent")
    public String getFundParent() {
        return fundParent;
    }

    @JsonProperty("fundParent")
    public void setFundParent(String fundParent) {
        this.fundParent = fundParent;
    }

    @JsonProperty("virtualFundSplitMethod")
    public String getVirtualFundSplitMethod() {
        return virtualFundSplitMethod;
    }

    @JsonProperty("virtualFundSplitMethod")
    public void setVirtualFundSplitMethod(String virtualFundSplitMethod) {
        this.virtualFundSplitMethod = virtualFundSplitMethod;
    }

    @JsonProperty("percentageOfAmountIndicator")
    public String getPercentageOfAmountIndicator() {
        return percentageOfAmountIndicator;
    }

    @JsonProperty("percentageOfAmountIndicator")
    public void setPercentageOfAmountIndicator(String percentageOfAmountIndicator) {
        this.percentageOfAmountIndicator = percentageOfAmountIndicator;
    }

    @JsonProperty("amount01")
    public BigDecimal getAmount01() {
        return amount01;
    }

    @JsonProperty("amount01")
    public void setAmount01(BigDecimal amount01) {
        this.amount01 = amount01;
    }

    @JsonProperty("amount02")
    public BigDecimal getAmount02() {
        return amount02;
    }

    @JsonProperty("amount02")
    public void setAmount02(BigDecimal amount02) {
        this.amount02 = amount02;
    }

    @JsonProperty("amount03")
    public BigDecimal getAmount03() {
        return amount03;
    }

    @JsonProperty("amount03")
    public void setAmount03(BigDecimal amount03) {
        this.amount03 = amount03;
    }

    @JsonProperty("amount04")
    public BigDecimal getAmount04() {
        return amount04;
    }

    @JsonProperty("amount04")
    public void setAmount04(BigDecimal amount04) {
        this.amount04 = amount04;
    }

    @JsonProperty("amount05")
    public BigDecimal getAmount05() {
        return amount05;
    }

    @JsonProperty("amount05")
    public void setAmount05(BigDecimal amount05) {
        this.amount05 = amount05;
    }

    @JsonProperty("amount06")
    public BigDecimal getAmount06() {
        return amount06;
    }

    @JsonProperty("amount06")
    public void setAmount06(BigDecimal amount06) {
        this.amount06 = amount06;
    }

    @JsonProperty("amount07")
    public BigDecimal getAmount07() {
        return amount07;
    }

    @JsonProperty("amount07")
    public void setAmount07(BigDecimal amount07) {
        this.amount07 = amount07;
    }

    @JsonProperty("amount08")
    public BigDecimal getAmount08() {
        return amount08;
    }

    @JsonProperty("amount08")
    public void setAmount08(BigDecimal amount08) {
        this.amount08 = amount08;
    }

    @JsonProperty("amount09")
    public BigDecimal getAmount09() {
        return amount09;
    }

    @JsonProperty("amount09")
    public void setAmount09(BigDecimal amount09) {
        this.amount09 = amount09;
    }

    @JsonProperty("amount10")
    public BigDecimal getAmount10() {
        return amount10;
    }

    @JsonProperty("amount10")
    public void setAmount10(BigDecimal amount10) {
        this.amount10 = amount10;
    }

    @JsonProperty("unitLinkedFund01")
    public String getUnitLinkedFund01() {
        return unitLinkedFund01;
    }

    @JsonProperty("unitLinkedFund01")
    public void setUnitLinkedFund01(String unitLinkedFund01) {
        this.unitLinkedFund01 = unitLinkedFund01;
    }

    @JsonProperty("unitLinkedFund02")
    public String getUnitLinkedFund02() {
        return unitLinkedFund02;
    }

    @JsonProperty("unitLinkedFund02")
    public void setUnitLinkedFund02(String unitLinkedFund02) {
        this.unitLinkedFund02 = unitLinkedFund02;
    }

    @JsonProperty("unitLinkedFund03")
    public String getUnitLinkedFund03() {
        return unitLinkedFund03;
    }

    @JsonProperty("unitLinkedFund03")
    public void setUnitLinkedFund03(String unitLinkedFund03) {
        this.unitLinkedFund03 = unitLinkedFund03;
    }

    @JsonProperty("unitLinkedFund04")
    public String getUnitLinkedFund04() {
        return unitLinkedFund04;
    }

    @JsonProperty("unitLinkedFund04")
    public void setUnitLinkedFund04(String unitLinkedFund04) {
        this.unitLinkedFund04 = unitLinkedFund04;
    }

    @JsonProperty("unitLinkedFund05")
    public String getUnitLinkedFund05() {
        return unitLinkedFund05;
    }

    @JsonProperty("unitLinkedFund05")
    public void setUnitLinkedFund05(String unitLinkedFund05) {
        this.unitLinkedFund05 = unitLinkedFund05;
    }

    @JsonProperty("unitLinkedFund06")
    public String getUnitLinkedFund06() {
        return unitLinkedFund06;
    }

    @JsonProperty("unitLinkedFund06")
    public void setUnitLinkedFund06(String unitLinkedFund06) {
        this.unitLinkedFund06 = unitLinkedFund06;
    }

    @JsonProperty("unitLinkedFund07")
    public String getUnitLinkedFund07() {
        return unitLinkedFund07;
    }

    @JsonProperty("unitLinkedFund07")
    public void setUnitLinkedFund07(String unitLinkedFund07) {
        this.unitLinkedFund07 = unitLinkedFund07;
    }

    @JsonProperty("unitLinkedFund08")
    public String getUnitLinkedFund08() {
        return unitLinkedFund08;
    }

    @JsonProperty("unitLinkedFund08")
    public void setUnitLinkedFund08(String unitLinkedFund08) {
        this.unitLinkedFund08 = unitLinkedFund08;
    }

    @JsonProperty("unitLinkedFund09")
    public String getUnitLinkedFund09() {
        return unitLinkedFund09;
    }

    @JsonProperty("unitLinkedFund09")
    public void setUnitLinkedFund09(String unitLinkedFund09) {
        this.unitLinkedFund09 = unitLinkedFund09;
    }

    @JsonProperty("unitLinkedFund10")
    public String getUnitLinkedFund10() {
        return unitLinkedFund10;
    }

    @JsonProperty("unitLinkedFund10")
    public void setUnitLinkedFund10(String unitLinkedFund10) {
        this.unitLinkedFund10 = unitLinkedFund10;
    }

    @JsonProperty("interateRate01")
    public BigDecimal getInterateRate01() {
        return interateRate01;
    }

    @JsonProperty("interateRate01")
    public void setInterateRate01(BigDecimal interateRate01) {
        this.interateRate01 = interateRate01;
    }

    @JsonProperty("renewalMonths01")
    public BigInteger getRenewalMonths01() {
        return renewalMonths01;
    }

    @JsonProperty("renewalMonths01")
    public void setRenewalMonths01(BigInteger renewalMonths01) {
        this.renewalMonths01 = renewalMonths01;
    }

    @JsonProperty("yearsInForce01")
    public BigInteger getYearsInForce01() {
        return yearsInForce01;
    }

    @JsonProperty("yearsInForce01")
    public void setYearsInForce01(BigInteger yearsInForce01) {
        this.yearsInForce01 = yearsInForce01;
    }

    @JsonProperty("interateRate02")
    public BigDecimal getInterateRate02() {
        return interateRate02;
    }

    @JsonProperty("interateRate02")
    public void setInterateRate02(BigDecimal interateRate02) {
        this.interateRate02 = interateRate02;
    }

    @JsonProperty("renewalMonths02")
    public BigInteger getRenewalMonths02() {
        return renewalMonths02;
    }

    @JsonProperty("renewalMonths02")
    public void setRenewalMonths02(BigInteger renewalMonths02) {
        this.renewalMonths02 = renewalMonths02;
    }

    @JsonProperty("yearsInForce02")
    public BigInteger getYearsInForce02() {
        return yearsInForce02;
    }

    @JsonProperty("yearsInForce02")
    public void setYearsInForce02(BigInteger yearsInForce02) {
        this.yearsInForce02 = yearsInForce02;
    }

    @JsonProperty("interateRate03")
    public BigDecimal getInterateRate03() {
        return interateRate03;
    }

    @JsonProperty("interateRate03")
    public void setInterateRate03(BigDecimal interateRate03) {
        this.interateRate03 = interateRate03;
    }

    @JsonProperty("renewalMonths03")
    public BigInteger getRenewalMonths03() {
        return renewalMonths03;
    }

    @JsonProperty("renewalMonths03")
    public void setRenewalMonths03(BigInteger renewalMonths03) {
        this.renewalMonths03 = renewalMonths03;
    }

    @JsonProperty("yearsInForce03")
    public BigInteger getYearsInForce03() {
        return yearsInForce03;
    }

    @JsonProperty("yearsInForce03")
    public void setYearsInForce03(BigInteger yearsInForce03) {
        this.yearsInForce03 = yearsInForce03;
    }

    @JsonProperty("interateRate04")
    public BigDecimal getInterateRate04() {
        return interateRate04;
    }

    @JsonProperty("interateRate04")
    public void setInterateRate04(BigDecimal interateRate04) {
        this.interateRate04 = interateRate04;
    }

    @JsonProperty("renewalMonths04")
    public BigInteger getRenewalMonths04() {
        return renewalMonths04;
    }

    @JsonProperty("renewalMonths04")
    public void setRenewalMonths04(BigInteger renewalMonths04) {
        this.renewalMonths04 = renewalMonths04;
    }

    @JsonProperty("yearsInForce04")
    public BigInteger getYearsInForce04() {
        return yearsInForce04;
    }

    @JsonProperty("yearsInForce04")
    public void setYearsInForce04(BigInteger yearsInForce04) {
        this.yearsInForce04 = yearsInForce04;
    }

    @JsonProperty("interateRate05")
    public BigDecimal getInterateRate05() {
        return interateRate05;
    }

    @JsonProperty("interateRate05")
    public void setInterateRate05(BigDecimal interateRate05) {
        this.interateRate05 = interateRate05;
    }

    @JsonProperty("renewalMonths05")
    public BigInteger getRenewalMonths05() {
        return renewalMonths05;
    }

    @JsonProperty("renewalMonths05")
    public void setRenewalMonths05(BigInteger renewalMonths05) {
        this.renewalMonths05 = renewalMonths05;
    }

    @JsonProperty("yearsInForce05")
    public BigInteger getYearsInForce05() {
        return yearsInForce05;
    }

    @JsonProperty("yearsInForce05")
    public void setYearsInForce05(BigInteger yearsInForce05) {
        this.yearsInForce05 = yearsInForce05;
    }

    @JsonProperty("interateRate06")
    public BigDecimal getInterateRate06() {
        return interateRate06;
    }

    @JsonProperty("interateRate06")
    public void setInterateRate06(BigDecimal interateRate06) {
        this.interateRate06 = interateRate06;
    }

    @JsonProperty("renewalMonths06")
    public BigInteger getRenewalMonths06() {
        return renewalMonths06;
    }

    @JsonProperty("renewalMonths06")
    public void setRenewalMonths06(BigInteger renewalMonths06) {
        this.renewalMonths06 = renewalMonths06;
    }

    @JsonProperty("yearsInForce06")
    public BigInteger getYearsInForce06() {
        return yearsInForce06;
    }

    @JsonProperty("yearsInForce06")
    public void setYearsInForce06(BigInteger yearsInForce06) {
        this.yearsInForce06 = yearsInForce06;
    }

    @JsonProperty("interateRate07")
    public BigDecimal getInterateRate07() {
        return interateRate07;
    }

    @JsonProperty("interateRate07")
    public void setInterateRate07(BigDecimal interateRate07) {
        this.interateRate07 = interateRate07;
    }

    @JsonProperty("renewalMonths07")
    public BigInteger getRenewalMonths07() {
        return renewalMonths07;
    }

    @JsonProperty("renewalMonths07")
    public void setRenewalMonths07(BigInteger renewalMonths07) {
        this.renewalMonths07 = renewalMonths07;
    }

    @JsonProperty("yearsInForce07")
    public BigInteger getYearsInForce07() {
        return yearsInForce07;
    }

    @JsonProperty("yearsInForce07")
    public void setYearsInForce07(BigInteger yearsInForce07) {
        this.yearsInForce07 = yearsInForce07;
    }

    @JsonProperty("interateRate08")
    public BigDecimal getInterateRate08() {
        return interateRate08;
    }

    @JsonProperty("interateRate08")
    public void setInterateRate08(BigDecimal interateRate08) {
        this.interateRate08 = interateRate08;
    }

    @JsonProperty("renewalMonths08")
    public BigInteger getRenewalMonths08() {
        return renewalMonths08;
    }

    @JsonProperty("renewalMonths08")
    public void setRenewalMonths08(BigInteger renewalMonths08) {
        this.renewalMonths08 = renewalMonths08;
    }

    @JsonProperty("yearsInForce08")
    public BigInteger getYearsInForce08() {
        return yearsInForce08;
    }

    @JsonProperty("yearsInForce08")
    public void setYearsInForce08(BigInteger yearsInForce08) {
        this.yearsInForce08 = yearsInForce08;
    }

    @JsonProperty("interateRate09")
    public BigDecimal getInterateRate09() {
        return interateRate09;
    }

    @JsonProperty("interateRate09")
    public void setInterateRate09(BigDecimal interateRate09) {
        this.interateRate09 = interateRate09;
    }

    @JsonProperty("renewalMonths09")
    public BigInteger getRenewalMonths09() {
        return renewalMonths09;
    }

    @JsonProperty("renewalMonths09")
    public void setRenewalMonths09(BigInteger renewalMonths09) {
        this.renewalMonths09 = renewalMonths09;
    }

    @JsonProperty("yearsInForce09")
    public BigInteger getYearsInForce09() {
        return yearsInForce09;
    }

    @JsonProperty("yearsInForce09")
    public void setYearsInForce09(BigInteger yearsInForce09) {
        this.yearsInForce09 = yearsInForce09;
    }

    @JsonProperty("interateRate10")
    public BigDecimal getInterateRate10() {
        return interateRate10;
    }

    @JsonProperty("interateRate10")
    public void setInterateRate10(BigDecimal interateRate10) {
        this.interateRate10 = interateRate10;
    }

    @JsonProperty("renewalMonths10")
    public BigInteger getRenewalMonths10() {
        return renewalMonths10;
    }

    @JsonProperty("renewalMonths10")
    public void setRenewalMonths10(BigInteger renewalMonths10) {
        this.renewalMonths10 = renewalMonths10;
    }

    @JsonProperty("yearsInForce10")
    public BigInteger getYearsInForce10() {
        return yearsInForce10;
    }

    @JsonProperty("yearsInForce10")
    public void setYearsInForce10(BigInteger yearsInForce10) {
        this.yearsInForce10 = yearsInForce10;
    }
}
