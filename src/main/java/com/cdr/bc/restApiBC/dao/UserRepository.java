package com.cdr.bc.restApiBC.dao;

import org.springframework.data.repository.CrudRepository;
import com.cdr.bc.restApiBC.domain.BcUserTable;

public interface UserRepository extends CrudRepository<BcUserTable, String> {
	
	BcUserTable findByWhoAndPermit(String who, String permit);
	BcUserTable findByWho(String who);
}
