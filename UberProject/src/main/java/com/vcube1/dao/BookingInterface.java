package com.vcube1.dao;

import java.util.List;

import com.vcube1.modal.BookingModal;

public interface BookingInterface {
	public boolean addBooking(BookingModal b);
	public BookingModal bookByVehicleId(int vehicleId);
    public List<BookingModal> getAllBookings();
}
