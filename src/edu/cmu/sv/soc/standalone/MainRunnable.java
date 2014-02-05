package edu.cmu.sv.soc.standalone;

import org.apache.log4j.Logger;

import edu.cmu.sv.soc.dto.WeatherAPIResponse;
import edu.cmu.sv.soc.service.IWeather;
import edu.cmu.sv.soc.service.WorldWeatherOnlineImpl;

public class MainRunnable {
	private static final Logger log = Logger.getLogger(MainRunnable.class);

	public static void main(String[] args) {
		IWeather weatherInfo = new WorldWeatherOnlineImpl();

		WeatherAPIResponse weatherData = weatherInfo.getWeatherInfo("94087", 3);

		log.trace("Weather Response as an object = " + weatherData);
	}

}
