package com.example.patterns.abstractfactory;

public class WindowsTextField extends TextField {
	
	@Override
	public void draw() {
		super.draw();
		System.out.println("WindowsTextField is drawn!!");
	}
}
