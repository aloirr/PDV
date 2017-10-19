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

	public static <T> Integer insert(T t, String table) {
		String sqlInsert = "INSERT INTO " + table + " (" + IpegaAtributosObjetos.String(t, "id")
				+ ") VALUES(" + IretornaValoresAtributosObj.retornaGet(t, "id") + ")";
		int psKey = Statement.RETURN_GENERATED_KEYS;
		PreparedStatement ps = GenericDAO.ps(sqlInsert, psKey);
		int count = 0;
		try {
			count = ps.executeUpdate();
			System.out.println(count + "registros inserido(s) com sucesso!");
			GenericDAO.closeConn(ps);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getSQLState();
		}

		return count;
	}

	static public <T> List<T> read(T t, String table, String atributoWhere, String string) {
		String sqlread = "SELECT " + IpegaAtributosObjetos.String(t) + " FROM " + table + " WHERE "
				+ atributoWhere + " LIKE '%" + string + "%'";
		PreparedStatement ps = GenericDAO.ps(sqlread);
		ResultSet rs;
		try {
			rs = ps.executeQuery();
			List<T> retornoConsulta = IretornaConsulta.retornaConsulta(rs, t);
			GenericDAO.closeConn(ps, rs);
			return retornoConsulta;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	static public <T> List<T> readAll(T t, String table) {
		String sqlread = "SELECT * FROM " + table;
		PreparedStatement ps = GenericDAO.ps(sqlread);
		ResultSet rs;
		try {
			rs = ps.executeQuery();
			List<T> retornoConsulta = IretornaConsulta.retornaConsulta(rs, t);
			GenericDAO.closeConn(ps, rs);
			return retornoConsulta;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	static public <T> Long update(T t, String table) {
		String sqlupdate = IgeradorSqlUpdate.sqlUpdate(t, table);
		PreparedStatement ps = GenericDAO.ps(sqlupdate);
		long count;
		try {
			count = ps.executeLargeUpdate();
			System.out.println(count + "registro(s) atualizado(s) com sucesso!");
			GenericDAO.closeConn(ps);
			return count;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	static public Long delete(String tabela, String id) {
		String sqldelete = "DELETE FROM " + tabela + " WHERE id=" + id;
		PreparedStatement ps = GenericDAO.ps(sqldelete);
		Long count;
		try {
			count = ps.executeLargeUpdate();
			GenericDAO.closeConn(ps);
			return count;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	static public Integer count(String table) {
		String sqlread = "SELECT COUNT(*) FROM " + table;
		PreparedStatement ps = GenericDAO.ps(sqlread);
		ResultSet rs;
		try {
			rs = ps.executeQuery();
			Integer count = rs.getInt("count(*)");
			GenericDAO.closeConn(ps, rs);
			return count;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	static public <T> Integer count(String table, String atributoWhere, String string) {
		String sqlread = "SELECT COUNT(*) FROM " + table + " WHERE " + atributoWhere + " LIKE '%"
				+ string + "%'";
		PreparedStatement ps = GenericDAO.ps(sqlread);
		ResultSet rs;
		try {
			rs = ps.executeQuery();
			rs.next();
			Integer count = rs.getInt("count(*)");
			GenericDAO.closeConn(ps, rs);
			return count;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

}