package com.learniteasy.builder;

public class VegPizza extends Pizza {

	@Override
	public float price() {
		return 25.0f;
	}

	@Override
	public String name() {
		return "Veg Pizza";
	}
}
