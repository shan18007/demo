package com.corona.controller;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corona.entity.Corona;
import com.corona.exceptions.CoronaNotFoundException;
import com.corona.service.CoronaService;

@RestController
@RequestMapping("/api")
public class CoronaRestController {
	
	
	Logger log = LogManager.getLogger();

	@Autowired
	private CoronaService coronaService;

	@PostMapping("/corona")
	public Corona addCorona(@RequestBody Corona corona) {
		System.out.println(corona);
		return coronaService.addCorona(corona);
	}

	@GetMapping("/corona")
	public List<Corona> getAllRecords() {
		return coronaService.geAllCorona();
	}

	@GetMapping("/corona/{id}")
	public Corona getRecord(@PathVariable Long id) {
		Optional val = Optional.ofNullable(coronaService.getCorona(id));
		
		log.info("SHANTANU MSG: "+val.isEmpty());
		if(val.isEmpty()) throw new CoronaNotFoundException("Corona not found for id: "+id);
		return (Corona) val.get();
//		return coronaService.getCorona(id);
	}

	@PutMapping("/corona")
	public Corona updateRecord(@RequestBody Corona corona) {
		coronaService.updateCorona(corona);
		return corona;
	}

	@DeleteMapping("/corona/{id}")
	public String deleteRecord(@PathVariable Long id) {
		return coronaService.deleteCorona(id);
	}

}
