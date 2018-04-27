package com.cdr.bc.restApiBC.service;

import java.io.Serializable;

import com.cdr.bc.restApiBC.domain.BcUserTable;


public interface LoginService extends Serializable{

	BcUserTable getUserDetails(String who, String orgId);
}
