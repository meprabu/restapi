package com.cdr.bc.restApiBC.dao;

import org.springframework.data.repository.CrudRepository;

import com.cdr.bc.restApiBC.domain.BcBedType;

public interface BedTypeRepository extends CrudRepository<BcBedType, String> {
	
	BcBedType findByBedType(String bedType);

}
