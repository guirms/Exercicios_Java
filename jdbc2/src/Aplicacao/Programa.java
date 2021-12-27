package Aplicacao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import db.DbException;

import db.DB;

public class Programa {

	public static void main(String[] args) {

		Connection conn = null; // conectar
		Statement st = null; // preparar consulta
		ResultSet rs = null; // guardar resultado da consulta

		try {
			conn = DB.getConnection();

			st = conn.createStatement();

			rs = st.executeQuery("select * from department");

			while (rs.next()) {
				System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
			}
		} catch (SQLException sqe) {
			throw new DbException(sqe.getMessage());
		} finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
			DB.closeConnection();
		}
		
	}

}
