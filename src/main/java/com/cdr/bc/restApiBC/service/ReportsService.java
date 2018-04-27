package com.cdr.bc.restApiBC.service;

import java.io.Serializable;
import java.util.List;

import com.cdr.bc.restApiBC.domain.BcReports;

public interface ReportsService extends Serializable{
	
	List<BcReports> getReports(String orgCode);

}
