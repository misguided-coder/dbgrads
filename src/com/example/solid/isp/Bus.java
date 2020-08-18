package com.example.solid.isp;

public class Bus implements Automobile, Repairable, Brakable {

	@Override
	public void start() {
		System.out.println("Bus engine started!!");
	}

	@Override
	public void stop() {
		System.out.println("Bus engine stopped!!");
	}

	@Override
	public void repair() {
		System.out.println("Bus is being repaired!!");
	}

	@Override
	public void applyBrake() {
		System.out.println("Bus is slowing down!!");
	}

}
