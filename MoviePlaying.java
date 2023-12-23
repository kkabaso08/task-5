package com.kabaso.task5;

public class MoviePlaying extends Shows {

	public MoviePlaying(String title, String date, SeatingArea seatingArea) {
		super(title, date, seatingArea);
	}
	@Override
	public String toString() {
		return "MoviePlaying [getAvailableSeats()=" + getAvailableSeats() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
