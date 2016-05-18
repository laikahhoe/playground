package com.icefive.model.db.jpa.common;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the TB_CIFEMPHIST database table.
 * 
 */
@Embeddable
public class TbCifemphistPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CFEM_CIFNO")
	private String cfemCifno;

	@Column(name="CFEM_EMPLOYERNAME1")
	private String cfemEmployername1;

	@Column(name="CFEM_EMPTYPE")
	private String cfemEmptype;

	public TbCifemphistPK() {
	}
	public String getCfemCifno() {
		return this.cfemCifno;
	}
	public void setCfemCifno(String cfemCifno) {
		this.cfemCifno = cfemCifno;
	}
	public String getCfemEmployername1() {
		return this.cfemEmployername1;
	}
	public void setCfemEmployername1(String cfemEmployername1) {
		this.cfemEmployername1 = cfemEmployername1;
	}
	public String getCfemEmptype() {
		return this.cfemEmptype;
	}
	public void setCfemEmptype(String cfemEmptype) {
		this.cfemEmptype = cfemEmptype;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TbCifemphistPK)) {
			return false;
		}
		TbCifemphistPK castOther = (TbCifemphistPK)other;
		return 
			this.cfemCifno.equals(castOther.cfemCifno)
			&& this.cfemEmployername1.equals(castOther.cfemEmployername1)
			&& this.cfemEmptype.equals(castOther.cfemEmptype);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cfemCifno.hashCode();
		hash = hash * prime + this.cfemEmployername1.hashCode();
		hash = hash * prime + this.cfemEmptype.hashCode();
		
		return hash;
	}
}