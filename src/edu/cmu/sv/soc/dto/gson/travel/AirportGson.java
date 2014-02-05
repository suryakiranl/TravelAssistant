package edu.cmu.sv.soc.dto.gson.travel;


public class AirportGson {
	private String code;
	private String name;
	private String pos; // was PositionGson
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}
}
