package edu.cmu.sv.soc.dto.gson;

public class WeatherRequestGson {
	private String query;
	private String type;
	
	@Override
	public String toString() {
		return " WeatherRequestGson={ query = " + query + ", type = " + type + " }";
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
