package com.cdr.bc.restApiBC.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the bc_providers database table.
 * 
 */
@Entity
@Table(name="bc_providers")
@NamedQuery(name="BcProvider.findAll", query="SELECT b FROM BcProvider b")
public class BcProvider implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ORG_CODE")
	private String orgCode;

	@Column(name="ACTIVE_STATUS", columnDefinition="char(1)")
	private String activeStatus;

	@Column(name="ACTIVE_STATUS_DATE")
	private Timestamp activeStatusDate;

	@Column(name="DATA_CONTACT")
	private String dataContact;

	@Column(name="DATA_CONTACT_EMAIL")
	private String dataContactEmail;

	@Column(name="DIRECTOR")
	private String director;

	@Column(name="DIRECTOR_EMAIL")
	private String directorEmail;

	@Column(name="PROVIDER_NAME")
	private String providerName;

	public BcProvider() {
	}

	public String getOrgCode() {
		return this.orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getActiveStatus() {
		return this.activeStatus;
	}

	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}

	public Timestamp getActiveStatusDate() {
		return this.activeStatusDate;
	}

	public void setActiveStatusDate(Timestamp activeStatusDate) {
		this.activeStatusDate = activeStatusDate;
	}

	public String getDataContact() {
		return this.dataContact;
	}

	public void setDataContact(String dataContact) {
		this.dataContact = dataContact;
	}

	public String getDataContactEmail() {
		return this.dataContactEmail;
	}

	public void setDataContactEmail(String dataContactEmail) {
		this.dataContactEmail = dataContactEmail;
	}

	public String getDirector() {
		return this.director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getDirectorEmail() {
		return this.directorEmail;
	}

	public void setDirectorEmail(String directorEmail) {
		this.directorEmail = directorEmail;
	}

	public String getProviderName() {
		return this.providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

}