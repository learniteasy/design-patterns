package com.learniteasy.factorymethod.basic;

import com.learniteasy.factorymethod.Shape;

public class Square implements Shape{

	public void draw() {
		System.out.println("Inside Square -> draw()");
	}

	@Override
	public void draw(COLOR colors, char fillChar) {
		// TODO Auto-generated method stub
		
	}

}
