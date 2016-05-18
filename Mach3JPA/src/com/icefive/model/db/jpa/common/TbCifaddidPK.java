package com.icefive.model.db.jpa.common;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the TB_CIFADDID database table.
 * 
 */
@Embeddable
public class TbCifaddidPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CFAI_CIFNO")
	private String cfaiCifno;

	@Column(name="CFAI_IDTYPEID")
	private String cfaiIdtypeid;

	@Column(name="CFAI_IDNO")
	private String cfaiIdno;

	public TbCifaddidPK() {
	}
	public String getCfaiCifno() {
		return this.cfaiCifno;
	}
	public void setCfaiCifno(String cfaiCifno) {
		this.cfaiCifno = cfaiCifno;
	}
	public String getCfaiIdtypeid() {
		return this.cfaiIdtypeid;
	}
	public void setCfaiIdtypeid(String cfaiIdtypeid) {
		this.cfaiIdtypeid = cfaiIdtypeid;
	}
	public String getCfaiIdno() {
		return this.cfaiIdno;
	}
	public void setCfaiIdno(String cfaiIdno) {
		this.cfaiIdno = cfaiIdno;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TbCifaddidPK)) {
			return false;
		}
		TbCifaddidPK castOther = (TbCifaddidPK)other;
		return 
			this.cfaiCifno.equals(castOther.cfaiCifno)
			&& this.cfaiIdtypeid.equals(castOther.cfaiIdtypeid)
			&& this.cfaiIdno.equals(castOther.cfaiIdno);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cfaiCifno.hashCode();
		hash = hash * prime + this.cfaiIdtypeid.hashCode();
		hash = hash * prime + this.cfaiIdno.hashCode();
		
		return hash;
	}
}