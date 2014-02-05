package edu.cmu.sv.soc.dto.gson.travel;

public class FlightLegGson {
	private int days;
	private FlightHopGson[] hops;
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public FlightHopGson[] getHops() {
		return hops;
	}
	public void setHops(FlightHopGson[] hops) {
		this.hops = hops;
	}
}
