package edu.cmu.sv.soc.service;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.Charset;

import org.apache.log4j.Logger;

import edu.cmu.sv.soc.util.HttpHelper;

public class WorldWeatherOnlineImpl implements IWeather {
	private static final Logger log = Logger.getLogger(WorldWeatherOnlineImpl.class);

	// Example URL for World Weather Online site
	// http://api.worldweatheronline.com/free/v1/weather.ashx?key=xxxxxxxxxxxxxxxxx&q=98115&format=json
	private static final String URL_PREFIX = "http://api.worldweatheronline.com/free/v1/weather.ashx"
			+ "?key=m7b32qfztwua6js7cjg2px6h" + "&format=json";

	@Override
	public String getWeatherInfo(String param) {
		String response = null;

		try {
			param = URLEncoder.encode(param, Charset.defaultCharset().name());
			log.trace("Encoded Param value = " + param);
			String url = URL_PREFIX + "&q=" + param;
			response = HttpHelper.httpGet(url);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return response;
	}
}
