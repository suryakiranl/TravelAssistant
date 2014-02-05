package edu.cmu.sv.soc.service;

import java.io.IOException;

import org.apache.log4j.Logger;

import edu.cmu.sv.soc.dto.WeatherAPIResponse;
import edu.cmu.sv.soc.util.HttpHelper;
import edu.cmu.sv.soc.util.StaticUtils;

public class WorldWeatherOnlineImpl implements IWeather {
	private static final Logger log = Logger
			.getLogger(WorldWeatherOnlineImpl.class);

	// Example URL for World Weather Online site
	// http://api.worldweatheronline.com/free/v1/weather.ashx?key=xxxxxxxxxxxxxxxxx&q=98115&format=json
	private static final String URL_PREFIX = "http://api.worldweatheronline.com/free/v1/weather.ashx"
			+ "?key=m7b32qfztwua6js7cjg2px6h" + "&format=json";

	@Override
	public WeatherAPIResponse getWeatherInfo(String param) {
		WeatherAPIResponse weatherData = null;
		try {
			param = StaticUtils.encodeParameter(param);
			String url = URL_PREFIX + "&q=" + param;
			String response = HttpHelper.httpGet(url);
			log.trace("Weather information = " + response);

			weatherData = StaticUtils.gson.fromJson(response,
					WeatherAPIResponse.class);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return weatherData;
	}

	@Override
	public WeatherAPIResponse getWeatherInfo(String cityNameOrZipCode,
			int numOfDays) {
		WeatherAPIResponse weatherData = null;

		try {
			cityNameOrZipCode = StaticUtils.encodeParameter(cityNameOrZipCode);
			String url = URL_PREFIX + "&q=" + cityNameOrZipCode
					+ "&num_of_days=" + numOfDays;
			String response = HttpHelper.httpGet(url);
			log.trace("Weather information = " + response);

			weatherData = StaticUtils.gson.fromJson(response,
					WeatherAPIResponse.class);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return weatherData;
	}
}
