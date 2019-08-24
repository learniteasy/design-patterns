package com.learniteasy.abstractfactory;

import com.learniteasy.factorymethod.Shape;
import com.learniteasy.factorymethod.Shape.COLOR;
import com.learniteasy.factorymethod.Shape.SHAPES;

/**
 * @author afudeale
 *
 */
public class AbstractFactoryTest {

	public static void main(String[] args) {

		AbstractFactory textShapeFactory = FactoryProducer.getFactory(false);
		
		Shape shape1 = textShapeFactory.getShape(SHAPES.RECTANGLE);
		shape1.draw();
		
		Shape shape2 = textShapeFactory.getShape(SHAPES.SQUARE);
		shape2.draw();
		

		AbstractFactory coloredShapeFactory = FactoryProducer.getFactory(true);
		
		Shape shape3 = coloredShapeFactory.getShape(SHAPES.RECTANGLE);
		shape3.draw(COLOR.ANSI_CYAN,'*');
		

		Shape shape4 = coloredShapeFactory.getShape(SHAPES.SQUARE);
		shape4.draw(COLOR.ANSI_GREEN,'+');

	}
}
