package control.dao;

import java.sql.SQLException;
import java.util.List;

import control.dao.GenericCRUD;
import model.Cliente;

public class ClienteDAO implements GenericCRUD {

	static final String table = "Cliente";

	public static Integer cadastrarDao(Cliente Cliente) throws SQLException {
		return GenericCRUD.insert(Cliente, table);
	}

	public static Long alterarDao(Cliente Cliente)
			throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException,
			SecurityException, SQLException {
		return GenericCRUD.update(Cliente, table);
	}

	public static List<Cliente> pesquisarDao(Cliente Cliente, String atributoWhere,
			String stringPequisa) throws SQLException {
		return GenericCRUD.read(Cliente, table, atributoWhere, stringPequisa);

	}

	public static Long deletarDao(String param)
			throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException,
			SecurityException, SQLException {
		return GenericCRUD.delete(table, param);
	}

}
