package com.vcube1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.vcube1.modal.BookingModal;
import com.vcube1.modal.VehicleModal;
import com.vcube1.utility.DBConnection;

public class Vehicle implements VehicleInterface {
	List<VehicleModal> list = new ArrayList<>();
	Connection con = null;
	String status = "fail";

	@Override
	public String addvehicle(VehicleModal vm) {
		try {
			DBConnection dbc = new DBConnection();
			con = dbc.getConnection();
			PreparedStatement ps = con.prepareStatement(
					"insert into vehicle(vehicle_name, vehicle_type, rent_per_day, availability) values(?,?,?,?)");
			ps.setString(1, vm.getVehicleName());
			ps.setString(2, vm.getVehicleType());
			ps.setDouble(3, vm.getRentPerDay());
			ps.setString(4, vm.getAvailability());
			int n = ps.executeUpdate();
			if (n > 0) {
				status = "success";
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

	@Override
	public List<VehicleModal> getAllVehicles() {
		list.clear();
		try {
			DBConnection dbc = new DBConnection();
			con = dbc.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from vehicle");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				VehicleModal v = new VehicleModal();
				v.setVehicleId(rs.getInt("vehicle_id"));
				v.setVehicleName(rs.getString("vehicle_name"));
				v.setVehicleType(rs.getString("vehicle_type"));
				v.setRentPerDay(rs.getDouble("rent_per_day"));
				v.setAvailability(rs.getString("availability"));
				list.add(v);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

	public VehicleModal editByVehicleId(int vehicleId) {
		VehicleModal vm = new VehicleModal();
		try {
			DBConnection dbc = new DBConnection();
			con = dbc.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from vehicle where vehicle_id=?");
			ps.setInt(1, vehicleId);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				vm.setVehicleId(rs.getInt("vehicle_id"));
				vm.setVehicleName(rs.getString("vehicle_name"));
				vm.setVehicleType(rs.getString("vehicle_type"));
				vm.setRentPerDay(rs.getDouble("rent_per_day"));
				vm.setAvailability(rs.getString("availability"));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return vm;

	}

	public String updateVehicleDetails(VehicleModal vm) {

		String status = "fail";

		try {
			DBConnection dbc = new DBConnection();
			con = dbc.getConnection();

			PreparedStatement ps = con.prepareStatement(
					"UPDATE vehicle SET vehicle_name=?, vehicle_type=?, rent_per_day=?, availability=? WHERE vehicle_id=?");

			ps.setString(1, vm.getVehicleName());
			ps.setString(2, vm.getVehicleType());
			ps.setDouble(3, vm.getRentPerDay());
			ps.setString(4, vm.getAvailability());
			ps.setInt(5, vm.getVehicleId());
			int n = ps.executeUpdate();
			if (n > 0) {
				status = "success";
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

	public String delete(int vehicleId) {

		try {
			DBConnection dbc = new DBConnection();
			con = dbc.getConnection();
			PreparedStatement ps = con.prepareStatement("DELETE FROM vehicle WHERE vehicle_id = ?");
			ps.setInt(1, vehicleId);
			int n = ps.executeUpdate();
			if (n > 0) {
				status = "success";
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

	public double getRentByVehicleId(int vehicleId) {
		double rent = 0;
		try {
			DBConnection dbc = new DBConnection();
			con = dbc.getConnection();
			PreparedStatement ps = con.prepareStatement("SELECT rent_per_day FROM vehicle WHERE vehicle_id=?");
			ps.setInt(1, vehicleId);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				rent = rs.getDouble("rent_per_day");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rent;
	}

}
