package edu.cmu.sv.soc.dto.gson.travel;

public class FlightItineraryGson {
	private FlightLegGson[] legs;

	public FlightLegGson[] getLegs() {
		return legs;
	}

	public void setLegs(FlightLegGson[] legs) {
		this.legs = legs;
	}
}
