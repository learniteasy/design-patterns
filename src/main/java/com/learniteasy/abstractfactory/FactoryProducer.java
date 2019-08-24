package com.learniteasy.abstractfactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(boolean needColored){   
	      if(needColored){
	         return new ColoredShapeFactory();         
	      }else{
	         return new ShapeFactory();
	      }
	   }
}
