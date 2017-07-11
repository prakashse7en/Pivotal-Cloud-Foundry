package com.weather.temparature.entity;

public class WeatherPojo {
	
	private String date;
	private String city;
	private Temparature[] temparature;
	
	public Temparature[] getTemparature() {
		return temparature;
	}
	public void setTemparature(Temparature[] temparature) {
		this.temparature = temparature;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		final WeatherPojo weatherObj = (WeatherPojo) obj;
	    if (this.getCity().equals(weatherObj.getCity())) {
	        return Boolean.TRUE;
	    }
		return Boolean.FALSE;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	

}
