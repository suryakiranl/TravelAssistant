package edu.cmu.sv.soc.dto.gson.travel;

public class FlightSegmentGson {
	private String kind; // flight
	private int isMajor; // was boolean
	private float distance;
	private float duration;
	private String sCode;
	private String tCode;
	private IndicativePriceGson indicativePrice;
	private FlightItineraryGson[] itineraries;
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getIsMajor() {
		return isMajor;
	}
	public void setIsMajor(int isMajor) {
		this.isMajor = isMajor;
	}
	public float getDistance() {
		return distance;
	}
	public void setDistance(float distance) {
		this.distance = distance;
	}
	public float getDuration() {
		return duration;
	}
	public void setDuration(float duration) {
		this.duration = duration;
	}
	public String getsCode() {
		return sCode;
	}
	public void setsCode(String sCode) {
		this.sCode = sCode;
	}
	public String gettCode() {
		return tCode;
	}
	public void settCode(String tCode) {
		this.tCode = tCode;
	}
	public IndicativePriceGson getIndicativePrice() {
		return indicativePrice;
	}
	public void setIndicativePrice(IndicativePriceGson indicativePrice) {
		this.indicativePrice = indicativePrice;
	}
	public FlightItineraryGson[] getItineraries() {
		return itineraries;
	}
	public void setItineraries(FlightItineraryGson[] itineraries) {
		this.itineraries = itineraries;
	}
}
