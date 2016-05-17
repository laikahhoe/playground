package com.icefive.model.db.jpa.master;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the TBM_QPARAM database table.
 * 
 */
@Entity
@Table(name="TBM_QPARAM", schema="MASTER")
@NamedQuery(name="TbmQparam.findAll", query="SELECT t FROM TbmQparam t")
public class TbmQparam implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="QPRM_QPRMID")
	private short qprmQprmid;

	@Column(name="QPRM_COMPOUNDFLAG")
	private int qprmCompoundflag;

	@Column(name="QPRM_CREATEDBY")
	private String qprmCreatedby;

	@Column(name="QPRM_CREATEDDATE")
	private Timestamp qprmCreateddate;

	@Column(name="QPRM_DISPLAYNAME")
	private String qprmDisplayname;

	@Column(name="QPRM_FCTYPE")
	private String qprmFctype;

	@Column(name="QPRM_MODULENO")
	private String qprmModuleno;

	@Column(name="QPRM_PRIORITY")
	private short qprmPriority;

	@Column(name="QPRM_PROCESSFLAG")
	private String qprmProcessflag;

	@Column(name="QPRM_QCRITERIAID")
	private String qprmQcriteriaid;

	@Column(name="QPRM_QCRITERIATABLENAME")
	private String qprmQcriteriatablename;

	@Column(name="QPRM_QCRITERIATABLESHORTNAME")
	private String qprmQcriteriatableshortname;

	@Column(name="QPRM_QNAME")
	private String qprmQname;

	@Column(name="QPRM_QREMARK")
	private String qprmQremark;

	@Column(name="QPRM_QSENBACKFLAG")
	private String qprmQsenbackflag;

	@Column(name="QPRM_QSETTINGID")
	private String qprmQsettingid;

	@Column(name="QPRM_QSETTINGTABLENAME")
	private String qprmQsettingtablename;

	@Column(name="QPRM_QSETTINGTABLESHORTNAME")
	private String qprmQsettingtableshortname;

	@Column(name="QPRM_QTABLEID")
	private String qprmQtableid;

	@Column(name="QPRM_QTABLENAME")
	private String qprmQtablename;

	@Column(name="QPRM_QTABLESHORTNAME")
	private String qprmQtableshortname;

	@Column(name="QPRM_REMARK")
	private String qprmRemark;

	@Column(name="QPRM_SCHEMANAME")
	private String qprmSchemaname;

	@Column(name="QPRM_SENDBACKFLAG")
	private String qprmSendbackflag;

	@Column(name="QPRM_TABLENAME")
	private String qprmTablename;

	@Column(name="QPRM_TEAMID")
	private String qprmTeamid;

	@Column(name="QPRM_TEAMQTABLENAME")
	private String qprmTeamqtablename;

	@Column(name="QPRM_TEAMQTABLESHORTNAME")
	private String qprmTeamqtableshortname;

	@Column(name="QPRM_TEAMSTAFFTABLENAME")
	private String qprmTeamstafftablename;

	@Column(name="QPRM_TEAMSTAFFTABLESHORTNAME")
	private String qprmTeamstafftableshortname;

	@Column(name="QPRM_TEAMTABLENAME")
	private String qprmTeamtablename;

	@Column(name="QPRM_TEAMTABLESHORTNAME")
	private String qprmTeamtableshortname;

	@Column(name="QPRM_UPDATEDBY")
	private String qprmUpdatedby;

	@Column(name="QPRM_UPDATEDDATE")
	private Timestamp qprmUpdateddate;

	public TbmQparam() {
	}

	public short getQprmQprmid() {
		return this.qprmQprmid;
	}

	public void setQprmQprmid(short qprmQprmid) {
		this.qprmQprmid = qprmQprmid;
	}

	public int getQprmCompoundflag() {
		return this.qprmCompoundflag;
	}

	public void setQprmCompoundflag(int qprmCompoundflag) {
		this.qprmCompoundflag = qprmCompoundflag;
	}

	public String getQprmCreatedby() {
		return this.qprmCreatedby;
	}

	public void setQprmCreatedby(String qprmCreatedby) {
		this.qprmCreatedby = qprmCreatedby;
	}

	public Timestamp getQprmCreateddate() {
		return this.qprmCreateddate;
	}

	public void setQprmCreateddate(Timestamp qprmCreateddate) {
		this.qprmCreateddate = qprmCreateddate;
	}

	public String getQprmDisplayname() {
		return this.qprmDisplayname;
	}

	public void setQprmDisplayname(String qprmDisplayname) {
		this.qprmDisplayname = qprmDisplayname;
	}

	public String getQprmFctype() {
		return this.qprmFctype;
	}

	public void setQprmFctype(String qprmFctype) {
		this.qprmFctype = qprmFctype;
	}

	public String getQprmModuleno() {
		return this.qprmModuleno;
	}

	public void setQprmModuleno(String qprmModuleno) {
		this.qprmModuleno = qprmModuleno;
	}

	public short getQprmPriority() {
		return this.qprmPriority;
	}

	public void setQprmPriority(short qprmPriority) {
		this.qprmPriority = qprmPriority;
	}

	public String getQprmProcessflag() {
		return this.qprmProcessflag;
	}

	public void setQprmProcessflag(String qprmProcessflag) {
		this.qprmProcessflag = qprmProcessflag;
	}

	public String getQprmQcriteriaid() {
		return this.qprmQcriteriaid;
	}

	public void setQprmQcriteriaid(String qprmQcriteriaid) {
		this.qprmQcriteriaid = qprmQcriteriaid;
	}

	public String getQprmQcriteriatablename() {
		return this.qprmQcriteriatablename;
	}

	public void setQprmQcriteriatablename(String qprmQcriteriatablename) {
		this.qprmQcriteriatablename = qprmQcriteriatablename;
	}

	public String getQprmQcriteriatableshortname() {
		return this.qprmQcriteriatableshortname;
	}

	public void setQprmQcriteriatableshortname(String qprmQcriteriatableshortname) {
		this.qprmQcriteriatableshortname = qprmQcriteriatableshortname;
	}

	public String getQprmQname() {
		return this.qprmQname;
	}

	public void setQprmQname(String qprmQname) {
		this.qprmQname = qprmQname;
	}

	public String getQprmQremark() {
		return this.qprmQremark;
	}

	public void setQprmQremark(String qprmQremark) {
		this.qprmQremark = qprmQremark;
	}

	public String getQprmQsenbackflag() {
		return this.qprmQsenbackflag;
	}

	public void setQprmQsenbackflag(String qprmQsenbackflag) {
		this.qprmQsenbackflag = qprmQsenbackflag;
	}

	public String getQprmQsettingid() {
		return this.qprmQsettingid;
	}

	public void setQprmQsettingid(String qprmQsettingid) {
		this.qprmQsettingid = qprmQsettingid;
	}

	public String getQprmQsettingtablename() {
		return this.qprmQsettingtablename;
	}

	public void setQprmQsettingtablename(String qprmQsettingtablename) {
		this.qprmQsettingtablename = qprmQsettingtablename;
	}

	public String getQprmQsettingtableshortname() {
		return this.qprmQsettingtableshortname;
	}

	public void setQprmQsettingtableshortname(String qprmQsettingtableshortname) {
		this.qprmQsettingtableshortname = qprmQsettingtableshortname;
	}

	public String getQprmQtableid() {
		return this.qprmQtableid;
	}

	public void setQprmQtableid(String qprmQtableid) {
		this.qprmQtableid = qprmQtableid;
	}

	public String getQprmQtablename() {
		return this.qprmQtablename;
	}

	public void setQprmQtablename(String qprmQtablename) {
		this.qprmQtablename = qprmQtablename;
	}

	public String getQprmQtableshortname() {
		return this.qprmQtableshortname;
	}

	public void setQprmQtableshortname(String qprmQtableshortname) {
		this.qprmQtableshortname = qprmQtableshortname;
	}

	public String getQprmRemark() {
		return this.qprmRemark;
	}

	public void setQprmRemark(String qprmRemark) {
		this.qprmRemark = qprmRemark;
	}

	public String getQprmSchemaname() {
		return this.qprmSchemaname;
	}

	public void setQprmSchemaname(String qprmSchemaname) {
		this.qprmSchemaname = qprmSchemaname;
	}

	public String getQprmSendbackflag() {
		return this.qprmSendbackflag;
	}

	public void setQprmSendbackflag(String qprmSendbackflag) {
		this.qprmSendbackflag = qprmSendbackflag;
	}

	public String getQprmTablename() {
		return this.qprmTablename;
	}

	public void setQprmTablename(String qprmTablename) {
		this.qprmTablename = qprmTablename;
	}

	public String getQprmTeamid() {
		return this.qprmTeamid;
	}

	public void setQprmTeamid(String qprmTeamid) {
		this.qprmTeamid = qprmTeamid;
	}

	public String getQprmTeamqtablename() {
		return this.qprmTeamqtablename;
	}

	public void setQprmTeamqtablename(String qprmTeamqtablename) {
		this.qprmTeamqtablename = qprmTeamqtablename;
	}

	public String getQprmTeamqtableshortname() {
		return this.qprmTeamqtableshortname;
	}

	public void setQprmTeamqtableshortname(String qprmTeamqtableshortname) {
		this.qprmTeamqtableshortname = qprmTeamqtableshortname;
	}

	public String getQprmTeamstafftablename() {
		return this.qprmTeamstafftablename;
	}

	public void setQprmTeamstafftablename(String qprmTeamstafftablename) {
		this.qprmTeamstafftablename = qprmTeamstafftablename;
	}

	public String getQprmTeamstafftableshortname() {
		return this.qprmTeamstafftableshortname;
	}

	public void setQprmTeamstafftableshortname(String qprmTeamstafftableshortname) {
		this.qprmTeamstafftableshortname = qprmTeamstafftableshortname;
	}

	public String getQprmTeamtablename() {
		return this.qprmTeamtablename;
	}

	public void setQprmTeamtablename(String qprmTeamtablename) {
		this.qprmTeamtablename = qprmTeamtablename;
	}

	public String getQprmTeamtableshortname() {
		return this.qprmTeamtableshortname;
	}

	public void setQprmTeamtableshortname(String qprmTeamtableshortname) {
		this.qprmTeamtableshortname = qprmTeamtableshortname;
	}

	public String getQprmUpdatedby() {
		return this.qprmUpdatedby;
	}

	public void setQprmUpdatedby(String qprmUpdatedby) {
		this.qprmUpdatedby = qprmUpdatedby;
	}

	public Timestamp getQprmUpdateddate() {
		return this.qprmUpdateddate;
	}

	public void setQprmUpdateddate(Timestamp qprmUpdateddate) {
		this.qprmUpdateddate = qprmUpdateddate;
	}

}