package com.weather.temparature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.weather.temparature.entity.WeatherPojo;
import com.weather.temparature.service.WeatherServiceImpl;

@RestController
@RequestMapping("/weather")
public class WeatherController {

	@Autowired
	private WeatherServiceImpl weatherServiceImpl;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<WeatherPojo> getAllStudents(){
		return weatherServiceImpl.getAllWeather();
	}
	
	
	@RequestMapping(method = RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	public void insertStudent(@RequestBody WeatherPojo weatherPojo){
		 weatherServiceImpl.insertWeather(weatherPojo);
	}
	
	//for updating use this  method
	@RequestMapping(method = RequestMethod.PUT,consumes=MediaType.APPLICATION_JSON_VALUE)
	public void updateStudent(@RequestBody WeatherPojo weather){
		weatherServiceImpl.updateWeather(weather);
	}
	//deleteWeather
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteWeather(@PathVariable("id") String city){
		weatherServiceImpl.deleteWeather(city);
	}
	
	
}
