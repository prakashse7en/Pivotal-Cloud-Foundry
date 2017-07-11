package com.weather.temparture.helper;

import java.util.ArrayList;
import java.util.List;

import com.weather.temparature.entity.Temparature;
import com.weather.temparature.entity.WeatherPojo;

public class WeatherStubHelper {
	
	
	public static List<WeatherPojo> getStubbedPojo(){
		try{
			List<WeatherPojo> weatherList = new ArrayList<WeatherPojo>();
			WeatherPojo weatherPojo = new WeatherPojo();
			weatherPojo.setCity("Chennai");
			weatherPojo.setDate("2017-10-01");
				//set temparature
			
			
			Temparature[] tempArr = new Temparature[2];
			
			Temparature temp = new Temparature();
			temp.setTemp("98");
			temp.setTime("9:00AM");
			
			Temparature temp2= new Temparature();
			temp2.setTemp("38");
			temp2.setTime("12:00PM");
			
			tempArr[0] = temp;
			tempArr[1] = temp2;
				//set temparature
			weatherPojo.setTemparature(tempArr);
			weatherList.add(weatherPojo);
			
			return weatherList;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

}
