package com.weather.service;

import java.util.List;

import com.weather.entity.Weather;

public interface WeatherService {

	public List<Weather> getAllWeather();

	public Weather getWeather(int id);

	public Weather addWeather(Weather weather);

	public String deleteWeather(int id);

	public Weather updateWeather(Weather weather);

}
