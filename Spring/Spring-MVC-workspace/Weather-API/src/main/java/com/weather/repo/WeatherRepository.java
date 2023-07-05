package com.weather.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weather.entity.Weather;

public interface WeatherRepository extends JpaRepository<Weather, Integer> {

	
}
