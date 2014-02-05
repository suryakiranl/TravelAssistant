package edu.cmu.sv.soc.dto.gson.travel;

public class IndicativePriceGson {
	private float price;
	private String currency;
	private float nativePrice;
	private String nativeCurrency;
	private int isFreeTransfer; // was boolean
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public float getNativePrice() {
		return nativePrice;
	}
	public void setNativePrice(float nativePrice) {
		this.nativePrice = nativePrice;
	}
	public String getNativeCurrency() {
		return nativeCurrency;
	}
	public void setNativeCurrency(String nativeCurrency) {
		this.nativeCurrency = nativeCurrency;
	}
	public int getIsFreeTransfer() {
		return isFreeTransfer;
	}
	public void setIsFreeTransfer(int isFreeTransfer) {
		this.isFreeTransfer = isFreeTransfer;
	}
}
