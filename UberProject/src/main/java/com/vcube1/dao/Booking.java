package com.vcube1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.vcube1.modal.BookingModal;
import com.vcube1.utility.DBConnection;

public class Booking implements BookingInterface {
	List<BookingModal> list = new ArrayList<>();
	Connection con = null;
	boolean status = false;

	@Override
	public boolean addBooking(BookingModal b) {
		try {
			DBConnection dbc = new DBConnection();
			con = dbc.getConnection();

			PreparedStatement ps = con.prepareStatement(
					"insert into booking(user_id, vehicle_id, start_date, end_date, total_amount, status) values (?,?,?,?,?,?)");
			ps.setInt(1, b.getUserId());
			ps.setInt(2, b.getVehicleId());
			ps.setDate(3, new java.sql.Date(b.getStartDate().getTime()));
			ps.setDate(4, new java.sql.Date(b.getEndDate().getTime()));
			ps.setDouble(5, b.getTotalAmount());
			ps.setString(6, b.getStatus());
			int n = ps.executeUpdate();
			if (n > 0) {
				status = true;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

	public List<BookingModal> getAllBookings() {

		List<BookingModal> list = new ArrayList<>();

		try {
			DBConnection dbc = new DBConnection();
			con = dbc.getConnection();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM booking");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				BookingModal b = new BookingModal();
				b.setBookingId(rs.getInt("booking_id"));
				b.setUserId(rs.getInt("user_id"));
				b.setVehicleId(rs.getInt("vehicle_id"));
				b.setStartDate(rs.getDate("start_date"));
				b.setEndDate(rs.getDate("end_date"));
				b.setTotalAmount(rs.getDouble("total_amount"));
				b.setStatus(rs.getString("status"));

				list.add(b);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public BookingModal bookByVehicleId(int vehicleId) {
		BookingModal b = null;
		try {
			DBConnection dbc = new DBConnection();
			con = dbc.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from vehicle where vehicle_id=?");
			ps.setInt(1, vehicleId);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				b = new BookingModal();
				b.setVehicleId(rs.getInt("vehicle_id"));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return b;
	}

}
