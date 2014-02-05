package edu.cmu.sv.soc.dto.gson;

import java.util.Date;

public class WeatherGson {
	private Date date;
	private String precipMM;
	private String tempMaxC;
	private String tempMaxF;
	private String tempMinC;
	private String tempMinF;
	private String weatherCode;
	private ValueGson[] weatherDesc;
	private ValueGson[] weatherIconUrl;
	private String winddir16Point;
	private String winddirDegree;
	private String winddirection;
	private String windspeedKmph;
	private String windspeedMiles;

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(" WeatherGson={ date=").append(date).append(", precipMM=")
				.append(precipMM).append(", tempMaxC=").append(tempMaxC)
				.append(", tempMaxF=").append(tempMaxF).append(", tempMinC=")
				.append(tempMinC).append(", tempMinF=").append(tempMinF)
				.append(", weatherCode=").append(weatherCode)
				.append(", winddir16Point=").append(winddir16Point)
				.append(", winddirDegree=").append(winddirDegree)
				.append(", winddirection=").append(winddirection)
				.append(", windspeedKmph=").append(windspeedKmph)
				.append(", windspeedMiles=").append(windspeedMiles);
		
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getPrecipMM() {
		return precipMM;
	}

	public void setPrecipMM(String precipMM) {
		this.precipMM = precipMM;
	}

	public String getTempMaxC() {
		return tempMaxC;
	}

	public void setTempMaxC(String tempMaxC) {
		this.tempMaxC = tempMaxC;
	}

	public String getTempMaxF() {
		return tempMaxF;
	}

	public void setTempMaxF(String tempMaxF) {
		this.tempMaxF = tempMaxF;
	}

	public String getTempMinC() {
		return tempMinC;
	}

	public void setTempMinC(String tempMinC) {
		this.tempMinC = tempMinC;
	}

	public String getTempMinF() {
		return tempMinF;
	}

	public void setTempMinF(String tempMinF) {
		this.tempMinF = tempMinF;
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

	public String getWinddirection() {
		return winddirection;
	}

	public void setWinddirection(String winddirection) {
		this.winddirection = winddirection;
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
