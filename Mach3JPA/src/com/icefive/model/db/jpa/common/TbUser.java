package com.icefive.model.db.jpa.common;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the TB_USER database table.
 * 
 */
@Entity
@Table(schema="COMMON",name="TB_USER")
@NamedQuery(name="TbUser.findAll", query="SELECT t FROM TbUser t")
public class TbUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USER_USERID")
	private String userUserid;

	@Column(name="USER_AKPKFLAG")
	private String userAkpkflag;

	@Column(name="USER_BRANCHCODE")
	private String userBranchcode;

	@Column(name="USER_CREATEDATE")
	private Timestamp userCreatedate;

	@Column(name="USER_CREATEUSER")
	private String userCreateuser;

	@Column(name="USER_CUSFLAG")
	private String userCusflag;

	@Column(name="USER_DELFLAG")
	private String userDelflag;

	@Column(name="USER_DEPARTMENTCODE")
	private String userDepartmentcode;

	@Column(name="USER_EMAIL")
	private String userEmail;

	@Column(name="USER_ENTRYFLAG")
	private String userEntryflag;

	@Column(name="USER_EXTERNALFCFLAG")
	private String userExternalfcflag;

	@Column(name="USER_FRAUDFLAG")
	private String userFraudflag;

	@Column(name="USER_GROUPID")
	private int userGroupid;

	@Column(name="USER_HOMEPHONE")
	private String userHomephone;

	@Column(name="USER_INTERNALFCFLAG")
	private String userInternalfcflag;

	@Column(name="USER_JOINDATE")
	private Timestamp userJoindate;

	@Column(name="USER_LASTLOGIN")
	private Timestamp userLastlogin;

	@Column(name="USER_LEVELCODE")
	private short userLevelcode;

	@Column(name="USER_NAME")
	private String userName;

	@Column(name="USER_OVERRIDEFLAG")
	private String userOverrideflag;

	@Column(name="USER_PASSWORD")
	private String userPassword;

	@Column(name="USER_PRINTFLAG")
	private String userPrintflag;

	@Column(name="USER_PWUPDATE")
	private Timestamp userPwupdate;

	@Column(name="USER_REGIONCODE")
	private String userRegioncode;

	@Column(name="USER_RESENDFLAG")
	private String userResendflag;

	@Column(name="USER_RESIGNDATE")
	private Timestamp userResigndate;

	@Column(name="USER_SETPRIORITYFLAG")
	private String userSetpriorityflag;

	@Column(name="USER_STAFFSTATUS")
	private String userStaffstatus;

	@Column(name="USER_STFFLAG")
	private String userStfflag;

	@Column(name="USER_UPDATEDATE")
	private Timestamp userUpdatedate;

	@Column(name="USER_UPDATEUSER")
	private String userUpdateuser;

	@Column(name="USER_VIPFLAG")
	private String userVipflag;

	public TbUser() {
	}

	public String getUserUserid() {
		return this.userUserid;
	}

	public void setUserUserid(String userUserid) {
		this.userUserid = userUserid;
	}

	public String getUserAkpkflag() {
		return this.userAkpkflag;
	}

	public void setUserAkpkflag(String userAkpkflag) {
		this.userAkpkflag = userAkpkflag;
	}

	public String getUserBranchcode() {
		return this.userBranchcode;
	}

	public void setUserBranchcode(String userBranchcode) {
		this.userBranchcode = userBranchcode;
	}

	public Timestamp getUserCreatedate() {
		return this.userCreatedate;
	}

	public void setUserCreatedate(Timestamp userCreatedate) {
		this.userCreatedate = userCreatedate;
	}

	public String getUserCreateuser() {
		return this.userCreateuser;
	}

	public void setUserCreateuser(String userCreateuser) {
		this.userCreateuser = userCreateuser;
	}

	public String getUserCusflag() {
		return this.userCusflag;
	}

	public void setUserCusflag(String userCusflag) {
		this.userCusflag = userCusflag;
	}

	public String getUserDelflag() {
		return this.userDelflag;
	}

	public void setUserDelflag(String userDelflag) {
		this.userDelflag = userDelflag;
	}

	public String getUserDepartmentcode() {
		return this.userDepartmentcode;
	}

	public void setUserDepartmentcode(String userDepartmentcode) {
		this.userDepartmentcode = userDepartmentcode;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserEntryflag() {
		return this.userEntryflag;
	}

	public void setUserEntryflag(String userEntryflag) {
		this.userEntryflag = userEntryflag;
	}

	public String getUserExternalfcflag() {
		return this.userExternalfcflag;
	}

	public void setUserExternalfcflag(String userExternalfcflag) {
		this.userExternalfcflag = userExternalfcflag;
	}

	public String getUserFraudflag() {
		return this.userFraudflag;
	}

	public void setUserFraudflag(String userFraudflag) {
		this.userFraudflag = userFraudflag;
	}

	public int getUserGroupid() {
		return this.userGroupid;
	}

	public void setUserGroupid(int userGroupid) {
		this.userGroupid = userGroupid;
	}

	public String getUserHomephone() {
		return this.userHomephone;
	}

	public void setUserHomephone(String userHomephone) {
		this.userHomephone = userHomephone;
	}

	public String getUserInternalfcflag() {
		return this.userInternalfcflag;
	}

	public void setUserInternalfcflag(String userInternalfcflag) {
		this.userInternalfcflag = userInternalfcflag;
	}

	public Timestamp getUserJoindate() {
		return this.userJoindate;
	}

	public void setUserJoindate(Timestamp userJoindate) {
		this.userJoindate = userJoindate;
	}

	public Timestamp getUserLastlogin() {
		return this.userLastlogin;
	}

	public void setUserLastlogin(Timestamp userLastlogin) {
		this.userLastlogin = userLastlogin;
	}

	public short getUserLevelcode() {
		return this.userLevelcode;
	}

	public void setUserLevelcode(short userLevelcode) {
		this.userLevelcode = userLevelcode;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserOverrideflag() {
		return this.userOverrideflag;
	}

	public void setUserOverrideflag(String userOverrideflag) {
		this.userOverrideflag = userOverrideflag;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserPrintflag() {
		return this.userPrintflag;
	}

	public void setUserPrintflag(String userPrintflag) {
		this.userPrintflag = userPrintflag;
	}

	public Timestamp getUserPwupdate() {
		return this.userPwupdate;
	}

	public void setUserPwupdate(Timestamp userPwupdate) {
		this.userPwupdate = userPwupdate;
	}

	public String getUserRegioncode() {
		return this.userRegioncode;
	}

	public void setUserRegioncode(String userRegioncode) {
		this.userRegioncode = userRegioncode;
	}

	public String getUserResendflag() {
		return this.userResendflag;
	}

	public void setUserResendflag(String userResendflag) {
		this.userResendflag = userResendflag;
	}

	public Timestamp getUserResigndate() {
		return this.userResigndate;
	}

	public void setUserResigndate(Timestamp userResigndate) {
		this.userResigndate = userResigndate;
	}

	public String getUserSetpriorityflag() {
		return this.userSetpriorityflag;
	}

	public void setUserSetpriorityflag(String userSetpriorityflag) {
		this.userSetpriorityflag = userSetpriorityflag;
	}

	public String getUserStaffstatus() {
		return this.userStaffstatus;
	}

	public void setUserStaffstatus(String userStaffstatus) {
		this.userStaffstatus = userStaffstatus;
	}

	public String getUserStfflag() {
		return this.userStfflag;
	}

	public void setUserStfflag(String userStfflag) {
		this.userStfflag = userStfflag;
	}

	public Timestamp getUserUpdatedate() {
		return this.userUpdatedate;
	}

	public void setUserUpdatedate(Timestamp userUpdatedate) {
		this.userUpdatedate = userUpdatedate;
	}

	public String getUserUpdateuser() {
		return this.userUpdateuser;
	}

	public void setUserUpdateuser(String userUpdateuser) {
		this.userUpdateuser = userUpdateuser;
	}

	public String getUserVipflag() {
		return this.userVipflag;
	}

	public void setUserVipflag(String userVipflag) {
		this.userVipflag = userVipflag;
	}

}