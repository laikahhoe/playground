package com.icefive.model.db.jpa.common;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the TB_APP2COMMITMENT database table.
 * 
 */
@Embeddable
public class TbApp2commitmentPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="APC_ACCRELID")
	private String apcAccrelid;

	@Column(name="APC_APPLICATIONNUMBER")
	private String apcApplicationnumber;

	@Column(name="APC_COMMITMENTTYPE")
	private String apcCommitmenttype;

	public TbApp2commitmentPK() {
	}
	public String getApcAccrelid() {
		return this.apcAccrelid;
	}
	public void setApcAccrelid(String apcAccrelid) {
		this.apcAccrelid = apcAccrelid;
	}
	public String getApcApplicationnumber() {
		return this.apcApplicationnumber;
	}
	public void setApcApplicationnumber(String apcApplicationnumber) {
		this.apcApplicationnumber = apcApplicationnumber;
	}
	public String getApcCommitmenttype() {
		return this.apcCommitmenttype;
	}
	public void setApcCommitmenttype(String apcCommitmenttype) {
		this.apcCommitmenttype = apcCommitmenttype;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TbApp2commitmentPK)) {
			return false;
		}
		TbApp2commitmentPK castOther = (TbApp2commitmentPK)other;
		return 
			this.apcAccrelid.equals(castOther.apcAccrelid)
			&& this.apcApplicationnumber.equals(castOther.apcApplicationnumber)
			&& this.apcCommitmenttype.equals(castOther.apcCommitmenttype);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.apcAccrelid.hashCode();
		hash = hash * prime + this.apcApplicationnumber.hashCode();
		hash = hash * prime + this.apcCommitmenttype.hashCode();
		
		return hash;
	}
}