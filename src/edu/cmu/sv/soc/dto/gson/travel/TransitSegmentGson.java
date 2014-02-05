package edu.cmu.sv.soc.dto.gson.travel;

public class TransitSegmentGson {
	private String kind; // "train", "bus", "ferry"
	private String subkind;// More specific for new transit types, eg. "train", "bus", "ferry", "carferry", "cablecar", "helicopter"
	private int isMajor; // was boolean
	private int isImperial; // was boolean
	private float distance;
	private float duration;
	private String sName;
	private String sPos; // was PositionGson
	private String tName;
	private String tPos; // was PositionGson
	private IndicativePriceGson indicativePrice;
	private TransitItineraryGson[] itineraries;
	private String path; // had to be Path object
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getSubkind() {
		return subkind;
	}
	public void setSubkind(String subkind) {
		this.subkind = subkind;
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
	public TransitItineraryGson[] getItineraries() {
		return itineraries;
	}
	public void setItineraries(TransitItineraryGson[] itineraries) {
		this.itineraries = itineraries;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
}
