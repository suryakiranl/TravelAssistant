package edu.cmu.sv.soc.service;

import edu.cmu.sv.soc.dto.WeatherAPIResponse;

public interface IWeather {
	/**
	 * Obtain weather information depending on city name or zipcode
	 * 
	 * @param cityNameOrZipCode - City name or Zip code
	 * 
	 * @return - Weather info from server
	 */
	WeatherAPIResponse getWeatherInfo(String cityNameOrZipCode);
	
	/**
	 * Obtain weather info based on city depending on the number of days
	 * to forecast
	 * 
	 * @param cityNameOrZipCode - City name or Zip Code
	 * @param numOfDays - Number of days to forecast
	 * 
	 * @return - Weather info from server
	 */
	WeatherAPIResponse getWeatherInfo(String cityNameOrZipCode, int numOfDays);
}
