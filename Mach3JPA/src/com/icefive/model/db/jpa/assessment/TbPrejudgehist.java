package com.icefive.model.db.jpa.assessment;

import java.io.Serializable;

import javax.persistence.*;

import com.icefive.model.db.jpa.common.TbCclimitRev;
import com.icefive.model.db.jpa.master.TbmNamecodeAS07;
import com.icefive.model.db.jpa.master.TbmNamecodeMY09;

import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the TB_PREJUDGEHIST database table.
 * 
 */
@Entity
@Table(schema="ASSESSMENT",name="TB_PREJUDGEHIST")
@NamedQuery(name="TbPrejudgehist.findAll", query="SELECT t FROM TbPrejudgehist t")
public class TbPrejudgehist implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PJH_PJHID")
	private int pjhPjhid;

	@Column(name="PJH_APPNO")
	private String pjhAppno;

	@Column(name="PJH_APPROVEREASON")
	private String pjhApprovereason;

	@Column(name="PJH_CASHLIMIT")
	private BigDecimal pjhCashlimit;

	@Column(name="PJH_CREDITLIMITCODE1")
	private String pjhCreditlimitcode1;

	@Column(name="PJH_CREDITLIMITCODE2")
	private String pjhCreditlimitcode2;

	@Column(name="PJH_JUDGEDBY")
	private String pjhJudgedby;

	@Column(name="PJH_JUDGEDDATE")
	private Timestamp pjhJudgeddate;

	@Column(name="PJH_JUDGEREMARK")
	private String pjhJudgeremark;

	@Column(name="PJH_JUDGESTATUS")
	private String pjhJudgestatus;

	@Column(name="PJH_REASONCODE1")
	private String pjhReasoncode1;

	@Column(name="PJH_REASONCODE2")
	private String pjhReasoncode2;

	@Column(name="PJH_REASONCODE3")
	private String pjhReasoncode3;

	@Column(name="PJH_RECOMMENDATION")
	private String pjhRecommendation;

	@Column(name="PJH_SHOPLIMIT")
	private BigDecimal pjhShoplimit;

	@Column(name="PJH_STRENGTH")
	private String pjhStrength;

	@Column(name="PJH_WEAKNESS")
	private String pjhWeakness;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="PJH_APPNO", insertable= false, updatable=false)
	private TbCclimitRev tbCclimitRev;
	
	public TbCclimitRev getTbCclimitRev() {
		return tbCclimitRev;
	}

	public void setTbCclimitRev(TbCclimitRev tbCclimitRev) {
		this.tbCclimitRev = tbCclimitRev;
	}
	
	@ManyToOne(fetch=FetchType.LAZY, targetEntity=TbmNamecodeAS07.class)
	@JoinColumn(name="PJH_JUDGESTATUS",referencedColumnName="NMCD_VALUE",updatable=false, insertable=false)
	private TbmNamecodeAS07 judgeStatus;

	public TbmNamecodeAS07 getJudgeStatus() {
		return judgeStatus;
	}
	

	public TbPrejudgehist() {
	}

	public int getPjhPjhid() {
		return this.pjhPjhid;
	}

	public void setPjhPjhid(int pjhPjhid) {
		this.pjhPjhid = pjhPjhid;
	}

	public String getPjhAppno() {
		return this.pjhAppno;
	}

	public void setPjhAppno(String pjhAppno) {
		this.pjhAppno = pjhAppno;
	}

	public String getPjhApprovereason() {
		return this.pjhApprovereason;
	}

	public void setPjhApprovereason(String pjhApprovereason) {
		this.pjhApprovereason = pjhApprovereason;
	}

	public BigDecimal getPjhCashlimit() {
		return this.pjhCashlimit;
	}

	public void setPjhCashlimit(BigDecimal pjhCashlimit) {
		this.pjhCashlimit = pjhCashlimit;
	}

	public String getPjhCreditlimitcode1() {
		return this.pjhCreditlimitcode1;
	}

	public void setPjhCreditlimitcode1(String pjhCreditlimitcode1) {
		this.pjhCreditlimitcode1 = pjhCreditlimitcode1;
	}

	public String getPjhCreditlimitcode2() {
		return this.pjhCreditlimitcode2;
	}

	public void setPjhCreditlimitcode2(String pjhCreditlimitcode2) {
		this.pjhCreditlimitcode2 = pjhCreditlimitcode2;
	}

	public String getPjhJudgedby() {
		return this.pjhJudgedby;
	}

	public void setPjhJudgedby(String pjhJudgedby) {
		this.pjhJudgedby = pjhJudgedby;
	}

	public Timestamp getPjhJudgeddate() {
		return this.pjhJudgeddate;
	}

	public void setPjhJudgeddate(Timestamp pjhJudgeddate) {
		this.pjhJudgeddate = pjhJudgeddate;
	}

	public String getPjhJudgeremark() {
		return this.pjhJudgeremark;
	}

	public void setPjhJudgeremark(String pjhJudgeremark) {
		this.pjhJudgeremark = pjhJudgeremark;
	}

	public String getPjhJudgestatus() {
		return this.pjhJudgestatus;
	}

	public void setPjhJudgestatus(String pjhJudgestatus) {
		this.pjhJudgestatus = pjhJudgestatus;
	}

	public String getPjhReasoncode1() {
		return this.pjhReasoncode1;
	}

	public void setPjhReasoncode1(String pjhReasoncode1) {
		this.pjhReasoncode1 = pjhReasoncode1;
	}

	public String getPjhReasoncode2() {
		return this.pjhReasoncode2;
	}

	public void setPjhReasoncode2(String pjhReasoncode2) {
		this.pjhReasoncode2 = pjhReasoncode2;
	}

	public String getPjhReasoncode3() {
		return this.pjhReasoncode3;
	}

	public void setPjhReasoncode3(String pjhReasoncode3) {
		this.pjhReasoncode3 = pjhReasoncode3;
	}

	public String getPjhRecommendation() {
		return this.pjhRecommendation;
	}

	public void setPjhRecommendation(String pjhRecommendation) {
		this.pjhRecommendation = pjhRecommendation;
	}

	public BigDecimal getPjhShoplimit() {
		return this.pjhShoplimit;
	}

	public void setPjhShoplimit(BigDecimal pjhShoplimit) {
		this.pjhShoplimit = pjhShoplimit;
	}

	public String getPjhStrength() {
		return this.pjhStrength;
	}

	public void setPjhStrength(String pjhStrength) {
		this.pjhStrength = pjhStrength;
	}

	public String getPjhWeakness() {
		return this.pjhWeakness;
	}

	public void setPjhWeakness(String pjhWeakness) {
		this.pjhWeakness = pjhWeakness;
	}

}