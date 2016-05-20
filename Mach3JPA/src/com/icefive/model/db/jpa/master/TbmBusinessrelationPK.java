package com.icefive.model.db.jpa.master;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the TBM_BUSINESSRELATION database table.
 * 
 */
@Embeddable
public class TbmBusinessrelationPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="BIZR_BIZCODE")
	private String bizrBizcode;

	@Column(name="BIZR_PRODUCTCODE")
	private String bizrProductcode;

	public TbmBusinessrelationPK() {
	}
	public String getBizrBizcode() {
		return this.bizrBizcode;
	}
	public void setBizrBizcode(String bizrBizcode) {
		this.bizrBizcode = bizrBizcode;
	}
	public String getBizrProductcode() {
		return this.bizrProductcode;
	}
	public void setBizrProductcode(String bizrProductcode) {
		this.bizrProductcode = bizrProductcode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TbmBusinessrelationPK)) {
			return false;
		}
		TbmBusinessrelationPK castOther = (TbmBusinessrelationPK)other;
		return 
			this.bizrBizcode.equals(castOther.bizrBizcode)
			&& this.bizrProductcode.equals(castOther.bizrProductcode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.bizrBizcode.hashCode();
		hash = hash * prime + this.bizrProductcode.hashCode();
		
		return hash;
	}
}