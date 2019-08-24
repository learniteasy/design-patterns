package com.learniteasy.prototype;

public class Car extends Vehicle {

	public Car() {
		type = "Car";
	}

	@Override
	public void draw() {
		System.out.println("Inside Car::draw() method.");
	}

}
