package com.cdr.bc.restApiBC.controller;

import org.springframework.web.bind.annotation.RestController;

import com.cdr.bc.restApiBC.dao.BedTypeRepository;
import com.cdr.bc.restApiBC.dao.OccupiedBedRepository;
import com.cdr.bc.restApiBC.dao.UserRepository;
import com.cdr.bc.restApiBC.domain.BcBedType;
import com.cdr.bc.restApiBC.domain.BcOccupied;
import com.cdr.bc.restApiBC.domain.OccupiedId;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class TestController {
	
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	BedTypeRepository bedtype;
	
	@Autowired
	OccupiedBedRepository occupy;
	
	@RequestMapping("/helloworld")	
	public String sayHello(){
		
		String hello= "Helllo";
		return hello;
	}
	
	@RequestMapping("/getpermit/{who}")	
	public String getpermit(@PathVariable String who){
		
		//BcUserTable user = userRepo.findByWho(who);
		
		BcBedType bctype = bedtype.findByBedType(who);
		return bctype.getBedTypeDesc();
	}
	
	@RequestMapping("/getOcuupied")	
	public List<BcOccupied> getOccupied(){
		
		//BcUserTable user = userRepo.findByWho(who);
		OccupiedId ocid = new OccupiedId();
		ocid.setBedType("AP1");
		//ocid.setLocationCode("0113");
		ocid.setModifyUser("dmh.test2");
		ocid.setOrgCode(113);
		BcOccupied bcOccupied = new BcOccupied();
		bcOccupied.setOccupiedId(ocid);
		List<BcOccupied> bcOcuupy = occupy.findAllByOccupiedId(ocid);
		
		//BcOccupied bcc = occupy.findAllFirstByOccupiedIdOrderByModifyDateDesc(ocid);
		
		List<BcOccupied> bccNew = occupy.findByOccupiedIdOrgCodeAndOccupiedIdModifyUserAndOccupiedIdBedType(113, "dmh.test2", "AP1");
		
		ExampleMatcher matcher = ExampleMatcher.matching()
                .withIncludeNullValues();
		List<BcOccupied> bccNew1 = occupy.findAll(Example.of(bcOccupied));
		
		System.out.println(bcOcuupy);
		return bccNew1;
	}

}
