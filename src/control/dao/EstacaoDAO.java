package control.dao;

import java.sql.SQLException;
import java.util.List;

import model.Cliente;
import model.Estacao;

public class EstacaoDAO implements GenericCRUD {

	static final String table = "estacao";

	public static Integer cadastrarDao(Estacao estacao) {
		return GenericCRUD.insert(estacao, table);
	}

	public static Long alterarDao(Estacao estacao) {
		return GenericCRUD.update(estacao, table);
	}

	public static List<Estacao> pesquisarDao(Estacao estacao, String atributoWhere,
			String stringPequisa) {
		return GenericCRUD.read(estacao, table, atributoWhere, stringPequisa);

	}

	public static Long deletarDao(String param) {
		return GenericCRUD.delete(table, param);
	}

	public static List<Estacao> listarDao(Estacao estacao, String table) {
		return GenericCRUD.readAll(estacao, table);
	}
}
