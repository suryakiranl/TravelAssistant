package edu.cmu.sv.soc.dto;

import edu.cmu.sv.soc.dto.gson.WeatherReponseDataGson;

public class WeatherAPIResponse {
	private WeatherReponseDataGson data;
	
	@Override
	public String toString() {
		return data.toString();
	}
}
