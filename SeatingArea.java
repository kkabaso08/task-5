package com.kabaso.task5;
   //static int seatNumber;

public interface SeatingArea {
	int getAvailableSeats();

    void reserveSeat(int seatNumber);

    void cancelReservation(int seatNumber);

}
