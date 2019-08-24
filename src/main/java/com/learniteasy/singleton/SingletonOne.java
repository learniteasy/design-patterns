package com.learniteasy.singleton;

public class SingletonOne {

	// create an object of Singleton
	private static SingletonOne _instance = new SingletonOne();

	// make the constructor private so that this class cannot be instantiated
	private SingletonOne() {
	}

	// Get the only object available
	public static SingletonOne getInstance() {
		return _instance;
	}

	public void showMessage() {
		System.out.println("SingletonDemoOne.showMessage() called ... ");
	}
}
