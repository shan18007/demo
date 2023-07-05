package com.weather.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weather.entity.Weather;
import com.weather.service.WeatherService;

@RestController
@RequestMapping("/api")
public class WeatherController {

	@Autowired
	private WeatherService wservice;

	@GetMapping("/weather/{id}")
	public Weather getWeather(@PathVariable Integer id) {
		return wservice.getWeather(id);
	}

	@GetMapping("/weather")
	public List<Weather> getAllWeather() {
		return wservice.getAllWeather();
	}

	@PostMapping("/weather")
	public Weather addWeather(@RequestBody Weather weather) {
		System.out.println(weather);
		return wservice.addWeather(weather);
	}

	@PutMapping("/weather")
	public Weather updateWeather(@RequestBody Weather weather) {
		return wservice.addWeather(weather);
	}

	@DeleteMapping("/weather/{id}")
	public String deleteWeather(@PathVariable Integer id) {
		return wservice.deleteWeather(id);
	}

}
