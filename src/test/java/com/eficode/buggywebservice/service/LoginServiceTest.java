package com.eficode.buggywebservice.service;


import org.bson.types.ObjectId;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.eficode.buggywebservice.domain.LoginInformation;
import com.eficode.buggywebservice.repository.LoginRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginServiceTest {
	
	@Autowired 
	private LoginService loginService;
	
	@Autowired 
	private LoginRepository loginRepository;
	
	/** 
	 * Somebody has started with this test case but haven't completed it. Continue and write rest of it to test something reasonable.
	 */
	@Test
	public void testLoginWithCorrectDetails() {
		System.out.println("Write some reasonable test case here !!!");
		
		LoginInformation logInfo = new LoginInformation(ObjectId.get().toString(), "testUser", "testPwd");
		loginRepository.insert(logInfo);
	}
}
