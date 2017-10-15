package control.rules;

import java.sql.SQLException;

import control.dao.ProdutoDAO;
import model.Produto;

public class ProdutoRules extends ProdutoDAO {

	public static Produto cadastrarRule(Produto produto) throws SQLException {

		// Verifica se os dados do objeto Usuario est�o dentro das regras de neg�cios, e
		// ent�o retorna o pr�prio objeto.

		return produto;
	}

	public static Produto alterarRule(Produto produto) throws IllegalArgumentException,
			IllegalAccessException, NoSuchFieldException, SecurityException, SQLException {

		// Verifica se os dados do objeto Usuario est�o dentro das regras de neg�cios, e
		// ent�o retorna o pr�prio objeto.

		return produto;
	}

	public static boolean pesquisarRule(Produto produto, String atributoWhere,
			String stringPequisa) {

		// Verifica se os dados do objeto Usuario est�o dentro das regras de neg�cios, e
		// ent�o retorna true ou false para continuar a pesquisa.

		return true;

	}

	public static boolean deletarRule(String id) throws IllegalArgumentException,
			IllegalAccessException, NoSuchFieldException, SecurityException, SQLException {

		// Verifica se os dados do objeto Usuario est�o dentro das regras de neg�cios, e
		// ent�o retorna true ou false para continuar o delete.
		return true;
	}

	public static boolean listarRule(Produto produto) throws IllegalArgumentException,
			IllegalAccessException, NoSuchFieldException, SecurityException, SQLException {

		// Verifica se os dados do objeto Usuario est�o dentro das regras de neg�cios, e
		// ent�o retorna true ou false para continuar o delete.
		return true;
	}
}