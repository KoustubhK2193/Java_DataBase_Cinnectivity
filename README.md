# Advance-Java
MVC -  Model View Controller

<h2> What is JDBC? </h2>
JDBC is API. Connect Java with Database 

<h2>JDBC Driver</h2>
1. JDBC-ODBC Bridge Driver: Oldest/Write in C langauge have performace and Scalaility Issue
2. Native-API PArty Java Driver : API of Particular Company i.e Database Vendor has dependibility issue 
3. Network Protocol Driver : Write in Java, Uses extra layer i.e Network 
need extra resources 
4. Thin Driver (Direct to Database Pure Java Driver)- Best Driver Resolve all Shortcoming of all other Driver Wrote in Java Light weight 

<h2>Components of JDBC </h2>
<h4>1. DriverManager Class : </h4>
	Method : getConnection() Connect to Database

<h4>2. Connection Interface:</h4>
	Stores connection in Instance

<h4>4. Statement and PreparedStatement Interfaces: </h4>
	Used to Run SQL Query
<h4>5. ResultSet Interface:</h4>
	Store the result of query in Instance



<h2>Types of Exwcute Statement</h2>
For Selection We Use executeQuery method

For Update Delete or Insert we use executeUpdate method

For Making Table we use execute method





