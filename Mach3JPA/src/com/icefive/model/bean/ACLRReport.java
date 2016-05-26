package com.icefive.model.bean;

import javax.persistence.Column;

public class ACLRReport {
	
	public ACLRReport(){
		
	}
	
	public ACLRReport(Integer i, String s, Long l){
		this.clrPrmid = i;
		this.qprmName = s;
		this.total = l;
	}
	
	@Column(name="CLR_PRMID")
	private Integer clrPrmid;
	
	@Column(name="TOTAL")
	private Long total;
	
	@Column(name="QPRM_QNAME")
	private String qprmName;

	public Integer getClrPrmid() {
		return clrPrmid;
	}

	public void setClrPrmid(Integer clrPrmid) {
		this.clrPrmid = clrPrmid;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public String getQprmName() {
		return qprmName;
	}

	public void setQprmName(String qprmName) {
		this.qprmName = qprmName;
	}
	
	
	
	

}
