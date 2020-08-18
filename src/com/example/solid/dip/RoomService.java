package com.example.solid.dip;

public class RoomService {
	
	public void bookRoom(String name, int howMany) {
		System.out.printf("%s rooms have been booked for Mr. %s.%n",howMany,name);	
	}

}
