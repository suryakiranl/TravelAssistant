package edu.cmu.sv.soc.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import edu.cmu.sv.soc.dto.WeatherAPIResponse;
import edu.cmu.sv.soc.dto.gson.CurrentConditionGson;
import edu.cmu.sv.soc.dto.gson.MsgGson;
import edu.cmu.sv.soc.dto.gson.WeatherRequestGson;
import edu.cmu.sv.soc.service.IWeather;
import edu.cmu.sv.soc.service.WorldWeatherOnlineImpl;

public class WeatherInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getLogger(WeatherInfoServlet.class);
	
    public WeatherInfoServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		log.trace("Inside doGet method.");
		
		String cityNameorZip = request.getParameter("cityNameOrZip");
		String numberOfDays = request.getParameter("days");
		
		log.debug("City name or Zip = " + cityNameorZip);
		log.debug("Days = " + numberOfDays);
		
		WeatherAPIResponse weather = null;
		IWeather ws = new WorldWeatherOnlineImpl();
		
		if(numberOfDays == null || "".equals(numberOfDays.trim())) {
			weather = ws.getWeatherInfo(cityNameorZip);
		} else {
			int days = Integer.parseInt(numberOfDays);
			weather = ws.getWeatherInfo(cityNameorZip, days);
		}
		
		if(weather == null) {
			throw new RuntimeException("Error when retrieving weather information.");
		}
		
		StringBuffer sb = new StringBuffer();
		if( weather.getData().getCurrent_condition() != null ) {
			sb.append(prepareCurrentCondition(weather));	
		} else {
			MsgGson[] messg = weather.getData().getError();
			if(messg == null) {
				sb.append("<b>No information/message obtained from weather server.</b>");
			} else {
				sb.append("<b>" + messg[0].getMsg() + "</b>");
			}
		}
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain");
		response.getWriter().write(sb.toString());
		response.flushBuffer();
		
		log.trace("Exiting doGet method.");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		log.trace("Inside doPost method.");
		response.getWriter().write("POST method is not implemented for this Servlet. Please use GET.");
		log.trace("Exiting doPost method.");		
	}
	
	private String prepareCurrentCondition(WeatherAPIResponse weather) {
		StringBuffer sb = new StringBuffer();
		
		WeatherRequestGson req = weather.getData().getRequest()[0];
		CurrentConditionGson cc = weather.getData().getCurrent_condition()[0];

		sb.append("Displaying weather information for " + req.getType() + " : <strong>" + req.getQuery() + "</strong>");
		sb.append("<hr/>");
		sb.append("<strong>Weather Information:</strong>");

		sb.append("<div class='container'>");
		sb.append("<div class='row'><div class='col-md-2'>");
		sb.append("Reading recorded at: </div><div class='col-md-2'>" + cc.getObservation_time() + " (Local Time)");
		sb.append("</div></div><div class='row'><div class='col-md-2'>");
		sb.append("Temperature: </div><div class='col-md-2'>" + cc.getTemp_F() + "F / " + cc.getTemp_C() + "C");
		sb.append("</div></div><div class='row'><div class='col-md-2'>");
		sb.append("Cloud Cover: </div><div class='col-md-2'>" + cc.getCloudcover() + "%");
		sb.append("</div></div><div class='row'><div class='col-md-2'>");
		sb.append("Humidity: </div><div class='col-md-2'>" + cc.getHumidity() + "%");
		sb.append("</div></div><div class='row'><div class='col-md-2'>");
		sb.append("Weather Description: </div><div class='col-md-2'>" + cc.getWeatherDesc()[0].getValue() );
		sb.append("</div></div><div class='row'><div class='col-md-2'>");
		sb.append("Wind Speed: </div><div class='col-md-2'>" + cc.getWindspeedMiles() + "mph");
		sb.append("</div></div><div class='row'><div class='col-md-2'>");
		sb.append("Wind direction: </div><div class='col-md-2'>" + cc.getWinddir16Point());
		sb.append("</div></div><div class='row'><div class='col-md-2'>");
		sb.append("Weather Icon: </div><div class='col-md-2'><img src='" + cc.getWeatherIconUrl()[0].getValue() + "' class='img-responsive' alt='Responsive image'/>");
		sb.append("</div></div></div>");
		return sb.toString();
	}

}
