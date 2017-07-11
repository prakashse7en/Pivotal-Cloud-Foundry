package com.weather.temparature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weather.temparature.entity.WeatherPojo;
import com.weather.temparature.repository.WeatherRepositoryImpl;

@Service
public class WeatherServiceImpl {
	
	@Autowired
	private WeatherRepositoryImpl weatherRepositoryImpl;
	
	public List<WeatherPojo> getAllWeather(){
		return weatherRepositoryImpl.getAllWeather();
	}
	
	//insertStudent
		public void insertWeather(WeatherPojo weatherPojo){
			 weatherRepositoryImpl.insertWeather(weatherPojo);
		}
		
		public void updateWeather(WeatherPojo weatherPojo){
			 weatherRepositoryImpl.updateWeather(weatherPojo);
		}
		
		public void deleteWeather(String city){
			 weatherRepositoryImpl.deleteWeather(city);
		}
}
