package com.eficode.buggywebservice.service;

import com.eficode.buggywebservice.domain.LoginInformation;
import com.eficode.buggywebservice.domain.LoginRequest;
import com.eficode.buggywebservice.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Service
public class LoginService implements LoginServiceInterface {

    /*
    How you would change service? Is there something wrong here?
     */

    @Autowired
    private LoginRepository loginRepository;

    public Boolean login(final LoginRequest loginRequest){
        LoginInformation login = loginRepository.findLogin(loginRequest.userName, loginRequest.password);
        if (loginRequest.password.equals(login.password) && loginRequest.userName.equals(login.password)){
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
    
    // Function for test case uses
    @Override
    public void setLoginRepository(LoginRepository loginRepository) {
    	
    	this.loginRepository = loginRepository;
    }
}
