package com.learniteasy.prototype;

public class PrototypeTester {

	public static void main(String[] args) {
		VehicleCache.loadCache();

		Vehicle clonedShape = (Vehicle) VehicleCache.getVehicle("1");
		System.out.println("Shape : " + clonedShape.getType());

		Vehicle clonedShape2 = (Vehicle) VehicleCache.getVehicle("2");
		System.out.println("Shape : " + clonedShape2.getType());
	}

}
