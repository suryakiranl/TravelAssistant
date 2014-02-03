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
}
