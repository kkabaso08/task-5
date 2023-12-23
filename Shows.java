package com.kabaso.task5;

public abstract class Shows {
	private String title;
	private String date;
	private SeatingArea seatingArea;

	public Shows(String title, String date, SeatingArea seatingArea) {
		super();
		this.title = title;
		this.date = date;
		this.seatingArea = seatingArea;
	}

	public int getAvailableSeats() {
		return seatingArea.getAvailableSeats();

	}

	public void reserveSeat(int seatNumber) {
		seatingArea.reserveSeat(seatNumber);
	}

	public void cancelReservation(int seatNumber) {
		seatingArea.cancelReservation(seatNumber);
	}
}
