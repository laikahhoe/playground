package com.icefive.model.db.jpa.common;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TB_CIFEMPHIST database table.
 * 
 */
@Entity
@Table(name="TB_CIFEMPHIST",schema="COMMON")
@NamedQuery(name="TbCifemphist.findAll", query="SELECT t FROM TbCifemphist t")
public class TbCifemphist implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TbCifemphistPK id;

	@Column(name="CFEM_ANNUALINCOME")
	private BigDecimal cfemAnnualincome;

	@Column(name="CFEM_DEPTID")
	private String cfemDeptid;

	@Column(name="CFEM_DEPTSPEC")
	private String cfemDeptspec;

	@Temporal(TemporalType.DATE)
	@Column(name="CFEM_EFFECTFROM")
	private Date cfemEffectfrom;

	@Temporal(TemporalType.DATE)
	@Column(name="CFEM_EFFECTTO")
	private Date cfemEffectto;

	@Column(name="CFEM_EMPLOYEESTATUS")
	private String cfemEmployeestatus;

	@Column(name="CFEM_EMPLOYERNAME2")
	private String cfemEmployername2;

	@Column(name="CFEM_GROSSMONTHLYSALARY")
	private BigDecimal cfemGrossmonthlysalary;

	@Column(name="CFEM_JOBDESC")
	private String cfemJobdesc;

	@Column(name="CFEM_JOBID")
	private String cfemJobid;

	@Column(name="CFEM_MIDMONTHSALARYDATE")
	private short cfemMidmonthsalarydate;

	@Column(name="CFEM_NETMONTHLYSALARY")
	private BigDecimal cfemNetmonthlysalary;

	@Column(name="CFEM_PAYSLIPTYPE")
	private String cfemPaysliptype;

	@Column(name="CFEM_SALARYDATE")
	private short cfemSalarydate;

	@Temporal(TemporalType.DATE)
	@Column(name="CFEM_WORKPMEXPDATE")
	private Date cfemWorkpmexpdate;

	@Column(name="CFEM_YEAROFSERVICE")
	private BigDecimal cfemYearofservice;
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CFEM_CIFNO", insertable= false, updatable=false)
	private TbCif tbcif;
	
	
	
	

	public TbCif getTbcif() {
		return tbcif;
	}

	public void setTbcif(TbCif tbcif) {
		this.tbcif = tbcif;
	}

	public TbCifemphist() {
	}

	public TbCifemphistPK getId() {
		return this.id;
	}

	public void setId(TbCifemphistPK id) {
		this.id = id;
	}

	public BigDecimal getCfemAnnualincome() {
		return this.cfemAnnualincome;
	}

	public void setCfemAnnualincome(BigDecimal cfemAnnualincome) {
		this.cfemAnnualincome = cfemAnnualincome;
	}

	public String getCfemDeptid() {
		return this.cfemDeptid;
	}

	public void setCfemDeptid(String cfemDeptid) {
		this.cfemDeptid = cfemDeptid;
	}

	public String getCfemDeptspec() {
		return this.cfemDeptspec;
	}

	public void setCfemDeptspec(String cfemDeptspec) {
		this.cfemDeptspec = cfemDeptspec;
	}

	public Date getCfemEffectfrom() {
		return this.cfemEffectfrom;
	}

	public void setCfemEffectfrom(Date cfemEffectfrom) {
		this.cfemEffectfrom = cfemEffectfrom;
	}

	public Date getCfemEffectto() {
		return this.cfemEffectto;
	}

	public void setCfemEffectto(Date cfemEffectto) {
		this.cfemEffectto = cfemEffectto;
	}

	public String getCfemEmployeestatus() {
		return this.cfemEmployeestatus;
	}

	public void setCfemEmployeestatus(String cfemEmployeestatus) {
		this.cfemEmployeestatus = cfemEmployeestatus;
	}

	public String getCfemEmployername2() {
		return this.cfemEmployername2;
	}

	public void setCfemEmployername2(String cfemEmployername2) {
		this.cfemEmployername2 = cfemEmployername2;
	}

	public BigDecimal getCfemGrossmonthlysalary() {
		return this.cfemGrossmonthlysalary;
	}

	public void setCfemGrossmonthlysalary(BigDecimal cfemGrossmonthlysalary) {
		this.cfemGrossmonthlysalary = cfemGrossmonthlysalary;
	}

	public String getCfemJobdesc() {
		return this.cfemJobdesc;
	}

	public void setCfemJobdesc(String cfemJobdesc) {
		this.cfemJobdesc = cfemJobdesc;
	}

	public String getCfemJobid() {
		return this.cfemJobid;
	}

	public void setCfemJobid(String cfemJobid) {
		this.cfemJobid = cfemJobid;
	}

	public short getCfemMidmonthsalarydate() {
		return this.cfemMidmonthsalarydate;
	}

	public void setCfemMidmonthsalarydate(short cfemMidmonthsalarydate) {
		this.cfemMidmonthsalarydate = cfemMidmonthsalarydate;
	}

	public BigDecimal getCfemNetmonthlysalary() {
		return this.cfemNetmonthlysalary;
	}

	public void setCfemNetmonthlysalary(BigDecimal cfemNetmonthlysalary) {
		this.cfemNetmonthlysalary = cfemNetmonthlysalary;
	}

	public String getCfemPaysliptype() {
		return this.cfemPaysliptype;
	}

	public void setCfemPaysliptype(String cfemPaysliptype) {
		this.cfemPaysliptype = cfemPaysliptype;
	}

	public short getCfemSalarydate() {
		return this.cfemSalarydate;
	}

	public void setCfemSalarydate(short cfemSalarydate) {
		this.cfemSalarydate = cfemSalarydate;
	}

	public Date getCfemWorkpmexpdate() {
		return this.cfemWorkpmexpdate;
	}

	public void setCfemWorkpmexpdate(Date cfemWorkpmexpdate) {
		this.cfemWorkpmexpdate = cfemWorkpmexpdate;
	}

	public BigDecimal getCfemYearofservice() {
		return this.cfemYearofservice;
	}

	public void setCfemYearofservice(BigDecimal cfemYearofservice) {
		this.cfemYearofservice = cfemYearofservice;
	}

}