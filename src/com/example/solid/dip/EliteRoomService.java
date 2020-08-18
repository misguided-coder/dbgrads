package com.example.solid.dip;

public class EliteRoomService extends RoomService {
	
	public void bookRoom(String name, int howMany) {
		System.out.printf("%s elite rooms have been booked for Mr. %s.%n",howMany,name);	
	}

}
