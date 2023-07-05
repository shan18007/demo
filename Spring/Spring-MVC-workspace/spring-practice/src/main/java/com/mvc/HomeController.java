package com.mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String showHome(Model model) {
		model.addAttribute("student", new Student());
		return "index";
	}

	@RequestMapping("/processForm")
	public String showData(@Valid @ModelAttribute("student") Student student, Model model,BindingResult bindingResult) {
		
		System.out.println(student);
		System.out.println(bindingResult.getErrorCount());
		if(bindingResult.hasErrors()) {
//			model.addAttribute("student", new Student());
			return "index";
		}else {
//			model.addAttribute("st", student);
			return "view-data";
		}
	}
}
