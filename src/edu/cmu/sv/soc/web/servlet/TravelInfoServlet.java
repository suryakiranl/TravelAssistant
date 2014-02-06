package edu.cmu.sv.soc.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import edu.cmu.sv.soc.dto.TravelSearchRequest;
import edu.cmu.sv.soc.dto.TravelSearchResponse;
import edu.cmu.sv.soc.dto.gson.travel.AirlineGson;
import edu.cmu.sv.soc.dto.gson.travel.RouteGson;
import edu.cmu.sv.soc.dto.gson.travel.StopGson;
import edu.cmu.sv.soc.service.ITravel;
import edu.cmu.sv.soc.service.Rome2RioTravelImpl;

/**
 * Servlet implementation class TravelInfoServlet
 */
public class TravelInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger
			.getLogger(WeatherInfoServlet.class);

	public TravelInfoServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		log.debug("Inside doGet method");

		String startLocation = request.getParameter("startLocation");
		String destination = request.getParameter("destination");

		TravelSearchResponse travel = null;
		ITravel ts = new Rome2RioTravelImpl();
		if (startLocation != null && destination != null) {
			TravelSearchRequest pathRequest = new TravelSearchRequest(
					startLocation, destination);
			travel = ts.findTravelPaths(pathRequest);
		}

		if (travel == null) {
			throw new RuntimeException(
					"Error when retrieving travel information.");
		}

		StringBuffer sb = new StringBuffer();
		if (travel.getRoutes() != null) {
			sb.append(prepareCurrentStatus(travel));
		}

		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain");
		response.getWriter().write(sb.toString());
		response.flushBuffer();

		log.debug("Exiting doGet method");
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		log.debug("Inside doPost method");
		doGet(request, response);
		log.debug("Exiting doPost method");
	}

	private String prepareCurrentStatus(TravelSearchResponse travel) {
		StringBuffer sb = new StringBuffer();

		RouteGson[] routes = travel.getRoutes();
		StopGson[] stops = routes[0].getStops();
		AirlineGson[] airline = travel.getAirlines();

		sb.append("<strong>" + routes[0].getName() + "</strong>");
		sb.append("<hr/>");
		sb.append("<div class='container'>");
		sb.append("<div class='row'><div class='col-md-2'>");
		sb.append("Distance: </div><div class='col-md-2'>"
				+ routes[0].getDistance() + " miles");
		sb.append("</div></div><div class='row'><div class='col-md-2'>");
		sb.append("Duration: </div><div class='col-md-2'>"
				+ routes[0].getDuration() + " minutes");
		sb.append("</div></div><div class='row'><div class='col-md-2'>");
		sb.append("Stops: </div><div class='col-md-2'>" + stops[0].getName());
		sb.append("</div></div><div class='row'><div class='col-md-2'>");
		sb.append("</div></div><div class='row'><div class='col-md-2'>");
		sb.append("Airline: </div><div class='col-md-2'>"
				+ airline[0].getName());
		sb.append("</div></div><div class='row'><div class='col-md-2'>");
		sb.append("</div></div></div>");

		return sb.toString();
	}

}
