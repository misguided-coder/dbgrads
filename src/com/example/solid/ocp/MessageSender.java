package com.example.solid.ocp;

//Developer A
public class MessageSender {

	public void send(String id, String message, Messanger messanger) {
		//100 LOC
		messanger.sendMessage(message + " has been sent to " + id+"!!\n");
	}
}
