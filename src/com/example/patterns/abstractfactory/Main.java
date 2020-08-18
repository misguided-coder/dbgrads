package com.example.patterns.abstractfactory;

public class Main {

	public static void main(String[] args) {

		PlatformManager platformManager = PlatformFactory.createPlatformManager('M');
		TextField textField = platformManager.createTextField();
		CheckBox checkBox = platformManager.createCheckBox();
		textField.draw();
		checkBox.draw();
	}

}
