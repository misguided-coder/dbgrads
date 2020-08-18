package com.example.solid.srp;

public class Main {

	public static void main(String[] args) {
		
		AccountService accountService = new AccountService();
		accountService.open("Billu", 12000.00);
		accountService.withdraw(1000.00);
		accountService.deposit(2000.00);
		accountService.close("Billu");
		
		EmailService emailService = new EmailService();
		emailService.sendMail("billu@gmail.com");
		emailService.configureMail(null);
		emailService.downloadMail("gmail.com");
		
		SMSService smsService = new SMSService();
		smsService.sendSMS("981010101010");
		smsService.configure("90000000000");
		
		
	}
}
