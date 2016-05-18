package com.icefive.model.db.jpa.fbchecking;

import java.io.Serializable;

import javax.persistence.*;

import com.icefive.model.db.jpa.common.TbCclimitRev;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the TB_FCREPORTREQUEST database table.
 * 
 */
@Entity
@Table(name="TB_FCREPORTREQUEST", schema="FB_CHECKING")
@NamedQuery(name="TbFcreportrequest.findAll", query="SELECT t FROM TbFcreportrequest t")
public class TbFcreportrequest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="FRRQ_FRRQID")
	private int frrqFrrqid;

	@Column(name="FRRQ_APPNO")
	private String frrqAppno;

	@Column(name="FRRQ_BASICGROUP")
	private String frrqBasicgroup;

	@Column(name="FRRQ_CHASISSERIALNO")
	private String frrqChasisserialno;

	@Column(name="FRRQ_CIFNO")
	private String frrqCifno;

	@Column(name="FRRQ_CORRELID")
	private String frrqCorrelid;

	@Column(name="FRRQ_CREATEDDATE")
	private Timestamp frrqCreateddate;

	@Temporal(TemporalType.DATE)
	@Column(name="FRRQ_DATEBR")
	private Date frrqDatebr;

	@Column(name="FRRQ_ENGINENO")
	private String frrqEngineno;

	@Column(name="FRRQ_FICODE")
	private String frrqFicode;

	@Column(name="FRRQ_MASTERACC")
	private String frrqMasteracc;

	@Column(name="FRRQ_NAME")
	private String frrqName;

	@Column(name="FRRQ_NATIONALITY")
	private String frrqNationality;

	@Column(name="FRRQ_NEWIC")
	private String frrqNewic;

	@Column(name="FRRQ_OLDIC")
	private String frrqOldic;

	@Column(name="FRRQ_PARTYTYPE")
	private String frrqPartytype;

	@Column(name="FRRQ_PRODUCTID")
	private String frrqProductid;

	@Column(name="FRRQ_QPRMID")
	private short frrqQprmid;

	@Column(name="FRRQ_REFNO")
	private String frrqRefno;

	@Column(name="FRRQ_REGISTRATIONNO")
	private String frrqRegistrationno;

	@Column(name="FRRQ_REPORTTYPE")
	private String frrqReporttype;

	@Column(name="FRRQ_REQUESTSTATUS")
	private String frrqRequeststatus;

	@Column(name="FRRQ_REQUESTXML")
	private String frrqRequestxml;

	@Column(name="FRRQ_RESERVEDFIELD")
	private String frrqReservedfield;

	@Column(name="FRRQ_SUBTIMESTAMP")
	private Timestamp frrqSubtimestamp;

	@Column(name="FRRQ_UPDATEDDATE")
	private Timestamp frrqUpdateddate;

	@Column(name="FRRQ_USERGROUPID")
	private short frrqUsergroupid;

	@Column(name="FRRQ_USERID")
	private String frrqUserid;

	@Column(name="FRRQ_VERSIONNO")
	private String frrqVersionno;

	//bi-directional many-to-one association to TbFcreportrespond
	@OneToMany(mappedBy="tbFcreportrequest")
	private List<TbFcreportrespond> tbFcreportresponds;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FRRQ_REFNO", insertable= false, updatable=false)
	private TbCclimitRev tbCclimitRev;

	public TbCclimitRev getTbCclimitRev() {
		return tbCclimitRev;
	}

	public void setTbCclimitRev(TbCclimitRev tbCclimitRev) {
		this.tbCclimitRev = tbCclimitRev;
	}

	public TbFcreportrequest() {
	}

	public int getFrrqFrrqid() {
		return this.frrqFrrqid;
	}

	public void setFrrqFrrqid(int frrqFrrqid) {
		this.frrqFrrqid = frrqFrrqid;
	}

	public String getFrrqAppno() {
		return this.frrqAppno;
	}

	public void setFrrqAppno(String frrqAppno) {
		this.frrqAppno = frrqAppno;
	}

	public String getFrrqBasicgroup() {
		return this.frrqBasicgroup;
	}

	public void setFrrqBasicgroup(String frrqBasicgroup) {
		this.frrqBasicgroup = frrqBasicgroup;
	}

	public String getFrrqChasisserialno() {
		return this.frrqChasisserialno;
	}

	public void setFrrqChasisserialno(String frrqChasisserialno) {
		this.frrqChasisserialno = frrqChasisserialno;
	}

	public String getFrrqCifno() {
		return this.frrqCifno;
	}

	public void setFrrqCifno(String frrqCifno) {
		this.frrqCifno = frrqCifno;
	}

	public String getFrrqCorrelid() {
		return this.frrqCorrelid;
	}

	public void setFrrqCorrelid(String frrqCorrelid) {
		this.frrqCorrelid = frrqCorrelid;
	}

	public Timestamp getFrrqCreateddate() {
		return this.frrqCreateddate;
	}

	public void setFrrqCreateddate(Timestamp frrqCreateddate) {
		this.frrqCreateddate = frrqCreateddate;
	}

	public Date getFrrqDatebr() {
		return this.frrqDatebr;
	}

	public void setFrrqDatebr(Date frrqDatebr) {
		this.frrqDatebr = frrqDatebr;
	}

	public String getFrrqEngineno() {
		return this.frrqEngineno;
	}

	public void setFrrqEngineno(String frrqEngineno) {
		this.frrqEngineno = frrqEngineno;
	}

	public String getFrrqFicode() {
		return this.frrqFicode;
	}

	public void setFrrqFicode(String frrqFicode) {
		this.frrqFicode = frrqFicode;
	}

	public String getFrrqMasteracc() {
		return this.frrqMasteracc;
	}

	public void setFrrqMasteracc(String frrqMasteracc) {
		this.frrqMasteracc = frrqMasteracc;
	}

	public String getFrrqName() {
		return this.frrqName;
	}

	public void setFrrqName(String frrqName) {
		this.frrqName = frrqName;
	}

	public String getFrrqNationality() {
		return this.frrqNationality;
	}

	public void setFrrqNationality(String frrqNationality) {
		this.frrqNationality = frrqNationality;
	}

	public String getFrrqNewic() {
		return this.frrqNewic;
	}

	public void setFrrqNewic(String frrqNewic) {
		this.frrqNewic = frrqNewic;
	}

	public String getFrrqOldic() {
		return this.frrqOldic;
	}

	public void setFrrqOldic(String frrqOldic) {
		this.frrqOldic = frrqOldic;
	}

	public String getFrrqPartytype() {
		return this.frrqPartytype;
	}

	public void setFrrqPartytype(String frrqPartytype) {
		this.frrqPartytype = frrqPartytype;
	}

	public String getFrrqProductid() {
		return this.frrqProductid;
	}

	public void setFrrqProductid(String frrqProductid) {
		this.frrqProductid = frrqProductid;
	}

	public short getFrrqQprmid() {
		return this.frrqQprmid;
	}

	public void setFrrqQprmid(short frrqQprmid) {
		this.frrqQprmid = frrqQprmid;
	}

	public String getFrrqRefno() {
		return this.frrqRefno;
	}

	public void setFrrqRefno(String frrqRefno) {
		this.frrqRefno = frrqRefno;
	}

	public String getFrrqRegistrationno() {
		return this.frrqRegistrationno;
	}

	public void setFrrqRegistrationno(String frrqRegistrationno) {
		this.frrqRegistrationno = frrqRegistrationno;
	}

	public String getFrrqReporttype() {
		return this.frrqReporttype;
	}

	public void setFrrqReporttype(String frrqReporttype) {
		this.frrqReporttype = frrqReporttype;
	}

	public String getFrrqRequeststatus() {
		return this.frrqRequeststatus;
	}

	public void setFrrqRequeststatus(String frrqRequeststatus) {
		this.frrqRequeststatus = frrqRequeststatus;
	}

	public String getFrrqRequestxml() {
		return this.frrqRequestxml;
	}

	public void setFrrqRequestxml(String frrqRequestxml) {
		this.frrqRequestxml = frrqRequestxml;
	}

	public String getFrrqReservedfield() {
		return this.frrqReservedfield;
	}

	public void setFrrqReservedfield(String frrqReservedfield) {
		this.frrqReservedfield = frrqReservedfield;
	}

	public Timestamp getFrrqSubtimestamp() {
		return this.frrqSubtimestamp;
	}

	public void setFrrqSubtimestamp(Timestamp frrqSubtimestamp) {
		this.frrqSubtimestamp = frrqSubtimestamp;
	}

	public Timestamp getFrrqUpdateddate() {
		return this.frrqUpdateddate;
	}

	public void setFrrqUpdateddate(Timestamp frrqUpdateddate) {
		this.frrqUpdateddate = frrqUpdateddate;
	}

	public short getFrrqUsergroupid() {
		return this.frrqUsergroupid;
	}

	public void setFrrqUsergroupid(short frrqUsergroupid) {
		this.frrqUsergroupid = frrqUsergroupid;
	}

	public String getFrrqUserid() {
		return this.frrqUserid;
	}

	public void setFrrqUserid(String frrqUserid) {
		this.frrqUserid = frrqUserid;
	}

	public String getFrrqVersionno() {
		return this.frrqVersionno;
	}

	public void setFrrqVersionno(String frrqVersionno) {
		this.frrqVersionno = frrqVersionno;
	}

	public List<TbFcreportrespond> getTbFcreportresponds() {
		return this.tbFcreportresponds;
	}

	public void setTbFcreportresponds(List<TbFcreportrespond> tbFcreportresponds) {
		this.tbFcreportresponds = tbFcreportresponds;
	}

	public TbFcreportrespond addTbFcreportrespond(TbFcreportrespond tbFcreportrespond) {
		getTbFcreportresponds().add(tbFcreportrespond);
		tbFcreportrespond.setTbFcreportrequest(this);

		return tbFcreportrespond;
	}

	public TbFcreportrespond removeTbFcreportrespond(TbFcreportrespond tbFcreportrespond) {
		getTbFcreportresponds().remove(tbFcreportrespond);
		tbFcreportrespond.setTbFcreportrequest(null);

		return tbFcreportrespond;
	}

}