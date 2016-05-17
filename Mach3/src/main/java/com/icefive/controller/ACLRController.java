package com.icefive.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.icefive.dao.AclrDao;
import com.icefive.model.db.jpa.common.TbCclimitRev;

@Controller
public class ACLRController {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@RequestMapping("/ACLR")
    public String index(@ModelAttribute("tbCclimitRev")TbCclimitRev tbCclimitRev, Model model) {
		
		AclrDao dao = new AclrDao();
		if(tbCclimitRev.getClrAppno()!=null){
			List cclimitRevList = dao.findAllCClimitRev(10, tbCclimitRev.getClrAppno());
			model.addAttribute("list", cclimitRevList);	
		}
		
        return "aclr_listing";
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
