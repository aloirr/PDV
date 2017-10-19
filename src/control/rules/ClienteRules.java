package control.rules;

import java.util.List;

import control.dao.ArmazemDAO;
import control.dao.ClienteDAO;
import model.Cliente;

public class ClienteRules extends ClienteDAO {

	public static String cadastrarRule(Cliente cliente) {
		// Verifica se os dados do objeto Usuario est�o dentro das regras de neg�cios e
		// retorna
		if (ClienteDAO.cadastrarDao(cliente) > 0) {
			return "Cadastro realizado com sucesso!";

		} else {
			return "Erro no cadastro! verifique as informa��es digitadas";
		}

	}

	public static String alterarRule(Cliente cliente) {

		// Verifica se os dados do objeto Usuario est�o dentro das regras de neg�cios, e
		// ent�o retorna o pr�prio objeto.
		if (ClienteDAO.alterarDao(cliente) > 0) {
			return "Altera��o Realizado com sucesso!";

		} else {
			return "Erro na altera��o! verifique as informa��es digitadas";
		}
	}

	public static List<Cliente> pesquisarRule(Cliente cliente, String atributoWhere,
			String stringPequisa) {

		// Verifica se os dados do objeto Usuario est�o dentro das regras de neg�cios, e
		// ent�o retorna true ou false para continuar a pesquisa.

		return ClienteDAO.pesquisarDao(cliente, atributoWhere, stringPequisa);

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

	public static List<Cliente> listarRule(Cliente cliente) {
		String table = "cliente";
		// Verifica se os dados do objeto Usuario est�o dentro das regras de neg�cios, e
		// ent�o retorna true ou false para continuar o delete.
		return ClienteDAO.listarDao(cliente, table);
	}

	public static Integer contarRule(String atributoWhere, String stringPequisa) {

		// Verifica se os dados do objeto Usuario est�o dentro das regras de neg�cios, e
		// ent�o retorna true ou false para continuar a pesquisa.

		return ClienteDAO.contarDao(atributoWhere, stringPequisa);

	}

	public static Integer contarRule() {

		// Verifica se os dados do objeto Usuario est�o dentro das regras de neg�cios, e
		// ent�o retorna true ou false para continuar a pesquisa.

		return ClienteDAO.contarDao();

	}

}