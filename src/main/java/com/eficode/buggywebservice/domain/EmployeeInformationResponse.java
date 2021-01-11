package com.eficode.buggywebservice.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class EmployeeInformationResponse {

    public final List<EmployeeInformation> employeeInformations;

    public EmployeeInformationResponse(@JsonProperty("employeeInformations") List<EmployeeInformation> employeeInformations) {
        this.employeeInformations = employeeInformations;
    }
}
