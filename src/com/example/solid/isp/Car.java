package com.example.solid.isp;

public class Car implements Automobile, Acceleratable, Washable {

	@Override
	public void start() {
		System.out.println("Car engine started!!");
	}

	@Override
	public void stop() {
		System.out.println("Car engine stopped!!");
	}

	@Override
	public void speedUp() {
		System.out.println("Car is speeding up!!");
	}

	@Override
	public void wash() {
		System.out.println("Car is being washed!!");
	}
}
