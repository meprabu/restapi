package com.cdr.bc.restApiBC.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the bc_locations database table.
 * 
 */
@Entity
@Table(name="bc_locations")
@NamedQuery(name="BcLocation.findAll", query="SELECT b FROM BcLocation b")
public class BcLocation implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	
	@Column(name="ADDRESS1")
	private String address1;

	@Column(name="ADDRESS2")
	private String address2;

	@Column(name="BED_TYPE")
	private String bedType;

	@Column(name="CITY")
	private String city;

	@Column(name="CNTY_NUMBER")
	private String cntyNumber;

	@Column(name="CONTACT")
	private String contact;

	@Id
	@Column(name="LOCATION_CODE")
	private String locationCode;

	@Column(name="LOCATION_NAME")
	private String locationName;

	@Column(name="MODIFY_DATE")
	private Timestamp modifyDate;

	@Column(name="MODIFY_USER")
	private String modifyUser;

	@Column(name="PHONE_EXT")
	private String phoneExt;

	@Column(name="PHONE1")
	private String phone1;

	@Column(name="PROVIDER_NUMBER")
	private String providerNumber;

	@Column(name="ZIP")
	private String zip;

	public BcLocation() {
	}

	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getBedType() {
		return this.bedType;
	}

	public void setBedType(String bedType) {
		this.bedType = bedType;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCntyNumber() {
		return this.cntyNumber;
	}

	public void setCntyNumber(String cntyNumber) {
		this.cntyNumber = cntyNumber;
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getLocationCode() {
		return this.locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public String getLocationName() {
		return this.locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public Timestamp getModifyDate() {
		return this.modifyDate;
	}

	public void setModifyDate(Timestamp modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getModifyUser() {
		return this.modifyUser;
	}

	public void setModifyUser(String modifyUser) {
		this.modifyUser = modifyUser;
	}

	public String getPhoneExt() {
		return this.phoneExt;
	}

	public void setPhoneExt(String phoneExt) {
		this.phoneExt = phoneExt;
	}

	public String getPhone1() {
		return this.phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getProviderNumber() {
		return this.providerNumber;
	}

	public void setProviderNumber(String providerNumber) {
		this.providerNumber = providerNumber;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}