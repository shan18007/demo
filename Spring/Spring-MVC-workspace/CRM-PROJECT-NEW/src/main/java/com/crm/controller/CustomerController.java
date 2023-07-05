package com.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.dao.CustomerDAO;
import com.crm.entity.Customer;
import com.crm.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/")
	public String showHome() {
		return "index";
	}


	@PostMapping("/saveCustomer")
	public String addCustomer(@ModelAttribute("customer") Customer c, Model model) {
		customerService.addCustomer(c);
		System.out.println("added..");
		return "redirect:/customer/list";
	}

	@RequestMapping("/list")
	public String showCustomer(Model model) {
		System.out.println("in cust list");
		List<Customer> li = customerService.getCustomerList();
		model.addAttribute("customer", li);
		return "customer-list";
	}

	@RequestMapping("/form")
	public String showAddCustomerForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "add-cust";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showUpdateForm(@RequestParam("customerId") int theId,Model model) {
	
		Customer thecustomer= customerService.getCustomer(theId);
		model.addAttribute("customer",thecustomer);
		return "add-cust";
	}
	
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId") int theId) {
		customerService.deleteCustomer(theId);
		return "redirect:/customer/list";
	}

}
