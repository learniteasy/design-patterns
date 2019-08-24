package com.learniteasy.builder;

public class BuilderTester {

	public static void main(String[] args) {
		   
	      MealBuilder mealBuilder = new MealBuilder();

	      Meal vegMeal = mealBuilder.prepareVeg();
	      System.out.println("Veg Meal");
	      vegMeal.showItems();
	      System.out.println("Total Cost: " + vegMeal.getCost());

	      Meal nonVegMeal = mealBuilder.prepareNonVeg();
	      System.out.println("\n\nNon-Veg Meal");
	      nonVegMeal.showItems();
	      System.out.println("Total Cost: " + nonVegMeal.getCost());
	   }
}
