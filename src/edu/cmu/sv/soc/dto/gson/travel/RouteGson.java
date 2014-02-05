package edu.cmu.sv.soc.dto.gson.travel;

public class RouteGson {
	private String name;
	private float distance;
	private float duration;
	private StopGson[] stops;
	private SegmentGson[] segments;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public StopGson[] getStops() {
		return stops;
	}
	public void setStops(StopGson[] stops) {
		this.stops = stops;
	}
	public SegmentGson[] getSegments() {
		return segments;
	}
	public void setSegments(SegmentGson[] segments) {
		this.segments = segments;
	}
}
