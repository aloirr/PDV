package control.dao;

import java.util.List;

import model.Produto;

public class ProdutoDAO implements GenericCRUD {
	static final String table = "produto";

	public static Integer cadastrarDao(Produto produto) {
		return GenericCRUD.insert(produto, table);
	}

	public static Long alterarDao(Produto produto) {
		return GenericCRUD.update(produto, table);
	}

	public static List<Produto> pesquisarDao(Produto produto, String atributoWhere,
			String stringPequisa) {
		return GenericCRUD.read(produto, table, atributoWhere, stringPequisa);

	}

	public static List<Produto> listarDao(Produto produto, String table) {
		return GenericCRUD.readAll(produto, table);
	}

	public static Long deletarDao(String param) {
		return GenericCRUD.delete(table, param);
	}

	public static Integer contarDao() {
		return GenericCRUD.count(table);
	}

	public static Integer contarDao(String atributoWhere, String stringPequisa) {
		return GenericCRUD.count(table, atributoWhere, stringPequisa);
	}

}
