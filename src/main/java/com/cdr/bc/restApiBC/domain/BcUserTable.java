package com.cdr.bc.restApiBC.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the bc_user_table database table.
 * 
 */
@Entity
@Table(name="bc_user_table")
@NamedQuery(name="BcUserTable.findAll", query="SELECT b FROM BcUserTable b")
public class BcUserTable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="first_name")
	private String firstName;

	@Column(name="last_name")
	private String lastName;

	@Column(name="LOCATION_CODE")
	private String locationCode;

	@Column(name="[PERMIT]")
	private String permit;
	
	@Id
	@Column(name="WHO")
	private String who;

	public BcUserTable() {
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLocationCode() {
		return this.locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public String getPermit() {
		return this.permit;
	}

	public void setPermit(String permit) {
		this.permit = permit;
	}

	public String getWho() {
		return this.who;
	}

	public void setWho(String who) {
		this.who = who;
	}

}