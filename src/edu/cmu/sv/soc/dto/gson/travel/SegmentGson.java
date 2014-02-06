package edu.cmu.sv.soc.dto.gson.travel;

public class SegmentGson {
	private String kind; // Values can be "walk" , "car"
	private int isMajor; // was boolean
	private int isImperial; // was boolean
	private float distance;
	private float duration;
	private String sName;
	private String sPos; // was PositionGson
	private String tName;
	private String tPos; // was PositionGson
	private String sCode; // Will be available only for flight
	private String tCode; // Will be available only for flight
	private IndicativePriceGson indicativePrice;
	private String path; // had to be Path object
	private FlightItineraryGson[] itineraries; // Will be available only for flight
	
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
	public FlightItineraryGson[] getItineraries() {
		return itineraries;
	}
	public void setItineraries(FlightItineraryGson[] itineraries) {
		this.itineraries = itineraries;
	}
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
	public int getIsImperial() {
		return isImperial;
	}
	public void setIsImperial(int isImperial) {
		this.isImperial = isImperial;
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
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsPos() {
		return sPos;
	}
	public void setsPos(String sPos) {
		this.sPos = sPos;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public String gettPos() {
		return tPos;
	}
	public void settPos(String tPos) {
		this.tPos = tPos;
	}
	public IndicativePriceGson getIndicativePrice() {
		return indicativePrice;
	}
	public void setIndicativePrice(IndicativePriceGson indicativePrice) {
		this.indicativePrice = indicativePrice;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
}
