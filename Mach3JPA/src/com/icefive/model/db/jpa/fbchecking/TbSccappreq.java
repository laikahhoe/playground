package com.icefive.model.db.jpa.fbchecking;

import java.io.Serializable;

import javax.persistence.*;

import com.icefive.model.db.jpa.common.TbCclimitRev;

import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TB_SCCAPPREQ database table.
 * 
 */
@Entity
@Table(schema="FB_CHECKING", name="TB_SCCAPPREQ")
@NamedQuery(name="TbSccappreq.findAll", query="SELECT t FROM TbSccappreq t")
public class TbSccappreq implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SARQ_SARQID")
	private int sarqSarqid;

	@Column(name="SARQ_ACADEMICID")
	private String sarqAcademicid;

	@Column(name="SARQ_AGE")
	private short sarqAge;

	@Column(name="SARQ_APPLICANTNAME")
	private String sarqApplicantname;

	@Column(name="SARQ_APPLICATIONDATE")
	private Timestamp sarqApplicationdate;

	@Column(name="SARQ_APPNO")
	private String sarqAppno;

	@Column(name="SARQ_BASICGROUP")
	private String sarqBasicgroup;

	@Column(name="SARQ_CANCELEDBY")
	private String sarqCanceledby;

	@Column(name="SARQ_CANCELEDDATE")
	private Timestamp sarqCanceleddate;

	@Column(name="SARQ_CANCELFLAG")
	private String sarqCancelflag;

	@Column(name="SARQ_CASHPRICE")
	private BigDecimal sarqCashprice;

	@Column(name="SARQ_CREATEDBY")
	private String sarqCreatedby;

	@Column(name="SARQ_CREATEDDATE")
	private Timestamp sarqCreateddate;

	@Temporal(TemporalType.DATE)
	@Column(name="SARQ_DATEOFBIRTH")
	private Date sarqDateofbirth;

	@Column(name="SARQ_DEPOSIT")
	private BigDecimal sarqDeposit;

	@Column(name="SARQ_ERROR")
	private String sarqError;

	@Column(name="SARQ_FICODE")
	private String sarqFicode;

	@Column(name="SARQ_FINANCEPRICE")
	private BigDecimal sarqFinanceprice;

	@Column(name="SARQ_FNCODE")
	private String sarqFncode;

	@Column(name="SARQ_GENDER")
	private String sarqGender;

	@Column(name="SARQ_HOMEPHONENO")
	private String sarqHomephoneno;

	@Column(name="SARQ_INTUPDATEDDATE")
	private long sarqIntupdateddate;

	@Column(name="SARQ_MARITALSTATUSID")
	private String sarqMaritalstatusid;

	@Column(name="SARQ_MOBILEPHONENO")
	private String sarqMobilephoneno;

	@Column(name="SARQ_NATIONALITY")
	private String sarqNationality;

	@Column(name="SARQ_NATUREOFBIZ")
	private String sarqNatureofbiz;

	@Column(name="SARQ_NETINCOMEMONTHLY")
	private BigDecimal sarqNetincomemonthly;

	@Column(name="SARQ_NEWICNO")
	private String sarqNewicno;

	@Column(name="SARQ_OLDESTAGREEMENTDATE")
	private Timestamp sarqOldestagreementdate;

	@Column(name="SARQ_OLDIDNO")
	private String sarqOldidno;

	@Column(name="SARQ_OWNTYPEID")
	private String sarqOwntypeid;

	@Column(name="SARQ_POSITIONCODE")
	private String sarqPositioncode;

	@Column(name="SARQ_PRODUCTID")
	private String sarqProductid;

	@Column(name="SARQ_RACEID")
	private String sarqRaceid;

	@Column(name="SARQ_RECENTAGREEMENTDATE")
	private Timestamp sarqRecentagreementdate;

	@Column(name="SARQ_REFNO")
	private String sarqRefno;

	@Column(name="SARQ_REFQSCCID")
	private int sarqRefqsccid;

	@Column(name="SARQ_REMARK")
	private String sarqRemark;

	@Column(name="SARQ_REPORTTYPE")
	private String sarqReporttype;

	@Column(name="SARQ_REQUESTSTATUS")
	private String sarqRequeststatus;

	@Column(name="SARQ_REQUESTXML")
	private String sarqRequestxml;

	@Column(name="SARQ_RESENDCOUNT")
	private short sarqResendcount;

	@Column(name="SARQ_RESERVEDFIELD")
	private String sarqReservedfield;

	@Column(name="SARQ_SUBPRODID")
	private String sarqSubprodid;

	@Column(name="SARQ_SUBTIMESTAMP")
	private Timestamp sarqSubtimestamp;

	@Column(name="SARQ_TERM")
	private short sarqTerm;

	@Column(name="SARQ_UPDATEDBY")
	private String sarqUpdatedby;

	@Column(name="SARQ_UPDATEDDATE")
	private Timestamp sarqUpdateddate;

	@Column(name="SARQ_USERGROUP")
	private String sarqUsergroup;

	@Column(name="SARQ_USERID")
	private String sarqUserid;

	@Column(name="SARQ_VERSIONNO")
	private String sarqVersionno;

	@Column(name="SARQ_WORKPHONENO")
	private String sarqWorkphoneno;

	@Column(name="SARQ_YEAROFJOB")
	private BigDecimal sarqYearofjob;

	@Column(name="SARQ_YEAROFSTAY")
	private BigDecimal sarqYearofstay;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="SARQ_REFNO", insertable= false, updatable=false)
	private TbCclimitRev tbCclimitRev;

	public TbCclimitRev getTbCclimitRev() {
		return tbCclimitRev;
	}

	public void setTbCclimitRev(TbCclimitRev tbCclimitRev) {
		this.tbCclimitRev = tbCclimitRev;
	}

	

	public TbSccappreq() {
	}

	public int getSarqSarqid() {
		return this.sarqSarqid;
	}

	public void setSarqSarqid(int sarqSarqid) {
		this.sarqSarqid = sarqSarqid;
	}

	public String getSarqAcademicid() {
		return this.sarqAcademicid;
	}

	public void setSarqAcademicid(String sarqAcademicid) {
		this.sarqAcademicid = sarqAcademicid;
	}

	public short getSarqAge() {
		return this.sarqAge;
	}

	public void setSarqAge(short sarqAge) {
		this.sarqAge = sarqAge;
	}

	public String getSarqApplicantname() {
		return this.sarqApplicantname;
	}

	public void setSarqApplicantname(String sarqApplicantname) {
		this.sarqApplicantname = sarqApplicantname;
	}

	public Timestamp getSarqApplicationdate() {
		return this.sarqApplicationdate;
	}

	public void setSarqApplicationdate(Timestamp sarqApplicationdate) {
		this.sarqApplicationdate = sarqApplicationdate;
	}

	public String getSarqAppno() {
		return this.sarqAppno;
	}

	public void setSarqAppno(String sarqAppno) {
		this.sarqAppno = sarqAppno;
	}

	public String getSarqBasicgroup() {
		return this.sarqBasicgroup;
	}

	public void setSarqBasicgroup(String sarqBasicgroup) {
		this.sarqBasicgroup = sarqBasicgroup;
	}

	public String getSarqCanceledby() {
		return this.sarqCanceledby;
	}

	public void setSarqCanceledby(String sarqCanceledby) {
		this.sarqCanceledby = sarqCanceledby;
	}

	public Timestamp getSarqCanceleddate() {
		return this.sarqCanceleddate;
	}

	public void setSarqCanceleddate(Timestamp sarqCanceleddate) {
		this.sarqCanceleddate = sarqCanceleddate;
	}

	public String getSarqCancelflag() {
		return this.sarqCancelflag;
	}

	public void setSarqCancelflag(String sarqCancelflag) {
		this.sarqCancelflag = sarqCancelflag;
	}

	public BigDecimal getSarqCashprice() {
		return this.sarqCashprice;
	}

	public void setSarqCashprice(BigDecimal sarqCashprice) {
		this.sarqCashprice = sarqCashprice;
	}

	public String getSarqCreatedby() {
		return this.sarqCreatedby;
	}

	public void setSarqCreatedby(String sarqCreatedby) {
		this.sarqCreatedby = sarqCreatedby;
	}

	public Timestamp getSarqCreateddate() {
		return this.sarqCreateddate;
	}

	public void setSarqCreateddate(Timestamp sarqCreateddate) {
		this.sarqCreateddate = sarqCreateddate;
	}

	public Date getSarqDateofbirth() {
		return this.sarqDateofbirth;
	}

	public void setSarqDateofbirth(Date sarqDateofbirth) {
		this.sarqDateofbirth = sarqDateofbirth;
	}

	public BigDecimal getSarqDeposit() {
		return this.sarqDeposit;
	}

	public void setSarqDeposit(BigDecimal sarqDeposit) {
		this.sarqDeposit = sarqDeposit;
	}

	public String getSarqError() {
		return this.sarqError;
	}

	public void setSarqError(String sarqError) {
		this.sarqError = sarqError;
	}

	public String getSarqFicode() {
		return this.sarqFicode;
	}

	public void setSarqFicode(String sarqFicode) {
		this.sarqFicode = sarqFicode;
	}

	public BigDecimal getSarqFinanceprice() {
		return this.sarqFinanceprice;
	}

	public void setSarqFinanceprice(BigDecimal sarqFinanceprice) {
		this.sarqFinanceprice = sarqFinanceprice;
	}

	public String getSarqFncode() {
		return this.sarqFncode;
	}

	public void setSarqFncode(String sarqFncode) {
		this.sarqFncode = sarqFncode;
	}

	public String getSarqGender() {
		return this.sarqGender;
	}

	public void setSarqGender(String sarqGender) {
		this.sarqGender = sarqGender;
	}

	public String getSarqHomephoneno() {
		return this.sarqHomephoneno;
	}

	public void setSarqHomephoneno(String sarqHomephoneno) {
		this.sarqHomephoneno = sarqHomephoneno;
	}

	public long getSarqIntupdateddate() {
		return this.sarqIntupdateddate;
	}

	public void setSarqIntupdateddate(long sarqIntupdateddate) {
		this.sarqIntupdateddate = sarqIntupdateddate;
	}

	public String getSarqMaritalstatusid() {
		return this.sarqMaritalstatusid;
	}

	public void setSarqMaritalstatusid(String sarqMaritalstatusid) {
		this.sarqMaritalstatusid = sarqMaritalstatusid;
	}

	public String getSarqMobilephoneno() {
		return this.sarqMobilephoneno;
	}

	public void setSarqMobilephoneno(String sarqMobilephoneno) {
		this.sarqMobilephoneno = sarqMobilephoneno;
	}

	public String getSarqNationality() {
		return this.sarqNationality;
	}

	public void setSarqNationality(String sarqNationality) {
		this.sarqNationality = sarqNationality;
	}

	public String getSarqNatureofbiz() {
		return this.sarqNatureofbiz;
	}

	public void setSarqNatureofbiz(String sarqNatureofbiz) {
		this.sarqNatureofbiz = sarqNatureofbiz;
	}

	public BigDecimal getSarqNetincomemonthly() {
		return this.sarqNetincomemonthly;
	}

	public void setSarqNetincomemonthly(BigDecimal sarqNetincomemonthly) {
		this.sarqNetincomemonthly = sarqNetincomemonthly;
	}

	public String getSarqNewicno() {
		return this.sarqNewicno;
	}

	public void setSarqNewicno(String sarqNewicno) {
		this.sarqNewicno = sarqNewicno;
	}

	public Timestamp getSarqOldestagreementdate() {
		return this.sarqOldestagreementdate;
	}

	public void setSarqOldestagreementdate(Timestamp sarqOldestagreementdate) {
		this.sarqOldestagreementdate = sarqOldestagreementdate;
	}

	public String getSarqOldidno() {
		return this.sarqOldidno;
	}

	public void setSarqOldidno(String sarqOldidno) {
		this.sarqOldidno = sarqOldidno;
	}

	public String getSarqOwntypeid() {
		return this.sarqOwntypeid;
	}

	public void setSarqOwntypeid(String sarqOwntypeid) {
		this.sarqOwntypeid = sarqOwntypeid;
	}

	public String getSarqPositioncode() {
		return this.sarqPositioncode;
	}

	public void setSarqPositioncode(String sarqPositioncode) {
		this.sarqPositioncode = sarqPositioncode;
	}

	public String getSarqProductid() {
		return this.sarqProductid;
	}

	public void setSarqProductid(String sarqProductid) {
		this.sarqProductid = sarqProductid;
	}

	public String getSarqRaceid() {
		return this.sarqRaceid;
	}

	public void setSarqRaceid(String sarqRaceid) {
		this.sarqRaceid = sarqRaceid;
	}

	public Timestamp getSarqRecentagreementdate() {
		return this.sarqRecentagreementdate;
	}

	public void setSarqRecentagreementdate(Timestamp sarqRecentagreementdate) {
		this.sarqRecentagreementdate = sarqRecentagreementdate;
	}

	public String getSarqRefno() {
		return this.sarqRefno;
	}

	public void setSarqRefno(String sarqRefno) {
		this.sarqRefno = sarqRefno;
	}

	public int getSarqRefqsccid() {
		return this.sarqRefqsccid;
	}

	public void setSarqRefqsccid(int sarqRefqsccid) {
		this.sarqRefqsccid = sarqRefqsccid;
	}

	public String getSarqRemark() {
		return this.sarqRemark;
	}

	public void setSarqRemark(String sarqRemark) {
		this.sarqRemark = sarqRemark;
	}

	public String getSarqReporttype() {
		return this.sarqReporttype;
	}

	public void setSarqReporttype(String sarqReporttype) {
		this.sarqReporttype = sarqReporttype;
	}

	public String getSarqRequeststatus() {
		return this.sarqRequeststatus;
	}

	public void setSarqRequeststatus(String sarqRequeststatus) {
		this.sarqRequeststatus = sarqRequeststatus;
	}

	public String getSarqRequestxml() {
		return this.sarqRequestxml;
	}

	public void setSarqRequestxml(String sarqRequestxml) {
		this.sarqRequestxml = sarqRequestxml;
	}

	public short getSarqResendcount() {
		return this.sarqResendcount;
	}

	public void setSarqResendcount(short sarqResendcount) {
		this.sarqResendcount = sarqResendcount;
	}

	public String getSarqReservedfield() {
		return this.sarqReservedfield;
	}

	public void setSarqReservedfield(String sarqReservedfield) {
		this.sarqReservedfield = sarqReservedfield;
	}

	public String getSarqSubprodid() {
		return this.sarqSubprodid;
	}

	public void setSarqSubprodid(String sarqSubprodid) {
		this.sarqSubprodid = sarqSubprodid;
	}

	public Timestamp getSarqSubtimestamp() {
		return this.sarqSubtimestamp;
	}

	public void setSarqSubtimestamp(Timestamp sarqSubtimestamp) {
		this.sarqSubtimestamp = sarqSubtimestamp;
	}

	public short getSarqTerm() {
		return this.sarqTerm;
	}

	public void setSarqTerm(short sarqTerm) {
		this.sarqTerm = sarqTerm;
	}

	public String getSarqUpdatedby() {
		return this.sarqUpdatedby;
	}

	public void setSarqUpdatedby(String sarqUpdatedby) {
		this.sarqUpdatedby = sarqUpdatedby;
	}

	public Timestamp getSarqUpdateddate() {
		return this.sarqUpdateddate;
	}

	public void setSarqUpdateddate(Timestamp sarqUpdateddate) {
		this.sarqUpdateddate = sarqUpdateddate;
	}

	public String getSarqUsergroup() {
		return this.sarqUsergroup;
	}

	public void setSarqUsergroup(String sarqUsergroup) {
		this.sarqUsergroup = sarqUsergroup;
	}

	public String getSarqUserid() {
		return this.sarqUserid;
	}

	public void setSarqUserid(String sarqUserid) {
		this.sarqUserid = sarqUserid;
	}

	public String getSarqVersionno() {
		return this.sarqVersionno;
	}

	public void setSarqVersionno(String sarqVersionno) {
		this.sarqVersionno = sarqVersionno;
	}

	public String getSarqWorkphoneno() {
		return this.sarqWorkphoneno;
	}

	public void setSarqWorkphoneno(String sarqWorkphoneno) {
		this.sarqWorkphoneno = sarqWorkphoneno;
	}

	public BigDecimal getSarqYearofjob() {
		return this.sarqYearofjob;
	}

	public void setSarqYearofjob(BigDecimal sarqYearofjob) {
		this.sarqYearofjob = sarqYearofjob;
	}

	public BigDecimal getSarqYearofstay() {
		return this.sarqYearofstay;
	}

	public void setSarqYearofstay(BigDecimal sarqYearofstay) {
		this.sarqYearofstay = sarqYearofstay;
	}

}