package com.icefive.model.db.jpa.common;

import java.io.Serializable;

import javax.persistence.*;

import com.icefive.model.db.jpa.master.TbmBusinessmatch;
import com.icefive.model.db.jpa.master.TbmBusinessrelation;
import com.icefive.model.db.jpa.master.TbmCreditlimitcode;

import java.util.Date;


/**
 * The persistent class for the TB_CCDETAIL database table.
 * 
 */
@Entity
@Table(name="TB_CCDETAIL", schema="COMMON")
@NamedQuery(name="TbCcdetail.findAll", query="SELECT t FROM TbCcdetail t")
public class TbCcdetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CCD_CREDITCARDNO")
	private String ccdCreditcardno;

	@Column(name="CCD_ACCOUNTNAME")
	private String ccdAccountname;

	@Column(name="CCD_ACCOUNTNO")
	private String ccdAccountno;

	@Column(name="CCD_ACCOUNTTYPE")
	private String ccdAccounttype;

	@Column(name="CCD_AGENTCODE")
	private short ccdAgentcode;

	@Column(name="CCD_ANNUALFEECODE")
	private String ccdAnnualfeecode;

	@Temporal(TemporalType.DATE)
	@Column(name="CCD_APPLICANTDATE")
	private Date ccdApplicantdate;

	@Column(name="CCD_APPLICATIONTYPE")
	private String ccdApplicationtype;

	@Column(name="CCD_AREACODE")
	private short ccdAreacode;

	@Column(name="CCD_ATMPINNO")
	private String ccdAtmpinno;

	@Column(name="CCD_BANKCODE")
	private String ccdBankcode;

	@Column(name="CCD_BRANCHCODE")
	private String ccdBranchcode;

	@Column(name="CCD_BRANCHCODE2")
	private short ccdBranchcode2;

	@Column(name="CCD_BUSINESSCODE")
	private String ccdBusinesscode;

	@Column(name="CCD_CARDDILIVERBRANCH")
	private short ccdCarddiliverbranch;

	@Column(name="CCD_CARDDILIVERCOUNTER")
	private short ccdCarddilivercounter;

	@Column(name="CCD_CARDDILIVERY")
	private short ccdCarddilivery;

	@Temporal(TemporalType.DATE)
	@Column(name="CCD_CARDSENDDATE")
	private Date ccdCardsenddate;

	@Column(name="CCD_COUNTERBRANCH")
	private short ccdCounterbranch;

	@Column(name="CCD_DELIQUENTHOLDCODE")
	private String ccdDeliquentholdcode;

	@Column(name="CCD_DEPTCODE")
	private String ccdDeptcode;

	@Column(name="CCD_DIRECTMAILING")
	private String ccdDirectmailing;

	@Column(name="CCD_EMAIL")
	private String ccdEmail;

	@Column(name="CCD_EXPIRYDATE")
	private int ccdExpirydate;

	@Column(name="CCD_FILLER2")
	private String ccdFiller2;

	@Column(name="CCD_FLORLIMITCODE")
	private String ccdFlorlimitcode;

	@Column(name="CCD_GROUPCODE")
	private short ccdGroupcode;

	@Column(name="CCD_GUARANTORTHAIID")
	private String ccdGuarantorthaiid;

	@Column(name="CCD_HOLDCODE")
	private String ccdHoldcode;

	@Temporal(TemporalType.DATE)
	@Column(name="CCD_HOLDDATE")
	private Date ccdHolddate;

	@Column(name="CCD_HOLDFLAG")
	private String ccdHoldflag;

	@Column(name="CCD_MAILTO")
	private String ccdMailto;

	@Column(name="CCD_OPERATORID")
	private String ccdOperatorid;

	@Column(name="CCD_PAYMENTTYPE")
	private short ccdPaymenttype;

	@Column(name="CCD_PRODUCTCODE")
	private short ccdProductcode;

	@Temporal(TemporalType.DATE)
	@Column(name="CCD_RETREATDATE")
	private Date ccdRetreatdate;

	@Column(name="CCD_RETREATFLAG")
	private String ccdRetreatflag;

	@Column(name="CCD_SENDMODE")
	private String ccdSendmode;

	@Column(name="CCD_SHOPCODE")
	private short ccdShopcode;

	@Column(name="CCD_SMS")
	private String ccdSms;

	@Column(name="CCD_SOURCECODE")
	private String ccdSourcecode;

	@Column(name="CCD_STAFFCODE")
	private String ccdStaffcode;

	@Column(name="CCD_STAFFID")
	private String ccdStaffid;

	@Column(name="CCD_STORECODE")
	private String ccdStorecode;

	@Column(name="CCD_TEAMCODE")
	private String ccdTeamcode;

	@Column(name="CCD_THAIID")
	private String ccdThaiid;

	@Temporal(TemporalType.DATE)
	@Column(name="CCD_UPDATEDATE")
	private Date ccdUpdatedate;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="CCD_BUSINESSCODE",referencedColumnName="CLC_CREDITLIMITCODE1",updatable=false, insertable=false),
		@JoinColumn(name="CCD_FLORLIMITCODE",referencedColumnName="CLC_CREDITLIMITCODE2",updatable=false, insertable=false)
		}
	)
	private TbmCreditlimitcode tbmCreditlimitcode;
	
	public TbmCreditlimitcode getTbmCreditlimitcode() {
		return tbmCreditlimitcode;
	}

	public void setTbmCreditlimitcode(TbmCreditlimitcode tbmCreditlimitcode) {
		this.tbmCreditlimitcode = tbmCreditlimitcode;
	}
	
//	@OneToOne(fetch=FetchType.LAZY)
//	@JoinColumn(name="CCD_BUSINESSCODE",referencedColumnName="BIZM_BIZCODE",updatable=false, insertable=false)
//	private TbmBusinessmatch tbmBusinessmatch;
//	
//	public TbmBusinessmatch getTbmBusinessmatch() {
//		return tbmBusinessmatch;
//	}
//
//	public void setTbmBusinessmatch(TbmBusinessmatch tbmBusinessmatch) {
//		this.tbmBusinessmatch = tbmBusinessmatch;
//	}

	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="CCD_BUSINESSCODE",referencedColumnName="BIZR_BIZCODE",updatable=false, insertable=false),
		@JoinColumn(name="CCD_PRODUCTCODE",referencedColumnName="BIZR_PRODUCTCODE",updatable=false, insertable=false)
	})
	private TbmBusinessrelation tbmBusinessrelation;

	public TbmBusinessrelation getTbmBusinessrelation() {
		return tbmBusinessrelation;
	}

	public void setTbmBusinessrelation(TbmBusinessrelation tbmBusinessrelation) {
		this.tbmBusinessrelation = tbmBusinessrelation;
	}

	public TbCcdetail() {
	}

	public String getCcdCreditcardno() {
		return this.ccdCreditcardno;
	}

	public void setCcdCreditcardno(String ccdCreditcardno) {
		this.ccdCreditcardno = ccdCreditcardno;
	}

	public String getCcdAccountname() {
		return this.ccdAccountname;
	}

	public void setCcdAccountname(String ccdAccountname) {
		this.ccdAccountname = ccdAccountname;
	}

	public String getCcdAccountno() {
		return this.ccdAccountno;
	}

	public void setCcdAccountno(String ccdAccountno) {
		this.ccdAccountno = ccdAccountno;
	}

	public String getCcdAccounttype() {
		return this.ccdAccounttype;
	}

	public void setCcdAccounttype(String ccdAccounttype) {
		this.ccdAccounttype = ccdAccounttype;
	}

	public short getCcdAgentcode() {
		return this.ccdAgentcode;
	}

	public void setCcdAgentcode(short ccdAgentcode) {
		this.ccdAgentcode = ccdAgentcode;
	}

	public String getCcdAnnualfeecode() {
		return this.ccdAnnualfeecode;
	}

	public void setCcdAnnualfeecode(String ccdAnnualfeecode) {
		this.ccdAnnualfeecode = ccdAnnualfeecode;
	}

	public Date getCcdApplicantdate() {
		return this.ccdApplicantdate;
	}

	public void setCcdApplicantdate(Date ccdApplicantdate) {
		this.ccdApplicantdate = ccdApplicantdate;
	}

	public String getCcdApplicationtype() {
		return this.ccdApplicationtype;
	}

	public void setCcdApplicationtype(String ccdApplicationtype) {
		this.ccdApplicationtype = ccdApplicationtype;
	}

	public short getCcdAreacode() {
		return this.ccdAreacode;
	}

	public void setCcdAreacode(short ccdAreacode) {
		this.ccdAreacode = ccdAreacode;
	}

	public String getCcdAtmpinno() {
		return this.ccdAtmpinno;
	}

	public void setCcdAtmpinno(String ccdAtmpinno) {
		this.ccdAtmpinno = ccdAtmpinno;
	}

	public String getCcdBankcode() {
		return this.ccdBankcode;
	}

	public void setCcdBankcode(String ccdBankcode) {
		this.ccdBankcode = ccdBankcode;
	}

	public String getCcdBranchcode() {
		return this.ccdBranchcode;
	}

	public void setCcdBranchcode(String ccdBranchcode) {
		this.ccdBranchcode = ccdBranchcode;
	}

	public short getCcdBranchcode2() {
		return this.ccdBranchcode2;
	}

	public void setCcdBranchcode2(short ccdBranchcode2) {
		this.ccdBranchcode2 = ccdBranchcode2;
	}

	public String getCcdBusinesscode() {
		return this.ccdBusinesscode;
	}

	public void setCcdBusinesscode(String ccdBusinesscode) {
		this.ccdBusinesscode = ccdBusinesscode;
	}

	public short getCcdCarddiliverbranch() {
		return this.ccdCarddiliverbranch;
	}

	public void setCcdCarddiliverbranch(short ccdCarddiliverbranch) {
		this.ccdCarddiliverbranch = ccdCarddiliverbranch;
	}

	public short getCcdCarddilivercounter() {
		return this.ccdCarddilivercounter;
	}

	public void setCcdCarddilivercounter(short ccdCarddilivercounter) {
		this.ccdCarddilivercounter = ccdCarddilivercounter;
	}

	public short getCcdCarddilivery() {
		return this.ccdCarddilivery;
	}

	public void setCcdCarddilivery(short ccdCarddilivery) {
		this.ccdCarddilivery = ccdCarddilivery;
	}

	public Date getCcdCardsenddate() {
		return this.ccdCardsenddate;
	}

	public void setCcdCardsenddate(Date ccdCardsenddate) {
		this.ccdCardsenddate = ccdCardsenddate;
	}

	public short getCcdCounterbranch() {
		return this.ccdCounterbranch;
	}

	public void setCcdCounterbranch(short ccdCounterbranch) {
		this.ccdCounterbranch = ccdCounterbranch;
	}

	public String getCcdDeliquentholdcode() {
		return this.ccdDeliquentholdcode;
	}

	public void setCcdDeliquentholdcode(String ccdDeliquentholdcode) {
		this.ccdDeliquentholdcode = ccdDeliquentholdcode;
	}

	public String getCcdDeptcode() {
		return this.ccdDeptcode;
	}

	public void setCcdDeptcode(String ccdDeptcode) {
		this.ccdDeptcode = ccdDeptcode;
	}

	public String getCcdDirectmailing() {
		return this.ccdDirectmailing;
	}

	public void setCcdDirectmailing(String ccdDirectmailing) {
		this.ccdDirectmailing = ccdDirectmailing;
	}

	public String getCcdEmail() {
		return this.ccdEmail;
	}

	public void setCcdEmail(String ccdEmail) {
		this.ccdEmail = ccdEmail;
	}

	public int getCcdExpirydate() {
		return this.ccdExpirydate;
	}

	public void setCcdExpirydate(int ccdExpirydate) {
		this.ccdExpirydate = ccdExpirydate;
	}

	public String getCcdFiller2() {
		return this.ccdFiller2;
	}

	public void setCcdFiller2(String ccdFiller2) {
		this.ccdFiller2 = ccdFiller2;
	}

	public String getCcdFlorlimitcode() {
		return this.ccdFlorlimitcode;
	}

	public void setCcdFlorlimitcode(String ccdFlorlimitcode) {
		this.ccdFlorlimitcode = ccdFlorlimitcode;
	}

	public short getCcdGroupcode() {
		return this.ccdGroupcode;
	}

	public void setCcdGroupcode(short ccdGroupcode) {
		this.ccdGroupcode = ccdGroupcode;
	}

	public String getCcdGuarantorthaiid() {
		return this.ccdGuarantorthaiid;
	}

	public void setCcdGuarantorthaiid(String ccdGuarantorthaiid) {
		this.ccdGuarantorthaiid = ccdGuarantorthaiid;
	}

	public String getCcdHoldcode() {
		return this.ccdHoldcode;
	}

	public void setCcdHoldcode(String ccdHoldcode) {
		this.ccdHoldcode = ccdHoldcode;
	}

	public Date getCcdHolddate() {
		return this.ccdHolddate;
	}

	public void setCcdHolddate(Date ccdHolddate) {
		this.ccdHolddate = ccdHolddate;
	}

	public String getCcdHoldflag() {
		return this.ccdHoldflag;
	}

	public void setCcdHoldflag(String ccdHoldflag) {
		this.ccdHoldflag = ccdHoldflag;
	}

	public String getCcdMailto() {
		return this.ccdMailto;
	}

	public void setCcdMailto(String ccdMailto) {
		this.ccdMailto = ccdMailto;
	}

	public String getCcdOperatorid() {
		return this.ccdOperatorid;
	}

	public void setCcdOperatorid(String ccdOperatorid) {
		this.ccdOperatorid = ccdOperatorid;
	}

	public short getCcdPaymenttype() {
		return this.ccdPaymenttype;
	}

	public void setCcdPaymenttype(short ccdPaymenttype) {
		this.ccdPaymenttype = ccdPaymenttype;
	}

	public short getCcdProductcode() {
		return this.ccdProductcode;
	}

	public void setCcdProductcode(short ccdProductcode) {
		this.ccdProductcode = ccdProductcode;
	}

	public Date getCcdRetreatdate() {
		return this.ccdRetreatdate;
	}

	public void setCcdRetreatdate(Date ccdRetreatdate) {
		this.ccdRetreatdate = ccdRetreatdate;
	}

	public String getCcdRetreatflag() {
		return this.ccdRetreatflag;
	}

	public void setCcdRetreatflag(String ccdRetreatflag) {
		this.ccdRetreatflag = ccdRetreatflag;
	}

	public String getCcdSendmode() {
		return this.ccdSendmode;
	}

	public void setCcdSendmode(String ccdSendmode) {
		this.ccdSendmode = ccdSendmode;
	}

	public short getCcdShopcode() {
		return this.ccdShopcode;
	}

	public void setCcdShopcode(short ccdShopcode) {
		this.ccdShopcode = ccdShopcode;
	}

	public String getCcdSms() {
		return this.ccdSms;
	}

	public void setCcdSms(String ccdSms) {
		this.ccdSms = ccdSms;
	}

	public String getCcdSourcecode() {
		return this.ccdSourcecode;
	}

	public void setCcdSourcecode(String ccdSourcecode) {
		this.ccdSourcecode = ccdSourcecode;
	}

	public String getCcdStaffcode() {
		return this.ccdStaffcode;
	}

	public void setCcdStaffcode(String ccdStaffcode) {
		this.ccdStaffcode = ccdStaffcode;
	}

	public String getCcdStaffid() {
		return this.ccdStaffid;
	}

	public void setCcdStaffid(String ccdStaffid) {
		this.ccdStaffid = ccdStaffid;
	}

	public String getCcdStorecode() {
		return this.ccdStorecode;
	}

	public void setCcdStorecode(String ccdStorecode) {
		this.ccdStorecode = ccdStorecode;
	}

	public String getCcdTeamcode() {
		return this.ccdTeamcode;
	}

	public void setCcdTeamcode(String ccdTeamcode) {
		this.ccdTeamcode = ccdTeamcode;
	}

	public String getCcdThaiid() {
		return this.ccdThaiid;
	}

	public void setCcdThaiid(String ccdThaiid) {
		this.ccdThaiid = ccdThaiid;
	}

	public Date getCcdUpdatedate() {
		return this.ccdUpdatedate;
	}

	public void setCcdUpdatedate(Date ccdUpdatedate) {
		this.ccdUpdatedate = ccdUpdatedate;
	}

}