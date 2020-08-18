package com.example.patterns.factory;

public class Desk extends Furniture {

	@Override
	public void make() {
		System.out.println("Desk is ready!!");
	}
}
