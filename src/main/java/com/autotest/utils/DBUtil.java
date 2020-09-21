package com.autotest.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class DBUtil {
	private Connection con;
	private Statement statement;
	private PreparedStatement preparedStatement;
	private String dbURL;
	private String dbUserName;
	private String dbPassword;

	public void createDBConnection(String dbURL, String dbUserName, String dbPassword) {
		try {			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(dbURL, dbUserName, dbPassword);
			if (con != null) {				
			} else {				
			}
		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void createATable(String dbURL, String dbUserName, String dbPassword, String sqlQuery) {
		try {
			createDBConnection(dbURL, dbUserName, dbPassword);
			statement = con.createStatement();
			statement.execute(sqlQuery);
		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void createATable(String sqlQuery) {
		try {
			if (con == null) {
				createDBConnection(dbURL, dbUserName, dbPassword);
			}
			statement = con.createStatement();
			statement.execute(sqlQuery);
		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int insertIntoDB(String dbURL, String dbUserName, String dbPassword, String sqlQuery) {
		try {
			createDBConnection(dbURL, dbUserName, dbPassword);
			statement = con.createStatement();
			int row = statement.executeUpdate(sqlQuery);
			return row;
		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int insertIntoDB(String sqlQuery) {
		try {
			if (con == null) {
				createDBConnection(dbURL, dbUserName, dbPassword);
			}
			statement = con.createStatement();
			int row = statement.executeUpdate(sqlQuery);
			return row;
		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int updateIntoDB(String dbURL, String dbUserName, String dbPassword, String sqlQuery) {
		try {
			createDBConnection(dbURL, dbUserName, dbPassword);
			statement = con.createStatement();
			int row = statement.executeUpdate(sqlQuery);
			return row;
		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int updateIntoDB(String sqlQuery) {
		try {
			if (con == null) {
				createDBConnection(dbURL, dbUserName, dbPassword);
			}
			statement = con.createStatement();
			int row = statement.executeUpdate(sqlQuery);
			return row;
		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int deleteFromDB(String dbURL, String dbUserName, String dbPassword, String sqlQuery) {
		try {
			createDBConnection(dbURL, dbUserName, dbPassword);
			preparedStatement = con.prepareStatement(sqlQuery);
			preparedStatement.setString(1, "mkyong");

			int row = preparedStatement.executeUpdate();

			return row;
		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int deleteFromDB(String sqlQuery) {
		try {
			if (con == null) {
				createDBConnection(dbURL, dbUserName, dbPassword);
			}
			preparedStatement = con.prepareStatement(sqlQuery);
			preparedStatement.setString(1, "mkyong");

			int row = preparedStatement.executeUpdate();

			return row;
		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public ResultSet selectDataFromDB(String dbURL, String dbUserName, String dbPassword, String sqlQuery) {
		try {
			createDBConnection(dbURL, dbUserName, dbPassword);
			preparedStatement = con.prepareStatement(sqlQuery);
			ResultSet resultSet = preparedStatement.executeQuery();
			return resultSet;
		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public ResultSet selectDataFromDB(String sqlQuery) {
		try {
			if (con == null) {
				createDBConnection(dbURL, dbUserName, dbPassword);
			}
			preparedStatement = con.prepareStatement(sqlQuery);
			ResultSet resultSet = preparedStatement.executeQuery();
			return resultSet;
		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
