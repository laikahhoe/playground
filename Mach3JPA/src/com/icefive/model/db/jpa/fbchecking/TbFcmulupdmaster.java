package com.icefive.model.db.jpa.fbchecking;

import java.io.Serializable;

import javax.persistence.*;

import com.icefive.model.db.jpa.common.TbCclimitRev;

import java.sql.Timestamp;


/**
 * The persistent class for the TB_FCMULUPDMASTER database table.
 * 
 */
@Entity
@Table(schema="FB_CHECKING", name="TB_FCMULUPDMASTER")
@NamedQuery(name="TbFcmulupdmaster.findAll", query="SELECT t FROM TbFcmulupdmaster t")
public class TbFcmulupdmaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MULM_MULMID")
	private int mulmMulmid;

	@Column(name="MULM_APPNO")
	private String mulmAppno;

	@Column(name="MULM_CORRELID")
	private String mulmCorrelid;

	@Column(name="MULM_CREATEDBY")
	private String mulmCreatedby;

	@Column(name="MULM_CREATEDDATE")
	private Timestamp mulmCreateddate;

	@Column(name="MULM_FICODE")
	private String mulmFicode;

	@Column(name="MULM_PRODUCTID")
	private String mulmProductid;

	@Column(name="MULM_REFNO")
	private String mulmRefno;

	@Column(name="MULM_REFTYPEID")
	private int mulmReftypeid;

	@Column(name="MULM_RESERVEDFIELD")
	private String mulmReservedfield;

	@Column(name="MULM_STPREQID")
	private String mulmStpreqid;

	@Column(name="MULM_SUBTIMESTAMP")
	private Timestamp mulmSubtimestamp;

	@Column(name="MULM_TYPE")
	private String mulmType;

	@Column(name="MULM_UPDATEDBY")
	private String mulmUpdatedby;

	@Column(name="MULM_UPDATEDDATE")
	private Timestamp mulmUpdateddate;

	@Lob
	@Column(name="MULM_UPDATEXML")
	private String mulmUpdatexml;

	@Column(name="MULM_USERGROUP")
	private short mulmUsergroup;

	@Column(name="MULM_USERID")
	private String mulmUserid;

	@Column(name="MULM_VERSIONNO")
	private String mulmVersionno;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="MULM_APPNO", insertable= false, updatable=false)
	private TbCclimitRev tbCclimitRev;

	public TbCclimitRev getTbCclimitRev() {
		return tbCclimitRev;
	}

	public TbFcmulupdmaster() {
	}

	public int getMulmMulmid() {
		return this.mulmMulmid;
	}

	public void setMulmMulmid(int mulmMulmid) {
		this.mulmMulmid = mulmMulmid;
	}

	public String getMulmAppno() {
		return this.mulmAppno;
	}

	public void setMulmAppno(String mulmAppno) {
		this.mulmAppno = mulmAppno;
	}

	public String getMulmCorrelid() {
		return this.mulmCorrelid;
	}

	public void setMulmCorrelid(String mulmCorrelid) {
		this.mulmCorrelid = mulmCorrelid;
	}

	public String getMulmCreatedby() {
		return this.mulmCreatedby;
	}

	public void setMulmCreatedby(String mulmCreatedby) {
		this.mulmCreatedby = mulmCreatedby;
	}

	public Timestamp getMulmCreateddate() {
		return this.mulmCreateddate;
	}

	public void setMulmCreateddate(Timestamp mulmCreateddate) {
		this.mulmCreateddate = mulmCreateddate;
	}

	public String getMulmFicode() {
		return this.mulmFicode;
	}

	public void setMulmFicode(String mulmFicode) {
		this.mulmFicode = mulmFicode;
	}

	public String getMulmProductid() {
		return this.mulmProductid;
	}

	public void setMulmProductid(String mulmProductid) {
		this.mulmProductid = mulmProductid;
	}

	public String getMulmRefno() {
		return this.mulmRefno;
	}

	public void setMulmRefno(String mulmRefno) {
		this.mulmRefno = mulmRefno;
	}

	public int getMulmReftypeid() {
		return this.mulmReftypeid;
	}

	public void setMulmReftypeid(int mulmReftypeid) {
		this.mulmReftypeid = mulmReftypeid;
	}

	public String getMulmReservedfield() {
		return this.mulmReservedfield;
	}

	public void setMulmReservedfield(String mulmReservedfield) {
		this.mulmReservedfield = mulmReservedfield;
	}

	public String getMulmStpreqid() {
		return this.mulmStpreqid;
	}

	public void setMulmStpreqid(String mulmStpreqid) {
		this.mulmStpreqid = mulmStpreqid;
	}

	public Timestamp getMulmSubtimestamp() {
		return this.mulmSubtimestamp;
	}

	public void setMulmSubtimestamp(Timestamp mulmSubtimestamp) {
		this.mulmSubtimestamp = mulmSubtimestamp;
	}

	public String getMulmType() {
		return this.mulmType;
	}

	public void setMulmType(String mulmType) {
		this.mulmType = mulmType;
	}

	public String getMulmUpdatedby() {
		return this.mulmUpdatedby;
	}

	public void setMulmUpdatedby(String mulmUpdatedby) {
		this.mulmUpdatedby = mulmUpdatedby;
	}

	public Timestamp getMulmUpdateddate() {
		return this.mulmUpdateddate;
	}

	public void setMulmUpdateddate(Timestamp mulmUpdateddate) {
		this.mulmUpdateddate = mulmUpdateddate;
	}

	public String getMulmUpdatexml() {
		return this.mulmUpdatexml;
	}

	public void setMulmUpdatexml(String mulmUpdatexml) {
		this.mulmUpdatexml = mulmUpdatexml;
	}

	public short getMulmUsergroup() {
		return this.mulmUsergroup;
	}

	public void setMulmUsergroup(short mulmUsergroup) {
		this.mulmUsergroup = mulmUsergroup;
	}

	public String getMulmUserid() {
		return this.mulmUserid;
	}

	public void setMulmUserid(String mulmUserid) {
		this.mulmUserid = mulmUserid;
	}

	public String getMulmVersionno() {
		return this.mulmVersionno;
	}

	public void setMulmVersionno(String mulmVersionno) {
		this.mulmVersionno = mulmVersionno;
	}

}