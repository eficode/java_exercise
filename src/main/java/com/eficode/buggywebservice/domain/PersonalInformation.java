package com.eficode.buggywebservice.domain;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class PersonalInformation {
    public final String firstName;
    public final String lastName;
    public final Date dateOfBirth;
    public final String streetAddress;
    public final String zipCode;
    public final String postalOffice;

    public PersonalInformation(@JsonProperty("firstName") String firstName,@JsonProperty("lastName") String lastName,
                               @JsonProperty("dateOfBirth") Date dateOfBirth,@JsonProperty("streetAddress") String streetAddress,
                               @JsonProperty("zipCode") String zipCode,@JsonProperty("postalOffice") String postalOffice) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.streetAddress = streetAddress;
        this.zipCode = zipCode;
        this.postalOffice = null;
    }
}
