package control.rules;

import java.sql.SQLException;

import control.dao.FornecedorDAO;
import model.Fornecedor;

public class FornecedorRules extends FornecedorDAO {

	public static  Fornecedor cadastrarRule(Fornecedor Fornecedor) throws SQLException {

		// Verifica se os dados do objeto Fornecedor est�o dentro das regras de neg�cios, e
		// ent�o retorna o pr�prio objeto.

		return Fornecedor;
	}

	public static  Fornecedor alterarRule(Fornecedor Fornecedor) throws IllegalArgumentException, IllegalAccessException,
			NoSuchFieldException, SecurityException, SQLException {

		// Verifica se os dados do objeto Fornecedor est�o dentro das regras de neg�cios, e
		// ent�o retorna o pr�prio objeto.

		return Fornecedor;
	}

	public static  boolean pesquisarRule(Fornecedor Fornecedor, String atributoWhere, String stringPequisa) {

		// Verifica se os dados do objeto Fornecedor est�o dentro das regras de neg�cios, e
		// ent�o retorna true ou false para continuar a pesquisa.

		return true;

	}

	public static  boolean deletarRule(String param) throws IllegalArgumentException, IllegalAccessException,
			NoSuchFieldException, SecurityException, SQLException {
		
		// Verifica se os dados do objeto Fornecedor est�o dentro das regras de neg�cios, e
		// ent�o retorna true ou false para continuar o delete.
		return true;
	}
}