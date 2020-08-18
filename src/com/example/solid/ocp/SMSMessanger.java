package com.example.solid.ocp;

public class SMSMessanger implements Messanger {
	
	@Override
	public void sendMessage(String message) {
		//20 LOC
		System.out.println("INFO--> SMS SENDER ----"+message);
	}
}
