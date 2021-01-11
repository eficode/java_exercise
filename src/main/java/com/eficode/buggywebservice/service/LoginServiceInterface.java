package com.eficode.buggywebservice.service;

import com.eficode.buggywebservice.domain.LoginRequest;
import com.eficode.buggywebservice.repository.LoginRepository;

public interface LoginServiceInterface {
	
	public Boolean login(final LoginRequest loginRequest);
	public void setLoginRepository(LoginRepository loginRepository);
}
