package com.eficode.buggywebservice.controller;

import com.eficode.buggywebservice.domain.LoginRequest;
import com.eficode.buggywebservice.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    /*
    * What is problem with this controller? You can write test case to prove it (not necessary)
    */

    @Autowired
    private LoginService loginService;
    
    @RequestMapping(path = "/login",method = RequestMethod.POST)
    public ResponseEntity<Boolean> login(@RequestBody LoginRequest loginRequest){
        return new ResponseEntity<>(loginService.login(loginRequest), HttpStatus.OK);
    }

}
