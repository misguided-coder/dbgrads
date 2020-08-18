package com.example.solid.ocp;

public class TwitterMessanger implements Messanger {
	
	@Override
	public void sendMessage(String message) {
		//20 LOC
		System.out.println("INFO--> TWITTER SENDER ----"+message);
	}
}
