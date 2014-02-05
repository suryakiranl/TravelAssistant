package edu.cmu.sv.soc.dto.gson.constants;

public class DayFlags {
	public static final int SUNDAY = 0x01;
	public static final int MONDAY = 0x02;
	public static final int TUESDAY = 0x04;
	public static final int WEDNESDAY = 0x08;
	public static final int THURSDAY = 0x10;
	public static final int FRIDAY = 0x20;
	public static final int SATURDAY = 0x40;

	public static final int WEEKDAYS = 0x3E;
	public static final int WEEKENDS = 0x41;
	public static final int EVERYDAY = 0x7F;
}
