package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {

	private static Connection con = null;

	public static Connection getConnection() {
		if (con == null) {
			try {
				Properties props = loadProperties();
				String url = props.getProperty("dburl");
				con = DriverManager.getConnection(url, props);
			} catch (SQLException sqe) {
				throw new DbException(sqe.getMessage());
			}
		}
		return con;
	}

	public static void closeConnection() {
		try {
			if (con != null) {
				con.close();
			}
		} catch (SQLException sqe) {
			throw new DbException(sqe.getMessage());
		}
	}

	private static Properties loadProperties() {
		try (FileInputStream fs = new FileInputStream("db.properties")) {
			Properties props = new Properties();
			props.load(fs);
			return props;
		} catch (IOException io) {
			throw new DbException(io.getMessage());
		}
	}

}
