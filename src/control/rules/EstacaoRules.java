package control.rules;

import java.sql.SQLException;

import model.Estacao;

public class EstacaoRules {

	public static Estacao cadastrarRule(Estacao estacao) throws SQLException {

		// Verifica se os dados do objeto Estacao estão dentro das regras de negócios, e
		// então retorna o próprio objeto.

		return estacao;
	}

	public static Estacao alterarRule(Estacao estacao) throws IllegalArgumentException, IllegalAccessException,
			NoSuchFieldException, SecurityException, SQLException {

		// Verifica se os dados do objeto Estacao estão dentro das regras de negócios, e
		// então retorna o próprio objeto.

		return estacao;
	}

	public static boolean pesquisarRule(Estacao estacao, String atributoWhere, String stringPequisa) {

		// Verifica se os dados do objeto Estacao estão dentro das regras de negócios, e
		// então retorna true ou false para continuar a pesquisa.

		return true;

	}

	public static boolean deletarRule(String param) throws IllegalArgumentException, IllegalAccessException,
			NoSuchFieldException, SecurityException, SQLException {

		// Verifica se os dados do objeto Estacao estão dentro das regras de negócios, e
		// então retorna true ou false para continuar o delete.
		return true;
	}
}
