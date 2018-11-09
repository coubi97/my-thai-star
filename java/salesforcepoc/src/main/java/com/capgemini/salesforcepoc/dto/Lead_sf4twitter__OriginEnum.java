/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jan 12 15:20:23 CET 2018
 */
package com.capgemini.salesforcepoc.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist sf4twitter__Origin__c
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum Lead_sf4twitter__OriginEnum {

    // Facebook
    FACEBOOK("Facebook"),
    // Twitter
    TWITTER("Twitter");

    final String value;

    private Lead_sf4twitter__OriginEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static Lead_sf4twitter__OriginEnum fromValue(String value) {
        for (Lead_sf4twitter__OriginEnum e : Lead_sf4twitter__OriginEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}