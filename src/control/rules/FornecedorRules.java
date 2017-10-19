package control.rules;

import java.util.List;

import control.dao.ArmazemDAO;
import control.dao.FornecedorDAO;
import model.Fornecedor;

public class FornecedorRules extends FornecedorDAO {

	public static String cadastrarRule(Fornecedor fornecedor) {
		// Verifica se os dados do objeto Usuario estão dentro das regras de negócios e
		// retorna
		if (FornecedorDAO.cadastrarDao(fornecedor) > 0) {
			return "Cadastro realizado com sucesso!";

		} else {
			return "Erro no cadastro! verifique as informações digitadas";
		}

	}

	public static String alterarRule(Fornecedor fornecedor) {

		// Verifica se os dados do objeto Usuario estão dentro das regras de negócios, e
		// então retorna o próprio objeto.
		if (FornecedorDAO.alterarDao(fornecedor) > 0) {
			return "Alteração Realizado com sucesso!";

		} else {f
			return "Erro na alteração! verifique as informações digitadas";
		}
	}

	public static List<Fornecedor> pesquisarRule(Fornecedor fornecedor, String atributoWhere,
			String stringPequisa) {

		// Verifica se os dados do objeto Usuario estão dentro das regras de negócios, e
		// então retorna true ou false para continuar a pesquisa.

		return FornecedorDAO.pesquisarDao(fornecedor, atributoWhere, stringPequisa);

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

	public static List<Fornecedor> listarRule(Fornecedor fornecedor) {
		String table = "fornecedor";
		// Verifica se os dados do objeto Usuario estão dentro das regras de negócios, e
		// então retorna true ou false para continuar o delete.
		return FornecedorDAO.listarDao(fornecedor, table);
	}

	public static Integer contarRule(String atributoWhere, String stringPequisa) {

		// Verifica se os dados do objeto Usuario estão dentro das regras de negócios, e
		// então retorna true ou false para continuar a pesquisa.

		return FornecedorDAO.contarDao(atributoWhere, stringPequisa);

	}

	public static Integer contarRule() {

		// Verifica se os dados do objeto Usuario estão dentro das regras de negócios, e
		// então retorna true ou false para continuar a pesquisa.

		return FornecedorDAO.contarDao();

	}

}