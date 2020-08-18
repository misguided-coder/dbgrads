package com.example.solid.dip;

public class Main {

	public static void main(String[] args) {
		
		HotelService hotelService = new HotelService();
		//hotelService.setRoomService(new RoomService());
		//hotelService.setRoomService(new LuxuryRoomService());
		//hotelService.setRoomService(new EliteRoomService());
			
		hotelService.makeBooking("Gates", 20);
		
	}
}
