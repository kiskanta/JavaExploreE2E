package com.ksh.jdbc.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

public class MySqlConnection {
	private final static Logger LOG = Logger.getLogger(MySqlConnection.class.getName());
	private static MySqlConnection instance = null;
	private static String MYSQL_DRIVER_CLASS = "com.mysql.jdbc.Driver";
	private static String MYSQL_DRIVER_URL = "jdbc:mysql://localhost:3306/exp2";
	private static String MYSQL_USER_NAME = "root";
	private static String MYSQL_PWD = "root";

	/**
	 * Step1: Making constructor as private so that Object can't create explicitly.
	 */
	private MySqlConnection() {
		try {
			Class.forName(MYSQL_DRIVER_CLASS);
		} catch (ClassNotFoundException e) {
			LOG.info(e.getMessage());
		}
	}

	/**
	 * Step2: Without instantiating the Class, will return Connection object. 
	 * -> Eager Initialization /static block initialization - the instance is created
	 * at the time of class Loading. 
	 * 	 Drawback that instance is created even through 
	 * ->* Lazy initialization * create the instance in the global access
	 * method. Step3: synchronized makes sure that only one Thread at a time can
	 * execute. 
	 * i.e public static synchronized MySqlConnection getInstance()
	 * 
	 * -> Disadvantage is every time while creating the singleton object is
	 * expensive and may decrease the performance of your program.
	 * 
	 * <b>Step 4*:</b> Double checked locking once an object is created synchronization is
	 * no longer useful, because now object will not be null and any sequence of
	 * operations will lead to consistent results. \n
	 * 
	 * we will only acquire lock on the getInstnace() once, when the obj is null. This way we only synchronize the first way through, 
	 * 
	 * @return single instance MySQL connection.
	 */
	public static MySqlConnection getInstance() {
		// return new MySqlConnection(); // Eager Initialization
		LOG.info("MySql connection single instnace got created");
		
		/*// Lazy initialization
		if (instance == null) { 
			instance = new MySqlConnection();
		}*/
		
		if (instance == null) {
			synchronized (MySqlConnection.class) {
				if(instance == null) {
					instance = new MySqlConnection();
				}
			}
		}
		return instance;
	}

	/**
	 * To load the connection object using DriverURL, UserName, pwd.
	 * 
	 * @return
	 */
	public static Connection getConnection() {
		try {
			return DriverManager.getConnection(MYSQL_DRIVER_URL, MYSQL_USER_NAME, MYSQL_PWD);
		} catch (SQLException e) {
			LOG.info(e.getMessage());
		}
		return null;
	}
	
	public static void closeConnection(Connection con, ResultSet rs){
		closeConnection(con);
		if(rs != null) {
			try {
				rs.close();
			}catch (Exception e) {
				LOG.info(e.getMessage());
			}
		}
	}
	public static void closeConnection(Connection con) {
		if(con!= null) {
			try {
				con.close();
			}catch (Exception e) {
				LOG.info(e.getMessage());
			}
		}
	}
}