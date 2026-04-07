package com.vcube1.modal;

public class VehicleModal {
	private int vehicleId;
	private String vehicleName;
	private String vehicleType;
	private double rentPerDay;
	private String availability;
	public VehicleModal() {
		
	}
	
	public VehicleModal(String vehicleName, String vehicleType, double rentPerDay, String availability) {
		super();
		this.vehicleName = vehicleName;
		this.vehicleType = vehicleType;
		this.rentPerDay = rentPerDay;
		this.availability = availability;
	}
	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public double getRentPerDay() {
		return rentPerDay;
	}
	public void setRentPerDay(double rentPerDay) {
		this.rentPerDay = rentPerDay;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}

	@Override
	public String toString() {
		return "VehicleModal [vehicleName=" + vehicleName + ", vehicleType=" + vehicleType + ", rentPerDay="
				+ rentPerDay + ", availability=" + availability + "]";
	}
	
	
}
