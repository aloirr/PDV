package control.rules;

import java.util.List;

import control.dao.FornecedorDAO;
import model.Fornecedor;

public class FornecedorRules extends FornecedorDAO {

	public static String cadastrarRule(Fornecedor Fornecedor) {
		// Verifica se os dados do objeto Usuario est�o dentro das regras de neg�cios e
		// retorna
		if (FornecedorDAO.cadastrarDao(Fornecedor) > 0) {
			return "Cadastro realizado com sucesso!";

		} else {
			return "Erro no cadastro! verifique as informa��es digitadas";
		}

	}

	public static String alterarRule(Fornecedor Fornecedor) {

		// Verifica se os dados do objeto Usuario est�o dentro das regras de neg�cios, e
		// ent�o retorna o pr�prio objeto.
		if (FornecedorDAO.alterarDao(Fornecedor) > 0) {
			return "Altera��o Realizado com sucesso!";

		} else {
			return "Erro na altera��o! verifique as informa��es digitadas";
		}
	}

	public static List<Fornecedor> pesquisarRule(Fornecedor Fornecedor, String atributoWhere,
			String stringPequisa) {

		// Verifica se os dados do objeto Usuario est�o dentro das regras de neg�cios, e
		// ent�o retorna true ou false para continuar a pesquisa.

		return FornecedorDAO.pesquisarDao(Fornecedor, atributoWhere, stringPequisa);

	}

	public static String deletarRule(String id) {
		// Verifica se os dados do objeto Usuario est�o dentro das regras de neg�cios, e
		// ent�o retorna true ou false para continuar o delete.
		if (FornecedorDAO.deletarDao(id) > 0) {
			return "id: " + id + " excluido com sucesso!";
		} else {

			return "registro n�o localizado! tente novamente!";
		}
	}

	public static List<Fornecedor> listarRule(Fornecedor Fornecedor) {
		String table = "Fornecedor";
		// Verifica se os dados do objeto Usuario est�o dentro das regras de neg�cios, e
		// ent�o retorna true ou false para continuar o delete.
		return FornecedorDAO.listarDao(Fornecedor, table);
	}
}