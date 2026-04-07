package com.vcube1.modal;

import java.util.Date;

public class BookingModal {
	private int bookingId;
    private int userId;
    private int vehicleId;
    private Date startDate;
    private Date endDate;
    private double totalAmount;
    private String status;
    public BookingModal() {
    }
	public BookingModal(int bookingId, int userId, int vehicleId, Date startDate, Date endDate, double totalAmount,
			String status) {
		super();
		this.bookingId = bookingId;
		this.userId = userId;
		this.vehicleId = vehicleId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.totalAmount = totalAmount;
		this.status = status;
	}


	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "BookingModal [bookingId=" + bookingId + ", userId=" + userId + ", vehicleId=" + vehicleId
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", totalAmount=" + totalAmount + ", status="
				+ status + "]";
	}
    
}
