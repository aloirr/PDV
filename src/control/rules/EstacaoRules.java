package control.rules;

import java.sql.SQLException;

import model.Estacao;

public class EstacaoRules {

	public static Estacao cadastrarRule(Estacao estacao) throws SQLException {

		// Verifica se os dados do objeto Estacao est�o dentro das regras de neg�cios, e
		// ent�o retorna o pr�prio objeto.

		return estacao;
	}

	public static Estacao alterarRule(Estacao estacao) throws IllegalArgumentException, IllegalAccessException,
			NoSuchFieldException, SecurityException, SQLException {

		// Verifica se os dados do objeto Estacao est�o dentro das regras de neg�cios, e
		// ent�o retorna o pr�prio objeto.

		return estacao;
	}

	public static boolean pesquisarRule(Estacao estacao, String atributoWhere, String stringPequisa) {

		// Verifica se os dados do objeto Estacao est�o dentro das regras de neg�cios, e
		// ent�o retorna true ou false para continuar a pesquisa.

		return true;

	}

	public static boolean deletarRule(String param) throws IllegalArgumentException, IllegalAccessException,
			NoSuchFieldException, SecurityException, SQLException {

		// Verifica se os dados do objeto Estacao est�o dentro das regras de neg�cios, e
		// ent�o retorna true ou false para continuar o delete.
		return true;
	}
}
