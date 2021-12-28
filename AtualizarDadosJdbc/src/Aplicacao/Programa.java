package Aplicacao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import db.DbException;

public class Programa {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement ps = null;

		try {
			conn = DB.getConnection();
			ps = conn.prepareStatement("UPDATE seller SET BaseSalary = BaseSalary + ? WHERE (DepartmentId = ?)");

			ps.setDouble(1, 1.0);
			ps.setInt(2, 1);

			int linhasAlteradas = ps.executeUpdate();

			System.out.println(linhasAlteradas + " linhas alteradas");
		} catch (SQLException sqe) {
			throw new DbException(sqe.getMessage());
		} finally {
			DB.closeStatement(ps);
			DB.closeConnection();
		}

	}

}
