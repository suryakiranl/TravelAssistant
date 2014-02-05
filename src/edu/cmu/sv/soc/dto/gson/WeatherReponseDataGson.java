package edu.cmu.sv.soc.dto.gson;

public class WeatherReponseDataGson {
	private CurrentConditionGson[] current_condition;
	private WeatherRequestGson[] request;
	private WeatherGson[] weather;

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();

		sb.append(" WeatherReponseDataGson={");

		sb.append(" current_condition=[");
		for (CurrentConditionGson ccg : current_condition) {
			sb.append(ccg.toString()).append(", ");
		}
		sb.append(" ]");

		sb.append(", Request=[");
		for (WeatherRequestGson req : request) {
			sb.append(req.toString()).append(", ");
		}
		sb.append(" ]");

		sb.append(", WeatherGson=[");
		for (WeatherGson wg : weather) {
			sb.append(wg.toString()).append(", ");
		}
		sb.append(" ]");

		sb.append(" }");

		return sb.toString();
	}

	public CurrentConditionGson[] getCurrent_condition() {
		return current_condition;
	}

	public void setCurrent_condition(CurrentConditionGson[] current_condition) {
		this.current_condition = current_condition;
	}

	public WeatherRequestGson[] getRequest() {
		return request;
	}

	public void setRequest(WeatherRequestGson[] request) {
		this.request = request;
	}

	public WeatherGson[] getWeather() {
		return weather;
	}

	public void setWeather(WeatherGson[] weather) {
		this.weather = weather;
	}
}
