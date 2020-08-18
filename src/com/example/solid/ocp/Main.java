package com.example.solid.ocp;

//Developer B
public class Main {

	public static void main(String[] args) {

		MessageSender messageSender = new MessageSender();
		messageSender.send("98100000089", "$200 million credited in your account", new SMSMessanger());
		messageSender.send("raj@gmail.com", "$200 million credited in your account", new EmailMessanger());
		messageSender.send("@rajsingh", "$200 million credited in your account", new TwitterMessanger());
	}
}
