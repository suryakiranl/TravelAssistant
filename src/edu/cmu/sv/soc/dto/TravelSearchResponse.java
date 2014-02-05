package edu.cmu.sv.soc.dto;

import edu.cmu.sv.soc.dto.gson.travel.AgencyGson;
import edu.cmu.sv.soc.dto.gson.travel.AircraftGson;
import edu.cmu.sv.soc.dto.gson.travel.AirlineGson;
import edu.cmu.sv.soc.dto.gson.travel.AirportGson;
import edu.cmu.sv.soc.dto.gson.travel.RouteGson;

public class TravelSearchResponse {
	private AirportGson[] airports;
	private AirlineGson[] airlines;
	private AircraftGson[] aircrafts;
	private AgencyGson[] agencies;
	private RouteGson[] routes;
	
	public AirportGson[] getAirports() {
		return airports;
	}
	public void setAirports(AirportGson[] airports) {
		this.airports = airports;
	}
	public AirlineGson[] getAirlines() {
		return airlines;
	}
	public void setAirlines(AirlineGson[] airlines) {
		this.airlines = airlines;
	}
	public AircraftGson[] getAircrafts() {
		return aircrafts;
	}
	public void setAircrafts(AircraftGson[] aircrafts) {
		this.aircrafts = aircrafts;
	}
	public AgencyGson[] getAgencies() {
		return agencies;
	}
	public void setAgencies(AgencyGson[] agencies) {
		this.agencies = agencies;
	}
	public RouteGson[] getRoutes() {
		return routes;
	}
	public void setRoutes(RouteGson[] routes) {
		this.routes = routes;
	}
}