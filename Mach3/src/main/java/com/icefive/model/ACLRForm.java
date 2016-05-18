package com.icefive.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ACLRForm {

	
	public String clrAppno;
	
	@DateTimeFormat(pattern="MM/dd/yyyy")
	public Date clrSubmittedDate;
	public Integer clrPrmid;
	public String getClrAppno() {
		return clrAppno;
	}
	public void setClrAppno(String clrAppno) {
		this.clrAppno = clrAppno;
	}
	public Date getClrSubmittedDate() {
		return clrSubmittedDate;
	}
	public void setClrSubmittedDate(Date clrSubmittedDate) {
		this.clrSubmittedDate = clrSubmittedDate;
	}
	public Integer getClrPrmid() {
		return clrPrmid;
	}
	public void setClrPrmid(Integer clrPrmid) {
		this.clrPrmid = clrPrmid;
	}
	
	
}
