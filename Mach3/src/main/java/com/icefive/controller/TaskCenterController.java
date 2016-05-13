package com.icefive.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.icefive.model.Task;
import com.icefive.mq.MySender;

@Controller
public class TaskCenterController {

	@RequestMapping("/TaskCenter")
    public String home(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
		List taskList = new ArrayList();
		Task t = new Task();
		t.name= "Smoke salmon";
		Task t2 = new Task();
		t2.name= "Smoke wasabi";
		taskList.add(t);
		taskList.add(t2);
        model.addAttribute("list", taskList);
        return "task_listing";
    }
	
	@RequestMapping("/TaskCenter/SendMQ")
    public String sendMQ( Model model) {
		try {
			MySender.sendMQ();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return "task_listing";
    }
}
