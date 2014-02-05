package edu.cmu.sv.soc.dto.gson.travel;

public class FlightHopGson {
	private String sCode;
	private String tCode;
	private String sTerminal;
	private String tTerminal;
	private String sTime;
	private String tTime;
	private String airline;
	private String flight;
	private float duration;
	private String aircraft;
	private int dayChange;
	private float lDuration;
	private int lDayChange;
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
	public String getsTerminal() {
		return sTerminal;
	}
	public void setsTerminal(String sTerminal) {
		this.sTerminal = sTerminal;
	}
	public String gettTerminal() {
		return tTerminal;
	}
	public void settTerminal(String tTerminal) {
		this.tTerminal = tTerminal;
	}
	public String getsTime() {
		return sTime;
	}
	public void setsTime(String sTime) {
		this.sTime = sTime;
	}
	public String gettTime() {
		return tTime;
	}
	public void settTime(String tTime) {
		this.tTime = tTime;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getFlight() {
		return flight;
	}
	public void setFlight(String flight) {
		this.flight = flight;
	}
	public float getDuration() {
		return duration;
	}
	public void setDuration(float duration) {
		this.duration = duration;
	}
	public String getAircraft() {
		return aircraft;
	}
	public void setAircraft(String aircraft) {
		this.aircraft = aircraft;
	}
	public int getDayChange() {
		return dayChange;
	}
	public void setDayChange(int dayChange) {
		this.dayChange = dayChange;
	}
	public float getlDuration() {
		return lDuration;
	}
	public void setlDuration(float lDuration) {
		this.lDuration = lDuration;
	}
	public int getlDayChange() {
		return lDayChange;
	}
	public void setlDayChange(int lDayChange) {
		this.lDayChange = lDayChange;
	}
}
