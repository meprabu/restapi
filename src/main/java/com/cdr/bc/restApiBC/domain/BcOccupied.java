package com.cdr.bc.restApiBC.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the bc_occupied database table.
 * 
 */
@Entity
@Table(name="bc_occupied")
@NamedQuery(name="BcOccupied.findAll", query="SELECT b FROM BcOccupied b")
public class BcOccupied implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@EmbeddedId 
	OccupiedId occupiedId;

	
	
	@Column(name="occupied_coed")
	private int occupiedCoed;

	@Column(name="occupied_female")
	private int occupiedFemale;

	@Column(name="occupied_male")
	private int occupiedMale;
	
	@Column(name="pending_adm")
	private int pendingAdm;
	
	@Column(name="pending_dis")
	private int pendingDis;

	public BcOccupied() {
	}
	

	public int getOccupiedCoed() {
		return this.occupiedCoed;
	}

	public void setOccupiedCoed(int occupiedCoed) {
		this.occupiedCoed = occupiedCoed;
	}

	public int getOccupiedFemale() {
		return this.occupiedFemale;
	}

	public void setOccupiedFemale(int occupiedFemale) {
		this.occupiedFemale = occupiedFemale;
	}

	public int getOccupiedMale() {
		return this.occupiedMale;
	}

	public void setOccupiedMale(int occupiedMale) {
		this.occupiedMale = occupiedMale;
	}


	public OccupiedId getOccupiedId() {
		return occupiedId;
	}


	public void setOccupiedId(OccupiedId occupiedId) {
		this.occupiedId = occupiedId;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public int getPendingAdm() {
		return pendingAdm;
	}


	public void setPendingAdm(int pendingAdm) {
		this.pendingAdm = pendingAdm;
	}


	public int getPendingDis() {
		return pendingDis;
	}


	public void setPendingDis(int pendingDis) {
		this.pendingDis = pendingDis;
	}


	

	

}