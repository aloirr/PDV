package control.rules;

import java.util.List;

import control.dao.EstacaoDAO;
import model.Estacao;

public class EstacaoRules extends EstacaoDAO {

	public static String cadastrarRule(Estacao Estacao) {
		// Verifica se os dados do objeto Usuario estão dentro das regras de negócios e
		// retorna
		if (EstacaoDAO.cadastrarDao(Estacao) > 0) {
			return "Cadastro realizado com sucesso!";

		} else {
			return "Erro no cadastro! verifique as informações digitadas";
		}

	}

	public static String alterarRule(Estacao Estacao) {

		// Verifica se os dados do objeto Usuario estão dentro das regras de negócios, e
		// então retorna o próprio objeto.
		if (EstacaoDAO.alterarDao(Estacao) > 0) {
			return "Alteração Realizado com sucesso!";

		} else {
			return "Erro na alteração! verifique as informações digitadas";
		}
	}

	public static List<Estacao> pesquisarRule(Estacao Estacao, String atributoWhere,
			String stringPequisa) {

		// Verifica se os dados do objeto Usuario estão dentro das regras de negócios, e
		// então retorna true ou false para continuar a pesquisa.

		return EstacaoDAO.pesquisarDao(Estacao, atributoWhere, stringPequisa);

	}

	public static String deletarRule(String id) {
		// Verifica se os dados do objeto Usuario estão dentro das regras de negócios, e
		// então retorna true ou false para continuar o delete.
		if (EstacaoDAO.deletarDao(id) > 0) {
			return "id: " + id + " excluido com sucesso!";
		} else {

			return "registro não localizado! tente novamente!";
		}
	}

	public static List<Estacao> listarRule(Estacao Estacao) {
		String table = "Estacao";
		// Verifica se os dados do objeto Usuario estão dentro das regras de negócios, e
		// então retorna true ou false para continuar o delete.
		return EstacaoDAO.listarDao(Estacao, table);
	}
}