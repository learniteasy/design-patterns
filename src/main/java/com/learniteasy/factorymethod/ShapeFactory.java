package com.learniteasy.factorymethod;

public class ShapeFactory {

	public enum SHAPES {
		CIRCLE, SQUARE, RECTANGLE;
	}

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
