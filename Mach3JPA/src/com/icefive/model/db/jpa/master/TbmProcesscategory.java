package com.icefive.model.db.jpa.master;

import java.io.Serializable;

import javax.persistence.*;

import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the TBM_PROCESSCATEGORY database table.
 * 
 */
@Entity
@Table(name="TBM_PROCESSCATEGORY",schema="MASTER")
@NamedQuery(name="TbmProcesscategory.findAll", query="SELECT t FROM TbmProcesscategory t")
public class TbmProcesscategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TbmProcesscategoryPK id;

	@Column(name="MPCC_CREATEDBY")
	private String mpccCreatedby;

	@Column(name="MPCC_CREATEDDATE")
	private Timestamp mpccCreateddate;

	@Column(name="MPCC_FINANCEPRICEMAX")
	private BigDecimal mpccFinancepricemax;

	@Column(name="MPCC_FINANCEPRICEMIN")
	private BigDecimal mpccFinancepricemin;

	@Column(name="MPCC_LOANCODE")
	private short mpccLoancode;

	@Column(name="MPCC_UPDATEDBY")
	private String mpccUpdatedby;

	@Column(name="MPCC_UPDATEDDATE")
	private Timestamp mpccUpdateddate;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "MPCC_PROCESSTYPEID", referencedColumnName = "BIZM_PROCESSTYPEID", insertable=false, updatable=false)
	private TbmBusinessmatch35 tbmBusinessmatch;

	public TbmBusinessmatch35 getTbmBusinessmatch() {
		return tbmBusinessmatch;
	}

	public void setTbmBusinessmatch(TbmBusinessmatch35 tbmBusinessmatch) {
		this.tbmBusinessmatch = tbmBusinessmatch;
	}

	public TbmProcesscategory() {
	}

	public TbmProcesscategoryPK getId() {
		return this.id;
	}

	public void setId(TbmProcesscategoryPK id) {
		this.id = id;
	}

	public String getMpccCreatedby() {
		return this.mpccCreatedby;
	}

	public void setMpccCreatedby(String mpccCreatedby) {
		this.mpccCreatedby = mpccCreatedby;
	}

	public Timestamp getMpccCreateddate() {
		return this.mpccCreateddate;
	}

	public void setMpccCreateddate(Timestamp mpccCreateddate) {
		this.mpccCreateddate = mpccCreateddate;
	}

	public BigDecimal getMpccFinancepricemax() {
		return this.mpccFinancepricemax;
	}

	public void setMpccFinancepricemax(BigDecimal mpccFinancepricemax) {
		this.mpccFinancepricemax = mpccFinancepricemax;
	}

	public BigDecimal getMpccFinancepricemin() {
		return this.mpccFinancepricemin;
	}

	public void setMpccFinancepricemin(BigDecimal mpccFinancepricemin) {
		this.mpccFinancepricemin = mpccFinancepricemin;
	}

	public short getMpccLoancode() {
		return this.mpccLoancode;
	}

	public void setMpccLoancode(short mpccLoancode) {
		this.mpccLoancode = mpccLoancode;
	}

	public String getMpccUpdatedby() {
		return this.mpccUpdatedby;
	}

	public void setMpccUpdatedby(String mpccUpdatedby) {
		this.mpccUpdatedby = mpccUpdatedby;
	}

	public Timestamp getMpccUpdateddate() {
		return this.mpccUpdateddate;
	}

	public void setMpccUpdateddate(Timestamp mpccUpdateddate) {
		this.mpccUpdateddate = mpccUpdateddate;
	}

}