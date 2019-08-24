package com.learniteasy.builder;

public class ChickenPizza extends Pizza{

	@Override
	   public float price() {
	      return 50.5f;
	   }

	   @Override
	   public String name() {
	      return "Chicken Pizza";
	   }
}
