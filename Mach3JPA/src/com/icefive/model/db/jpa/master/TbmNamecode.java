package com.icefive.model.db.jpa.master;

import java.io.Serializable;

import javax.persistence.*;

import java.sql.Timestamp;


/**
 * The persistent class for the TBM_NAMECODE database table.
 * 
 */
@Entity
@Table(name="TBM_NAMECODE",schema="MASTER")

@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="NMCD_NMCDCODE", discriminatorType=DiscriminatorType.STRING, length=4)
@NamedQuery(name="TbmNamecode.findAll", query="SELECT t FROM TbmNamecode t")
public abstract class TbmNamecode implements Serializable {
	private static final long serialVersionUID = 1L;

//	@EmbeddedId
//	private TbmNamecodePK id;
	@Id
	@Column(name="NMCD_VALUE")
	private String nmcdValue;
	
	@Column(name="NMCD_NMCDCODE")
	private String nmcdNmcdcode;

	@Column(name="NMCD_CREATEDBY")
	private String nmcdCreatedby;

	@Column(name="NMCD_CREATEDDATE")
	private Timestamp nmcdCreateddate;

	@Column(name="NMCD_DELETEFLAG")
	private String nmcdDeleteflag;

	@Column(name="NMCD_DISPLAYFLAG")
	private String nmcdDisplayflag;

	@Column(name="NMCD_FULLNAME")
	private String nmcdFullname;

	@Column(name="NMCD_NAME")
	private String nmcdName;

	@Column(name="NMCD_OPERATORID")
	private String nmcdOperatorid;

	@Column(name="NMCD_PROCESSINGNO")
	private String nmcdProcessingno;

	@Column(name="NMCD_REMARK")
	private String nmcdRemark;

	@Column(name="NMCD_SYNCFLAG")
	private String nmcdSyncflag;

	@Column(name="NMCD_TERMINALID")
	private String nmcdTerminalid;

	@Column(name="NMCD_UPDATEDBY")
	private String nmcdUpdatedby;

	@Column(name="NMCD_UPDATEDDATE")
	private Timestamp nmcdUpdateddate;

	public TbmNamecode() {
	}

//	public TbmNamecodePK getId() {
//		return this.id;
//	}
//
//	public void setId(TbmNamecodePK id) {
//		this.id = id;
//	}
	


	public String getNmcdCreatedby() {
		return this.nmcdCreatedby;
	}

	public String getNmcdNmcdcode() {
		return nmcdNmcdcode;
	}

	public void setNmcdNmcdcode(String nmcdNmcdcode) {
		this.nmcdNmcdcode = nmcdNmcdcode;
	}

	public String getNmcdValue() {
		return nmcdValue;
	}

	public void setNmcdValue(String nmcdValue) {
		this.nmcdValue = nmcdValue;
	}

	public void setNmcdCreatedby(String nmcdCreatedby) {
		this.nmcdCreatedby = nmcdCreatedby;
	}

	public Timestamp getNmcdCreateddate() {
		return this.nmcdCreateddate;
	}

	public void setNmcdCreateddate(Timestamp nmcdCreateddate) {
		this.nmcdCreateddate = nmcdCreateddate;
	}

	public String getNmcdDeleteflag() {
		return this.nmcdDeleteflag;
	}

	public void setNmcdDeleteflag(String nmcdDeleteflag) {
		this.nmcdDeleteflag = nmcdDeleteflag;
	}

	public String getNmcdDisplayflag() {
		return this.nmcdDisplayflag;
	}

	public void setNmcdDisplayflag(String nmcdDisplayflag) {
		this.nmcdDisplayflag = nmcdDisplayflag;
	}

	public String getNmcdFullname() {
		return this.nmcdFullname;
	}

	public void setNmcdFullname(String nmcdFullname) {
		this.nmcdFullname = nmcdFullname;
	}

	public String getNmcdName() {
		return this.nmcdName;
	}

	public void setNmcdName(String nmcdName) {
		this.nmcdName = nmcdName;
	}

	public String getNmcdOperatorid() {
		return this.nmcdOperatorid;
	}

	public void setNmcdOperatorid(String nmcdOperatorid) {
		this.nmcdOperatorid = nmcdOperatorid;
	}

	public String getNmcdProcessingno() {
		return this.nmcdProcessingno;
	}

	public void setNmcdProcessingno(String nmcdProcessingno) {
		this.nmcdProcessingno = nmcdProcessingno;
	}

	public String getNmcdRemark() {
		return this.nmcdRemark;
	}

	public void setNmcdRemark(String nmcdRemark) {
		this.nmcdRemark = nmcdRemark;
	}

	public String getNmcdSyncflag() {
		return this.nmcdSyncflag;
	}

	public void setNmcdSyncflag(String nmcdSyncflag) {
		this.nmcdSyncflag = nmcdSyncflag;
	}

	public String getNmcdTerminalid() {
		return this.nmcdTerminalid;
	}

	public void setNmcdTerminalid(String nmcdTerminalid) {
		this.nmcdTerminalid = nmcdTerminalid;
	}

	public String getNmcdUpdatedby() {
		return this.nmcdUpdatedby;
	}

	public void setNmcdUpdatedby(String nmcdUpdatedby) {
		this.nmcdUpdatedby = nmcdUpdatedby;
	}

	public Timestamp getNmcdUpdateddate() {
		return this.nmcdUpdateddate;
	}

	public void setNmcdUpdateddate(Timestamp nmcdUpdateddate) {
		this.nmcdUpdateddate = nmcdUpdateddate;
	}

}