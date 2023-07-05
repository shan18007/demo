package com.corona.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corona.entity.Corona;
import com.corona.exceptions.CoronaErrorResponse;
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
//		String name = null;
//		System.out.println("length: " + name.length());
		return coronaService.geAllCorona();
	}

	@GetMapping("/corona/{id}")
	public Corona getRecord(@PathVariable Long id) {
		
		Corona corona = coronaService.getCorona(id);
//		ResponseEntity res = new ResponseEntity(corona, HttpStatus.OK);
		return corona;

//		try {
//			Corona corona = coronaService.getCorona(id);
//			ResponseEntity res = new ResponseEntity(corona, HttpStatus.OK);
//			return res;
//		} catch (CoronaNotFoundException e) {
//			CoronaErrorResponse error = new CoronaErrorResponse();
//			error.setStatus(HttpStatus.NOT_FOUND.value());
//			error.setMessage(e.getMessage());
//			error.setTimestamp(System.currentTimeMillis());
			
//			ResponseEntity resp = new ResponseEntity(error, HttpStatus.NOT_FOUND);
//			return ResponseEntity.status(HttpStatus.NOT_FOUND).contentType(MediaType.APPLICATION_JSON).body(error);
//			return resp;
//		}
//	return coronaService.getCorona(id);
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

//	@ExceptionHandler
//	public ResponseEntity handleException(Exception e) {
//		System.out.println("Inside Global Excpetion...");
//		CoronaErrorResponse error = new CoronaErrorResponse();
//		error.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
//		error.setMessage("Something went wrong....");
//		error.setTimestamp(System.currentTimeMillis());
//
//		return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
//	}

}
