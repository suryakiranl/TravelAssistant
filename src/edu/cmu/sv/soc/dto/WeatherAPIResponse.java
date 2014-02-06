package edu.cmu.sv.soc.dto;

import edu.cmu.sv.soc.dto.gson.WeatherReponseDataGson;

public class WeatherAPIResponse {
	private WeatherReponseDataGson data;
	
	public WeatherReponseDataGson getData() {
		return data;
	}

	public void setData(WeatherReponseDataGson data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return data.toString();
	}
}
