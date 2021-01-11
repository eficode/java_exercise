package com.eficode.buggywebservice.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

public class PreviousJobs {
    /**
     * Why there shouldn't be id filled in this class?
     */

    @Id
    public String id;
    public final String employerName;
    public final Date startDate;
    public final Date endDate;
    public final List<Skill> skills;

    public PreviousJobs(@JsonProperty("employerName") String employerName,@JsonProperty("startDate") Date startDate,
                        @JsonProperty("endDate") Date endDate,@JsonProperty("skills") List<Skill> skills) {
        this.employerName = employerName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.skills = skills;
    }


}
