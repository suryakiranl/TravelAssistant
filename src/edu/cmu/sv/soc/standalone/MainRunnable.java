package edu.cmu.sv.soc.standalone;

import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import edu.cmu.sv.soc.dto.WeatherAPIResponse;
import edu.cmu.sv.soc.service.IWeather;
import edu.cmu.sv.soc.service.WorldWeatherOnlineImpl;

public class MainRunnable {
	private static final Logger log = Logger.getLogger(MainRunnable.class);
	
	public static void main(String[] args) {
		IWeather weatherInfo = new WorldWeatherOnlineImpl();
		
		String jsonResponse = weatherInfo.getWeatherInfo("94087", 3);
		log.trace("Weather information 1 = " + jsonResponse);
		
		//Gson gson = new Gson();
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
		WeatherAPIResponse weatherData = gson.fromJson(jsonResponse, WeatherAPIResponse.class);
		
		log.trace("Weather Respnse as an object = " + weatherData);
	}

}
