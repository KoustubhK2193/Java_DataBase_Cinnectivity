package myPackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		/*
		 * 5 Basic Steps of JDBC is :     
		 * Driver Load
		 * Connection Establishment
		 * Statement Create
		 * Execute Query
		 * Connection Close 
		 *  
		 * J2EE
		 * Applet
		 * Servlet
		 * Spring
		 * Swing
		 * Spring Boot
		 * 
		 */
		//Driver Load
		//Connection Establish
		try {
			String url = "jdbc:mysql://localhost:3306/dbb";
			String userName = "root";
			String password = "Swami@21";
			//Driver Load
//			Class.forName("	com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,userName,password);
			
			
			System.out.println("Connection Successful");
			Statement stm = con.createStatement();
			String query = "create table Mob_Login (Mon_no int,Pass varchar(16))";
			boolean a = stm.execute(query);
			if(a==true) {
				System.out.println("Statement Executed Successfully");
			}
			else {
				System.out.println("Executio Failed");
			}
			stm.close(); //Statement Closure
			con.close(); //Connection Termination
			
			System.out.println("Connection Closed");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		//statement Create
		//Execute - query
		// Connection Close
		

	}

}
