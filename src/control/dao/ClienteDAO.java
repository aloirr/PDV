package control.dao;

import java.util.List;

import model.Cliente;

public class ClienteDAO implements GenericCRUD {

	static final String table = "clientes";

	public static Integer cadastrarDao(Cliente Cliente) {
		return GenericCRUD.insert(Cliente, table);
	}

	public static Long alterarDao(Cliente Cliente) {
		return GenericCRUD.update(Cliente, table);
	}

	public static List<Cliente> pesquisarDao(Cliente Cliente, String atributoWhere,
			String stringPequisa) {
		return GenericCRUD.read(Cliente, table, atributoWhere, stringPequisa);

	}

	public static Long deletarDao(String param) {
		return GenericCRUD.delete(table, param);
	}

	public static List<Cliente> listarDao(Cliente cliente, String table) {
		return GenericCRUD.readAll(cliente, table);
	}

	public static Integer contarDao() {
		return GenericCRUD.count(table);
	}

	public static Integer contarDao(String atributoWhere, String stringPequisa) {
		return GenericCRUD.count(table, atributoWhere, stringPequisa);
	}
}
