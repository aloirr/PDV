package control.rules;

import java.util.List;

import control.dao.ArmazemDAO;
import control.dao.ProdutoDAO;
import model.Produto;

public class ProdutoRules extends ProdutoDAO {

	public static String cadastrarRule(Produto produto) {
		// Verifica se os dados do objeto Usuario estão dentro das regras de negócios e
		// retorna
		if (ProdutoDAO.cadastrarDao(produto) > 0) {
			return "Cadastro realizado com sucesso!";

		} else {
			return "Erro no cadastro! verifique as informações digitadas";
		}

	}

	public static String alterarRule(Produto produto) {

		// Verifica se os dados do objeto Usuario estão dentro das regras de negócios, e
		// então retorna o próprio objeto.
		if (ProdutoDAO.alterarDao(produto) > 0) {
			return "Alteração Realizado com sucesso!";

		} else {
			return "Erro na alteração! verifique as informações digitadas";
		}
	}

	public static List<Produto> pesquisarRule(Produto produto, String atributoWhere,
			String stringPequisa) {

		// Verifica se os dados do objeto Usuario estão dentro das regras de negócios, e
		// então retorna true ou false para continuar a pesquisa.

		return ProdutoDAO.pesquisarDao(produto, atributoWhere, stringPequisa);

	}

	public static String deletarRule(String id) {
		// Verifica se os dados do objeto Usuario estão dentro das regras de negócios, e
		// então retorna true ou false para continuar o delete.
		if (ProdutoDAO.deletarDao(id) > 0) {
			return "id: " + id + " excluido com sucesso!";
		} else {

			return "registro não localizado! tente novamente!";
		}
	}

	public static List<Produto> listarRule(Produto produto) {
		String table = "produto";
		// Verifica se os dados do objeto Usuario estão dentro das regras de negócios, e
		// então retorna true ou false para continuar o delete.
		return ProdutoDAO.listarDao(produto, table);
	}

	public static Integer contarRule(String atributoWhere, String stringPequisa) {

		// Verifica se os dados do objeto Usuario estão dentro das regras de negócios, e
		// então retorna true ou false para continuar a pesquisa.

		return ProdutoDAO.contarDao(atributoWhere, stringPequisa);

	}

	public static Integer contarRule() {

		// Verifica se os dados do objeto Usuario estão dentro das regras de negócios, e
		// então retorna true ou false para continuar a pesquisa.

		return ProdutoDAO.contarDao();

	}

}