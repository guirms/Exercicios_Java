package Aplicacao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class Programa {

	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null;

		try {
			conn = DB.getConnection();

			st = conn.createStatement();
			conn.setAutoCommit(false); //alteraçoes so serao confirmadas quando o dev confirmar tal ato
			
			int linha1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");
			
			int x = 0;
			
			if (x == 0) {
				throw new SQLException("Erro Forçado");
			}
			
			int linha2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");
			
			conn.commit(); //alteraçoes confirmadas manualmente

			System.out.println("Linha 1: " + linha1);
			System.out.println("Linha 2: " + linha2);

		} catch (SQLException sqe) {
			throw new DbException(sqe.getMessage());
		} finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}

	}

}
