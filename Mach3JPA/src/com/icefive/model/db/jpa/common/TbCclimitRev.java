package com.icefive.model.db.jpa.common;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the TB_CCLIMIT_REV database table.
 * 
 */
@Entity
@Table(name="TB_CCLIMIT_REV",schema="COMMON")
@NamedQueries({
	@NamedQuery(name="TbCclimitRev.findAll", query="SELECT t FROM TbCclimitRev t"),
    @NamedQuery(name="TbCclimitRev.findAllBySubmittedDate",
    			query="SELECT t FROM TbCclimitRev t WHERE t.clrSubmittedDate >= :clrSubmittedDateStartTime and t.clrSubmittedDate < :clrSubmittedDateEndTime ")
}) 

public class TbCclimitRev implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CLR_APPNO")
	private String clrAppno;

	@Column(name="CLR_CARDNO")
	private String clrCardno;

	@Column(name="CLR_CHECKEDOUT_BY")
	private String clrCheckedoutBy;

	@Column(name="CLR_CHECKEDOUT_DATE")
	private Timestamp clrCheckedoutDate;

	@Column(name="CLR_CIFNO")
	private String clrCifno;

	@Column(name="CLR_COMPLETED_BY")
	private String clrCompletedBy;

	@Column(name="CLR_COMPLETED_DATE")
	private Timestamp clrCompletedDate;

	@Column(name="CLR_CREATED_BY")
	private String clrCreatedBy;

	@Column(name="CLR_CREATED_DATE")
	private Timestamp clrCreatedDate;

	@Column(name="CLR_CURRENT_LIMIT_CODE")
	private String clrCurrentLimitCode;

	@Column(name="CLR_DISPOSITION")
	private String clrDisposition;

	@Column(name="CLR_DISPOSITION_REASON")
	private String clrDispositionReason;

	@Column(name="CLR_FINALJUDGED_BY")
	private String clrFinaljudgedBy;

	@Column(name="CLR_FINALJUDGED_DATE")
	private Timestamp clrFinaljudgedDate;

	@Column(name="CLR_JUDGED_LIMIT_CODE")
	private String clrJudgedLimitCode;

	@Column(name="CLR_LAST_PREJUDGEHISTID")
	private int clrLastPrejudgehistid;

	@Column(name="CLR_PREJUDGED_DATE")
	private Timestamp clrPrejudgedDate;

	@Column(name="CLR_PRMID")
	private int clrPrmid;

	@Column(name="CLR_PROPOSED_LIMIT_CODE")
	private String clrProposedLimitCode;

	@Column(name="CLR_REQBY")
	private String clrReqby;

	@Column(name="CLR_REQTYPE")
	private String clrReqtype;

	@Column(name="CLR_RISKGROUP")
	private String clrRiskgroup;

	@Column(name="CLR_STATUS")
	private String clrStatus;

	@Column(name="CLR_SUBMITTED_BY")
	private String clrSubmittedBy;

	@Column(name="CLR_SUBMITTED_DATE")
	private Timestamp clrSubmittedDate;

	@Temporal(TemporalType.DATE)
	@Column(name="CLR_TICL_END_DATE")
	private Date clrTiclEndDate;

	@Temporal(TemporalType.DATE)
	@Column(name="CLR_TICL_START_DATE")
	private Date clrTiclStartDate;

	@Column(name="CLR_UPDATED_BY")
	private String clrUpdatedBy;

	@Column(name="CLR_UPDATED_DATE")
	private Timestamp clrUpdatedDate;

	@Column(name="CLR_VER")
	private int clrVer;

	public TbCclimitRev() {
	}

	public String getClrAppno() {
		return this.clrAppno;
	}

	public void setClrAppno(String clrAppno) {
		this.clrAppno = clrAppno;
	}

	public String getClrCardno() {
		return this.clrCardno;
	}

	public void setClrCardno(String clrCardno) {
		this.clrCardno = clrCardno;
	}

	public String getClrCheckedoutBy() {
		return this.clrCheckedoutBy;
	}

	public void setClrCheckedoutBy(String clrCheckedoutBy) {
		this.clrCheckedoutBy = clrCheckedoutBy;
	}

	public Timestamp getClrCheckedoutDate() {
		return this.clrCheckedoutDate;
	}

	public void setClrCheckedoutDate(Timestamp clrCheckedoutDate) {
		this.clrCheckedoutDate = clrCheckedoutDate;
	}

	public String getClrCifno() {
		return this.clrCifno;
	}

	public void setClrCifno(String clrCifno) {
		this.clrCifno = clrCifno;
	}

	public String getClrCompletedBy() {
		return this.clrCompletedBy;
	}

	public void setClrCompletedBy(String clrCompletedBy) {
		this.clrCompletedBy = clrCompletedBy;
	}

	public Timestamp getClrCompletedDate() {
		return this.clrCompletedDate;
	}

	public void setClrCompletedDate(Timestamp clrCompletedDate) {
		this.clrCompletedDate = clrCompletedDate;
	}

	public String getClrCreatedBy() {
		return this.clrCreatedBy;
	}

	public void setClrCreatedBy(String clrCreatedBy) {
		this.clrCreatedBy = clrCreatedBy;
	}

	public Timestamp getClrCreatedDate() {
		return this.clrCreatedDate;
	}

	public void setClrCreatedDate(Timestamp clrCreatedDate) {
		this.clrCreatedDate = clrCreatedDate;
	}

	public String getClrCurrentLimitCode() {
		return this.clrCurrentLimitCode;
	}

	public void setClrCurrentLimitCode(String clrCurrentLimitCode) {
		this.clrCurrentLimitCode = clrCurrentLimitCode;
	}

	public String getClrDisposition() {
		return this.clrDisposition;
	}

	public void setClrDisposition(String clrDisposition) {
		this.clrDisposition = clrDisposition;
	}

	public String getClrDispositionReason() {
		return this.clrDispositionReason;
	}

	public void setClrDispositionReason(String clrDispositionReason) {
		this.clrDispositionReason = clrDispositionReason;
	}

	public String getClrFinaljudgedBy() {
		return this.clrFinaljudgedBy;
	}

	public void setClrFinaljudgedBy(String clrFinaljudgedBy) {
		this.clrFinaljudgedBy = clrFinaljudgedBy;
	}

	public Timestamp getClrFinaljudgedDate() {
		return this.clrFinaljudgedDate;
	}

	public void setClrFinaljudgedDate(Timestamp clrFinaljudgedDate) {
		this.clrFinaljudgedDate = clrFinaljudgedDate;
	}

	public String getClrJudgedLimitCode() {
		return this.clrJudgedLimitCode;
	}

	public void setClrJudgedLimitCode(String clrJudgedLimitCode) {
		this.clrJudgedLimitCode = clrJudgedLimitCode;
	}

	public int getClrLastPrejudgehistid() {
		return this.clrLastPrejudgehistid;
	}

	public void setClrLastPrejudgehistid(int clrLastPrejudgehistid) {
		this.clrLastPrejudgehistid = clrLastPrejudgehistid;
	}

	public Timestamp getClrPrejudgedDate() {
		return this.clrPrejudgedDate;
	}

	public void setClrPrejudgedDate(Timestamp clrPrejudgedDate) {
		this.clrPrejudgedDate = clrPrejudgedDate;
	}

	public int getClrPrmid() {
		return this.clrPrmid;
	}

	public void setClrPrmid(int clrPrmid) {
		this.clrPrmid = clrPrmid;
	}

	public String getClrProposedLimitCode() {
		return this.clrProposedLimitCode;
	}

	public void setClrProposedLimitCode(String clrProposedLimitCode) {
		this.clrProposedLimitCode = clrProposedLimitCode;
	}

	public String getClrReqby() {
		return this.clrReqby;
	}

	public void setClrReqby(String clrReqby) {
		this.clrReqby = clrReqby;
	}

	public String getClrReqtype() {
		return this.clrReqtype;
	}

	public void setClrReqtype(String clrReqtype) {
		this.clrReqtype = clrReqtype;
	}

	public String getClrRiskgroup() {
		return this.clrRiskgroup;
	}

	public void setClrRiskgroup(String clrRiskgroup) {
		this.clrRiskgroup = clrRiskgroup;
	}

	public String getClrStatus() {
		return this.clrStatus;
	}

	public void setClrStatus(String clrStatus) {
		this.clrStatus = clrStatus;
	}

	public String getClrSubmittedBy() {
		return this.clrSubmittedBy;
	}

	public void setClrSubmittedBy(String clrSubmittedBy) {
		this.clrSubmittedBy = clrSubmittedBy;
	}

	public Timestamp getClrSubmittedDate() {
		return this.clrSubmittedDate;
	}

	public void setClrSubmittedDate(Timestamp clrSubmittedDate) {
		this.clrSubmittedDate = clrSubmittedDate;
	}

	public Date getClrTiclEndDate() {
		return this.clrTiclEndDate;
	}

	public void setClrTiclEndDate(Date clrTiclEndDate) {
		this.clrTiclEndDate = clrTiclEndDate;
	}

	public Date getClrTiclStartDate() {
		return this.clrTiclStartDate;
	}

	public void setClrTiclStartDate(Date clrTiclStartDate) {
		this.clrTiclStartDate = clrTiclStartDate;
	}

	public String getClrUpdatedBy() {
		return this.clrUpdatedBy;
	}

	public void setClrUpdatedBy(String clrUpdatedBy) {
		this.clrUpdatedBy = clrUpdatedBy;
	}

	public Timestamp getClrUpdatedDate() {
		return this.clrUpdatedDate;
	}

	public void setClrUpdatedDate(Timestamp clrUpdatedDate) {
		this.clrUpdatedDate = clrUpdatedDate;
	}

	public int getClrVer() {
		return this.clrVer;
	}

	public void setClrVer(int clrVer) {
		this.clrVer = clrVer;
	}

}