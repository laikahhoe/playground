package com.icefive.model.db.jpa.fbchecking;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.icefive.model.db.jpa.common.TbCclimitRev;
import com.icefive.model.db.jpa.common.TbCif;


/**
 * The persistent class for the TB_QFLOWRPT database table.
 * 
 */
@Entity
@Table(name="TB_QFLOWRPT", schema="FB_CHECKING")
@NamedQuery(name="TbQflowrpt.findAll", query="SELECT t FROM TbQflowrpt t")
public class TbQflowrpt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="QFR_RPTID")
	private int qfrRptid;

	@Column(name="QFR_APPLICANTIC")
	private String qfrApplicantic;

	@Column(name="QFR_APPNO")
	private String qfrAppno;

	@Column(name="QFR_AUTO")
	private String qfrAuto;

	@Column(name="QFR_CHECKEDINBY")
	private String qfrCheckedinby;

	@Column(name="QFR_CHECKEDINDATE")
	private Timestamp qfrCheckedindate;

	@Column(name="QFR_CHECKEDINQID")
	private short qfrCheckedinqid;

	@Column(name="QFR_CHECKEDOUTDATE")
	private Timestamp qfrCheckedoutdate;

	@Column(name="QFR_CIFNO")
	private String qfrCifno;

	@Column(name="QFR_COMPLETEDBY")
	private String qfrCompletedby;

	@Column(name="QFR_COMPLETEDDATE")
	private Timestamp qfrCompleteddate;

	@Column(name="QFR_CREDITLIMIT")
	private BigDecimal qfrCreditlimit;

	@Column(name="QFR_DISPLAYFLAG")
	private String qfrDisplayflag;

	@Column(name="QFR_EXTERNALSENDFLAG")
	private String qfrExternalsendflag;

	@Column(name="QFR_FCRPID")
	private int qfrFcrpid;

	@Column(name="QFR_FRRQID")
	private int qfrFrrqid;

	@Column(name="QFR_PARTYTYPE")
	private String qfrPartytype;

	@Column(name="QFR_PRMID")
	private int qfrPrmid;

	@Column(name="QFR_PROCESSSTATUS")
	private String qfrProcessstatus;

	@Column(name="QFR_PROCESSTYPE")
	private String qfrProcesstype;

	@Column(name="QFR_REMARK")
	private String qfrRemark;

	@Column(name="QFR_REPORTSTATUS")
	private String qfrReportstatus;

	@Column(name="QFR_SEQ")
	private int qfrSeq;

	@Column(name="QFR_SUBSEQ")
	private int qfrSubseq;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="QFR_APPNO", insertable= false, updatable = false)
	private TbCclimitRev tbCclimitRev;


	public TbCclimitRev getTbCclimitRev() {
		return tbCclimitRev;
	}

	public void setTbCclimitRev(TbCclimitRev tbCclimitRev) {
		this.tbCclimitRev = tbCclimitRev;
	}

	public TbQflowrpt() {
	}

	public int getQfrRptid() {
		return this.qfrRptid;
	}

	public void setQfrRptid(int qfrRptid) {
		this.qfrRptid = qfrRptid;
	}

	public String getQfrApplicantic() {
		return this.qfrApplicantic;
	}

	public void setQfrApplicantic(String qfrApplicantic) {
		this.qfrApplicantic = qfrApplicantic;
	}

	public String getQfrAppno() {
		return this.qfrAppno;
	}

	public void setQfrAppno(String qfrAppno) {
		this.qfrAppno = qfrAppno;
	}

	public String getQfrAuto() {
		return this.qfrAuto;
	}

	public void setQfrAuto(String qfrAuto) {
		this.qfrAuto = qfrAuto;
	}

	public String getQfrCheckedinby() {
		return this.qfrCheckedinby;
	}

	public void setQfrCheckedinby(String qfrCheckedinby) {
		this.qfrCheckedinby = qfrCheckedinby;
	}

	public Timestamp getQfrCheckedindate() {
		return this.qfrCheckedindate;
	}

	public void setQfrCheckedindate(Timestamp qfrCheckedindate) {
		this.qfrCheckedindate = qfrCheckedindate;
	}

	public short getQfrCheckedinqid() {
		return this.qfrCheckedinqid;
	}

	public void setQfrCheckedinqid(short qfrCheckedinqid) {
		this.qfrCheckedinqid = qfrCheckedinqid;
	}

	public Timestamp getQfrCheckedoutdate() {
		return this.qfrCheckedoutdate;
	}

	public void setQfrCheckedoutdate(Timestamp qfrCheckedoutdate) {
		this.qfrCheckedoutdate = qfrCheckedoutdate;
	}

	public String getQfrCifno() {
		return this.qfrCifno;
	}

	public void setQfrCifno(String qfrCifno) {
		this.qfrCifno = qfrCifno;
	}

	public String getQfrCompletedby() {
		return this.qfrCompletedby;
	}

	public void setQfrCompletedby(String qfrCompletedby) {
		this.qfrCompletedby = qfrCompletedby;
	}

	public Timestamp getQfrCompleteddate() {
		return this.qfrCompleteddate;
	}

	public void setQfrCompleteddate(Timestamp qfrCompleteddate) {
		this.qfrCompleteddate = qfrCompleteddate;
	}

	public BigDecimal getQfrCreditlimit() {
		return this.qfrCreditlimit;
	}

	public void setQfrCreditlimit(BigDecimal qfrCreditlimit) {
		this.qfrCreditlimit = qfrCreditlimit;
	}

	public String getQfrDisplayflag() {
		return this.qfrDisplayflag;
	}

	public void setQfrDisplayflag(String qfrDisplayflag) {
		this.qfrDisplayflag = qfrDisplayflag;
	}

	public String getQfrExternalsendflag() {
		return this.qfrExternalsendflag;
	}

	public void setQfrExternalsendflag(String qfrExternalsendflag) {
		this.qfrExternalsendflag = qfrExternalsendflag;
	}

	public int getQfrFcrpid() {
		return this.qfrFcrpid;
	}

	public void setQfrFcrpid(int qfrFcrpid) {
		this.qfrFcrpid = qfrFcrpid;
	}

	public int getQfrFrrqid() {
		return this.qfrFrrqid;
	}

	public void setQfrFrrqid(int qfrFrrqid) {
		this.qfrFrrqid = qfrFrrqid;
	}

	public String getQfrPartytype() {
		return this.qfrPartytype;
	}

	public void setQfrPartytype(String qfrPartytype) {
		this.qfrPartytype = qfrPartytype;
	}

	public int getQfrPrmid() {
		return this.qfrPrmid;
	}

	public void setQfrPrmid(int qfrPrmid) {
		this.qfrPrmid = qfrPrmid;
	}

	public String getQfrProcessstatus() {
		return this.qfrProcessstatus;
	}

	public void setQfrProcessstatus(String qfrProcessstatus) {
		this.qfrProcessstatus = qfrProcessstatus;
	}

	public String getQfrProcesstype() {
		return this.qfrProcesstype;
	}

	public void setQfrProcesstype(String qfrProcesstype) {
		this.qfrProcesstype = qfrProcesstype;
	}

	public String getQfrRemark() {
		return this.qfrRemark;
	}

	public void setQfrRemark(String qfrRemark) {
		this.qfrRemark = qfrRemark;
	}

	public String getQfrReportstatus() {
		return this.qfrReportstatus;
	}

	public void setQfrReportstatus(String qfrReportstatus) {
		this.qfrReportstatus = qfrReportstatus;
	}

	public int getQfrSeq() {
		return this.qfrSeq;
	}

	public void setQfrSeq(int qfrSeq) {
		this.qfrSeq = qfrSeq;
	}

	public int getQfrSubseq() {
		return this.qfrSubseq;
	}

	public void setQfrSubseq(int qfrSubseq) {
		this.qfrSubseq = qfrSubseq;
	}

}