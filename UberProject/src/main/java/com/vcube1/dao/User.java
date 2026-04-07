package com.vcube1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.vcube1.modal.UserModal;
import com.vcube1.utility.DBConnection;

public class User implements UserInterface{
	Connection con=null;
	String status="fail";
	@Override
	public String insertUsers(UserModal u) {
		try {
			DBConnection dbc = new DBConnection();
			con = dbc.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into users(name,email,mobile,password) values(?,?,?,?)");
			ps.setString(1, u.getName());
			ps.setString(2, u.getEmail());
			ps.setInt(3, u.getMobileno());
			ps.setString(4, u.getPassword());
			int n=ps.executeUpdate();
			if (n > 0) {
				status = "success";
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

}
