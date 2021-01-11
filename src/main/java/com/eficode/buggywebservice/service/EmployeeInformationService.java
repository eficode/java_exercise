package com.eficode.buggywebservice.service;


import com.eficode.buggywebservice.domain.EmployeeInformation;
import com.eficode.buggywebservice.repository.EmployeeInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeInformationService {

    @Autowired
    private EmployeeInformationRepository employeeInformationRepository;

    public List<EmployeeInformation> getAll(){
        return employeeInformationRepository.findAll();
    }
    public List<EmployeeInformation> searchByLastName(final String lastName){
        return employeeInformationRepository.findByLastName(lastName);
    }
}
