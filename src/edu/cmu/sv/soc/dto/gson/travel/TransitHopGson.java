package edu.cmu.sv.soc.dto.gson.travel;

public class TransitHopGson {
	private String sName;
	private String sPos; // PositionGson
	private String tName;
	private String tPos; // PositionGson
	private float frequency;
	private float duration;
	private IndicativePriceGson indicativePrice;
	private TransitLineGson[] lines;
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
	public float getFrequency() {
		return frequency;
	}
	public void setFrequency(float frequency) {
		this.frequency = frequency;
	}
	public float getDuration() {
		return duration;
	}
	public void setDuration(float duration) {
		this.duration = duration;
	}
	public IndicativePriceGson getIndicativePrice() {
		return indicativePrice;
	}
	public void setIndicativePrice(IndicativePriceGson indicativePrice) {
		this.indicativePrice = indicativePrice;
	}
	public TransitLineGson[] getLines() {
		return lines;
	}
	public void setLines(TransitLineGson[] lines) {
		this.lines = lines;
	}
}
