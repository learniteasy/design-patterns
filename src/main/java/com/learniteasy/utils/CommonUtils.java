package com.learniteasy.utils;

import java.util.stream.IntStream;

public class CommonUtils {

	public static void printLine(int length, char printChar) {
		IntStream.range(0, length).forEach(e -> System.out.print(printChar));
	}

	public static void printSidesOfRectangle(int length, int height, char printChar, char fill) {
		StringBuilder singleWidth = new StringBuilder();
		singleWidth.append(printChar);
		IntStream.range(0, length - 2).forEach(e -> singleWidth.append(fill));
		singleWidth.append(printChar);

		IntStream.range(0, height - 1).forEach(e -> System.out.println(singleWidth.toString()));
		System.out.print(singleWidth.toString());
	}
}
