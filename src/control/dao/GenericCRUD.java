package control.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import control.dao.util.IgeradorSqlUpdate;
import control.dao.util.IpegaAtributosObjetos;
import control.dao.util.IretornaConsulta;
import control.dao.util.IretornaValoresAtributosObj;

public interface GenericCRUD extends GenericDAO, IpegaAtributosObjetos, IretornaValoresAtributosObj,
		IretornaConsulta, IgeradorSqlUpdate {

	public static <T> Integer insert(T t, String table) throws SQLException {
		String sqlInsert = "INSERT INTO " + table + " (" + IpegaAtributosObjetos.String(t, "id")
				+ ") VALUES(" + IretornaValoresAtributosObj.retornaGet(t, "id") + ")";
		int psKey = Statement.RETURN_GENERATED_KEYS;
		PreparedStatement ps = GenericDAO.ps(sqlInsert, psKey);
		int count = ps.executeUpdate();
		System.out.println(count + "registros inserido(s) com sucesso!");
		GenericDAO.closeConn(ps);
		return count;
	}

	static public <T> List<T> read(T t, String table, String atributoWhere, String string)
			throws SQLException {
		String sqlread = "SELECT " + IpegaAtributosObjetos.String(t) + " FROM " + table + " WHERE "
				+ atributoWhere + " LIKE '%" + string + "%'";
		PreparedStatement ps = GenericDAO.ps(sqlread);
		ResultSet rs = ps.executeQuery();
		List<T> retornoConsulta = IretornaConsulta.retornaConsulta(rs, t);
		GenericDAO.closeConn(ps, rs);
		return retornoConsulta;
	}

	static public <T> List<T> readAll(T t, String table) throws SQLException {
		String sqlread = "SELECT * FROM " + table;
		PreparedStatement ps = GenericDAO.ps(sqlread);
		ResultSet rs = ps.executeQuery();
		List<T> retornoConsulta = IretornaConsulta.retornaConsulta(rs, t);
		GenericDAO.closeConn(ps, rs);
		return retornoConsulta;
	}

	static public <T> Long update(T t, String table) throws SQLException, IllegalArgumentException,
			IllegalAccessException, NoSuchFieldException, SecurityException {

		String sqlupdate = IgeradorSqlUpdate.sqlUpdate(t, table);
		PreparedStatement ps = GenericDAO.ps(sqlupdate);
		long count = ps.executeLargeUpdate();
		System.out.println(count + "registros atualizado(s) com sucesso!");
		GenericDAO.closeConn(ps);
		return count;
	}

	static public Long delete(String tabela, String id)
			throws SQLException, IllegalArgumentException, IllegalAccessException,
			NoSuchFieldException, SecurityException {
		String sqldelete = "DELETE FROM " + tabela + " WHERE id=" + id;
		PreparedStatement ps = GenericDAO.ps(sqldelete);
		Long count = ps.executeLargeUpdate();
		GenericDAO.closeConn(ps);
		return count;
	}
}