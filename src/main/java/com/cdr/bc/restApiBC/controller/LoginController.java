package com.cdr.bc.restApiBC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdr.bc.restApiBC.domain.BcUserTable;
import com.cdr.bc.restApiBC.service.LoginService;

@RestController
public class LoginController {
	
	
	@Autowired
	LoginService loginservice;
	
	@CrossOrigin(origins = "*", methods= {RequestMethod.POST}, allowedHeaders = "*")
	@RequestMapping(value="/getLogin", method = RequestMethod.POST)
	public BcUserTable getUserDetails(@RequestParam String who, @RequestParam String orgId){
		
		BcUserTable userdetail = loginservice.getUserDetails(who, orgId);
		
		return userdetail;
		
	}
	

}
