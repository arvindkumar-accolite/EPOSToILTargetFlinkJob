
package com.pru.model.middleware;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "entId",
    "party",
    "clientNumber",
    "clientType",
    "addressType",
    "birthPlace",
    "address01",
    "address02",
    "address03",
    "address04",
    "address05",
    "dateOfBirth",
    "postalCode",
    "phone01",
    "phone02",
    "gender",
    "countryCode",
    "directMailIndicator",
    "documentNumber",
    "email",
    "ethnicOrigin",
    "givenName",
    "language",
    "mailingIndicator",
    "marriedIndicator",
    "middleName01",
    "middleName02",
    "nationality",
    "occupationCode",
    "prefCom",
    "salutaion",
    "securityNumber",
    "sourceOfEvidence",
    "statusCode",
    "surName",
    "vipIndicator",
    "forTheAttentionOf",
    "corporateName"
})
public class ClientDetails {

    @JsonProperty("entId")
    private String entId;
    @JsonProperty("party")
    private String party;
    @JsonProperty("clientNumber")
    private String clientNumber;
    @JsonProperty("clientType")
    private String clientType;
    @JsonProperty("addressType")
    private String addressType;
    @JsonProperty("birthPlace")
    private String birthPlace;
    @JsonProperty("address01")
    private String address01;
    @JsonProperty("address02")
    private String address02;
    @JsonProperty("address03")
    private String address03;
    @JsonProperty("address04")
    private String address04;
    @JsonProperty("address05")
    private String address05;
    @JsonProperty("dateOfBirth")
    private String dateOfBirth;
    @JsonProperty("postalCode")
    private String postalCode;
    @JsonProperty("phone01")
    private String phone01;
    @JsonProperty("phone02")
    private String phone02;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("countryCode")
    private String countryCode;
    @JsonProperty("directMailIndicator")
    private String directMailIndicator;
    @JsonProperty("documentNumber")
    private String documentNumber;
    @JsonProperty("email")
    private String email;
    @JsonProperty("ethnicOrigin")
    private String ethnicOrigin;
    @JsonProperty("givenName")
    private String givenName;
    @JsonProperty("language")
    private String language;
    @JsonProperty("mailingIndicator")
    private String mailingIndicator;
    @JsonProperty("marriedIndicator")
    private String marriedIndicator;
    @JsonProperty("middleName01")
    private String middleName01;
    @JsonProperty("middleName02")
    private String middleName02;
    @JsonProperty("nationality")
    private String nationality;
    @JsonProperty("occupationCode")
    private String occupationCode;
    @JsonProperty("prefCom")
    private String prefCom;
    @JsonProperty("salutation")
    private String salutation;
    @JsonProperty("securityNumber")
    private String securityNumber;
    @JsonProperty("sourceOfEvidence")
    private String sourceOfEvidence;
    @JsonProperty("statusCode")
    private String statusCode;
    @JsonProperty("surName")
    private String surName;
    @JsonProperty("vipIndicator")
    private String vipIndicator;
    @JsonProperty("forTheAttentionOf")
    private String forTheAttentionOf;
    @JsonProperty("corporateName")
    private String corporateName;
   
    @JsonProperty("entId")
    public String getEntId() {
        return entId;
    }

    @JsonProperty("entId")
    public void setEntId(String entId) {
        this.entId = entId;
    }

    @JsonProperty("party")
    public String getParty() {
        return party;
    }

    @JsonProperty("party")
    public void setParty(String party) {
        this.party = party;
    }

    @JsonProperty("clientNumber")
    public String getClientNumber() {
        return clientNumber;
    }

    @JsonProperty("clientNumber")
    public void setClientNumber(String clientNumber) {
        this.clientNumber = clientNumber;
    }

    @JsonProperty("clientType")
    public String getClientType() {
        return clientType;
    }

    @JsonProperty("clientType")
    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    @JsonProperty("addressType")
    public String getAddressType() {
        return addressType;
    }

    @JsonProperty("addressType")
    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    @JsonProperty("birthPlace")
    public String getBirthPlace() {
        return birthPlace;
    }

    @JsonProperty("birthPlace")
    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    @JsonProperty("address01")
    public String getAddress01() {
        return address01;
    }

    @JsonProperty("address01")
    public void setAddress01(String address01) {
        this.address01 = address01;
    }

    @JsonProperty("address02")
    public String getAddress02() {
        return address02;
    }

    @JsonProperty("address02")
    public void setAddress02(String address02) {
        this.address02 = address02;
    }

    @JsonProperty("address03")
    public String getAddress03() {
        return address03;
    }

    @JsonProperty("address03")
    public void setAddress03(String address03) {
        this.address03 = address03;
    }

    @JsonProperty("address04")
    public String getAddress04() {
        return address04;
    }

    @JsonProperty("address04")
    public void setAddress04(String address04) {
        this.address04 = address04;
    }
    
    @JsonProperty("address05")
    public String getAddress05() {
        return address05;
    }

    @JsonProperty("address05")
    public void setAddress05(String address05) {
        this.address05 = address05;
    }

    @JsonProperty("dateOfBirth")
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @JsonProperty("dateOfBirth")
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @JsonProperty("phone01")
    public String getPhone01() {
        return phone01;
    }

    @JsonProperty("phone01")
    public void setPhone01(String phone01) {
        this.phone01 = phone01;
    }

    @JsonProperty("phone02")
    public String getPhone02() {
        return phone02;
    }

    @JsonProperty("phone02")
    public void setPhone02(String phone02) {
        this.phone02 = phone02;
    }

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("directMailIndicator")
    public String getDirectMailIndicator() {
        return directMailIndicator;
    }

    @JsonProperty("directMailIndicator")
    public void setDirectMailIndicator(String directMailIndicator) {
        this.directMailIndicator = directMailIndicator;
    }

    @JsonProperty("documentNumber")
    public String getDocumentNumber() {
        return documentNumber;
    }

    @JsonProperty("documentNumber")
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("ethnicOrigin")
    public String getEthnicOrigin() {
        return ethnicOrigin;
    }

    @JsonProperty("ethnicOrigin")
    public void setEthnicOrigin(String ethnicOrigin) {
        this.ethnicOrigin = ethnicOrigin;
    }

    @JsonProperty("givenName")
    public String getGivenName() {
        return givenName;
    }

    @JsonProperty("givenName")
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("mailingIndicator")
    public String getMailingIndicator() {
        return mailingIndicator;
    }

    @JsonProperty("mailingIndicator")
    public void setMailingIndicator(String mailingIndicator) {
        this.mailingIndicator = mailingIndicator;
    }

    @JsonProperty("marriedIndicator")
    public String getMarriedIndicator() {
        return marriedIndicator;
    }

    @JsonProperty("marriedIndicator")
    public void setMarriedIndicator(String marriedIndicator) {
        this.marriedIndicator = marriedIndicator;
    }

    @JsonProperty("middleName01")
    public String getMiddleName01() {
        return middleName01;
    }

    @JsonProperty("middleName01")
    public void setMiddleName01(String middleName01) {
        this.middleName01 = middleName01;
    }

    @JsonProperty("middleName02")
    public String getMiddleName02() {
        return middleName02;
    }

    @JsonProperty("middleName02")
    public void setMiddleName02(String middleName02) {
        this.middleName02 = middleName02;
    }

    @JsonProperty("nationality")
    public String getNationality() {
        return nationality;
    }

    @JsonProperty("nationality")
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @JsonProperty("occupationCode")
    public String getOccupationCode() {
        return occupationCode;
    }

    @JsonProperty("occupationCode")
    public void setOccupationCode(String occupationCode) {
        this.occupationCode = occupationCode;
    }

    @JsonProperty("prefCom")
    public String getPrefCom() {
        return prefCom;
    }

    @JsonProperty("prefCom")
    public void setPrefCom(String prefCom) {
        this.prefCom = prefCom;
    }

    @JsonProperty("salutation")
    public String getSalutation() {
        return salutation;
    }

    @JsonProperty("salutation")
    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    @JsonProperty("securityNumber")
    public String getSecurityNumber() {
        return securityNumber;
    }

    @JsonProperty("securityNumber")
    public void setSecurityNumber(String securityNumber) {
        this.securityNumber = securityNumber;
    }

    @JsonProperty("sourceOfEvidence")
    public String getSourceOfEvidence() {
        return sourceOfEvidence;
    }

    @JsonProperty("sourceOfEvidence")
    public void setSourceOfEvidence(String sourceOfEvidence) {
        this.sourceOfEvidence = sourceOfEvidence;
    }

    @JsonProperty("statusCode")
    public String getStatusCode() {
        return statusCode;
    }

    @JsonProperty("statusCode")
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    @JsonProperty("surName")
    public String getSurName() {
        return surName;
    }

    @JsonProperty("surName")
    public void setSurName(String surName) {
        this.surName = surName;
    }

    @JsonProperty("vipIndicator")
    public String getVipIndicator() {
        return vipIndicator;
    }

    @JsonProperty("vipIndicator")
    public void setVipIndicator(String vipIndicator) {
        this.vipIndicator = vipIndicator;
    }

    @JsonProperty("forTheAttentionOf")
    public String getForTheAttentionOf() {
        return forTheAttentionOf;
    }

    @JsonProperty("forTheAttentionOf")
    public void setForTheAttentionOf(String forTheAttentionOf) {
        this.forTheAttentionOf = forTheAttentionOf;
    }

    @JsonProperty("corporateName")
    public String getCorporateName() {
        return corporateName;
    }

    @JsonProperty("corporateName")
    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }
}
