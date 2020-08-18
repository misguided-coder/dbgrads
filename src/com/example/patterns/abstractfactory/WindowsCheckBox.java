package com.example.patterns.abstractfactory;

public class WindowsCheckBox extends CheckBox {

	@Override
	public void draw() {
		super.draw();
		System.out.println("WindowsCheckBox is drawn!!");
	}
}
