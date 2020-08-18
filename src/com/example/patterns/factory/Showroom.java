package com.example.patterns.factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Showroom {

	public static void main(String[] args) {
		UC1();
		UC2();
		
		List list = Collections.emptyList();
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("Hello ");
		buffer.append("Hi ");
		buffer.append("Bye ");
		
		String string = buffer.toString();
		
		List list1 = new ArrayList<>();
		List list2 = Arrays.asList(12,45,67,90);
	}

	// with factory
	public static void UC2() {

		// Caller A
		Furniture desk1 = FurnitureFactory.createFurniture('D');
		desk1.make();

		// Caller B
		Furniture desk2 = FurnitureFactory.createFurniture('D');
		desk2.make();

		// Caller C
		Furniture chair = FurnitureFactory.createFurniture('C');
		chair.make();

		// Caller C
		Furniture almirah = FurnitureFactory.createFurniture('A');
		almirah.make();
	}

	// without factory
	public static void UC1() {

		// Caller A
		Furniture desk1 = new Desk();
		desk1.make();

		// Caller B
		Furniture desk2 = new Desk();
		desk2.make();

		// Caller C
		Furniture chair = new Chair();
		chair.make();

	}

}
