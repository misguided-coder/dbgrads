package com.example.solid.dip;

public class LuxuryRoomService extends RoomService {
	
	public void bookRoom(String name, int howMany) {
		System.out.printf("%s luxury rooms have been booked for Mr. %s.%n",howMany,name);	
	}

}
