package com.learniteasy.abstractfactory;

import com.learniteasy.factorymethod.Shape;
import com.learniteasy.factorymethod.Shape.SHAPES;
import com.learniteasy.factorymethod.advanced.RectangleComponent;
import com.learniteasy.factorymethod.advanced.SquareComponent;

public class ColoredShapeFactory extends AbstractFactory {

	/**
	 * @param shapeType
	 * @return
	 */
	public Shape getShape(SHAPES shapeType) {
		if (SHAPES.RECTANGLE.equals(shapeType) ) {
			return new RectangleComponent();

		} else if (SHAPES.SQUARE.equals(shapeType) ) {
			return new SquareComponent();
		}else {
			return null;
		}
	}
}
