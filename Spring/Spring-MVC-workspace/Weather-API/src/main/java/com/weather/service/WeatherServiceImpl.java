package com.weather.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weather.entity.Weather;
import com.weather.repo.WeatherRepository;

@Service
public class WeatherServiceImpl implements WeatherService {

	@Autowired
	private WeatherRepository wRepo;

	@Override
	public List<Weather> getAllWeather() {
		// TODO Auto-generated method stub
		return wRepo.findAll();
	}

	@Override
	public Weather getWeather(int id) {
		// TODO Auto-generated method stub
		return wRepo.findById(id).get();
	}

	@Override
	public Weather addWeather(Weather weather) {
		// TODO Auto-generated method stub
		System.out.println(weather);
		return wRepo.save(weather);
	}

	@Override
	public String deleteWeather(int id) {
		// TODO Auto-generated method stub
		wRepo.deleteById(id);
		return "record deleted..";
	}

	@Transactional
	@Override
	public Weather updateWeather(Weather weather) {
		Weather existingWeather = wRepo.findById(weather.getId()).get();
		if (existingWeather != null) {
			existingWeather.setCity(weather.getCity());
			existingWeather.setTemp(weather.getTemp());
			wRepo.save(existingWeather);
		}

		return weather;
	}

}
