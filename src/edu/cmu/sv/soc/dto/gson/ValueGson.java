package edu.cmu.sv.soc.dto.gson;

public class ValueGson {
	private String value;
	
	public String toString() {
		return "{ value =" + value + " }";
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
