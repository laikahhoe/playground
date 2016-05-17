package com.icefive.model.db.jpa.common;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TB_CIF database table.
 * 
 */
@Entity
@Table(name="TB_CIF",schema="COMMON")
@NamedQuery(name="TbCif.findAll", query="SELECT t FROM TbCif t")
public class TbCif implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CIF_CIFNO")
	private String cifCifno;

	@Column(name="CIF_ACADEMICID")
	private String cifAcademicid;

	@Column(name="CIF_ACADEMICIDDESC")
	private String cifAcademiciddesc;

	@Column(name="CIF_AGEOFDEPENDENT")
	private short cifAgeofdependent;

	@Column(name="CIF_BRANCHCODE")
	private String cifBranchcode;

	@Column(name="CIF_CCCARDBANK")
	private String cifCccardbank;

	@Column(name="CIF_CCNO")
	private String cifCcno;

	@Column(name="CIF_CCTYPE")
	private String cifCctype;

	@Column(name="CIF_CCTYPEDESC")
	private String cifCctypedesc;

	@Column(name="CIF_CITIZENID")
	private String cifCitizenid;

	@Column(name="CIF_CREATEDBRNCNT")
	private String cifCreatedbrncnt;

	@Column(name="CIF_CREATEDBY")
	private String cifCreatedby;

	@Column(name="CIF_CREATEDDATE")
	private Timestamp cifCreateddate;

	@Column(name="CIF_CREDITLIMIT")
	private BigDecimal cifCreditlimit;

	@Column(name="CIF_CRPADDR")
	private String cifCrpaddr;

	@Column(name="CIF_CUSTTYPEID")
	private String cifCusttypeid;

	@Temporal(TemporalType.DATE)
	@Column(name="CIF_DATEOFBIRTH")
	private Date cifDateofbirth;

	@Column(name="CIF_DISTRICTCODE")
	private String cifDistrictcode;

	@Temporal(TemporalType.DATE)
	@Column(name="CIF_EXPIRYDATE")
	private Date cifExpirydate;

	@Column(name="CIF_FAMILYMEMBER")
	private short cifFamilymember;

	@Column(name="CIF_GENDER")
	private String cifGender;

	@Column(name="CIF_GENDERSPEC")
	private String cifGenderspec;

	@Column(name="CIF_INCRESOURCE")
	private String cifIncresource;

	@Column(name="CIF_JOINTINCOMEIND")
	private String cifJointincomeind;

	@Column(name="CIF_MARITALSTATUSID")
	private String cifMaritalstatusid;

	@Temporal(TemporalType.DATE)
	@Column(name="CIF_MEMBERSINCE")
	private Date cifMembersince;

	@Column(name="CIF_NAME1")
	private String cifName1;

	@Column(name="CIF_NAME2")
	private String cifName2;

	@Column(name="CIF_NATUREOFBIZ")
	private String cifNatureofbiz;

	@Column(name="CIF_NATUREOFBIZDESC")
	private String cifNatureofbizdesc;

	@Column(name="CIF_NOOFCHILDREN")
	private short cifNoofchildren;

	@Column(name="CIF_OTHERINCOME")
	private BigDecimal cifOtherincome;

	@Column(name="CIF_OTHERINCOMESFY")
	private String cifOtherincomesfy;

	@Column(name="CIF_OTHERINCOMESRC")
	private String cifOtherincomesrc;

	@Column(name="CIF_OUTDOORBASE")
	private String cifOutdoorbase;

	@Column(name="CIF_PROPERTY")
	private String cifProperty;

	@Column(name="CIF_RACEID")
	private String cifRaceid;

	@Column(name="CIF_RACESPEC")
	private String cifRacespec;

	@Column(name="CIF_REGIONCODE")
	private String cifRegioncode;

	@Column(name="CIF_RESIDENTIND")
	private String cifResidentind;

	@Column(name="CIF_SECTIONID")
	private String cifSectionid;

	@Column(name="CIF_SECTORID")
	private String cifSectorid;

	@Column(name="CIF_SECTORSPEC")
	private String cifSectorspec;

	@Column(name="CIF_SELFEMPLOY")
	private String cifSelfemploy;

	@Column(name="CIF_SHORTNAME")
	private String cifShortname;

	@Column(name="CIF_STATECODE")
	private String cifStatecode;

	@Column(name="CIF_STAYWITHID")
	private String cifStaywithid;

	@Column(name="CIF_TITLEID")
	private String cifTitleid;

	@Column(name="CIF_TITLESPEC")
	private String cifTitlespec;

	@Column(name="CIF_UPDATEDBRNCNT")
	private String cifUpdatedbrncnt;

	@Column(name="CIF_UPDATEDBY")
	private String cifUpdatedby;

	@Column(name="CIF_UPDATEDDATE")
	private Timestamp cifUpdateddate;

	@Column(name="CIF_VEHICLENO")
	private String cifVehicleno;

	public TbCif() {
	}

	public String getCifCifno() {
		return this.cifCifno;
	}

	public void setCifCifno(String cifCifno) {
		this.cifCifno = cifCifno;
	}

	public String getCifAcademicid() {
		return this.cifAcademicid;
	}

	public void setCifAcademicid(String cifAcademicid) {
		this.cifAcademicid = cifAcademicid;
	}

	public String getCifAcademiciddesc() {
		return this.cifAcademiciddesc;
	}

	public void setCifAcademiciddesc(String cifAcademiciddesc) {
		this.cifAcademiciddesc = cifAcademiciddesc;
	}

	public short getCifAgeofdependent() {
		return this.cifAgeofdependent;
	}

	public void setCifAgeofdependent(short cifAgeofdependent) {
		this.cifAgeofdependent = cifAgeofdependent;
	}

	public String getCifBranchcode() {
		return this.cifBranchcode;
	}

	public void setCifBranchcode(String cifBranchcode) {
		this.cifBranchcode = cifBranchcode;
	}

	public String getCifCccardbank() {
		return this.cifCccardbank;
	}

	public void setCifCccardbank(String cifCccardbank) {
		this.cifCccardbank = cifCccardbank;
	}

	public String getCifCcno() {
		return this.cifCcno;
	}

	public void setCifCcno(String cifCcno) {
		this.cifCcno = cifCcno;
	}

	public String getCifCctype() {
		return this.cifCctype;
	}

	public void setCifCctype(String cifCctype) {
		this.cifCctype = cifCctype;
	}

	public String getCifCctypedesc() {
		return this.cifCctypedesc;
	}

	public void setCifCctypedesc(String cifCctypedesc) {
		this.cifCctypedesc = cifCctypedesc;
	}

	public String getCifCitizenid() {
		return this.cifCitizenid;
	}

	public void setCifCitizenid(String cifCitizenid) {
		this.cifCitizenid = cifCitizenid;
	}

	public String getCifCreatedbrncnt() {
		return this.cifCreatedbrncnt;
	}

	public void setCifCreatedbrncnt(String cifCreatedbrncnt) {
		this.cifCreatedbrncnt = cifCreatedbrncnt;
	}

	public String getCifCreatedby() {
		return this.cifCreatedby;
	}

	public void setCifCreatedby(String cifCreatedby) {
		this.cifCreatedby = cifCreatedby;
	}

	public Timestamp getCifCreateddate() {
		return this.cifCreateddate;
	}

	public void setCifCreateddate(Timestamp cifCreateddate) {
		this.cifCreateddate = cifCreateddate;
	}

	public BigDecimal getCifCreditlimit() {
		return this.cifCreditlimit;
	}

	public void setCifCreditlimit(BigDecimal cifCreditlimit) {
		this.cifCreditlimit = cifCreditlimit;
	}

	public String getCifCrpaddr() {
		return this.cifCrpaddr;
	}

	public void setCifCrpaddr(String cifCrpaddr) {
		this.cifCrpaddr = cifCrpaddr;
	}

	public String getCifCusttypeid() {
		return this.cifCusttypeid;
	}

	public void setCifCusttypeid(String cifCusttypeid) {
		this.cifCusttypeid = cifCusttypeid;
	}

	public Date getCifDateofbirth() {
		return this.cifDateofbirth;
	}

	public void setCifDateofbirth(Date cifDateofbirth) {
		this.cifDateofbirth = cifDateofbirth;
	}

	public String getCifDistrictcode() {
		return this.cifDistrictcode;
	}

	public void setCifDistrictcode(String cifDistrictcode) {
		this.cifDistrictcode = cifDistrictcode;
	}

	public Date getCifExpirydate() {
		return this.cifExpirydate;
	}

	public void setCifExpirydate(Date cifExpirydate) {
		this.cifExpirydate = cifExpirydate;
	}

	public short getCifFamilymember() {
		return this.cifFamilymember;
	}

	public void setCifFamilymember(short cifFamilymember) {
		this.cifFamilymember = cifFamilymember;
	}

	public String getCifGender() {
		return this.cifGender;
	}

	public void setCifGender(String cifGender) {
		this.cifGender = cifGender;
	}

	public String getCifGenderspec() {
		return this.cifGenderspec;
	}

	public void setCifGenderspec(String cifGenderspec) {
		this.cifGenderspec = cifGenderspec;
	}

	public String getCifIncresource() {
		return this.cifIncresource;
	}

	public void setCifIncresource(String cifIncresource) {
		this.cifIncresource = cifIncresource;
	}

	public String getCifJointincomeind() {
		return this.cifJointincomeind;
	}

	public void setCifJointincomeind(String cifJointincomeind) {
		this.cifJointincomeind = cifJointincomeind;
	}

	public String getCifMaritalstatusid() {
		return this.cifMaritalstatusid;
	}

	public void setCifMaritalstatusid(String cifMaritalstatusid) {
		this.cifMaritalstatusid = cifMaritalstatusid;
	}

	public Date getCifMembersince() {
		return this.cifMembersince;
	}

	public void setCifMembersince(Date cifMembersince) {
		this.cifMembersince = cifMembersince;
	}

	public String getCifName1() {
		return this.cifName1;
	}

	public void setCifName1(String cifName1) {
		this.cifName1 = cifName1;
	}

	public String getCifName2() {
		return this.cifName2;
	}

	public void setCifName2(String cifName2) {
		this.cifName2 = cifName2;
	}

	public String getCifNatureofbiz() {
		return this.cifNatureofbiz;
	}

	public void setCifNatureofbiz(String cifNatureofbiz) {
		this.cifNatureofbiz = cifNatureofbiz;
	}

	public String getCifNatureofbizdesc() {
		return this.cifNatureofbizdesc;
	}

	public void setCifNatureofbizdesc(String cifNatureofbizdesc) {
		this.cifNatureofbizdesc = cifNatureofbizdesc;
	}

	public short getCifNoofchildren() {
		return this.cifNoofchildren;
	}

	public void setCifNoofchildren(short cifNoofchildren) {
		this.cifNoofchildren = cifNoofchildren;
	}

	public BigDecimal getCifOtherincome() {
		return this.cifOtherincome;
	}

	public void setCifOtherincome(BigDecimal cifOtherincome) {
		this.cifOtherincome = cifOtherincome;
	}

	public String getCifOtherincomesfy() {
		return this.cifOtherincomesfy;
	}

	public void setCifOtherincomesfy(String cifOtherincomesfy) {
		this.cifOtherincomesfy = cifOtherincomesfy;
	}

	public String getCifOtherincomesrc() {
		return this.cifOtherincomesrc;
	}

	public void setCifOtherincomesrc(String cifOtherincomesrc) {
		this.cifOtherincomesrc = cifOtherincomesrc;
	}

	public String getCifOutdoorbase() {
		return this.cifOutdoorbase;
	}

	public void setCifOutdoorbase(String cifOutdoorbase) {
		this.cifOutdoorbase = cifOutdoorbase;
	}

	public String getCifProperty() {
		return this.cifProperty;
	}

	public void setCifProperty(String cifProperty) {
		this.cifProperty = cifProperty;
	}

	public String getCifRaceid() {
		return this.cifRaceid;
	}

	public void setCifRaceid(String cifRaceid) {
		this.cifRaceid = cifRaceid;
	}

	public String getCifRacespec() {
		return this.cifRacespec;
	}

	public void setCifRacespec(String cifRacespec) {
		this.cifRacespec = cifRacespec;
	}

	public String getCifRegioncode() {
		return this.cifRegioncode;
	}

	public void setCifRegioncode(String cifRegioncode) {
		this.cifRegioncode = cifRegioncode;
	}

	public String getCifResidentind() {
		return this.cifResidentind;
	}

	public void setCifResidentind(String cifResidentind) {
		this.cifResidentind = cifResidentind;
	}

	public String getCifSectionid() {
		return this.cifSectionid;
	}

	public void setCifSectionid(String cifSectionid) {
		this.cifSectionid = cifSectionid;
	}

	public String getCifSectorid() {
		return this.cifSectorid;
	}

	public void setCifSectorid(String cifSectorid) {
		this.cifSectorid = cifSectorid;
	}

	public String getCifSectorspec() {
		return this.cifSectorspec;
	}

	public void setCifSectorspec(String cifSectorspec) {
		this.cifSectorspec = cifSectorspec;
	}

	public String getCifSelfemploy() {
		return this.cifSelfemploy;
	}

	public void setCifSelfemploy(String cifSelfemploy) {
		this.cifSelfemploy = cifSelfemploy;
	}

	public String getCifShortname() {
		return this.cifShortname;
	}

	public void setCifShortname(String cifShortname) {
		this.cifShortname = cifShortname;
	}

	public String getCifStatecode() {
		return this.cifStatecode;
	}

	public void setCifStatecode(String cifStatecode) {
		this.cifStatecode = cifStatecode;
	}

	public String getCifStaywithid() {
		return this.cifStaywithid;
	}

	public void setCifStaywithid(String cifStaywithid) {
		this.cifStaywithid = cifStaywithid;
	}

	public String getCifTitleid() {
		return this.cifTitleid;
	}

	public void setCifTitleid(String cifTitleid) {
		this.cifTitleid = cifTitleid;
	}

	public String getCifTitlespec() {
		return this.cifTitlespec;
	}

	public void setCifTitlespec(String cifTitlespec) {
		this.cifTitlespec = cifTitlespec;
	}

	public String getCifUpdatedbrncnt() {
		return this.cifUpdatedbrncnt;
	}

	public void setCifUpdatedbrncnt(String cifUpdatedbrncnt) {
		this.cifUpdatedbrncnt = cifUpdatedbrncnt;
	}

	public String getCifUpdatedby() {
		return this.cifUpdatedby;
	}

	public void setCifUpdatedby(String cifUpdatedby) {
		this.cifUpdatedby = cifUpdatedby;
	}

	public Timestamp getCifUpdateddate() {
		return this.cifUpdateddate;
	}

	public void setCifUpdateddate(Timestamp cifUpdateddate) {
		this.cifUpdateddate = cifUpdateddate;
	}

	public String getCifVehicleno() {
		return this.cifVehicleno;
	}

	public void setCifVehicleno(String cifVehicleno) {
		this.cifVehicleno = cifVehicleno;
	}

}