package com.eficode.buggywebservice.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import java.util.stream.*;

import java.util.List;

public class EmployeeInformation {

    /*
    *What are good sides to use domain objects here and what things they make harder
     */
	
    @Id
    public String id;
    public final List<PreviousJobs> previousJobs;
    public final PersonalInformation personalInformation;

    public EmployeeInformation(@JsonProperty("id") String id,
    						   @JsonProperty("previousJobs") List<PreviousJobs> previousJobs,
                               @JsonProperty("personalInformation") PersonalInformation personalInformation) {
    	
        this.previousJobs = previousJobs;
        this.personalInformation = personalInformation;
        this.id=id;
    }
}
