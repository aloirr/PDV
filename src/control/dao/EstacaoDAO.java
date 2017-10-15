package control.dao;

import java.sql.SQLException;
import java.util.List;

import control.dao.GenericCRUD;
import model.Estacao;

public class EstacaoDAO implements GenericCRUD {

	static final String table = "estacao";

	public static  Integer cadastrarDao(Estacao estacao) throws SQLException {
		return GenericCRUD.insert(estacao, table);
	}

	public static  Long alterarDao(Estacao estacao) throws IllegalArgumentException, IllegalAccessException,
			NoSuchFieldException, SecurityException, SQLException {
		return GenericCRUD.update(estacao, table);
	}

	public static  List<Estacao> pesquisarDao(Estacao estacao, String atributoWhere, String stringPequisa) throws SQLException {
		return GenericCRUD.read(estacao, table, atributoWhere, stringPequisa);

	}

	public static  Long deletarDao(String param) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException,
			SecurityException, SQLException {
		return GenericCRUD.delete(table, param);
	}
}
