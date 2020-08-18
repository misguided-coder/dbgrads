package com.example.patterns.abstractfactory;

public class MacTextField extends TextField {
	
	@Override
	public void draw() {
		super.draw();
		System.out.println("MacTextField is drawn!!");
	}
}
