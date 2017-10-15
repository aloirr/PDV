package control.dao;

import java.sql.SQLException;
import java.util.List;

import model.Produto;

public class ProdutoDAO implements GenericCRUD {
	static final String table = "produto";

	public static Integer cadastrarDao(Produto produto) throws SQLException {
		return GenericCRUD.insert(produto, table);
	}

	public static Long alterarDao(Produto produto) throws IllegalArgumentException,
			IllegalAccessException, NoSuchFieldException, SecurityException, SQLException {
		return GenericCRUD.update(produto, table);
	}

	public static List<Produto> pesquisarDao(Produto produto, String atributoWhere,
			String stringPequisa) throws SQLException {
		return GenericCRUD.read(produto, table, atributoWhere, stringPequisa);

	}

	public static List<Produto> listarDao(Produto produto, String table) throws SQLException {
		return GenericCRUD.readAll(produto, table);
	}

	public static Long deletarDao(String param) throws IllegalArgumentException,
			IllegalAccessException, NoSuchFieldException, SecurityException, SQLException {
		return GenericCRUD.delete(table, param);
	}
}
