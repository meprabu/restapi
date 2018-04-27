package com.cdr.bc.restApiBC.domain;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;


/**
 * The persistent class for the bc_license database table.
 * 
 */
@Entity
@Table(name="bc_license")
@NamedQuery(name="BcLicense.findAll", query="SELECT b FROM BcLicense b")
public class BcLicense implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId 
	LicenseId id;

	@Column(name="act_bed_coed")
	private int actBedCoed;

	@Column(name="act_bed_female")
	private int actBedFemale;

	@Column(name="act_bed_male")
	private int actBedMale;

	

	@Column(name="lic_bed_coed")
	private int licBedCoed;

	@Column(name="lic_bed_female")
	private int licBedFemale;

	@Column(name="lic_bed_male")
	private int licBedMale;

	
	@Column(name="modify_date")
	private Timestamp modifyDate;
	

	public BcLicense() {
	}

	public int getActBedCoed() {
		return this.actBedCoed;
	}

	public void setActBedCoed(int actBedCoed) {
		this.actBedCoed = actBedCoed;
	}

	public int getActBedFemale() {
		return this.actBedFemale;
	}

	public void setActBedFemale(int actBedFemale) {
		this.actBedFemale = actBedFemale;
	}

	public int getActBedMale() {
		return this.actBedMale;
	}

	public void setActBedMale(int actBedMale) {
		this.actBedMale = actBedMale;
	}


	public int getLicBedCoed() {
		return this.licBedCoed;
	}

	public void setLicBedCoed(int licBedCoed) {
		this.licBedCoed = licBedCoed;
	}

	public int getLicBedFemale() {
		return this.licBedFemale;
	}

	public void setLicBedFemale(int licBedFemale) {
		this.licBedFemale = licBedFemale;
	}

	public int getLicBedMale() {
		return this.licBedMale;
	}

	public void setLicBedMale(int licBedMale) {
		this.licBedMale = licBedMale;
	}

	

	public Timestamp getModifyDate() {
		return this.modifyDate;
	}

	public void setModifyDate(Timestamp modifyDate) {
		this.modifyDate = modifyDate;
	}

	public LicenseId getId() {
		return id;
	}

	public void setId(LicenseId id) {
		this.id = id;
	}

	

}


