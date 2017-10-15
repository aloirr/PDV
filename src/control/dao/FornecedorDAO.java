package control.dao;

import java.sql.SQLException;
import java.util.List;

import control.dao.GenericCRUD;
import model.Fornecedor;

public class FornecedorDAO implements GenericCRUD {

	static final String table = "fornecedor";

	public static  Integer cadastrarDao(Fornecedor fornecedor) throws SQLException {
		return GenericCRUD.insert(fornecedor, table);
	}

	public static  Long alterarDao(Fornecedor fornecedor) throws IllegalArgumentException, IllegalAccessException,
			NoSuchFieldException, SecurityException, SQLException {
		return GenericCRUD.update(fornecedor, table);
	}

	public static  List<Fornecedor> pesquisarDao(Fornecedor fornecedor, String atributoWhere, String stringPequisa)
			throws SQLException {
		return GenericCRUD.read(fornecedor, table, atributoWhere, stringPequisa);

	}

	public static  Long deletarFornecedorDao(String param) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException,
			SecurityException, SQLException {
		return GenericCRUD.delete(table, param);
	}
}