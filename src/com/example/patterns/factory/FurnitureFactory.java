package com.example.patterns.factory;

public class FurnitureFactory {

	public static Furniture createFurniture(char type) {
		if (type == 'D') {
			return new Desk();
		} else if (type == 'C') {
			return new Chair();
		} else if (type == 'A') {
			return new Almirah();
		} else if (type == 'B') {
			return new Bench();
		}
		return null;
	}

}
