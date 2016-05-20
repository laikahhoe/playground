package com.icefive.model.db.jpa.master;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TBM_CREDITLIMITCODE database table.
 * 
 */
@Entity
@Table(name="TBM_CREDITLIMITCODE", schema="MASTER")
@NamedQuery(name="TbmCreditlimitcode.findAll", query="SELECT t FROM TbmCreditlimitcode t")
public class TbmCreditlimitcode implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TbmCreditlimitcodePK id;

	@Column(name="CLC_CASHLIMIT")
	private BigDecimal clcCashlimit;

	@Column(name="CLC_HIERPURCHASE")
	private BigDecimal clcHierpurchase;

	@Temporal(TemporalType.DATE)
	@Column(name="CLC_INPUTDATE")
	private Date clcInputdate;

	@Column(name="CLC_OPERID")
	private String clcOperid;

	@Column(name="CLC_SHOPLIMIT")
	private BigDecimal clcShoplimit;

	@Temporal(TemporalType.DATE)
	@Column(name="CLC_UPDATEDATE")
	private Date clcUpdatedate;

	public TbmCreditlimitcode() {
	}

	public TbmCreditlimitcodePK getId() {
		return this.id;
	}

	public void setId(TbmCreditlimitcodePK id) {
		this.id = id;
	}

	public BigDecimal getClcCashlimit() {
		return this.clcCashlimit;
	}

	public void setClcCashlimit(BigDecimal clcCashlimit) {
		this.clcCashlimit = clcCashlimit;
	}

	public BigDecimal getClcHierpurchase() {
		return this.clcHierpurchase;
	}

	public void setClcHierpurchase(BigDecimal clcHierpurchase) {
		this.clcHierpurchase = clcHierpurchase;
	}

	public Date getClcInputdate() {
		return this.clcInputdate;
	}

	public void setClcInputdate(Date clcInputdate) {
		this.clcInputdate = clcInputdate;
	}

	public String getClcOperid() {
		return this.clcOperid;
	}

	public void setClcOperid(String clcOperid) {
		this.clcOperid = clcOperid;
	}

	public BigDecimal getClcShoplimit() {
		return this.clcShoplimit;
	}

	public void setClcShoplimit(BigDecimal clcShoplimit) {
		this.clcShoplimit = clcShoplimit;
	}

	public Date getClcUpdatedate() {
		return this.clcUpdatedate;
	}

	public void setClcUpdatedate(Date clcUpdatedate) {
		this.clcUpdatedate = clcUpdatedate;
	}

}