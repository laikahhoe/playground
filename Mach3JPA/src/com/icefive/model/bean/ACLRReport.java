package com.icefive.model.bean;

import javax.persistence.Column;

public class ACLRReport {
	
	@Column(name="CLR_PRMID")
	private Integer clrPrmid;
	
	@Column(name="TOTAL")
	private Long total;

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
	
	

}
