package com.learniteasy.abstractfactory;

import com.learniteasy.factorymethod.Shape;
import com.learniteasy.factorymethod.Shape.SHAPES;

public abstract class AbstractFactory {
	abstract Shape getShape(SHAPES shapeType) ;
}
