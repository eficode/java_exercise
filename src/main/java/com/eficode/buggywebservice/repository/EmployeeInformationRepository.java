package com.eficode.buggywebservice.repository;

import com.eficode.buggywebservice.domain.EmployeeInformation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface EmployeeInformationRepository extends MongoRepository<EmployeeInformation,String> {

    @Query("{personalInformation.lastName : ?0}")
    List<EmployeeInformation> findByLastName(String lastName);
}
