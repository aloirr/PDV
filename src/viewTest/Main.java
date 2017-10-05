package viewTest;

import java.sql.SQLException;

import modelDAO.ConexaoFactory;

public class Main {
	public static void main(String[] args) throws SQLException {
		ConexaoFactory conn = new ConexaoFactory
				.ConexaoFactoryBuilder()
				.host("localhost:3306")
				.usuario("root")
				.senha("1234")
				.nomeDb("aloistore")
				.tipoDb("mysql")
				.build();
				
		System.out.println(conn.getConexao());
	}
}
