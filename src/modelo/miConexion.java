package modelo;

import java.sql.*;

public class miConexion {

	private String username="root";
	private String password="efelante";
	private String host="localhost";
	private String port="3306";
	private String database="sslFinal";
	private String classname="com.mysql.jdbc.Driver";
	private String url="jdbc:mysql://"+host+":"+port+"/"+database;
	private static Connection con;
	
	public miConexion() {
		
		try {
			
			Class.forName(classname);
			con=DriverManager.getConnection(url, username, password);
			
		}catch(ClassNotFoundException e) {
			
			System.out.println("Error"+e);
			
		}catch(SQLException e) {
			
			System.out.println("Error"+e);
			
		}
		
	}
	
	public static  Connection getConexion() {
		
		return con;
	}
	

}
