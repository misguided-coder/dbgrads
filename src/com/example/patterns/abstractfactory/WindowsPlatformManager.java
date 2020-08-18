package com.example.patterns.abstractfactory;

public class WindowsPlatformManager extends PlatformManager {

	@Override
	public CheckBox createCheckBox() {
		return new WindowsCheckBox();
	}

	@Override
	public TextField createTextField() {
		return new WindowsTextField();
	}
}
