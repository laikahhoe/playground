package com.icefive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class WizardController {

	public String start(Model model) {
        return "setup_wizard";
    }
}
