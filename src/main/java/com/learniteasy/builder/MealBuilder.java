package com.learniteasy.builder;

public class MealBuilder {

	public Meal prepareVeg() {
		Meal meal = new Meal();
		meal.addItem(new VegPizza());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepareNonVeg() {
		Meal meal = new Meal();
		meal.addItem(new ChickenPizza());
		meal.addItem(new Pepsi());
		return meal;
	}
}
