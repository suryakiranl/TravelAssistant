package edu.cmu.sv.soc.dto.gson.travel;

public class TransitItineraryGson {
	private TransitLegGson[] legs;

	public TransitLegGson[] getLegs() {
		return legs;
	}

	public void setLegs(TransitLegGson[] legs) {
		this.legs = legs;
	}
}
