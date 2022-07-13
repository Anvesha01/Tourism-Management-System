package com.tourism_manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class vehicleDoa {
	public static boolean insertVehicleToDB(Vehicle ve) throws SQLException{
		boolean f=false;
		try{
			Connection con = CP.createc();
			String q = "insert into Vehicle(vehicle_id, vehicle_name, vehicle_type) values (?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setInt(1, ve.getVehicle_id());
			pstmt.setString(2, ve.getVehicle_name());
			pstmt.setString(3, ve.getVehicle_type());
			pstmt.executeUpdate();
			f = true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
}
