package com.jatha.designpatterns.builder;

public class Pizza {
	
	private String size;
	private String mainTopping;
	private boolean wantCheese;
	private int numberOfSlice;
	private boolean isTakeAway;
	
	public Pizza(String size, String mainTopping, boolean wantCheese, int numberOfSlice, boolean isTakeAway) {
		super();
		this.size = size;
		this.mainTopping = mainTopping;
		this.wantCheese = wantCheese;
		this.numberOfSlice = numberOfSlice;
		this.isTakeAway = isTakeAway;
	}
	@Override
	public String toString() {
		return "Pizza [size=" + size + ", mainTopping=" + mainTopping + ", wantCheese=" + wantCheese
				+ ", numberOfSlice=" + numberOfSlice + ", isTakeAway=" + isTakeAway + "]";
	}
	
	

}
