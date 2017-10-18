package control.rules;

import java.util.List;

import control.dao.FornecedorDAO;
import model.Fornecedor;

public class FornecedorRules extends FornecedorDAO {

	public static String cadastrarRule(Fornecedor Fornecedor) {
		// Verifica se os dados do objeto Usuario estão dentro das regras de negócios e
		// retorna
		if (FornecedorDAO.cadastrarDao(Fornecedor) > 0) {
			return "Cadastro realizado com sucesso!";

		} else {
			return "Erro no cadastro! verifique as informações digitadas";
		}

	}

	public static String alterarRule(Fornecedor Fornecedor) {

		// Verifica se os dados do objeto Usuario estão dentro das regras de negócios, e
		// então retorna o próprio objeto.
		if (FornecedorDAO.alterarDao(Fornecedor) > 0) {
			return "Alteração Realizado com sucesso!";

		} else {
			return "Erro na alteração! verifique as informações digitadas";
		}
	}

	public static List<Fornecedor> pesquisarRule(Fornecedor Fornecedor, String atributoWhere,
			String stringPequisa) {

		// Verifica se os dados do objeto Usuario estão dentro das regras de negócios, e
		// então retorna true ou false para continuar a pesquisa.

		return FornecedorDAO.pesquisarDao(Fornecedor, atributoWhere, stringPequisa);

	}

	public static String deletarRule(String id) {
		// Verifica se os dados do objeto Usuario estão dentro das regras de negócios, e
		// então retorna true ou false para continuar o delete.
		if (FornecedorDAO.deletarDao(id) > 0) {
			return "id: " + id + " excluido com sucesso!";
		} else {

			return "registro não localizado! tente novamente!";
		}
	}

	public static List<Fornecedor> listarRule(Fornecedor Fornecedor) {
		String table = "Fornecedor";
		// Verifica se os dados do objeto Usuario estão dentro das regras de negócios, e
		// então retorna true ou false para continuar o delete.
		return FornecedorDAO.listarDao(Fornecedor, table);
	}
}