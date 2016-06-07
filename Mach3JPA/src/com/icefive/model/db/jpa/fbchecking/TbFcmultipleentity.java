package com.icefive.model.db.jpa.fbchecking;

import java.io.Serializable;

import javax.persistence.*;

import com.icefive.model.db.jpa.common.TbCclimitRev;

import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the TB_FCMULTIPLEENTITY database table.
 * 
 */
@Entity
@Table(schema="FB_CHECKING", name="TB_FCMULTIPLEENTITY")
@NamedQuery(name="TbFcmultipleentity.findAll", query="SELECT t FROM TbFcmultipleentity t")
public class TbFcmultipleentity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MUL_MULID")
	private int mulMulid;

	@Column(name="MUL_APPNO")
	private String mulAppno;

	@Column(name="MUL_CREATEDBY")
	private String mulCreatedby;

	@Column(name="MUL_CREATEDDATE")
	private Timestamp mulCreateddate;

	@Temporal(TemporalType.DATE)
	@Column(name="MUL_DOB")
	private Date mulDob;

	@Column(name="MUL_ENTITYGROUP")
	private String mulEntitygroup;

	@Column(name="MUL_ENTITYKEY")
	private String mulEntitykey;

	@Column(name="MUL_ENTITYREGISTERED")
	private String mulEntityregistered;

	@Column(name="MUL_FORCEADDFLAG")
	private String mulForceaddflag;

	@Column(name="MUL_IDNO")
	private String mulIdno;

	@Column(name="MUL_MULSEQNO")
	private short mulMulseqno;

	@Column(name="MUL_NAME")
	private String mulName;

	@Column(name="MUL_NATIONALITY")
	private String mulNationality;

	@Column(name="MUL_ORIGINALREFNO")
	private String mulOriginalrefno;

	@Column(name="MUL_PARTYCIFNO")
	private String mulPartycifno;

	@Column(name="MUL_PARTYTYPE")
	private String mulPartytype;

	@Column(name="MUL_REFTYPEID")
	private int mulReftypeid;

	@Column(name="MUL_SELECTFLAG")
	private String mulSelectflag;

	@Column(name="MUL_STPREQID")
	private String mulStpreqid;

	@Column(name="MUL_TYPE")
	private String mulType;

	@Column(name="MUL_UPDATEDBY")
	private String mulUpdatedby;

	@Column(name="MUL_UPDATEDDATE")
	private Timestamp mulUpdateddate;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="MUL_APPNO", insertable= false, updatable=false)
	private TbCclimitRev tbCclimitRev;

	public TbCclimitRev getTbCclimitRev() {
		return tbCclimitRev;
	}


	public TbFcmultipleentity() {
	}

	public int getMulMulid() {
		return this.mulMulid;
	}

	public void setMulMulid(int mulMulid) {
		this.mulMulid = mulMulid;
	}

	public String getMulAppno() {
		return this.mulAppno;
	}

	public void setMulAppno(String mulAppno) {
		this.mulAppno = mulAppno;
	}

	public String getMulCreatedby() {
		return this.mulCreatedby;
	}

	public void setMulCreatedby(String mulCreatedby) {
		this.mulCreatedby = mulCreatedby;
	}

	public Timestamp getMulCreateddate() {
		return this.mulCreateddate;
	}

	public void setMulCreateddate(Timestamp mulCreateddate) {
		this.mulCreateddate = mulCreateddate;
	}

	public Date getMulDob() {
		return this.mulDob;
	}

	public void setMulDob(Date mulDob) {
		this.mulDob = mulDob;
	}

	public String getMulEntitygroup() {
		return this.mulEntitygroup;
	}

	public void setMulEntitygroup(String mulEntitygroup) {
		this.mulEntitygroup = mulEntitygroup;
	}

	public String getMulEntitykey() {
		return this.mulEntitykey;
	}

	public void setMulEntitykey(String mulEntitykey) {
		this.mulEntitykey = mulEntitykey;
	}

	public String getMulEntityregistered() {
		return this.mulEntityregistered;
	}

	public void setMulEntityregistered(String mulEntityregistered) {
		this.mulEntityregistered = mulEntityregistered;
	}

	public String getMulForceaddflag() {
		return this.mulForceaddflag;
	}

	public void setMulForceaddflag(String mulForceaddflag) {
		this.mulForceaddflag = mulForceaddflag;
	}

	public String getMulIdno() {
		return this.mulIdno;
	}

	public void setMulIdno(String mulIdno) {
		this.mulIdno = mulIdno;
	}

	public short getMulMulseqno() {
		return this.mulMulseqno;
	}

	public void setMulMulseqno(short mulMulseqno) {
		this.mulMulseqno = mulMulseqno;
	}

	public String getMulName() {
		return this.mulName;
	}

	public void setMulName(String mulName) {
		this.mulName = mulName;
	}

	public String getMulNationality() {
		return this.mulNationality;
	}

	public void setMulNationality(String mulNationality) {
		this.mulNationality = mulNationality;
	}

	public String getMulOriginalrefno() {
		return this.mulOriginalrefno;
	}

	public void setMulOriginalrefno(String mulOriginalrefno) {
		this.mulOriginalrefno = mulOriginalrefno;
	}

	public String getMulPartycifno() {
		return this.mulPartycifno;
	}

	public void setMulPartycifno(String mulPartycifno) {
		this.mulPartycifno = mulPartycifno;
	}

	public String getMulPartytype() {
		return this.mulPartytype;
	}

	public void setMulPartytype(String mulPartytype) {
		this.mulPartytype = mulPartytype;
	}

	public int getMulReftypeid() {
		return this.mulReftypeid;
	}

	public void setMulReftypeid(int mulReftypeid) {
		this.mulReftypeid = mulReftypeid;
	}

	public String getMulSelectflag() {
		return this.mulSelectflag;
	}

	public void setMulSelectflag(String mulSelectflag) {
		this.mulSelectflag = mulSelectflag;
	}

	public String getMulStpreqid() {
		return this.mulStpreqid;
	}

	public void setMulStpreqid(String mulStpreqid) {
		this.mulStpreqid = mulStpreqid;
	}

	public String getMulType() {
		return this.mulType;
	}

	public void setMulType(String mulType) {
		this.mulType = mulType;
	}

	public String getMulUpdatedby() {
		return this.mulUpdatedby;
	}

	public void setMulUpdatedby(String mulUpdatedby) {
		this.mulUpdatedby = mulUpdatedby;
	}

	public Timestamp getMulUpdateddate() {
		return this.mulUpdateddate;
	}

	public void setMulUpdateddate(Timestamp mulUpdateddate) {
		this.mulUpdateddate = mulUpdateddate;
	}

}