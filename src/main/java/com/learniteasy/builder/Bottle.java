package com.learniteasy.builder;

public class Bottle implements DeliveryType {

	@Override
	public String pack() {
		return "Bottle";
	}
}
