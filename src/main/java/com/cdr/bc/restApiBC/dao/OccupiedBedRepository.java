package com.cdr.bc.restApiBC.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import com.cdr.bc.restApiBC.domain.BcOccupied;
import com.cdr.bc.restApiBC.domain.OccupiedId;
import org.springframework.data.domain.Example;

public interface OccupiedBedRepository extends CrudRepository<BcOccupied,OccupiedId>{
	
	List<BcOccupied> findAllByOccupiedId(OccupiedId ocuupyId);
	//BcOccupied findAllFirstByOccupiedIdOrderByModifyDateDesc(OccupiedId ocid);
	//BcOccupied findAllByOrgCodeAndModifyUserAndBedType(int orgCode,String modifyUser, String bedType);
	List<BcOccupied> findByOccupiedIdOrgCodeAndOccupiedIdModifyUserAndOccupiedIdBedType(int orgCode, String modifyUser, String bedType);
	List<BcOccupied> findAll(Example<BcOccupied> bcOccupied);
	@Query(value = "select t1.* from DMH.dbo.bc_occupied t1 JOIN (SELECT  org_code, location_code, MAX(modify_date) modify_date  "
			+ "FROM DMH.dbo.bc_occupied GROUP BY org_code , location_code) t2 ON t1.org_code = t2.org_code and "
			+ "t1.location_code = t2.location_code and t1.modify_date = t2.modify_date", nativeQuery = true)
	List<BcOccupied> getLatestOcuupiedBedForProviderLocation();
}
