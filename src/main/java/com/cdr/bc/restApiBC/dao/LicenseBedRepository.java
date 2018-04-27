package com.cdr.bc.restApiBC.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.cdr.bc.restApiBC.domain.BcLicense;
import com.cdr.bc.restApiBC.domain.LicenseId;

public interface LicenseBedRepository extends CrudRepository<BcLicense, LicenseId>{

	
	@Query(value="select t1.* from DMH.dbo.bc_license t1 JOIN (SELECT  org_code, location_code, MAX(modify_date) modify_date  FROM DMH.dbo.bc_license GROUP BY org_code , location_code) t2 ON "
			+ "t1.org_code = t2.org_code and t1.location_code = t2.location_code and t1.modify_date = t2.modify_date",nativeQuery = true)
	List<BcLicense> getLatestLicBedForProviderLocation();
	
	@Query(value="select * from DMH.dbo.bc_locations",  nativeQuery = true)
	List<BcLicense> getUniqueProviderLocations();
	
}
