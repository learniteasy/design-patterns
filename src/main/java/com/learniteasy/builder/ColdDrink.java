package com.learniteasy.builder;

public abstract class ColdDrink implements Item {

	@Override
	public DeliveryType packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();
}