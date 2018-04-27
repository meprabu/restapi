package com.cdr.bc.restApiBC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.cdr.bc.restApiBC.domain.BcReports;
import com.cdr.bc.restApiBC.service.ReportsService;

@RestController
public class ReportsController {
	
	@Autowired
	ReportsService reportsService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/getReports")	
	public List<BcReports> getReposrts(){
		
		List<BcReports> reports = reportsService.getReports("995");
		return reports;
	}

}
