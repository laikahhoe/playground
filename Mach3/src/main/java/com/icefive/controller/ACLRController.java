package com.icefive.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.icefive.dao.AclrDao;
import com.icefive.model.ACLRForm;
import com.icefive.model.bean.ACLRStaffReport;
import com.icefive.model.db.jpa.common.TbCclimitRev;

@Controller
public class ACLRController {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@RequestMapping("/ACLR")
	public String index(@ModelAttribute("aclrForm")ACLRForm aclrForm, Model model) {
    //public String index(@ModelAttribute("tbCclimitRev")TbCclimitRev tbCclimitRev, Model model) {
		
		AclrDao dao = new AclrDao();
		if(aclrForm.clrAppno!=null){
			Long total = dao.countAllCCLimitRev(aclrForm.clrAppno,aclrForm.clrPrmid, aclrForm.clrSubmittedDate);
			List cclimitRevList = dao.findAllCClimitRev(100, aclrForm.clrAppno,aclrForm.clrPrmid, aclrForm.clrSubmittedDate);
			model.addAttribute("list", cclimitRevList);
			model.addAttribute("total", total);	
		}
		
        return "aclr_listing";
    }
	
	@RequestMapping("/ACLR/Report")
	public String report(@ModelAttribute("aclrForm")ACLRForm aclrForm, Model model) {
		AclrDao dao = new AclrDao();
		Calendar c = new GregorianCalendar();
		Date prevDate = null;
		if(aclrForm.clrSubmittedDate==null){
			aclrForm.clrSubmittedDate = new Date();	
		}
		c.setTime(aclrForm.clrSubmittedDate);
		c.add(Calendar.DATE, -1);
		prevDate = c.getTime();
		
		List cclimitRevList = dao.findForReport(100, aclrForm.clrAppno,aclrForm.clrPrmid, aclrForm.clrSubmittedDate);
		List cclimitRevListPrev = dao.findForReport(100, aclrForm.clrAppno,aclrForm.clrPrmid, prevDate);
		model.addAttribute("list", cclimitRevList);
		model.addAttribute("prevDate", prevDate);
		model.addAttribute("listPrev", cclimitRevListPrev);
        return "aclr_report";
    }
	
	@RequestMapping("/ACLR/StaffReport")
	public String staffReport(@ModelAttribute("aclrForm")ACLRForm aclrForm, Model model) {
		AclrDao dao = new AclrDao();
		if(aclrForm.clrSubmittedDate==null){
			aclrForm.clrSubmittedDate = new Date();	
		}
		List<ACLRStaffReport> cclimitRevList = dao.findForStaffReport(aclrForm.clrSubmittedDate);
		model.addAttribute("list", cclimitRevList);
        return "aclr_staff_report";
    }
	
	
	@RequestMapping("/ACLR/detail/{id}")
	public String detail(@PathVariable String id, Model model) {
		AclrDao dao = new AclrDao();
		if(id!=null){
			TbCclimitRev tbCclimitRev = dao.get(id);
			model.addAttribute("item", tbCclimitRev);	
		}
        return "aclr_detail";
    }
	
}
