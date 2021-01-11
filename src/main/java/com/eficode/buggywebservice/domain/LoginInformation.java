package com.eficode.buggywebservice.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;


public class LoginInformation {
    @Id
    public final String id;
    public final String username;
    public final String password;

    public LoginInformation(@JsonProperty("id") String id, @JsonProperty("username") String username,@JsonProperty("password") String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
}
