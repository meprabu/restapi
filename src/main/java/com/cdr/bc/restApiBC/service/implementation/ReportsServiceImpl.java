package com.cdr.bc.restApiBC.service.implementation;

import com.cdr.bc.restApiBC.dao.LicenseBedRepository;
import com.cdr.bc.restApiBC.dao.LocationsRepository;
import com.cdr.bc.restApiBC.dao.OccupiedBedRepository;
import com.cdr.bc.restApiBC.domain.BcLicense;
import com.cdr.bc.restApiBC.domain.BcLocation;
import com.cdr.bc.restApiBC.domain.BcOccupied;
import com.cdr.bc.restApiBC.domain.BcReports;
import com.cdr.bc.restApiBC.service.ReportsService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportsServiceImpl implements ReportsService{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5895838812956729153L;

	@Autowired
	OccupiedBedRepository occuBedRepo;
	
	@Autowired
	LicenseBedRepository licBedRepo;
	
	@Autowired
	LocationsRepository locRepo;
	
	public List<BcReports> getReports(String orgCode){
		
		List<BcOccupied> occuList = occuBedRepo.getLatestOcuupiedBedForProviderLocation();
		System.out.println("------------occuList----------");
		occuList.forEach(bc ->{
			
			System.out.println(bc.getOccupiedId().getOrgCode());
			System.out.println(bc.getOccupiedId().getLocationCode());
			System.out.println(bc.getOccupiedMale());
			System.out.println(bc.getOccupiedFemale());
		});
		System.out.println("*************end occuList***************");
		List<BcLicense> licBedList = licBedRepo.getLatestLicBedForProviderLocation();
				licBedList.forEach(licBed -> {
					System.out.println("----------------------");
					System.out.println(licBed.getId().getOrgCode());
					System.out.println(licBed.getId().getLocationCode());
					System.out.println(licBed.getLicBedMale());
					System.out.println(licBed.getActBedFemale());
				});
		
		System.out.println("****************************");		
				
		List<BcLocation> locationProvList =  locRepo.getUniqueProviderLocations(); 
		locationProvList.forEach(provLoc ->{
			System.out.println(provLoc.getProviderNumber());
			System.out.println(provLoc.getLocationCode());
			System.out.println(provLoc.getLocationName());
		});
		
		System.out.println("****************************");
		
		return buildreports(locationProvList,occuList,licBedList);
	}
	
	private List<BcReports> buildreports(List<BcLocation> locationProvList, List<BcOccupied> occuList, List<BcLicense> licBedList){
		List<BcReports> reports = new ArrayList<BcReports>();
		for(BcLocation ProviderLocation: locationProvList){
			//String[] providerLoc = ProviderLocation.split("-");
			String provider = ProviderLocation.getProviderNumber();
			String location = ProviderLocation.getLocationCode();
			String locationName = ProviderLocation.getLocationName();
			BcReports report = new BcReports();
			int male = 0;
			int female = 0;
			int coed = 0;
			int activeMale = 0;
			int activeFemale = 0;
			int activeCoed = 0;
			int occupiedMale = 0;
			int occupiedFemale = 0;
			int occupiedCoed = 0;
			int pendAdm = 0;
			int pendDisc = 0;
			for(BcLicense licenseBed: licBedList){
				if(String.valueOf(licenseBed.getId().getOrgCode()).equals(provider) && licenseBed.getId().getLocationCode().equals(location)){
					activeMale = licenseBed.getActBedMale();
					activeFemale = licenseBed.getActBedFemale();
					activeCoed = licenseBed.getActBedCoed();
				}
			}
			for(BcOccupied occupiedBed : occuList){
				if(String.valueOf(occupiedBed.getOccupiedId().getOrgCode()).equals(provider) && String.valueOf(occupiedBed.getOccupiedId().getLocationCode()).equals(location)){
					occupiedMale = occupiedBed.getOccupiedMale();
					occupiedFemale = occupiedBed.getOccupiedFemale();
					occupiedCoed = occupiedBed.getOccupiedCoed();
					pendAdm = occupiedBed.getPendingAdm();
					pendDisc =  occupiedBed.getPendingDis();
				}
			}
			male = activeMale - occupiedMale;
			female = activeFemale - occupiedFemale;
			coed =  activeCoed - occupiedCoed;
			report.setMale(String.valueOf(male));
			report.setFemale(String.valueOf(female));
			report.setCoed(String.valueOf(coed));
			report.setPendAdm(String.valueOf(pendAdm));
			report.setPendDis(String.valueOf(pendDisc));
			report.setOrgCode(String.valueOf(provider));
			report.setLocationCode(nullZero(location));
			report.setLocationName(locationName);
			reports.add(report);
		}
		return reports;
	}
	
	
	private String nullZero(String num){
		if(null == num || "".equals(num.trim())){
			return "0";
		}else{
			return num.trim();
		}
	}
	

}
