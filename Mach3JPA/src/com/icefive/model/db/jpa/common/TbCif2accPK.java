package com.icefive.model.db.jpa.common;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the TB_CIF2ACC database table.
 * 
 */
@Embeddable
public class TbCif2accPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CFCA_CIFNO")
	private String cfcaCifno;

	@Column(name="CFCA_APPNO")
	private String cfcaAppno;

	public TbCif2accPK() {
	}
	public String getCfcaCifno() {
		return this.cfcaCifno;
	}
	public void setCfcaCifno(String cfcaCifno) {
		this.cfcaCifno = cfcaCifno;
	}
	public String getCfcaAppno() {
		return this.cfcaAppno;
	}
	public void setCfcaAppno(String cfcaAppno) {
		this.cfcaAppno = cfcaAppno;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TbCif2accPK)) {
			return false;
		}
		TbCif2accPK castOther = (TbCif2accPK)other;
		return 
			this.cfcaCifno.equals(castOther.cfcaCifno)
			&& this.cfcaAppno.equals(castOther.cfcaAppno);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cfcaCifno.hashCode();
		hash = hash * prime + this.cfcaAppno.hashCode();
		
		return hash;
	}
}