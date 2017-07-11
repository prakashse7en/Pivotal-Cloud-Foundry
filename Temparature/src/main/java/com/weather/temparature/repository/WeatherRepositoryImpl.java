package com.weather.temparature.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.weather.temparature.entity.WeatherPojo;
import com.weather.temparture.helper.WeatherStubHelper;

@Repository
public class WeatherRepositoryImpl {

	private static List<WeatherPojo> weatherPojo = null;

	static {
		weatherPojo = WeatherStubHelper.getStubbedPojo();
	}

	public List<WeatherPojo> getAllWeather() {
		try {
			if (null != weatherPojo) {
				return weatherPojo;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void insertWeather(WeatherPojo singlePojo) {
		try {
			if (null != weatherPojo) {
				weatherPojo.add(singlePojo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateWeather(WeatherPojo singlePojo) {
		try {
			if (null != weatherPojo && null != singlePojo) {
				System.out.println("weatherPojo.indexOf(singlePojo) " + weatherPojo.indexOf(singlePojo));
				if (weatherPojo.indexOf(singlePojo) >= 0 && weatherPojo.indexOf(singlePojo) < weatherPojo.size()) {
					weatherPojo.set(weatherPojo.indexOf(singlePojo), singlePojo);
				} else {
					// call new payload to be added
					insertWeather(singlePojo);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteWeather(String city) {
		try {
			WeatherPojo bufWeatherPojo = null;
			for(WeatherPojo singPojo : weatherPojo){
				if(singPojo.getCity().equals(city)){
					bufWeatherPojo = singPojo;
					break;
				}
			}
			if(null != bufWeatherPojo){
				weatherPojo.remove(weatherPojo.indexOf(bufWeatherPojo));
			}
		} catch (Exception e) {

		}
	}

}
