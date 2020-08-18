package com.example.patterns.abstractfactory;

public class MacPlatformManager extends PlatformManager {

	@Override
	public CheckBox createCheckBox() {
		return new MacCheckBox();
	}

	@Override
	public TextField createTextField() {
		return new MacTextField();
	}
}
