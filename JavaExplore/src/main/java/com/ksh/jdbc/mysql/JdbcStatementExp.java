package com.ksh.jdbc.mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Logger;

import com.ksh.jdbc.statement.StatementFactory;

public class JdbcStatementExp implements StatementFactory {
	private static final Logger LOG = Logger.getLogger(JdbcStatementExp.class.getName());
	
	String createTableSQL = "CREATE TABLE DBUSER(" + "USER_ID INT(5) NOT NULL, " + "USERNAME VARCHAR(20) NOT NULL, "
			+ "CREATED_BY VARCHAR(20) NOT NULL, " + "CREATED_DATE DATE NOT NULL, " + "PRIMARY KEY (USER_ID) " + ")";
	
	Connection con = null;
	Statement statement = null;
	ResultSet rs = null;
	
	public void createTable() {
		try {
			con = MySqlConnection.getConnection();
			statement = con.createStatement();
			int i= statement.executeUpdate(createTableSQL);
			System.out.println(i);
		} catch (Exception e) {
			LOG.info(e.getMessage());
		}finally {
			LOG.info("closing connection");
			MySqlConnection.closeConnection(con);
		}
	}

	public static void main(String[] args) {
		StatementFactory sf = new JdbcStatementExp();
		sf.createTable();
		
	}
}
