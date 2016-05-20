package com.icefive.model.db.jpa.master;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the TBM_PROCESSCATEGORYTYPE database table.
 * 
 */
@Entity
@Table(name="TBM_PROCESSCATEGORYTYPE")
@NamedQuery(name="TbmProcesscategorytype.findAll", query="SELECT t FROM TbmProcesscategorytype t")
public class TbmProcesscategorytype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MPTP_PROCESSCATEGORYID")
	private short mptpProcesscategoryid;

	@Column(name="MPTP_CREATEDBY")
	private String mptpCreatedby;

	@Column(name="MPTP_CREATEDDATE")
	private Timestamp mptpCreateddate;

	@Column(name="MPTP_PROCESSCATEGORY")
	private String mptpProcesscategory;

	@Column(name="MPTP_UPDATEDBY")
	private String mptpUpdatedby;

	@Column(name="MPTP_UPDATEDDATE")
	private Timestamp mptpUpdateddate;

	public TbmProcesscategorytype() {
	}

	public short getMptpProcesscategoryid() {
		return this.mptpProcesscategoryid;
	}

	public void setMptpProcesscategoryid(short mptpProcesscategoryid) {
		this.mptpProcesscategoryid = mptpProcesscategoryid;
	}

	public String getMptpCreatedby() {
		return this.mptpCreatedby;
	}

	public void setMptpCreatedby(String mptpCreatedby) {
		this.mptpCreatedby = mptpCreatedby;
	}

	public Timestamp getMptpCreateddate() {
		return this.mptpCreateddate;
	}

	public void setMptpCreateddate(Timestamp mptpCreateddate) {
		this.mptpCreateddate = mptpCreateddate;
	}

	public String getMptpProcesscategory() {
		return this.mptpProcesscategory;
	}

	public void setMptpProcesscategory(String mptpProcesscategory) {
		this.mptpProcesscategory = mptpProcesscategory;
	}

	public String getMptpUpdatedby() {
		return this.mptpUpdatedby;
	}

	public void setMptpUpdatedby(String mptpUpdatedby) {
		this.mptpUpdatedby = mptpUpdatedby;
	}

	public Timestamp getMptpUpdateddate() {
		return this.mptpUpdateddate;
	}

	public void setMptpUpdateddate(Timestamp mptpUpdateddate) {
		this.mptpUpdateddate = mptpUpdateddate;
	}

}