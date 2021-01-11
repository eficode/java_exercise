package com.eficode.buggywebservice.controller;

import com.eficode.buggywebservice.domain.EmployeeInformationResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EmployeeInformationControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void testFindAll(){
        ResponseEntity<EmployeeInformationResponse> forEntity = testRestTemplate.getForEntity("/all", EmployeeInformationResponse.class, Collections.emptyMap());
        assertThat(forEntity,notNullValue());
        assertThat(forEntity.getStatusCode(),is(HttpStatus.OK));
        assertThat(forEntity.getBody(),notNullValue());
    }
}
