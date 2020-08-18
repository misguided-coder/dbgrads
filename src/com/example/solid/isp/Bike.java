package com.example.solid.isp;

public class Bike  implements Automobile,Acceleratable,Brakable {

	@Override
	public void start() {
		System.out.println("Bike engine started!!");
	}

	@Override
	public void stop() {
		System.out.println("Bike engine stopped!!");
	}

	@Override
	public void speedUp() {
		System.out.println("Bike is speeding up!!");
	}

	@Override
	public void applyBrake() {
		System.out.println("Bike is slowing down!!");
	}
	
}
