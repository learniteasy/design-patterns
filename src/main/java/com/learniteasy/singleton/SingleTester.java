package com.learniteasy.singleton;

public class SingleTester {

	public static void main(String[] args) {

		// Get the only object available
		SingletonOne object = SingletonOne.getInstance();

		// show the message
		object.showMessage();
	}
}
