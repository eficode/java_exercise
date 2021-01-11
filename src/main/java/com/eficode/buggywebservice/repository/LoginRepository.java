package com.eficode.buggywebservice.repository;

import com.eficode.buggywebservice.domain.LoginInformation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends MongoRepository<LoginInformation,String> {

    @Query(value = "{ username: ?0, password: ?1 }", fields = "{ username : 1, password : 1}")
    LoginInformation findLogin(String username,String password);

}
