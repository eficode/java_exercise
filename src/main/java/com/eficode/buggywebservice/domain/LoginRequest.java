package com.eficode.buggywebservice.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginRequest {
    public final String userName;
    public final String password;

    public LoginRequest(@JsonProperty("userName") String userName,@JsonProperty("password") String password) {
        this.userName = userName;
        this.password = password;
    }
}
