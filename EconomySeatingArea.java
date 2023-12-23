package com.kabaso.task5;

public class EconomySeatingArea implements SeatingArea {
	int seatNumber;
	String name;
	Boolean isReserved;
		public EconomySeatingArea(int seatNumber, String name, Boolean isReserved) {
		super();
		this.seatNumber = seatNumber;
		this.name = name;
		this.isReserved = isReserved;
	}

	@Override
	public int getAvailableSeats() {
		// TODO Auto-generated method stub
		return seatNumber;
	}

	@Override
	public void reserveSeat(int seatNumber) {
		System.out.println("We have reserve the seat number of ->  " + seatNumber);

	}

	@Override
	public void cancelReservation(int seatNumber) {
		System.out.println("Your seat has been concelled which was ->  " + seatNumber);
	}

}
