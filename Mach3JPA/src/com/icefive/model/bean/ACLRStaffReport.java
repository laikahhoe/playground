package com.icefive.model.bean;

import javax.persistence.Column;

public class ACLRStaffReport {
	
	@Column(name="PJH_JUDGEDBY")
	private String judgeBy;
	
	@Column(name="USER_NAME")
	private String userName;
	
	@Column(name="JUDGE_ACTION")
	private String judgeAction;
	
	@Column(name="TOTAL")
	private Long total;
	
	public ACLRStaffReport(String _judgeBy, String _userName, String _judgeAction, long total){
		this.judgeBy = _judgeBy;
		this.userName = _userName;
		this.judgeAction = _judgeAction;
		this.total = total;
	}

	public String getJudgeBy() {
		return judgeBy;
	}

	public void setJudgeBy(String judgeBy) {
		this.judgeBy = judgeBy;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getJudgeAction() {
		return judgeAction;
	}

	public void setJudgeAction(String judgeAction) {
		this.judgeAction = judgeAction;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

		
	

}
