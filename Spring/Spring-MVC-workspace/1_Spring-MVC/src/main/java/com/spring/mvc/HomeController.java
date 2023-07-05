package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String showHome(Model model) {
		model.addAttribute("student", new Student());
		return "index";
	}

	@RequestMapping("/process-form")
	public String showName(@ModelAttribute("student") Student student, Model model) {
//		String name=request.getParameter("name");
		System.out.println(student.getFirstName());
		System.out.println(student.getLastName());
		System.out.println(student.getCountry());
		model.addAttribute("message", student);
		return "show-data";
	}
}
