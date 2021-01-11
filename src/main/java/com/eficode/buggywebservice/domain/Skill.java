package com.eficode.buggywebservice.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Skill {
    public final String name;
    public final ExperienceLevel experienceLevel;

    public Skill(@JsonProperty("name") String name,@JsonProperty("experienceLevel") ExperienceLevel experienceLevel) {
        this.name = name;
        this.experienceLevel = experienceLevel;
    }

    public static class Builder {
        public String name;
        public ExperienceLevel experienceLevel;

        public Builder(@JsonProperty("name") String name,@JsonProperty("experienceLevel") ExperienceLevel experienceLevel){
        	this.name = name; 
        	this.experienceLevel = experienceLevel;
        }

	    public Builder name(final String n) {
	    	this.name = n;
	    	return this;
	    }

	    public Builder experienceLevel(final ExperienceLevel e) {
	    	this.experienceLevel = e;
	    	return this;
	    }

	    public Skill build() {
	    	return new Skill(name, experienceLevel);
	    }
	}
}
