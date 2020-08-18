package com.example.solid.ocp;

public class EmailMessanger implements Messanger {
	
	@Override
	public void sendMessage(String message) {
		//50 LOC
		System.out.println("INFO--> EMAIL SENDER ----"+message);
	}
}
