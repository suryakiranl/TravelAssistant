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
}
