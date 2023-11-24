package SetTransaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class CheckTransaction {
	public static void Make_Transaction(PreparedStatement dbs,PreparedStatement cds,Connection con) {
		try  {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Sender's Account Number : ");
			int DebAcc = sc.nextInt();
			System.out.println("Enter Reciever's Account Number : ");
			int credAcc = sc.nextInt();
			System.out.println("Enter Amount to be Transfer : ");
			double Amount = sc.nextDouble();
			dbs.setDouble(1,Amount);
			dbs.setInt(2, DebAcc);
			cds.setDouble(1,Amount);
			cds.setInt(2, credAcc);
			System.out.println("To Confirm Transaction Press (Y/y) : ");
			String choice = sc.next();
//			if(!choice.toUpperCase().equals("Y")) {
//				return;
//			}
			int debSucc = dbs.executeUpdate();
			int credSucc = cds.executeUpdate();
//			con.commit();
//			if(debSucc>0 && credSucc >0) {
//				System.out.println("Transaction Successful");
//			}
			if(safetransaction(DebAcc,Amount,con)) {
				con.commit();
				System.out.println("Transaction Successful");
			}
			else {
				con.rollback();
				if(!(debSucc>0)) {
					System.out.println("Something Went Wrong!!!");
				}
				if(!(credSucc>0)) {
					System.out.println("Reciver Cant be Reached!!!1");
				}
				System.out.println("Transaction Failed Due to Insufficient Balance");
			}
			
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public static boolean safetransaction (int acc,double amount,Connection con) {
		try {
			Statement check = con.createStatement();
			String accS = Integer.toString(acc);
			ResultSet res = check.executeQuery("SELECT Acc_Balance FROM Account WHERE Acc_No = "+accS);
			double curr_bal = 0;
			if(res.next()) {
				 curr_bal = res.getDouble("Acc_Balance");
			}
			if(curr_bal>0 && curr_bal>=amount) {
				System.out.println("Your Balance is : "+curr_bal);
				return true;
			}
			else {
				System.out.println("Transaction Failed Due to Insufficient Balance");
				return false;
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	public static void main(String[] args) {
		String URL = "jdbc:mysql://localhost:3306/bank";
		String UserName = "root";
		String UPass = "Swami@21";
		
		try {
			Connection con = DriverManager.getConnection(URL,UserName,UPass);
			System.out.println("Successful Connection");
			String Derbit_Query = "Update account Set Acc_Balance = Acc_Balance - ? where Acc_No = ?";
			String Credit_Query = "Update account Set Acc_Balance = Acc_Balance + ? where Acc_No = ?";
			PreparedStatement dps = con.prepareStatement(Derbit_Query);
			PreparedStatement cps = con.prepareStatement(Credit_Query);
			con.setAutoCommit(false);
			Make_Transaction(dps,cps,con);
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
