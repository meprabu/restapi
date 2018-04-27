package com.cdr.bc.restApiBC.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the bc_bed_type database table.
 * 
 */
@Entity
@Table(name="bc_bed_type")
@NamedQuery(name="BcBedType.findAll", query="SELECT b FROM BcBedType b")
public class BcBedType implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="bed_type")
	private String bedType;

	@Column(name="bed_type_desc")
	private String bedTypeDesc;

	public BcBedType() {
	}

	public String getBedType() {
		return this.bedType;
	}

	public void setBedType(String bedType) {
		this.bedType = bedType;
	}

	public String getBedTypeDesc() {
		return this.bedTypeDesc;
	}

	public void setBedTypeDesc(String bedTypeDesc) {
		this.bedTypeDesc = bedTypeDesc;
	}

}