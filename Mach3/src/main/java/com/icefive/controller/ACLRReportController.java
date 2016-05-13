package com.icefive.controller;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.icefive.dao.AclrDao;

@Controller
public class ACLRReportController {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@RequestMapping("/ACLR")
    public String home(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
		AclrDao dao = new AclrDao();
		List cclimitRevList = dao.findAllCClimitRev(10, new Timestamp(System.currentTimeMillis()));
		model.addAttribute("list", cclimitRevList);
        return "cclimit_listing";
    }
	
}
