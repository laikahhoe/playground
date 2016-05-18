package com.icefive.model.db.jpa.common;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TB_CIF2ACC database table.
 * 
 */
@Entity
@Table(name="TB_CIF2ACC")
@NamedQuery(name="TbCif2acc.findAll", query="SELECT t FROM TbCif2acc t")
public class TbCif2acc implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TbCif2accPK id;

	@Column(name="CFCA_ACCOUNTNO")
	private String cfcaAccountno;

	@Column(name="CFCA_ACCRELID")
	private String cfcaAccrelid;

	@Column(name="CFCA_APPNO11")
	private String cfcaAppno11;

	@Column(name="CFCA_RELACCTYPE")
	private String cfcaRelacctype;

	@Column(name="CFCA_RELID")
	private String cfcaRelid;

	@Column(name="CFCA_RELSPEC")
	private String cfcaRelspec;

	public TbCif2acc() {
	}

	public TbCif2accPK getId() {
		return this.id;
	}

	public void setId(TbCif2accPK id) {
		this.id = id;
	}

	public String getCfcaAccountno() {
		return this.cfcaAccountno;
	}

	public void setCfcaAccountno(String cfcaAccountno) {
		this.cfcaAccountno = cfcaAccountno;
	}

	public String getCfcaAccrelid() {
		return this.cfcaAccrelid;
	}

	public void setCfcaAccrelid(String cfcaAccrelid) {
		this.cfcaAccrelid = cfcaAccrelid;
	}

	public String getCfcaAppno11() {
		return this.cfcaAppno11;
	}

	public void setCfcaAppno11(String cfcaAppno11) {
		this.cfcaAppno11 = cfcaAppno11;
	}

	public String getCfcaRelacctype() {
		return this.cfcaRelacctype;
	}

	public void setCfcaRelacctype(String cfcaRelacctype) {
		this.cfcaRelacctype = cfcaRelacctype;
	}

	public String getCfcaRelid() {
		return this.cfcaRelid;
	}

	public void setCfcaRelid(String cfcaRelid) {
		this.cfcaRelid = cfcaRelid;
	}

	public String getCfcaRelspec() {
		return this.cfcaRelspec;
	}

	public void setCfcaRelspec(String cfcaRelspec) {
		this.cfcaRelspec = cfcaRelspec;
	}

}