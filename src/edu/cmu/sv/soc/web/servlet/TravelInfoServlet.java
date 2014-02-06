package edu.cmu.sv.soc.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import edu.cmu.sv.soc.dto.TravelSearchRequest;
import edu.cmu.sv.soc.dto.TravelSearchResponse;
import edu.cmu.sv.soc.dto.gson.travel.RouteGson;
import edu.cmu.sv.soc.dto.gson.travel.SegmentGson;
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

		sb.append("<strong>Travel Itinerary Options</strong>");
		sb.append(prepareRoutes(travel.getRoutes()));

		return sb.toString();
	}

	private String prepareRoutes(RouteGson[] routes) {
		StringBuffer sb = new StringBuffer();

		if (routes != null) {
			for (RouteGson route : routes) {
				sb.append("<hr/>");
				sb.append("<div class='container'>");
				sb.append("<div class='row'><div class='col-md-2'>");
				sb.append("<strong>Route Name: </strong>")
						.append("</div><div class='col-md-6'>")
						.append(route.getName());
				sb.append("</div></div><div class='row'><div class='col-md-2'>");
				sb.append("<strong>Distance:</strong>")
						.append("</div><div class='col-md-6'>")
						.append(route.getDistance()).append(" miles");
				sb.append("</div></div><div class='row'><div class='col-md-2'>");
				sb.append("<strong>Duration:</strong>")
						.append("</div><div class='col-md-6'>")
						.append(route.getDuration()).append(" minutes");
				sb.append("</div></div><div class='row'><div class='col-md-2'>");

				// Add indicative pricing if it is available.
				if (route.getIndicativePrice() != null) {
					sb.append("<strong>Indicative Price:</strong>")
							.append("</div><div class='col-md-6'>")
							.append(route.getIndicativePrice().getPrice())
							.append(" ")
							.append(route.getIndicativePrice().getCurrency());
					sb.append("</div></div><div class='row'><div class='col-md-2'>");
				}
				sb.append("<strong>Segments in this route:</strong>")
						.append("</div><div class='col-md-6'>")
						.append(prepareSegments(route.getSegments()));
				sb.append("</div></div></div>");
			}
		}

		return sb.toString();
	}

	private String prepareSegments(SegmentGson[] segments) {
		StringBuffer sb = new StringBuffer();

		if (segments != null) {
			for (SegmentGson segment : segments) {
				sb.append("<strong> ===== Segment ===== </strong>").append(
						"<br/>");
				sb.append("Mode of Transportation: ").append(segment.getKind())
						.append("<br/>");
				String sourceName, destName;
				if ("flight".equalsIgnoreCase(segment.getKind())) {
					sourceName = segment.getsCode();
					destName = segment.gettCode();
				} else {
					sourceName = segment.getsName();
					destName = segment.gettName();
				}

				sb.append("From: ").append(sourceName).append("<br/>");
				sb.append("To: ").append(destName).append("<br/>");
				sb.append("Distance: ").append(segment.getDistance());
				if (segment.getIsImperial() == 1) {
					sb.append(" kms").append("<br/>");
				} else {
					sb.append(" miles").append("<br/>");
				}
				sb.append("Duration: ")
						.append(new Float(segment.getDuration()).intValue())
						.append(" mins").append("<br/>");
			}
		} else {
			sb.append("No segments listed.");
		}

		return sb.toString();
	}
}
