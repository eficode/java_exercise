package com.eficode.buggywebservice.repository;

import com.eficode.buggywebservice.domain.EmployeeInformation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobRepository extends MongoRepository<EmployeeInformation,String> {
}
