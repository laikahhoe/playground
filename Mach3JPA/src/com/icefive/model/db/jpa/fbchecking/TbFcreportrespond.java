package com.icefive.model.db.jpa.fbchecking;

import java.io.Serializable;

import javax.persistence.*;

import com.icefive.model.db.jpa.common.TbCclimitRev;

import java.sql.Timestamp;


/**
 * The persistent class for the TB_FCREPORTRESPOND database table.
 * 
 */
@Entity
@Table(name="TB_FCREPORTRESPOND", schema="FB_CHECKING")
@NamedQuery(name="TbFcreportrespond.findAll", query="SELECT t FROM TbFcreportrespond t")
public class TbFcreportrespond implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="FCRP_FCRPID")
	private int fcrpFcrpid;

	@Column(name="FCCR_PARTYTYPE")
	private String fccrPartytype;

	@Column(name="FCRP_APPNO")
	private String fcrpAppno;


	@Column(name="FCRP_CIFNO")
	private String fcrpCifno;

	@Column(name="FCRP_CORRELID")
	private String fcrpCorrelid;

	@Column(name="FCRP_CREATEDDATE")
	private Timestamp fcrpCreateddate;

	@Column(name="FCRP_DIRECTION")
	private String fcrpDirection;

	@Column(name="FCRP_ERROR")
	private String fcrpError;

	@Column(name="FCRP_OLDREPORTFLAG")
	private String fcrpOldreportflag;

	@Column(name="FCRP_QPRMID")
	private short fcrpQprmid;

	@Column(name="FCRP_REFNO")
	private String fcrpRefno;

	@Column(name="FCRP_REMARK")
	private String fcrpRemark;

	@Lob
	@Column(name="FCRP_RESPONDXML")
	private String fcrpRespondxml;

	@Column(name="FCRP_RESPTIMESTAMP")
	private Timestamp fcrpResptimestamp;

	@Column(name="FCRP_STATUSCODE")
	private String fcrpStatuscode;

	@Column(name="FCRP_UPDATEBY")
	private String fcrpUpdateby;

	@Column(name="FCRP_UPDATEDATE")
	private Timestamp fcrpUpdatedate;

	//bi-directional many-to-one association to TbFcreportrequest
	@ManyToOne
	@JoinColumn(name="FCRP_FRRQID", insertable=false,updatable = false )
	private TbFcreportrequest tbFcreportrequest;
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FCRP_REFNO", insertable= false, updatable=false)
	private TbCclimitRev tbCclimitRev;

	public TbCclimitRev getTbCclimitRev() {
		return tbCclimitRev;
	}

	public void setTbCclimitRev(TbCclimitRev tbCclimitRev) {
		this.tbCclimitRev = tbCclimitRev;
	}

	public TbFcreportrespond() {
	}

	public int getFcrpFcrpid() {
		return this.fcrpFcrpid;
	}

	public void setFcrpFcrpid(int fcrpFcrpid) {
		this.fcrpFcrpid = fcrpFcrpid;
	}

	public String getFccrPartytype() {
		return this.fccrPartytype;
	}

	public void setFccrPartytype(String fccrPartytype) {
		this.fccrPartytype = fccrPartytype;
	}

	public String getFcrpAppno() {
		return this.fcrpAppno;
	}

	public void setFcrpAppno(String fcrpAppno) {
		this.fcrpAppno = fcrpAppno;
	}

	
	public String getFcrpCifno() {
		return this.fcrpCifno;
	}

	public void setFcrpCifno(String fcrpCifno) {
		this.fcrpCifno = fcrpCifno;
	}

	public String getFcrpCorrelid() {
		return this.fcrpCorrelid;
	}

	public void setFcrpCorrelid(String fcrpCorrelid) {
		this.fcrpCorrelid = fcrpCorrelid;
	}

	public Timestamp getFcrpCreateddate() {
		return this.fcrpCreateddate;
	}

	public void setFcrpCreateddate(Timestamp fcrpCreateddate) {
		this.fcrpCreateddate = fcrpCreateddate;
	}

	public String getFcrpDirection() {
		return this.fcrpDirection;
	}

	public void setFcrpDirection(String fcrpDirection) {
		this.fcrpDirection = fcrpDirection;
	}

	public String getFcrpError() {
		return this.fcrpError;
	}

	public void setFcrpError(String fcrpError) {
		this.fcrpError = fcrpError;
	}

	public String getFcrpOldreportflag() {
		return this.fcrpOldreportflag;
	}

	public void setFcrpOldreportflag(String fcrpOldreportflag) {
		this.fcrpOldreportflag = fcrpOldreportflag;
	}

	public short getFcrpQprmid() {
		return this.fcrpQprmid;
	}

	public void setFcrpQprmid(short fcrpQprmid) {
		this.fcrpQprmid = fcrpQprmid;
	}

	public String getFcrpRefno() {
		return this.fcrpRefno;
	}

	public void setFcrpRefno(String fcrpRefno) {
		this.fcrpRefno = fcrpRefno;
	}

	public String getFcrpRemark() {
		return this.fcrpRemark;
	}

	public void setFcrpRemark(String fcrpRemark) {
		this.fcrpRemark = fcrpRemark;
	}

	public String getFcrpRespondxml() {
		return this.fcrpRespondxml;
	}

	public void setFcrpRespondxml(String fcrpRespondxml) {
		this.fcrpRespondxml = fcrpRespondxml;
	}

	public Timestamp getFcrpResptimestamp() {
		return this.fcrpResptimestamp;
	}

	public void setFcrpResptimestamp(Timestamp fcrpResptimestamp) {
		this.fcrpResptimestamp = fcrpResptimestamp;
	}

	public String getFcrpStatuscode() {
		return this.fcrpStatuscode;
	}

	public void setFcrpStatuscode(String fcrpStatuscode) {
		this.fcrpStatuscode = fcrpStatuscode;
	}

	public String getFcrpUpdateby() {
		return this.fcrpUpdateby;
	}

	public void setFcrpUpdateby(String fcrpUpdateby) {
		this.fcrpUpdateby = fcrpUpdateby;
	}

	public Timestamp getFcrpUpdatedate() {
		return this.fcrpUpdatedate;
	}

	public void setFcrpUpdatedate(Timestamp fcrpUpdatedate) {
		this.fcrpUpdatedate = fcrpUpdatedate;
	}

	public TbFcreportrequest getTbFcreportrequest() {
		return this.tbFcreportrequest;
	}

	public void setTbFcreportrequest(TbFcreportrequest tbFcreportrequest) {
		this.tbFcreportrequest = tbFcreportrequest;
	}

}