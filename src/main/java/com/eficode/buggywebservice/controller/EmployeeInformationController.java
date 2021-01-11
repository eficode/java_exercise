package com.eficode.buggywebservice.controller;

import com.eficode.buggywebservice.domain.EmployeeInformation;
import com.eficode.buggywebservice.domain.EmployeeInformationRequest;
import com.eficode.buggywebservice.domain.EmployeeInformationResponse;
import com.eficode.buggywebservice.service.EmployeeInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeInformationController {

    /*
    Why it may be good idea to use response and request objects and not value classes themselves
     */
	
    @Autowired
    private EmployeeInformationService employeeInformationService;

    @RequestMapping(path = "/byName",method = RequestMethod.POST)
    public ResponseEntity<EmployeeInformationResponse> findByName(@RequestBody EmployeeInformationRequest employeeInformationRequest){
        return new ResponseEntity<>(
                new EmployeeInformationResponse(employeeInformationService.searchByLastName(employeeInformationRequest.lastName)), HttpStatus.OK);
    }
    @RequestMapping(path = "/all",method = RequestMethod.GET)
    public ResponseEntity<EmployeeInformationResponse> findAllName(){
        return new ResponseEntity<>(
                new EmployeeInformationResponse(employeeInformationService.getAll()), HttpStatus.OK);
    }


}
