package com.icefive.model.db.jpa.master;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the TBM_NAMECODE database table.
 * 
 */
@Embeddable
public class TbmNamecodePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="NMCD_NMCDCODE")
	private String nmcdNmcdcode;

	@Column(name="NMCD_VALUE")
	private String nmcdValue;

	public TbmNamecodePK() {
	}
	public String getNmcdNmcdcode() {
		return this.nmcdNmcdcode;
	}
	public void setNmcdNmcdcode(String nmcdNmcdcode) {
		this.nmcdNmcdcode = nmcdNmcdcode;
	}
	public String getNmcdValue() {
		return this.nmcdValue;
	}
	public void setNmcdValue(String nmcdValue) {
		this.nmcdValue = nmcdValue;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TbmNamecodePK)) {
			return false;
		}
		TbmNamecodePK castOther = (TbmNamecodePK)other;
		return 
			this.nmcdNmcdcode.equals(castOther.nmcdNmcdcode)
			&& this.nmcdValue.equals(castOther.nmcdValue);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.nmcdNmcdcode.hashCode();
		hash = hash * prime + this.nmcdValue.hashCode();
		
		return hash;
	}
}