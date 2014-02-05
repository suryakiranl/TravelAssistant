package edu.cmu.sv.soc.dto.gson.travel;

public class TransitLegGson {
	private String url;
	private TransitHopGson[] hops;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public TransitHopGson[] getHops() {
		return hops;
	}
	public void setHops(TransitHopGson[] hops) {
		this.hops = hops;
	}
}
