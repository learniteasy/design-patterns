package com.learniteasy.prototype;

public class Van extends Vehicle {

	public Van() {
		type = "Van";
	}

	@Override
	public void draw() {
		System.out.println("Inside Van::draw() method.");
	}

}
