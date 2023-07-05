package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String showHome(Model model) {
		model.addAttribute("student",new Student());
		return "index";
	}
	@RequestMapping("/process-form")
	public String processingForm(@ModelAttribute("student") Student st,Model model) {
		st.setSname(st.getSname().toUpperCase());
		model.addAttribute("student",st);
		return "view-data";
	}
	
}
