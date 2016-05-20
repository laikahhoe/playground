package com.icefive.model.db.jpa.master;

import java.io.Serializable;

import javax.persistence.*;

import org.eclipse.persistence.annotations.FetchAttribute;


/**
 * The persistent class for the TBM_BUSINESSRELATION database table.
 * 
 */
@Entity
@Table(name="TBM_BUSINESSRELATION",schema="MASTER")
@NamedQuery(name="TbmBusinessrelation.findAll", query="SELECT t FROM TbmBusinessrelation t")
public class TbmBusinessrelation implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TbmBusinessrelationPK id;

	@Column(name="BIZR_AFFICODE")
	private String bizrAfficode;

	@Column(name="BIZR_BINSEQNO")
	private String bizrBinseqno;

	@Column(name="BIZR_CARDAGENCYCODE")
	private String bizrCardagencycode;

	@Column(name="BIZR_CARDBRAND")
	private String bizrCardbrand;

	@Column(name="BIZR_CARDNAME")
	private String bizrCardname;

	@Column(name="BIZR_CARDTYPE")
	private String bizrCardtype;

	@Column(name="BIZR_CASHSALETYPE")
	private String bizrCashsaletype;

	@Column(name="BIZR_DSPFTITLE")
	private String bizrDspftitle;

	@Column(name="BIZR_HPAGENTCODE")
	private String bizrHpagentcode;

	@Column(name="BIZR_HPAGREEMENT")
	private String bizrHpagreement;

	@Column(name="BIZR_HPSALETYPE")
	private String bizrHpsaletype;

	@Column(name="BIZR_ICA")
	private String bizrIca;

	@Column(name="BIZR_OPERATORID")
	private String bizrOperatorid;

	@Column(name="BIZR_POINTAFF")
	private String bizrPointaff;

	@Column(name="BIZR_POSBINNO")
	private String bizrPosbinno;

	@Column(name="BIZR_SEQBYBRAND")
	private String bizrSeqbybrand;

	@Column(name="BIZR_SEQENDFLAG")
	private String bizrSeqendflag;

	@Column(name="BIZR_SETTTYPE")
	private String bizrSetttype;

	@Column(name="BIZR_SHOPSALETYPE")
	private String bizrShopsaletype;

	@Column(name="BIZR_TRACK")
	private String bizrTrack;

	@Column(name="BIZR_TYPE")
	private String bizrType;

	@Column(name="BIZR_UPDATEDATE")
	private String bizrUpdatedate;
	
	@ManyToOne(fetch=FetchType.LAZY, targetEntity=TbmNamecodeMY09.class)
	@JoinColumn(name="BIZR_CARDTYPE",referencedColumnName="NMCD_VALUE",updatable=false, insertable=false)
	private TbmNamecodeMY09 cardType;

	public TbmNamecodeMY09 getCardType() {
		return cardType;
	}

	public void setCardType(TbmNamecodeMY09 cardType) {
		this.cardType = cardType;
	}

	public TbmBusinessrelation() {
	}

	public TbmBusinessrelationPK getId() {
		return this.id;
	}

	public void setId(TbmBusinessrelationPK id) {
		this.id = id;
	}

	public String getBizrAfficode() {
		return this.bizrAfficode;
	}

	public void setBizrAfficode(String bizrAfficode) {
		this.bizrAfficode = bizrAfficode;
	}

	public String getBizrBinseqno() {
		return this.bizrBinseqno;
	}

	public void setBizrBinseqno(String bizrBinseqno) {
		this.bizrBinseqno = bizrBinseqno;
	}

	public String getBizrCardagencycode() {
		return this.bizrCardagencycode;
	}

	public void setBizrCardagencycode(String bizrCardagencycode) {
		this.bizrCardagencycode = bizrCardagencycode;
	}

	public String getBizrCardbrand() {
		return this.bizrCardbrand;
	}

	public void setBizrCardbrand(String bizrCardbrand) {
		this.bizrCardbrand = bizrCardbrand;
	}

	public String getBizrCardname() {
		return this.bizrCardname;
	}

	public void setBizrCardname(String bizrCardname) {
		this.bizrCardname = bizrCardname;
	}

	public String getBizrCardtype() {
		return this.bizrCardtype;
	}

	public void setBizrCardtype(String bizrCardtype) {
		this.bizrCardtype = bizrCardtype;
	}

	public String getBizrCashsaletype() {
		return this.bizrCashsaletype;
	}

	public void setBizrCashsaletype(String bizrCashsaletype) {
		this.bizrCashsaletype = bizrCashsaletype;
	}

	public String getBizrDspftitle() {
		return this.bizrDspftitle;
	}

	public void setBizrDspftitle(String bizrDspftitle) {
		this.bizrDspftitle = bizrDspftitle;
	}

	public String getBizrHpagentcode() {
		return this.bizrHpagentcode;
	}

	public void setBizrHpagentcode(String bizrHpagentcode) {
		this.bizrHpagentcode = bizrHpagentcode;
	}

	public String getBizrHpagreement() {
		return this.bizrHpagreement;
	}

	public void setBizrHpagreement(String bizrHpagreement) {
		this.bizrHpagreement = bizrHpagreement;
	}

	public String getBizrHpsaletype() {
		return this.bizrHpsaletype;
	}

	public void setBizrHpsaletype(String bizrHpsaletype) {
		this.bizrHpsaletype = bizrHpsaletype;
	}

	public String getBizrIca() {
		return this.bizrIca;
	}

	public void setBizrIca(String bizrIca) {
		this.bizrIca = bizrIca;
	}

	public String getBizrOperatorid() {
		return this.bizrOperatorid;
	}

	public void setBizrOperatorid(String bizrOperatorid) {
		this.bizrOperatorid = bizrOperatorid;
	}

	public String getBizrPointaff() {
		return this.bizrPointaff;
	}

	public void setBizrPointaff(String bizrPointaff) {
		this.bizrPointaff = bizrPointaff;
	}

	public String getBizrPosbinno() {
		return this.bizrPosbinno;
	}

	public void setBizrPosbinno(String bizrPosbinno) {
		this.bizrPosbinno = bizrPosbinno;
	}

	public String getBizrSeqbybrand() {
		return this.bizrSeqbybrand;
	}

	public void setBizrSeqbybrand(String bizrSeqbybrand) {
		this.bizrSeqbybrand = bizrSeqbybrand;
	}

	public String getBizrSeqendflag() {
		return this.bizrSeqendflag;
	}

	public void setBizrSeqendflag(String bizrSeqendflag) {
		this.bizrSeqendflag = bizrSeqendflag;
	}

	public String getBizrSetttype() {
		return this.bizrSetttype;
	}

	public void setBizrSetttype(String bizrSetttype) {
		this.bizrSetttype = bizrSetttype;
	}

	public String getBizrShopsaletype() {
		return this.bizrShopsaletype;
	}

	public void setBizrShopsaletype(String bizrShopsaletype) {
		this.bizrShopsaletype = bizrShopsaletype;
	}

	public String getBizrTrack() {
		return this.bizrTrack;
	}

	public void setBizrTrack(String bizrTrack) {
		this.bizrTrack = bizrTrack;
	}

	public String getBizrType() {
		return this.bizrType;
	}

	public void setBizrType(String bizrType) {
		this.bizrType = bizrType;
	}

	public String getBizrUpdatedate() {
		return this.bizrUpdatedate;
	}

	public void setBizrUpdatedate(String bizrUpdatedate) {
		this.bizrUpdatedate = bizrUpdatedate;
	}

}