package com.hib;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stm = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stm);
	}

	@RequestMapping("/")
	public String showHome() {
		return "index";
	}

	@RequestMapping("/form")
	public String showForm(Model model) {
		model.addAttribute("student", new Student());
		return "student-form";
	}

	@RequestMapping("/process-form")
	public String procesForm(@Valid @ModelAttribute("student") Student student, BindingResult bs, Model model) {
		System.out.println(bs);
		System.out.println("\n\n\n\n");
		if (bs.hasErrors()) {
//			System.out.println("Error found....!!" + bs);
//			model.addAttribute("student", student);
			return "student-form";
		} else {
			model.addAttribute("student", student);
			System.out.println("|" + student.getFirstName() + "|");
			System.out.println("first name length: " + student.getFirstName().length());
			return "show-data";
		}

	}
}
