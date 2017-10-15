package control.rules;

import java.sql.SQLException;

import control.dao.ClienteDAO;
import model.Cliente;

public class ClienteRules extends ClienteDAO {

	public static Cliente cadastrarRule(Cliente cliente) throws SQLException {

		// Verifica se os dados do objeto Cliente est�o dentro das regras de neg�cios, e
		// ent�o retorna o pr�prio objeto.

		return cliente;
	}

	public static Cliente alterarRule(Cliente cliente) throws IllegalArgumentException, IllegalAccessException,
			NoSuchFieldException, SecurityException, SQLException {

		// Verifica se os dados do objeto Cliente est�o dentro das regras de neg�cios, e
		// ent�o retorna o pr�prio objeto.

		return cliente;
	}

	public static boolean pesquisarRule(Cliente cliente, String atributoWhere, String stringPequisa) {

		// Verifica se os dados do objeto Cliente est�o dentro das regras de neg�cios, e
		// ent�o retorna true ou false para continuar a pesquisa.

		return true;

	}

	public static boolean deletarRule(String param) throws IllegalArgumentException, IllegalAccessException,
			NoSuchFieldException, SecurityException, SQLException {

		// Verifica se os dados do objeto Cliente est�o dentro das regras de neg�cios, e
		// ent�o retorna true ou false para continuar o delete.
		return true;
	}

}
