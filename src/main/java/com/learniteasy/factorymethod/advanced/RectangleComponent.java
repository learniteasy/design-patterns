package com.learniteasy.factorymethod.advanced;

import com.learniteasy.factorymethod.Shape;
import com.learniteasy.utils.CommonUtils;

public class RectangleComponent implements Shape {

	public void draw(COLOR colors, char fillChar) {
		System.out.println(colors.getColor());
		CommonUtils.printLine(20, fillChar);
		System.out.println();
		CommonUtils.printSidesOfRectangle(20, 5, fillChar, ' ');
		System.out.println();
		CommonUtils.printLine(20, fillChar);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

}
