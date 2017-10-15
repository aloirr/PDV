package control.rules;

import java.sql.SQLException;

import control.dao.ProdutoDAO;
import control.dao.UsuarioDAO;
import model.Usuario;

public class UsuarioRules extends UsuarioDAO {
	

	public static  Usuario cadastrarRule(Usuario Usuario) throws SQLException {

		// Verifica se os dados do objeto Usuario est�o dentro das regras de neg�cios, e
		// ent�o retorna o pr�prio objeto.

		return Usuario;
	}

	public static  Usuario alterarRule(Usuario Usuario) throws IllegalArgumentException, IllegalAccessException,
			NoSuchFieldException, SecurityException, SQLException {

		// Verifica se os dados do objeto Usuario est�o dentro das regras de neg�cios, e
		// ent�o retorna o pr�prio objeto.

		return Usuario;
	}

	public static  boolean pesquisarRule(Usuario Usuario, String atributoWhere, String stringPequisa) {

		// Verifica se os dados do objeto Usuario est�o dentro das regras de neg�cios, e
		// ent�o retorna true ou false para continuar a pesquisa.

		return true;

	}

	public static  boolean deletarRule(String param) throws IllegalArgumentException, IllegalAccessException,
			NoSuchFieldException, SecurityException, SQLException {

		// Verifica se os dados do objeto Usuario est�o dentro das regras de neg�cios, e
		// ent�o retorna true ou false para continuar o delete.
		return true;
	}
}
