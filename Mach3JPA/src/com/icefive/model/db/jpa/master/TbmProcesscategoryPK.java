package com.icefive.model.db.jpa.master;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the TBM_PROCESSCATEGORY database table.
 * 
 */
@Embeddable
public class TbmProcesscategoryPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="MPCC_LOANTYPEID")
	private short mpccLoantypeid;

	@Column(name="MPCC_PROCESSTYPEID")
	private short mpccProcesstypeid;

	@Column(name="MPCC_PROCESSCATEGORYID")
	private short mpccProcesscategoryid;

	public TbmProcesscategoryPK() {
	}
	public short getMpccLoantypeid() {
		return this.mpccLoantypeid;
	}
	public void setMpccLoantypeid(short mpccLoantypeid) {
		this.mpccLoantypeid = mpccLoantypeid;
	}
	public short getMpccProcesstypeid() {
		return this.mpccProcesstypeid;
	}
	public void setMpccProcesstypeid(short mpccProcesstypeid) {
		this.mpccProcesstypeid = mpccProcesstypeid;
	}
	public short getMpccProcesscategoryid() {
		return this.mpccProcesscategoryid;
	}
	public void setMpccProcesscategoryid(short mpccProcesscategoryid) {
		this.mpccProcesscategoryid = mpccProcesscategoryid;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TbmProcesscategoryPK)) {
			return false;
		}
		TbmProcesscategoryPK castOther = (TbmProcesscategoryPK)other;
		return 
			(this.mpccLoantypeid == castOther.mpccLoantypeid)
			&& (this.mpccProcesstypeid == castOther.mpccProcesstypeid)
			&& (this.mpccProcesscategoryid == castOther.mpccProcesscategoryid);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) this.mpccLoantypeid);
		hash = hash * prime + ((int) this.mpccProcesstypeid);
		hash = hash * prime + ((int) this.mpccProcesscategoryid);
		
		return hash;
	}
}