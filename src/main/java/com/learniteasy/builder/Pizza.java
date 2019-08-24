package com.learniteasy.builder;

public abstract class Pizza implements Item {

	@Override
	public DeliveryType packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();
}
