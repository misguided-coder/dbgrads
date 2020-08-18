package com.example.patterns.abstractfactory;

public class PlatformFactory {

	public static PlatformManager createPlatformManager(char type) {
		if (type == 'W') {
			return new WindowsPlatformManager();
		}
		if (type == 'M') {
			return new MacPlatformManager();
		}
		return null;
	}
}
