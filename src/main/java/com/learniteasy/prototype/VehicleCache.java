package com.learniteasy.prototype;

import java.util.HashMap;
import java.util.Map;

public class VehicleCache {

	private static Map<String, Vehicle> shapeMap = new HashMap<>();

	public static Vehicle getVehicle(String vehicleId) {
		Vehicle cachedShape = shapeMap.get(vehicleId);
		return (Vehicle) cachedShape.clone();
	}

	public static void loadCache() {
		Car circle = new Car();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);

		Van square = new Van();
		square.setId("2");
		shapeMap.put(square.getId(), square);

	}
}
