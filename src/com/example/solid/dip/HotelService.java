package com.example.solid.dip;

public class HotelService {

	// BAD --- Violation of DIP
	// RoomService roomService = new RoomService();

	// GOOD --- Following DIP
	RoomService roomService;

	public void setRoomService(RoomService roomService) {
		this.roomService = roomService;
	}

	public void makeBooking(String name, int howMany) {
		// 20 LOC
		// Check customer id
		// Check customer credit history
		System.out.println("Hotel preparing for booking rooms!!");
		this.roomService.bookRoom(name, howMany);
	}

}
