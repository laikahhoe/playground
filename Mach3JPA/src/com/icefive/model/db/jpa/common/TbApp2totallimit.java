package com.icefive.model.db.jpa.common;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the TB_APP2TOTALLIMIT database table.
 * 
 */
@Entity
@Table(schema="COMMON",name="TB_APP2TOTALLIMIT")
@NamedQuery(name="TbApp2totallimit.findAll", query="SELECT t FROM TbApp2totallimit t")
public class TbApp2totallimit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="A2T_APPLICATIONNUMBER")
	private String a2tApplicationnumber;

	@Column(name="A2T_AEONCOMMITMENTINSTALLMENTCC")
	private BigDecimal a2tAeoncommitmentinstallmentcc;

	@Column(name="A2T_AEONCOMMITMENTINSTALLMENTGEP")
	private BigDecimal a2tAeoncommitmentinstallmentgep;

	@Column(name="A2T_AEONCOMMITMENTINSTALLMENTMOPED")
	private BigDecimal a2tAeoncommitmentinstallmentmoped;

	@Column(name="A2T_AEONCOMMITMENTINSTALLMENTPF")
	private BigDecimal a2tAeoncommitmentinstallmentpf;

	@Column(name="A2T_AEONCOMMITMENTINSTALLMENTSBIKE")
	private BigDecimal a2tAeoncommitmentinstallmentsbike;

	@Column(name="A2T_AEONCOMMITMENTINSTALLMENTUCEP")
	private BigDecimal a2tAeoncommitmentinstallmentucep;

	@Column(name="A2T_AEONCOMMITMENTOSBALANCECC")
	private BigDecimal a2tAeoncommitmentosbalancecc;

	@Column(name="A2T_AEONCOMMITMENTOSBALANCEGEP")
	private BigDecimal a2tAeoncommitmentosbalancegep;

	@Column(name="A2T_AEONCOMMITMENTOSBALANCEMOPED")
	private BigDecimal a2tAeoncommitmentosbalancemoped;

	@Column(name="A2T_AEONCOMMITMENTOSBALANCEPF")
	private BigDecimal a2tAeoncommitmentosbalancepf;

	@Column(name="A2T_AEONCOMMITMENTOSBALANCESBIKE")
	private BigDecimal a2tAeoncommitmentosbalancesbike;

	@Column(name="A2T_AEONCOMMITMENTOSBALANCEUCEP")
	private BigDecimal a2tAeoncommitmentosbalanceucep;

	@Column(name="A2T_CCLIMITTABLETYPE")
	private String a2tCclimittabletype;

	@Column(name="A2T_CCRISSUPPCHECKCODE")
	private String a2tCcrissuppcheckcode;

	@Column(name="A2T_COMMITMENTCHARGECARD")
	private BigDecimal a2tCommitmentchargecard;

	@Column(name="A2T_COMMITMENTCREDITCARD")
	private BigDecimal a2tCommitmentcreditcard;

	@Column(name="A2T_COMMITMENTEPPFINSTALLMENT")
	private BigDecimal a2tCommitmenteppfinstallment;

	@Column(name="A2T_COMMITMENTLOANPRODUCTS")
	private BigDecimal a2tCommitmentloanproducts;

	@Column(name="A2T_COMMITMENTNONBANK")
	private BigDecimal a2tCommitmentnonbank;

	@Column(name="A2T_COMMITMENTTOTAL")
	private BigDecimal a2tCommitmenttotal;

	@Column(name="A2T_CREATEDATE")
	private Timestamp a2tCreatedate;

	@Column(name="A2T_CURRENTAEONREPAYMENTRATIO")
	private BigDecimal a2tCurrentaeonrepaymentratio;

	@Column(name="A2T_CURRENTDSR")
	private BigDecimal a2tCurrentdsr;

	@Column(name="A2T_EPPFAPPROVALAMOUNT")
	private BigDecimal a2tEppfapprovalamount;

	@Column(name="A2T_EPPFLIMITTABLETYPE")
	private String a2tEppflimittabletype;

	@Column(name="A2T_FINANCEPRICE")
	private BigDecimal a2tFinanceprice;

	@Column(name="A2T_JOINTINCOMEIND")
	private String a2tJointincomeind;

	@Column(name="A2T_LIMITDENOMINATOR")
	private BigDecimal a2tLimitdenominator;

	@Column(name="A2T_LIMITPRODUCTTYPE")
	private String a2tLimitproducttype;

	@Column(name="A2T_LOWERSCORELIMIT")
	private BigDecimal a2tLowerscorelimit;

	@Column(name="A2T_MAXCASHING")
	private BigDecimal a2tMaxcashing;

	@Column(name="A2T_MAXSHOPPING")
	private BigDecimal a2tMaxshopping;

	@Column(name="A2T_NDI")
	private BigDecimal a2tNdi;

	@Column(name="A2T_NETSALARY")
	private BigDecimal a2tNetsalary;

	@Column(name="A2T_NEWAEONREPAYMENTRATIO")
	private BigDecimal a2tNewaeonrepaymentratio;

	@Column(name="A2T_NEWDSR")
	private BigDecimal a2tNewdsr;

	@Column(name="A2T_OVERLIMIT")
	private BigDecimal a2tOverlimit;

	@Column(name="A2T_PREVIOUSCASHING")
	private BigDecimal a2tPreviouscashing;

	@Column(name="A2T_PREVIOUSSHOPPING")
	private BigDecimal a2tPreviousshopping;

	@Column(name="A2T_PRODUCTAPPROVALAMOUNT")
	private BigDecimal a2tProductapprovalamount;

	@Column(name="A2T_PRODUCTLIMITTABLETYPE")
	private String a2tProductlimittabletype;

	@Column(name="A2T_PROPOSEDCASHING")
	private BigDecimal a2tProposedcashing;

	@Column(name="A2T_PROPOSEDLIMIT")
	private BigDecimal a2tProposedlimit;

	@Column(name="A2T_PROPOSEDSHOPPING")
	private BigDecimal a2tProposedshopping;

	@Column(name="A2T_RECOMMENDATION")
	private String a2tRecommendation;

	@Column(name="A2T_RECOMMENDEDINTERESTRATE")
	private BigDecimal a2tRecommendedinterestrate;

	@Column(name="A2T_RISKGROUP")
	private String a2tRiskgroup;

	@Column(name="A2T_SCORE")
	private String a2tScore;

	@Column(name="A2T_SHOPPINGAPPROVALAMOUNT")
	private BigDecimal a2tShoppingapprovalamount;

	@Column(name="A2T_TOTALAEONINSTALLMENT")
	private BigDecimal a2tTotalaeoninstallment;

	@Column(name="A2T_TOTALAEONOS")
	private BigDecimal a2tTotalaeonos;

	@Column(name="A2T_TOTALAPPROVALAMOUNT")
	private BigDecimal a2tTotalapprovalamount;

	@Column(name="A2T_TOTALLIMITTABLETYPE")
	private String a2tTotallimittabletype;

	@Column(name="A2T_UPDATEDDATE")
	private Timestamp a2tUpdateddate;

	@Column(name="A2T_UPPERSCORELIMIT")
	private BigDecimal a2tUpperscorelimit;

	public TbApp2totallimit() {
	}

	public String getA2tApplicationnumber() {
		return this.a2tApplicationnumber;
	}

	public void setA2tApplicationnumber(String a2tApplicationnumber) {
		this.a2tApplicationnumber = a2tApplicationnumber;
	}

	public BigDecimal getA2tAeoncommitmentinstallmentcc() {
		return this.a2tAeoncommitmentinstallmentcc;
	}

	public void setA2tAeoncommitmentinstallmentcc(BigDecimal a2tAeoncommitmentinstallmentcc) {
		this.a2tAeoncommitmentinstallmentcc = a2tAeoncommitmentinstallmentcc;
	}

	public BigDecimal getA2tAeoncommitmentinstallmentgep() {
		return this.a2tAeoncommitmentinstallmentgep;
	}

	public void setA2tAeoncommitmentinstallmentgep(BigDecimal a2tAeoncommitmentinstallmentgep) {
		this.a2tAeoncommitmentinstallmentgep = a2tAeoncommitmentinstallmentgep;
	}

	public BigDecimal getA2tAeoncommitmentinstallmentmoped() {
		return this.a2tAeoncommitmentinstallmentmoped;
	}

	public void setA2tAeoncommitmentinstallmentmoped(BigDecimal a2tAeoncommitmentinstallmentmoped) {
		this.a2tAeoncommitmentinstallmentmoped = a2tAeoncommitmentinstallmentmoped;
	}

	public BigDecimal getA2tAeoncommitmentinstallmentpf() {
		return this.a2tAeoncommitmentinstallmentpf;
	}

	public void setA2tAeoncommitmentinstallmentpf(BigDecimal a2tAeoncommitmentinstallmentpf) {
		this.a2tAeoncommitmentinstallmentpf = a2tAeoncommitmentinstallmentpf;
	}

	public BigDecimal getA2tAeoncommitmentinstallmentsbike() {
		return this.a2tAeoncommitmentinstallmentsbike;
	}

	public void setA2tAeoncommitmentinstallmentsbike(BigDecimal a2tAeoncommitmentinstallmentsbike) {
		this.a2tAeoncommitmentinstallmentsbike = a2tAeoncommitmentinstallmentsbike;
	}

	public BigDecimal getA2tAeoncommitmentinstallmentucep() {
		return this.a2tAeoncommitmentinstallmentucep;
	}

	public void setA2tAeoncommitmentinstallmentucep(BigDecimal a2tAeoncommitmentinstallmentucep) {
		this.a2tAeoncommitmentinstallmentucep = a2tAeoncommitmentinstallmentucep;
	}

	public BigDecimal getA2tAeoncommitmentosbalancecc() {
		return this.a2tAeoncommitmentosbalancecc;
	}

	public void setA2tAeoncommitmentosbalancecc(BigDecimal a2tAeoncommitmentosbalancecc) {
		this.a2tAeoncommitmentosbalancecc = a2tAeoncommitmentosbalancecc;
	}

	public BigDecimal getA2tAeoncommitmentosbalancegep() {
		return this.a2tAeoncommitmentosbalancegep;
	}

	public void setA2tAeoncommitmentosbalancegep(BigDecimal a2tAeoncommitmentosbalancegep) {
		this.a2tAeoncommitmentosbalancegep = a2tAeoncommitmentosbalancegep;
	}

	public BigDecimal getA2tAeoncommitmentosbalancemoped() {
		return this.a2tAeoncommitmentosbalancemoped;
	}

	public void setA2tAeoncommitmentosbalancemoped(BigDecimal a2tAeoncommitmentosbalancemoped) {
		this.a2tAeoncommitmentosbalancemoped = a2tAeoncommitmentosbalancemoped;
	}

	public BigDecimal getA2tAeoncommitmentosbalancepf() {
		return this.a2tAeoncommitmentosbalancepf;
	}

	public void setA2tAeoncommitmentosbalancepf(BigDecimal a2tAeoncommitmentosbalancepf) {
		this.a2tAeoncommitmentosbalancepf = a2tAeoncommitmentosbalancepf;
	}

	public BigDecimal getA2tAeoncommitmentosbalancesbike() {
		return this.a2tAeoncommitmentosbalancesbike;
	}

	public void setA2tAeoncommitmentosbalancesbike(BigDecimal a2tAeoncommitmentosbalancesbike) {
		this.a2tAeoncommitmentosbalancesbike = a2tAeoncommitmentosbalancesbike;
	}

	public BigDecimal getA2tAeoncommitmentosbalanceucep() {
		return this.a2tAeoncommitmentosbalanceucep;
	}

	public void setA2tAeoncommitmentosbalanceucep(BigDecimal a2tAeoncommitmentosbalanceucep) {
		this.a2tAeoncommitmentosbalanceucep = a2tAeoncommitmentosbalanceucep;
	}

	public String getA2tCclimittabletype() {
		return this.a2tCclimittabletype;
	}

	public void setA2tCclimittabletype(String a2tCclimittabletype) {
		this.a2tCclimittabletype = a2tCclimittabletype;
	}

	public String getA2tCcrissuppcheckcode() {
		return this.a2tCcrissuppcheckcode;
	}

	public void setA2tCcrissuppcheckcode(String a2tCcrissuppcheckcode) {
		this.a2tCcrissuppcheckcode = a2tCcrissuppcheckcode;
	}

	public BigDecimal getA2tCommitmentchargecard() {
		return this.a2tCommitmentchargecard;
	}

	public void setA2tCommitmentchargecard(BigDecimal a2tCommitmentchargecard) {
		this.a2tCommitmentchargecard = a2tCommitmentchargecard;
	}

	public BigDecimal getA2tCommitmentcreditcard() {
		return this.a2tCommitmentcreditcard;
	}

	public void setA2tCommitmentcreditcard(BigDecimal a2tCommitmentcreditcard) {
		this.a2tCommitmentcreditcard = a2tCommitmentcreditcard;
	}

	public BigDecimal getA2tCommitmenteppfinstallment() {
		return this.a2tCommitmenteppfinstallment;
	}

	public void setA2tCommitmenteppfinstallment(BigDecimal a2tCommitmenteppfinstallment) {
		this.a2tCommitmenteppfinstallment = a2tCommitmenteppfinstallment;
	}

	public BigDecimal getA2tCommitmentloanproducts() {
		return this.a2tCommitmentloanproducts;
	}

	public void setA2tCommitmentloanproducts(BigDecimal a2tCommitmentloanproducts) {
		this.a2tCommitmentloanproducts = a2tCommitmentloanproducts;
	}

	public BigDecimal getA2tCommitmentnonbank() {
		return this.a2tCommitmentnonbank;
	}

	public void setA2tCommitmentnonbank(BigDecimal a2tCommitmentnonbank) {
		this.a2tCommitmentnonbank = a2tCommitmentnonbank;
	}

	public BigDecimal getA2tCommitmenttotal() {
		return this.a2tCommitmenttotal;
	}

	public void setA2tCommitmenttotal(BigDecimal a2tCommitmenttotal) {
		this.a2tCommitmenttotal = a2tCommitmenttotal;
	}

	public Timestamp getA2tCreatedate() {
		return this.a2tCreatedate;
	}

	public void setA2tCreatedate(Timestamp a2tCreatedate) {
		this.a2tCreatedate = a2tCreatedate;
	}

	public BigDecimal getA2tCurrentaeonrepaymentratio() {
		return this.a2tCurrentaeonrepaymentratio;
	}

	public void setA2tCurrentaeonrepaymentratio(BigDecimal a2tCurrentaeonrepaymentratio) {
		this.a2tCurrentaeonrepaymentratio = a2tCurrentaeonrepaymentratio;
	}

	public BigDecimal getA2tCurrentdsr() {
		return this.a2tCurrentdsr;
	}

	public void setA2tCurrentdsr(BigDecimal a2tCurrentdsr) {
		this.a2tCurrentdsr = a2tCurrentdsr;
	}

	public BigDecimal getA2tEppfapprovalamount() {
		return this.a2tEppfapprovalamount;
	}

	public void setA2tEppfapprovalamount(BigDecimal a2tEppfapprovalamount) {
		this.a2tEppfapprovalamount = a2tEppfapprovalamount;
	}

	public String getA2tEppflimittabletype() {
		return this.a2tEppflimittabletype;
	}

	public void setA2tEppflimittabletype(String a2tEppflimittabletype) {
		this.a2tEppflimittabletype = a2tEppflimittabletype;
	}

	public BigDecimal getA2tFinanceprice() {
		return this.a2tFinanceprice;
	}

	public void setA2tFinanceprice(BigDecimal a2tFinanceprice) {
		this.a2tFinanceprice = a2tFinanceprice;
	}

	public String getA2tJointincomeind() {
		return this.a2tJointincomeind;
	}

	public void setA2tJointincomeind(String a2tJointincomeind) {
		this.a2tJointincomeind = a2tJointincomeind;
	}

	public BigDecimal getA2tLimitdenominator() {
		return this.a2tLimitdenominator;
	}

	public void setA2tLimitdenominator(BigDecimal a2tLimitdenominator) {
		this.a2tLimitdenominator = a2tLimitdenominator;
	}

	public String getA2tLimitproducttype() {
		return this.a2tLimitproducttype;
	}

	public void setA2tLimitproducttype(String a2tLimitproducttype) {
		this.a2tLimitproducttype = a2tLimitproducttype;
	}

	public BigDecimal getA2tLowerscorelimit() {
		return this.a2tLowerscorelimit;
	}

	public void setA2tLowerscorelimit(BigDecimal a2tLowerscorelimit) {
		this.a2tLowerscorelimit = a2tLowerscorelimit;
	}

	public BigDecimal getA2tMaxcashing() {
		return this.a2tMaxcashing;
	}

	public void setA2tMaxcashing(BigDecimal a2tMaxcashing) {
		this.a2tMaxcashing = a2tMaxcashing;
	}

	public BigDecimal getA2tMaxshopping() {
		return this.a2tMaxshopping;
	}

	public void setA2tMaxshopping(BigDecimal a2tMaxshopping) {
		this.a2tMaxshopping = a2tMaxshopping;
	}

	public BigDecimal getA2tNdi() {
		return this.a2tNdi;
	}

	public void setA2tNdi(BigDecimal a2tNdi) {
		this.a2tNdi = a2tNdi;
	}

	public BigDecimal getA2tNetsalary() {
		return this.a2tNetsalary;
	}

	public void setA2tNetsalary(BigDecimal a2tNetsalary) {
		this.a2tNetsalary = a2tNetsalary;
	}

	public BigDecimal getA2tNewaeonrepaymentratio() {
		return this.a2tNewaeonrepaymentratio;
	}

	public void setA2tNewaeonrepaymentratio(BigDecimal a2tNewaeonrepaymentratio) {
		this.a2tNewaeonrepaymentratio = a2tNewaeonrepaymentratio;
	}

	public BigDecimal getA2tNewdsr() {
		return this.a2tNewdsr;
	}

	public void setA2tNewdsr(BigDecimal a2tNewdsr) {
		this.a2tNewdsr = a2tNewdsr;
	}

	public BigDecimal getA2tOverlimit() {
		return this.a2tOverlimit;
	}

	public void setA2tOverlimit(BigDecimal a2tOverlimit) {
		this.a2tOverlimit = a2tOverlimit;
	}

	public BigDecimal getA2tPreviouscashing() {
		return this.a2tPreviouscashing;
	}

	public void setA2tPreviouscashing(BigDecimal a2tPreviouscashing) {
		this.a2tPreviouscashing = a2tPreviouscashing;
	}

	public BigDecimal getA2tPreviousshopping() {
		return this.a2tPreviousshopping;
	}

	public void setA2tPreviousshopping(BigDecimal a2tPreviousshopping) {
		this.a2tPreviousshopping = a2tPreviousshopping;
	}

	public BigDecimal getA2tProductapprovalamount() {
		return this.a2tProductapprovalamount;
	}

	public void setA2tProductapprovalamount(BigDecimal a2tProductapprovalamount) {
		this.a2tProductapprovalamount = a2tProductapprovalamount;
	}

	public String getA2tProductlimittabletype() {
		return this.a2tProductlimittabletype;
	}

	public void setA2tProductlimittabletype(String a2tProductlimittabletype) {
		this.a2tProductlimittabletype = a2tProductlimittabletype;
	}

	public BigDecimal getA2tProposedcashing() {
		return this.a2tProposedcashing;
	}

	public void setA2tProposedcashing(BigDecimal a2tProposedcashing) {
		this.a2tProposedcashing = a2tProposedcashing;
	}

	public BigDecimal getA2tProposedlimit() {
		return this.a2tProposedlimit;
	}

	public void setA2tProposedlimit(BigDecimal a2tProposedlimit) {
		this.a2tProposedlimit = a2tProposedlimit;
	}

	public BigDecimal getA2tProposedshopping() {
		return this.a2tProposedshopping;
	}

	public void setA2tProposedshopping(BigDecimal a2tProposedshopping) {
		this.a2tProposedshopping = a2tProposedshopping;
	}

	public String getA2tRecommendation() {
		return this.a2tRecommendation;
	}

	public void setA2tRecommendation(String a2tRecommendation) {
		this.a2tRecommendation = a2tRecommendation;
	}

	public BigDecimal getA2tRecommendedinterestrate() {
		return this.a2tRecommendedinterestrate;
	}

	public void setA2tRecommendedinterestrate(BigDecimal a2tRecommendedinterestrate) {
		this.a2tRecommendedinterestrate = a2tRecommendedinterestrate;
	}

	public String getA2tRiskgroup() {
		return this.a2tRiskgroup;
	}

	public void setA2tRiskgroup(String a2tRiskgroup) {
		this.a2tRiskgroup = a2tRiskgroup;
	}

	public String getA2tScore() {
		return this.a2tScore;
	}

	public void setA2tScore(String a2tScore) {
		this.a2tScore = a2tScore;
	}

	public BigDecimal getA2tShoppingapprovalamount() {
		return this.a2tShoppingapprovalamount;
	}

	public void setA2tShoppingapprovalamount(BigDecimal a2tShoppingapprovalamount) {
		this.a2tShoppingapprovalamount = a2tShoppingapprovalamount;
	}

	public BigDecimal getA2tTotalaeoninstallment() {
		return this.a2tTotalaeoninstallment;
	}

	public void setA2tTotalaeoninstallment(BigDecimal a2tTotalaeoninstallment) {
		this.a2tTotalaeoninstallment = a2tTotalaeoninstallment;
	}

	public BigDecimal getA2tTotalaeonos() {
		return this.a2tTotalaeonos;
	}

	public void setA2tTotalaeonos(BigDecimal a2tTotalaeonos) {
		this.a2tTotalaeonos = a2tTotalaeonos;
	}

	public BigDecimal getA2tTotalapprovalamount() {
		return this.a2tTotalapprovalamount;
	}

	public void setA2tTotalapprovalamount(BigDecimal a2tTotalapprovalamount) {
		this.a2tTotalapprovalamount = a2tTotalapprovalamount;
	}

	public String getA2tTotallimittabletype() {
		return this.a2tTotallimittabletype;
	}

	public void setA2tTotallimittabletype(String a2tTotallimittabletype) {
		this.a2tTotallimittabletype = a2tTotallimittabletype;
	}

	public Timestamp getA2tUpdateddate() {
		return this.a2tUpdateddate;
	}

	public void setA2tUpdateddate(Timestamp a2tUpdateddate) {
		this.a2tUpdateddate = a2tUpdateddate;
	}

	public BigDecimal getA2tUpperscorelimit() {
		return this.a2tUpperscorelimit;
	}

	public void setA2tUpperscorelimit(BigDecimal a2tUpperscorelimit) {
		this.a2tUpperscorelimit = a2tUpperscorelimit;
	}

}