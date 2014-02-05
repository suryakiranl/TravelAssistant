package edu.cmu.sv.soc.dto.gson;

public class CurrentConditionGson {
	private String cloudcover;
	private String humidity;
	private String observation_time;
	private String precipMM;
	private String pressure;
	private String temp_C;
	private String temp_F;
	private String visibility;
	private String weatherCode;
	private ValueGson[] weatherDesc;
	private ValueGson[] weatherIconUrl;
	private String winddir16Point;
	private String winddirDegree;
	private String windspeedKmph;
	private String windspeedMiles;

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(" CurrentConditionGson={ cloudcover=").append(cloudcover)
				.append(", precipMM=").append(precipMM).append(", humidity=")
				.append(humidity).append(", observation_time=")
				.append(observation_time).append(", pressure=")
				.append(pressure).append(", temp_C=").append(temp_C)
				.append(", temp_F=").append(temp_F).append(", visibility=")
				.append(visibility).append(", weatherCode=")
				.append(weatherCode).append(", winddir16Point=")
				.append(winddir16Point).append(", winddirDegree=")
				.append(winddirDegree).append(", windspeedKmph=")
				.append(windspeedKmph).append(", windspeedMiles=")
				.append(windspeedMiles);

		sb.append(", weatherDesc=[ ");
		for (ValueGson vg : weatherDesc) {
			sb.append(vg).append(" ,");
		}
		sb.append(" ]");

		sb.append(", weatherIconUrl=[ ");
		for (ValueGson vg : weatherIconUrl) {
			sb.append(vg).append(" ,");
		}
		sb.append(" ]");

		sb.append(" }");

		return sb.toString();
	}

	public String getCloudcover() {
		return cloudcover;
	}

	public void setCloudcover(String cloudcover) {
		this.cloudcover = cloudcover;
	}

	public String getHumidity() {
		return humidity;
	}

	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}

	public String getObservation_time() {
		return observation_time;
	}

	public void setObservation_time(String observation_time) {
		this.observation_time = observation_time;
	}

	public String getPrecipMM() {
		return precipMM;
	}

	public void setPrecipMM(String precipMM) {
		this.precipMM = precipMM;
	}

	public String getPressure() {
		return pressure;
	}

	public void setPressure(String pressure) {
		this.pressure = pressure;
	}

	public String getTemp_C() {
		return temp_C;
	}

	public void setTemp_C(String temp_C) {
		this.temp_C = temp_C;
	}

	public String getTemp_F() {
		return temp_F;
	}

	public void setTemp_F(String temp_F) {
		this.temp_F = temp_F;
	}

	public String getVisibility() {
		return visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	public String getWeatherCode() {
		return weatherCode;
	}

	public void setWeatherCode(String weatherCode) {
		this.weatherCode = weatherCode;
	}

	public ValueGson[] getWeatherDesc() {
		return weatherDesc;
	}

	public void setWeatherDesc(ValueGson[] weatherDesc) {
		this.weatherDesc = weatherDesc;
	}

	public ValueGson[] getWeatherIconUrl() {
		return weatherIconUrl;
	}

	public void setWeatherIconUrl(ValueGson[] weatherIconUrl) {
		this.weatherIconUrl = weatherIconUrl;
	}

	public String getWinddir16Point() {
		return winddir16Point;
	}

	public void setWinddir16Point(String winddir16Point) {
		this.winddir16Point = winddir16Point;
	}

	public String getWinddirDegree() {
		return winddirDegree;
	}

	public void setWinddirDegree(String winddirDegree) {
		this.winddirDegree = winddirDegree;
	}

	public String getWindspeedKmph() {
		return windspeedKmph;
	}

	public void setWindspeedKmph(String windspeedKmph) {
		this.windspeedKmph = windspeedKmph;
	}

	public String getWindspeedMiles() {
		return windspeedMiles;
	}

	public void setWindspeedMiles(String windspeedMiles) {
		this.windspeedMiles = windspeedMiles;
	}
}
