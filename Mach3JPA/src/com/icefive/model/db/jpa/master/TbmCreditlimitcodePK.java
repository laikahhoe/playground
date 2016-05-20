package com.icefive.model.db.jpa.master;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the TBM_CREDITLIMITCODE database table.
 * 
 */
@Embeddable
public class TbmCreditlimitcodePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CLC_CREDITLIMITCODE1")
	private String clcCreditlimitcode1;

	@Column(name="CLC_CREDITLIMITCODE2")
	private String clcCreditlimitcode2;

	public TbmCreditlimitcodePK() {
	}
	public String getClcCreditlimitcode1() {
		return this.clcCreditlimitcode1;
	}
	public void setClcCreditlimitcode1(String clcCreditlimitcode1) {
		this.clcCreditlimitcode1 = clcCreditlimitcode1;
	}
	public String getClcCreditlimitcode2() {
		return this.clcCreditlimitcode2;
	}
	public void setClcCreditlimitcode2(String clcCreditlimitcode2) {
		this.clcCreditlimitcode2 = clcCreditlimitcode2;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TbmCreditlimitcodePK)) {
			return false;
		}
		TbmCreditlimitcodePK castOther = (TbmCreditlimitcodePK)other;
		return 
			this.clcCreditlimitcode1.equals(castOther.clcCreditlimitcode1)
			&& this.clcCreditlimitcode2.equals(castOther.clcCreditlimitcode2);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.clcCreditlimitcode1.hashCode();
		hash = hash * prime + this.clcCreditlimitcode2.hashCode();
		
		return hash;
	}
}