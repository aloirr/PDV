package control.rules;

import java.util.List;

import control.dao.ClienteDAO;
import model.Cliente;

public class ClienteRules extends ClienteDAO {

	public static String cadastrarRule(Cliente Cliente) {
		// Verifica se os dados do objeto Usuario est�o dentro das regras de neg�cios e
		// retorna
		if (ClienteDAO.cadastrarDao(Cliente) > 0) {
			return "Cadastro realizado com sucesso!";

		} else {
			return "Erro no cadastro! verifique as informa��es digitadas";
		}

	}

	public static String alterarRule(Cliente Cliente) {

		// Verifica se os dados do objeto Usuario est�o dentro das regras de neg�cios, e
		// ent�o retorna o pr�prio objeto.
		if (ClienteDAO.alterarDao(Cliente) > 0) {
			return "Altera��o Realizado com sucesso!";

		} else {
			return "Erro na altera��o! verifique as informa��es digitadas";
		}
	}

	public static List<Cliente> pesquisarRule(Cliente Cliente, String atributoWhere,
			String stringPequisa) {

		// Verifica se os dados do objeto Usuario est�o dentro das regras de neg�cios, e
		// ent�o retorna true ou false para continuar a pesquisa.

		return ClienteDAO.pesquisarDao(Cliente, atributoWhere, stringPequisa);

	}

	public static String deletarRule(String id) {
		// Verifica se os dados do objeto Usuario est�o dentro das regras de neg�cios, e
		// ent�o retorna true ou false para continuar o delete.
		if (ClienteDAO.deletarDao(id) > 0) {
			return "id: " + id + " excluido com sucesso!";
		} else {

			return "registro n�o localizado! tente novamente!";
		}
	}

	public static List<Cliente> listarRule(Cliente Cliente) {
		String table = "cliente";
		// Verifica se os dados do objeto Usuario est�o dentro das regras de neg�cios, e
		// ent�o retorna true ou false para continuar o delete.
		return ClienteDAO.listarDao(Cliente, table);
	}
}