package com.icefive.model.db.jpa.master;

import java.io.Serializable;

import javax.persistence.*;
import javax.print.DocFlavor.STRING;


/**
 * The persistent class for the TBM_BUSINESSMATCH database table.
 * 
 */
@Entity
@Table(name="TBM_BUSINESSMATCH",schema="MASTER")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="BIZM_PROCESSTYPEID", discriminatorType=DiscriminatorType.INTEGER)
@NamedQuery(name="TbmBusinessmatch.findAll", query="SELECT t FROM TbmBusinessmatch t")
public class TbmBusinessmatch implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="BIZM_BIZCODE")
	private String bizmBizcode;

	@Column(name="BIZM_PROCESSTYPEID")
	private short bizmProcesstypeid;
	
	public TbmBusinessmatch() {
	}

	public String getBizmBizcode() {
		return this.bizmBizcode;
	}

	public void setBizmBizcode(String bizmBizcode) {
		this.bizmBizcode = bizmBizcode;
	}

	public short getBizmProcesstypeid() {
		return this.bizmProcesstypeid;
	}

	public void setBizmProcesstypeid(short bizmProcesstypeid) {
		this.bizmProcesstypeid = bizmProcesstypeid;
	}

}