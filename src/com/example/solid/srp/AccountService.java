package com.example.solid.srp;

public class AccountService {

	public void open(String name, double initialAmount) {
		System.out.printf("Account opened for Mr. %s and current balance is %s!!%n", name, initialAmount);
	}

	public void close(String name) {
		System.out.printf("Account closed for Mr. %s!!%n", name);
	}

	public void deposit(double amount) {
		System.out.printf("%s amount deposited in account!!%n", amount);
	}

	public void withdraw(double amount) {
		System.out.printf("%s amount debited from account!!%n", amount);
	}
}
