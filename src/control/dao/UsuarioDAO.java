package control.dao;

import java.util.List;

import model.Usuario;

public class UsuarioDAO implements GenericCRUD {

	static final String table = "usuario";

	public static Integer cadastrarDao(Usuario usuario) {
		return GenericCRUD.insert(usuario, table);
	}

	public static Long alterarDao(Usuario usuario) {
		return GenericCRUD.update(usuario, table);
	}

	public static List<Usuario> pesquisarDao(Usuario usuario, String atributoWhere,
			String stringPequisa) {
		return GenericCRUD.read(usuario, table, atributoWhere, stringPequisa);

	}

	public static Long deletarDao(String param) {
		return GenericCRUD.delete(table, param);
	}

	public static List<Usuario> listarDao(Usuario usuario, String table) {
		return GenericCRUD.readAll(usuario, table);
	}
}