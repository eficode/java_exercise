package com.eficode.buggywebservice.repository;

import com.eficode.buggywebservice.domain.LoginInformation;
import com.mongodb.Mongo;
import org.bson.BSON;
import org.bson.types.ObjectId;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginRepositoryTest {

    /*
    Is there something wrong here? What other cases should be tested?
     */

    @Autowired
    private LoginRepository loginRepository
    
    private String testString;

    @Test
    public void testInsertAndSelect(){
        loginRepository.insert(new LoginInformation(ObjectId.get().toString(),"username","password"));
        LoginInformation loginInformation = loginRepository.findLogin("username", "password");
        assertThat(loginInformation,notNullValue());
        loginRepository.delete(loginInformation);


    }
}
