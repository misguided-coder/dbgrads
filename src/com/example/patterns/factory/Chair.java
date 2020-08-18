package com.example.patterns.factory;

public class Chair extends Furniture {

	@Override
	public void make() {
		System.out.println("Chair is ready!!");
	}
}
