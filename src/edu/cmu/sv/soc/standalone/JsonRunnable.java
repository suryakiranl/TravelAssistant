package edu.cmu.sv.soc.standalone;

import com.google.gson.Gson;

import edu.cmu.sv.soc.dto.WeatherAPIResponse;

public class JsonRunnable {

	public static void main(String[] args) {
		String jsonStr = "{ \"data\": { "
				+ "\"request\": [ {\"query\": \"94087\","
				+ " \"type\": \"Zipcode\" } ]"
				+ "}}";
		Gson gson = new Gson();
		WeatherAPIResponse wd = gson.fromJson(jsonStr, WeatherAPIResponse.class);
		
		System.out.println("WD = " + wd);
	}

}
