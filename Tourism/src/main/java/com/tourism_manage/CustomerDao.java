package com.tourism_manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomerDao {
	public static boolean insertCustomerToDB(Customer cu){
		boolean f=false;
		try{
			Connection con = CP.createc();
			String q = "insert into customer(customer_name, customer_phone) values (?,?)";
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setString(1, cu.getCustomer_name());
			pstmt.setString(2, cu.getMobile_phone());
			pstmt.executeUpdate();
			f = true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	public static boolean deleteCustomer(int userId){
		boolean f=false;
		try{
			Connection con = CP.createc();
			String q = "delete from Customer where customer_id = ?";
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setInt(1, userId);
			pstmt.executeUpdate();
			f = true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	public static void showAllStudent() {
		boolean f=false;
		try{
			Connection con = CP.createc();
			String q = "select * from Customer";
			PreparedStatement pstmt = con.prepareStatement(q);
			ResultSet set = pstmt.executeQuery(q);
			while(set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String phone = set.getString(3);
				
				System.out.println("ID: "+ id);
				System.out.println("Name: " + name);
				System.out.println("Phone: " + phone);
			}
			f = true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
