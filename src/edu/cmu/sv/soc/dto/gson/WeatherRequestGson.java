package edu.cmu.sv.soc.dto.gson;

public class WeatherRequestGson {
	private String query;
	private String type;
	
	@Override
	public String toString() {
		return " WeatherRequestGson={ query = " + query + ", type = " + type + " }";
	}
}
