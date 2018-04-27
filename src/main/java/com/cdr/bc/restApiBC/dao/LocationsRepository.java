package com.cdr.bc.restApiBC.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.cdr.bc.restApiBC.domain.BcLocation;

public interface LocationsRepository extends CrudRepository<BcLocation, String>{
	
	@Query(value="select L.* from DMH.dbo.bc_locations L where L.PROVIDER_NUMBER in (select ORG_CODE from DMH.dbo.bc_providers ) order by L.PROVIDER_NUMBER",  nativeQuery = true)
	List<BcLocation> getUniqueProviderLocations();

}
