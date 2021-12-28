package Aplicacao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;
import db.DbException;

public class Programa {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement ps = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			conn = DB.getConnection();

			ps = conn.prepareStatement("INSERT INTO seller (Name, Email, BirthDate, BaseSalary, DepartmentId)"
					+ "VALUES (?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);

			ps.setString(1, "João");
			ps.setString(2, "joao@hotmail.com");
			ps.setDate(3, new java.sql.Date(sdf.parse("04/09/2003").getTime()));
			ps.setDouble(4, 3000.0);
			ps.setInt(5, 4);

			int linhasAlteradas = ps.executeUpdate();

			if (linhasAlteradas > 0) {
				ResultSet rs = ps.getGeneratedKeys();
				while (rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Feito, id: " + id);
				}
			} else {
				System.out.println("Nenhuma linha foi alterada");
			}

		} catch (SQLException sqe) {
			throw new DbException(sqe.getMessage());
		} catch (ParseException pe) {
			throw new DbException(pe.getMessage());
		} finally {
			DB.closeStatement(ps);
			DB.closeConnection();
		}
	}

}
