package com.learniteasy.factorymethod.basic;

import com.learniteasy.factorymethod.Shape;
import com.learniteasy.factorymethod.Shape.SHAPES;

/**
 * @author afudeale
 *
 */
public class FactoryMethodTest {

	public static void main(String[] args) {
		
		ShapeFactory shapeFactory = new ShapeFactory();

		// get an object of Circle and call its draw method.
		Shape shape1 = shapeFactory.getShape(SHAPES.CIRCLE);
		shape1.draw();

		// get an object of Rectangle and call its draw method.
		Shape shape2 = shapeFactory.getShape(SHAPES.RECTANGLE);
		shape2.draw();

		// get an object of Square and call its draw method.
		Shape shape3 = shapeFactory.getShape(SHAPES.SQUARE);
		shape3.draw();
	}
}
