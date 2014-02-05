package edu.cmu.sv.soc.dto;

import java.io.UnsupportedEncodingException;

import edu.cmu.sv.soc.util.StaticUtils;

public class TravelSearchRequest {
	private String key = "crZxBpEr";
	private String oName;
	private String dName;
	private String currency = "USD";

	public TravelSearchRequest(String oName, String dName) {
		super();
		this.oName = oName;
		this.dName = dName;
	}

	public String getoName() {
		return oName;
	}

	public void setoName(String oName) {
		this.oName = oName;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "key=" + key + "&oName=" + oName
				+ "&dName=" + dName + "&currency=" + currency;
	}
	
	public String getForURL() throws UnsupportedEncodingException {
		return "key=" + key + "&oName=" + StaticUtils.encodeParameter(oName)
				+ "&dName=" + StaticUtils.encodeParameter(dName) + "&currency=" + currency;
	}
}
