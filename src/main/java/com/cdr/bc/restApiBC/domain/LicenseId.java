package com.cdr.bc.restApiBC.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class LicenseId implements Serializable {
	private static final long serialVersionUID = 1L;
	

	@Column(name="org_code")
	private int orgCode;
	
	@Column(name="modify_user")
	private String modifyUser;
	
	@Column(name="bed_type")
	private String bedType;
	
	@Column(name="location_code")
	private String locationCode;
	
	public String getModifyUser() {
		return this.modifyUser;
	}

	public void setModifyUser(String modifyUser) {
		this.modifyUser = modifyUser;
	}

	public int getOrgCode() {
		return this.orgCode;
	}

	public void setOrgCode(int orgCode) {
		this.orgCode = orgCode;
	}
	
	public String getLocationCode() {
		return this.locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}
	
	public String getBedType() {
		return this.bedType;
	}

	public void setBedType(String bedType) {
		this.bedType = bedType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bedType == null) ? 0 : bedType.hashCode());
		result = prime * result + ((locationCode == null) ? 0 : locationCode.hashCode());
		result = prime * result + ((modifyUser == null) ? 0 : modifyUser.hashCode());
		result = prime * result + orgCode;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LicenseId other = (LicenseId) obj;
		if (bedType == null) {
			if (other.bedType != null)
				return false;
		} else if (!bedType.equals(other.bedType))
			return false;
		if (locationCode == null) {
			if (other.locationCode != null)
				return false;
		} else if (!locationCode.equals(other.locationCode))
			return false;
		if (modifyUser == null) {
			if (other.modifyUser != null)
				return false;
		} else if (!modifyUser.equals(other.modifyUser))
			return false;
		if (orgCode != other.orgCode)
			return false;
		return true;
	}
	
	
	
}