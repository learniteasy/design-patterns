package com.learniteasy.abstractfactory;

import com.learniteasy.factorymethod.Shape;
import com.learniteasy.factorymethod.Shape.SHAPES;
import com.learniteasy.factorymethod.basic.Circle;
import com.learniteasy.factorymethod.basic.Rectangle;
import com.learniteasy.factorymethod.basic.Square;

public class ShapeFactory extends AbstractFactory {

	/**
	 * @param shapeType
	 * @return
	 */
	public Shape getShape(SHAPES shapeType) {
		if (SHAPES.CIRCLE.equals(shapeType) ) {
			return new Circle();
		} else if (SHAPES.RECTANGLE.equals(shapeType) ) {
			return new Rectangle();

		} else if (SHAPES.SQUARE.equals(shapeType) ) {
			return new Square();
		}else {
			return null;
		}
	}
}