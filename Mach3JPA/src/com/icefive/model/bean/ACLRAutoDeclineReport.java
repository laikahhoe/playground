package com.icefive.model.bean;

import javax.persistence.Column;

public class ACLRAutoDeclineReport {
	
	@Column(name="CLR_APPNO")
	private String clrAppNo;
	
	
	@Column(name="QFR_REMARK")
	private String qfrRemark;
	
	public ACLRAutoDeclineReport(){
		
	}
	
	public ACLRAutoDeclineReport(String  _clrAppNo,String _qfrRemark){
		this.clrAppNo = _clrAppNo;
		this.qfrRemark = _qfrRemark;

	}

	public String getClrAppNo() {
		return clrAppNo;
	}

	public void setClrAppNo(String clrAppNo) {
		this.clrAppNo = clrAppNo;
	}

	public String getQfrRemark() {
		return qfrRemark;
	}

	public void setQfrRemark(String qfrRemark) {
		this.qfrRemark = qfrRemark;
	}
	
	
	

}
