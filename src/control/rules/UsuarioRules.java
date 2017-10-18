package control.rules;

import java.util.List;

import control.dao.UsuarioDAO;
import model.Usuario;

public class UsuarioRules extends UsuarioDAO {

	public static String cadastrarRule(Usuario Usuario) {
		// Verifica se os dados do objeto Usuario est�o dentro das regras de neg�cios e
		// retorna
		if (UsuarioDAO.cadastrarDao(Usuario) > 0) {
			return "Cadastro realizado com sucesso!";

		} else {
			return "Erro no cadastro! verifique as informa��es digitadas";
		}

	}

	public static String alterarRule(Usuario Usuario) {

		// Verifica se os dados do objeto Usuario est�o dentro das regras de neg�cios, e
		// ent�o retorna o pr�prio objeto.
		if (UsuarioDAO.alterarDao(Usuario) > 0) {
			return "Altera��o Realizado com sucesso!";

		} else {
			return "Erro na altera��o! verifique as informa��es digitadas";
		}
	}

	public static List<Usuario> pesquisarRule(Usuario Usuario, String atributoWhere,
			String stringPequisa) {

		// Verifica se os dados do objeto Usuario est�o dentro das regras de neg�cios, e
		// ent�o retorna true ou false para continuar a pesquisa.

		return UsuarioDAO.pesquisarDao(Usuario, atributoWhere, stringPequisa);

	}

	public static String deletarRule(String id) {
		// Verifica se os dados do objeto Usuario est�o dentro das regras de neg�cios, e
		// ent�o retorna true ou false para continuar o delete.
		if (UsuarioDAO.deletarDao(id) > 0) {
			return "id: " + id + " excluido com sucesso!";
		} else {

			return "registro n�o localizado! tente novamente!";
		}
	}

	public static List<Usuario> listarRule(Usuario Usuario) {
		String table = "usuario";
		// Verifica se os dados do objeto Usuario est�o dentro das regras de neg�cios, e
		// ent�o retorna true ou false para continuar o delete.
		return UsuarioDAO.listarDao(Usuario, table);
	}
}