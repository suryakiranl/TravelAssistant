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
			CurrentConditionGson cc = weather.getData().getCurrent_condition()[0];
			sb.append(cc.getTemp_F() + "F");
			sb.append(" / " + cc.getTemp_C() + "C");	
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
		
		
		log.trace("Exiting doPost method.");		
	}

}
