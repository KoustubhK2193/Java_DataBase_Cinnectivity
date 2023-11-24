package Exec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/dbb";
		String Username = "root";
		String Pass = "Swami@21";
		try {
			Connection con = DriverManager.getConnection(url,Username,Pass);
//			Statement state = con.createStatement();
			
			//Creating Table 
			
//			String Query = "create table School (Roll int, Name varchar(20),Marks double, primary key(Roll))";
//			boolean a = state.execute(Query);
//			System.out.println("Successfull Done"+a);
			// For Selection We Use executeQuery method
			// For Update Delete or Insert we use executeUpdate method
			// For Making Table we use execute method
			
			//Insertion Query
			
//			String ins_query = String.format("Insert Into School (Roll,Name,Marks) values (%d,'%s',%f)",1,"Piyush",78.5 );
//			int rowsAffected = state.executeUpdate(ins_query);
//			if(rowsAffected>0) {
//				System.out.println("Data Inserted Successfully ");
//				
//			}
//			else {
//				System.out.println("Data Not Inserted");
//			}
			
			//Update Query
			
//			String up_query = String.format("Update School Set marks = %f where Roll = %d", 86.6,1);
//			int rowsAffected = state.executeUpdate(up_query);
//			if(rowsAffected>0) {
//				System.out.println("Data Updated Successfully ");
//				
//			}
//			else {
//				System.out.println("Data Not Updated");
//			}
			
			//Selection Query
			
//			String sel_query = "Select * from School";
//			ResultSet result = state.executeQuery(sel_query);
//			while(result.next()) {
//				int Roll = result.getInt("Roll");
//				String Name = result.getString("Name");
//				double marks = result.getDouble("Marks");
//				System.out.println("================================");
//				System.out.println("Roll Number of Student is : "+Roll);
//				System.out.println("Name of Studet is :"+Name);
//				System.out.println("Marks of Student is : "+marks);
//				System.out.println("================================");
//			}
			
			//Insert Using Prepared statement
//			
//			String ins_query = String.format("Insert Into School (Roll,Name,Marks) values (?,?,?)" );
//			PreparedStatement prep_state = con.prepareStatement(ins_query);
//			prep_state.setInt(1, 2);
//			prep_state.setString(2, "Minal");
//			prep_state.setDouble(3, 93.3);
//			int rowsAffected = prep_state.executeUpdate();
//			if(rowsAffected>0) {
//				System.out.println("Data Updated Successfully ");
//				
//			}
//			else {
//				System.out.println("Data Not Updated");
//			}
			
			// Select using Prepared Statement
			
//			String query = "Select * from School where Marks>=?";
//			PreparedStatement prep_state = con.prepareStatement(query);
//			prep_state.setDouble(1, 95);
//			ResultSet res = prep_state.executeQuery();
//			if(res.next())
//			while(res.next()) {
//				int Roll = res.getInt("Roll");
//				String Name = res.getString("Name");
//				double Marks = res.getDouble("Marks");
//				System.out.println("================================");
//				System.out.println("Roll Number of Student is : "+Roll);
//				System.out.println("Name of Studet is :"+Name);
//				System.out.println("Marks of Student is : "+Marks);
//				System.out.println("================================");
//			}
//			else 
//				System.out.println("Data Not Found");
			
			//Update Query in Prepared Statement
			
//			String Query = "Update School SET marks = ? where Roll = ?";
//			PreparedStatement prep_state = con.prepareStatement(Query);
//			prep_state.setInt(1,88);
//			prep_state.setInt(2, 2);
//			int AffectedRows = prep_state.executeUpdate();
//			if(AffectedRows>0) {
//				System.out.println("Update Successful");
//			}
//			else {
//				System.out.println("Update Failed");
//			}
			
			//Batch Processing using Statement
			
//			Statement state = con.createStatement();
//			Scanner sc = new Scanner(System.in);
//			while(true) {
//				System.out.print("Enter Roll Number to Enter : ");
//				int URoll = sc.nextInt();
//				System.out.print("Enter Roll Number to Enter : ");
//				String UName = sc.next();
//				System.out.print("Enter Roll Number to Enter : ");
//				double UMarks = sc.nextDouble();
//				String Query = String.format("Insert into School (Roll,Name,Marks) values(%d,'%s',%f)",URoll,UName,UMarks );
//				state.addBatch(Query);
//				System.out.print("To Continue Enter (Y/N) : ");
//				String choice = sc.next();
//				if(choice.toUpperCase().equals("N")) {
//					break;
//				}
//				
//			}
//			int [] resArr = state.executeBatch();
//			for (int i =0;i<resArr.length;i++ ) {
//				if(i==0)
//					System.out.printf("Query %d failed",i+1);
//			}
			
			
			//Batch Processing Using PreparedStatement
			
//			String Query = "Insert into School (Roll,Name,Marks) values (?,?,?)";
//			Scanner sc = new Scanner(System.in);
//			PreparedStatement pstate = con.prepareStatement(Query);
//			while(true) {
//				System.out.print("Enter Roll Number : ");
//				int URoll = sc.nextInt();
//				System.out.print("Enter Name : ");
//				String UName = sc.next();
//				System.out.print("Enter Marks : ");
//				double UMarks = sc.nextDouble();
//				pstate.setInt(1,URoll);
//				pstate.setString(2, UName);
//				pstate.setDouble(3, UMarks);
//				pstate.addBatch();
//				System.out.print("To Continue Enter (Y/N) : ");
//				String choice = sc.next();
//				if(choice.toUpperCase().equals("N")) {
//					break;
//				}
//				
//			}
//			int [] resArr = pstate.executeBatch();
//			for (int i =0;i<resArr.length;i++)
//				if(i==0)
//					System.out.printf("Failed to Insert %d Query ", i+1);
			
			//Transaction Control 
			

		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
