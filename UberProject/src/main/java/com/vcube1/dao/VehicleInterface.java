package com.vcube1.dao;


import java.util.List;

import com.vcube1.modal.VehicleModal;

public interface VehicleInterface {
	public String addvehicle(VehicleModal vm);
	public List<VehicleModal> getAllVehicles();
	//public String updateVehicleDetails(VehicleModal vm);
	public VehicleModal editByVehicleId(int vehicleId);
	public String delete(int vehicleId);
	public double getRentByVehicleId(int vehicleId);
	
}
