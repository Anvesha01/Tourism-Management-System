import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import com.tourism_manage.Customer;
import com.tourism_manage.CustomerDao;
import com.tourism_manage.Vehicle;
import com.tourism_manage.vehicleDoa;

public class Start {

	public static void main(String[] args) throws IOException, SQLException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("<-------------------- WELCOME TO TOURISM MANAGEMENT SYSTEM--------------------->");
		while(true) 
		{
			System.out.println("<--1------- CUSTOMER MODULE----------->");
			System.out.println("<--2-----FACULTY MODULE----------->");
			System.out.println("<--3------Exit--->");
			int cc = Integer.parseInt(br.readLine());
			if(cc==1) {
				System.out.println("Customer Module");
				BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
				while(true) {
					
				}
			}
			else if(cc==2) {
				
				System.out.println("Faculty Module");
				BufferedReader cr = new BufferedReader(new InputStreamReader(System.in));
				while(true)
				{	
					
					System.out.println("<--1------- Customer----------->");
					System.out.println("<--2-----Vehicle----------->");
					System.out.println("<--4------Exit--->");
					
					int d = Integer.parseInt(cr.readLine());
					
					
					if(d==1) {
						
						BufferedReader gr = new BufferedReader(new InputStreamReader(System.in));
						System.out.println("Customer");
						while(true)
						{
							System.out.println("Press 1 to add customer");
							System.out.println("Press 2 to delete customer");
							System.out.println("Press 3 to display customer");
							System.out.println("Press 4 to exit app");
								
							int i = Integer.parseInt(gr.readLine());
								
							if(i==1) {
//								add customer
								System.out.println("Enter your name: ");
								String name = gr.readLine();
								System.out.println("Enter your phone: ");
								String phone = gr.readLine();
								Customer cu = new Customer(name, phone);
								boolean ans = CustomerDao.insertCustomerToDB(cu);
								if(ans) {
									System.out.println("customer added successfully..");
								}
								else {
									System.out.println("Something went wrong");
								}
									System.out.println(cu);
							}
							else if(i==2) {

		//							
		//							delete customer
									
								System.out.println("enter student id to delete");
								int userId = Integer.parseInt(br.readLine());
								boolean ans = CustomerDao.deleteCustomer(userId);
								if(ans) {
									System.out.println("customer deleted successfully..");
								}
								else {
									System.out.println("Something went wrong");
								}
									
							}
							else if(i==3) {
			//							display customer
								System.out.println("enter the id: ");
								int customer_id = Integer.parseInt(br.readLine());
								
								CustomerDao.showAllStudent();
							}
							else if(i==4) {
								break;
							}
								
						
				}	
					
					}
					else if(d==2) {
						System.out.println("Enter your vehicle id: ");
						int id = Integer.parseInt(cr.readLine());
						System.out.println("Enter your vehicle type: ");
						String type = cr.readLine();
						System.out.println("Enter your vehicle name: ");
						String name = cr.readLine();
						Vehicle ve = new Vehicle(id, type, name);
						boolean ans = vehicleDoa.insertVehicleToDB(ve);
						if(ans) {
							System.out.println("vehicle added successfully..");
						}
						else {
							System.out.println("Something went wrong");
						}
						System.out.println(ve);
					}
					else if(d==4)
					{
						System.out.println("Thankyou for using the application.");
						break;
					}
			
			else if(cc==3) {
				System.out.println("Press 1 to add vehicle");
				System.out.println("Press 2 to delete vehicle");
				System.out.println("Press 3 to display available vehicle");
				System.out.println("Press 4 to exit app");
			}
			else {
				System.out.println("thankyou for using my application \n See you soon....bye bye");
			}
				System.out.println("Please enter the value correctly");
			}
			}
		
			}
			}	
}
