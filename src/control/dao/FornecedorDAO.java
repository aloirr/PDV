package control.dao;

import java.sql.SQLException;
import java.util.List;

import model.Cliente;
import model.Fornecedor;

public class FornecedorDAO implements GenericCRUD {

	static final String table = "fornecedor";

	public static Integer cadastrarDao(Fornecedor fornecedor) {
		return GenericCRUD.insert(fornecedor, table);
	}

	public static Long alterarDao(Fornecedor fornecedor) {
		return GenericCRUD.update(fornecedor, table);
	}

	public static List<Fornecedor> pesquisarDao(Fornecedor fornecedor, String atributoWhere,
			String stringPequisa) {
		return GenericCRUD.read(fornecedor, table, atributoWhere, stringPequisa);

	}

	public static Long deletarDao(String param) {
		return GenericCRUD.delete(table, param);
	}

	public static List<Fornecedor> listarDao(Fornecedor fornecedor, String table) {
		return GenericCRUD.readAll(fornecedor, table);
	}
}