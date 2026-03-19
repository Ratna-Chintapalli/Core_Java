package com.vcube.vmsapp.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "service_bookings")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ServiceBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingId;

    @NotBlank(message = "Customer Name is required")
    private String customerName;

    @NotBlank(message = "Vehicle Number is required")
    private String vehicleNumber;

    @NotBlank(message = "Vehicle Type is required")
    private String vehicleType;

    @NotBlank(message = "Service Type is required")
    private String serviceType;

    @NotNull(message = "Booking Date is required")
    private LocalDate bookingDate;

    @NotBlank(message = "Status is required")
    private String status;

	public ServiceBooking(int bookingId, @NotBlank(message = "Customer Name is required") String customerName,
			@NotBlank(message = "Vehicle Number is required") String vehicleNumber,
			@NotBlank(message = "Vehicle Type is required") String vehicleType,
			@NotBlank(message = "Service Type is required") String serviceType,
			@NotNull(message = "Booking Date is required") LocalDate bookingDate,
			@NotBlank(message = "Status is required") String status) {
		super();
		this.bookingId = bookingId;
		this.customerName = customerName;
		this.vehicleNumber = vehicleNumber;
		this.vehicleType = vehicleType;
		this.serviceType = serviceType;
		this.bookingDate = bookingDate;
		this.status = status;
	}
	
	public ServiceBooking() {
		
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	

}