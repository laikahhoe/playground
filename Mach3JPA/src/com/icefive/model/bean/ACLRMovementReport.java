package com.icefive.model.bean;

import java.sql.Timestamp;

import javax.persistence.Column;

public class ACLRMovementReport {
	
	@Column(name="D")
	private Timestamp processDate;
	
	@Column(name="NEW")
	private Long newCase;
	
	@Column(name="SUBMITTED")
	private Long submittedCase;
	
	@Column(name="PREAPPROVED")
	private Long preapprovedCase;
	
	@Column(name="FINALJUDGE")
	private Long finalJudgeCase;
	
	public ACLRMovementReport(){
		
	}
	
	public ACLRMovementReport(Timestamp _processDate,Long _newCase,Long _submittedCase,Long _preapprovedCase,Long _finalJudgeCase){
		
		this.processDate = _processDate;
		this.newCase = _newCase;
		this.submittedCase = _submittedCase;
		this.preapprovedCase = _preapprovedCase;
		this.finalJudgeCase = _finalJudgeCase;
	}

	public Timestamp getProcessDate() {
		return processDate;
	}

	public void setProcessDate(Timestamp processDate) {
		this.processDate = processDate;
	}

	public Long getNewCase() {
		return newCase;
	}

	public void setNewCase(Long newCase) {
		this.newCase = newCase;
	}

	public Long getSubmittedCase() {
		return submittedCase;
	}

	public void setSubmittedCase(Long submittedCase) {
		this.submittedCase = submittedCase;
	}

	public Long getPreapprovedCase() {
		return preapprovedCase;
	}

	public void setPreapprovedCase(Long preapprovedCase) {
		this.preapprovedCase = preapprovedCase;
	}

	public Long getFinalJudgeCase() {
		return finalJudgeCase;
	}

	public void setFinalJudgeCase(Long finalJudgeCase) {
		this.finalJudgeCase = finalJudgeCase;
	}
	
	

}
