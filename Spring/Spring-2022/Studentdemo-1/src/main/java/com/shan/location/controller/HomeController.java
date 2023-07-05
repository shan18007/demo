package com.shan.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shan.location.entities.Location;
import com.shan.location.service.LocationService;

@Controller
public class HomeController {

	@Autowired
	private LocationService service;
	
	@RequestMapping("/")
	public String showHome() {
	return "index";	
	}
	
	
	@RequestMapping("/showAddLocation")
	public String addLocation() {
	return "addLocation";	
	}
	
	@RequestMapping("/showAllLocation")
	public String showAllLocation() {
	return "addLocation";	
	}
	
	@RequestMapping("/saveloc")
	public String saveLocation(@ModelAttribute("location") Location location,ModelMap map) {
		service.addLocation(location);
		System.out.println(location);
		String msg="location added";
		map.addAttribute("message", msg);
		return "addLocation";
	}
	
	@RequestMapping("/updatesLocation")
	public String updateLocation() {
	return "addLocation";	
	}
	
	@RequestMapping("/deleteLocation")
	public String deleteLocation(@RequestParam("id") Integer id,Model model) {
	service.deletLocation(id);
	String msg="delete success with id: "+id;
	model.addAttribute("message", msg);
	List<Location> allLocations = service.getAllLocations();
	model.addAttribute("locations",allLocations);
	return "allLocations";	
	}
	
	@RequestMapping("/showLocations")
	public String showAllLocations(Model model) {
	List<Location> allLocations = service.getAllLocations();
	System.out.println("data fetched: " +allLocations);
	model.addAttribute("locations",allLocations);
	return "allLocations";
	}
	
	
}
