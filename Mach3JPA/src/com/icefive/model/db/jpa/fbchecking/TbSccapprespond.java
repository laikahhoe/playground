package com.icefive.model.db.jpa.fbchecking;

import java.io.Serializable;

import javax.persistence.*;

import com.icefive.model.db.jpa.common.TbCclimitRev;

import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the TB_SCCAPPRESPOND database table.
 * 
 */
@Entity
@Table(schema="FB_CHECKING",name="TB_SCCAPPRESPOND")
@NamedQuery(name="TbSccapprespond.findAll", query="SELECT t FROM TbSccapprespond t")
public class TbSccapprespond implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SARP_SARPID")
	private int sarpSarpid;

	@Column(name="SARP_APPNO")
	private String sarpAppno;

	@Column(name="SARP_COMPLETEFLAG")
	private String sarpCompleteflag;

	@Column(name="SARP_CREATEDATE")
	private Timestamp sarpCreatedate;

	@Column(name="SARP_CREATEDBY")
	private String sarpCreatedby;

	@Column(name="SARP_ERROR")
	private String sarpError;

	@Column(name="SARP_ERRORS")
	private String sarpErrors;

	@Column(name="SARP_FINALSCORE")
	private BigDecimal sarpFinalscore;

	@Column(name="SARP_PRODUCTID")
	private String sarpProductid;

	@Column(name="SARP_REFNO")
	private String sarpRefno;

	@Column(name="SARP_REMARK")
	private String sarpRemark;

	@Column(name="SARP_RESPONDXML")
	private String sarpRespondxml;

	@Column(name="SARP_RESPTIMESTAMP")
	private Timestamp sarpResptimestamp;

	@Column(name="SARP_SARQID")
	private int sarpSarqid;

	@Column(name="SARP_STATUSCODE")
	private String sarpStatuscode;

	@Column(name="SARP_SUBPRODID")
	private String sarpSubprodid;

	@Column(name="SARP_SYSSTEMRECOMMENDATION")
	private String sarpSysstemrecommendation;

	@Column(name="SARP_UPDATEDBY")
	private String sarpUpdatedby;

	@Column(name="SARP_UPDATEDDATE")
	private Timestamp sarpUpdateddate;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="SARP_APPNO", insertable= false, updatable=false)
	private TbCclimitRev tbCclimitRev;

	public TbCclimitRev getTbCclimitRev() {
		return tbCclimitRev;
	}

	public void setTbCclimitRev(TbCclimitRev tbCclimitRev) {
		this.tbCclimitRev = tbCclimitRev;
	}

	

	public TbSccapprespond() {
	}

	public int getSarpSarpid() {
		return this.sarpSarpid;
	}

	public void setSarpSarpid(int sarpSarpid) {
		this.sarpSarpid = sarpSarpid;
	}

	public String getSarpAppno() {
		return this.sarpAppno;
	}

	public void setSarpAppno(String sarpAppno) {
		this.sarpAppno = sarpAppno;
	}

	public String getSarpCompleteflag() {
		return this.sarpCompleteflag;
	}

	public void setSarpCompleteflag(String sarpCompleteflag) {
		this.sarpCompleteflag = sarpCompleteflag;
	}

	public Timestamp getSarpCreatedate() {
		return this.sarpCreatedate;
	}

	public void setSarpCreatedate(Timestamp sarpCreatedate) {
		this.sarpCreatedate = sarpCreatedate;
	}

	public String getSarpCreatedby() {
		return this.sarpCreatedby;
	}

	public void setSarpCreatedby(String sarpCreatedby) {
		this.sarpCreatedby = sarpCreatedby;
	}

	public String getSarpError() {
		return this.sarpError;
	}

	public void setSarpError(String sarpError) {
		this.sarpError = sarpError;
	}

	public String getSarpErrors() {
		return this.sarpErrors;
	}

	public void setSarpErrors(String sarpErrors) {
		this.sarpErrors = sarpErrors;
	}

	public BigDecimal getSarpFinalscore() {
		return this.sarpFinalscore;
	}

	public void setSarpFinalscore(BigDecimal sarpFinalscore) {
		this.sarpFinalscore = sarpFinalscore;
	}

	public String getSarpProductid() {
		return this.sarpProductid;
	}

	public void setSarpProductid(String sarpProductid) {
		this.sarpProductid = sarpProductid;
	}

	public String getSarpRefno() {
		return this.sarpRefno;
	}

	public void setSarpRefno(String sarpRefno) {
		this.sarpRefno = sarpRefno;
	}

	public String getSarpRemark() {
		return this.sarpRemark;
	}

	public void setSarpRemark(String sarpRemark) {
		this.sarpRemark = sarpRemark;
	}

	public String getSarpRespondxml() {
		return this.sarpRespondxml;
	}

	public void setSarpRespondxml(String sarpRespondxml) {
		this.sarpRespondxml = sarpRespondxml;
	}

	public Timestamp getSarpResptimestamp() {
		return this.sarpResptimestamp;
	}

	public void setSarpResptimestamp(Timestamp sarpResptimestamp) {
		this.sarpResptimestamp = sarpResptimestamp;
	}

	public int getSarpSarqid() {
		return this.sarpSarqid;
	}

	public void setSarpSarqid(int sarpSarqid) {
		this.sarpSarqid = sarpSarqid;
	}

	public String getSarpStatuscode() {
		return this.sarpStatuscode;
	}

	public void setSarpStatuscode(String sarpStatuscode) {
		this.sarpStatuscode = sarpStatuscode;
	}

	public String getSarpSubprodid() {
		return this.sarpSubprodid;
	}

	public void setSarpSubprodid(String sarpSubprodid) {
		this.sarpSubprodid = sarpSubprodid;
	}

	public String getSarpSysstemrecommendation() {
		return this.sarpSysstemrecommendation;
	}

	public void setSarpSysstemrecommendation(String sarpSysstemrecommendation) {
		this.sarpSysstemrecommendation = sarpSysstemrecommendation;
	}

	public String getSarpUpdatedby() {
		return this.sarpUpdatedby;
	}

	public void setSarpUpdatedby(String sarpUpdatedby) {
		this.sarpUpdatedby = sarpUpdatedby;
	}

	public Timestamp getSarpUpdateddate() {
		return this.sarpUpdateddate;
	}

	public void setSarpUpdateddate(Timestamp sarpUpdateddate) {
		this.sarpUpdateddate = sarpUpdateddate;
	}

}