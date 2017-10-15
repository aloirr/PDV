package control.dao;

import java.sql.SQLException;
import java.util.List;

import model.Usuario;

public class UsuarioDAO implements GenericCRUD {

	static final String table = "usuario";

	public static Integer cadastrarUsuarioDao(Usuario usuario) throws SQLException {
		return GenericCRUD.insert(usuario, table);
	}

	public static Long alterarUsuarioDao(Usuario usuario) throws IllegalArgumentException, IllegalAccessException,
			NoSuchFieldException, SecurityException, SQLException {
		return GenericCRUD.update(usuario, table);
	}

	public static List<Usuario> pesquisarUsuarioDao(Usuario usuario, String atributoWhere, String stringPequisa)
			throws SQLException {
		return GenericCRUD.read(usuario, table, atributoWhere, stringPequisa);

	}

	public static Long deletarUsuarioDao(String param) throws IllegalArgumentException, IllegalAccessException,
			NoSuchFieldException, SecurityException, SQLException {
		return GenericCRUD.delete(table, param);
	}
}