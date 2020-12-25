package com.jatha.designpatterns.builder;

public class PizzaBuilder {
	
	private String size;
	private String mainTopping;
	private boolean wantCheese;
	private int numberOfSlice;
	private boolean isTakeAway;
	
	public PizzaBuilder setSize(String size) {
		this.size = size;
		return this;
	}
	public PizzaBuilder setMainTopping(String mainTopping) {
		this.mainTopping = mainTopping;
		return this;
	}
	public PizzaBuilder setWantCheese(boolean wantCheese) {
		this.wantCheese = wantCheese;
		return this;
	}
	public PizzaBuilder setNumberOfSlice(int numberOfSlice) {
		this.numberOfSlice = numberOfSlice;
		return this;
	}
	public PizzaBuilder setTakeAway(boolean isTakeAway) {
		this.isTakeAway = isTakeAway;
		return this;
	}
	
	public Pizza getPizza() {
		return new Pizza(size, mainTopping, wantCheese, numberOfSlice, isTakeAway);
	}

}
