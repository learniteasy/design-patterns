package com.learniteasy.factorymethod.basic;

import com.learniteasy.factorymethod.Shape;

public class Rectangle implements Shape{

	public void draw() {
		System.out.println("Inside Rectangle -> draw()");
	}

	@Override
	public void draw(COLOR colors, char fillChar) {
		// TODO Auto-generated method stub
		
	}

}
