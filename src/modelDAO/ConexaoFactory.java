package modelDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
	private String host, url, usuario, senha, dbType, dbName;
	private Connection conn;

	private ConexaoFactory(String host, String usuario, String senha, String dbType, String dbName) {
		this.host = host;
		this.usuario = usuario;
		this.senha = senha;
		this.dbType = dbType;
		this.dbName = dbName;
	}

	public ConexaoFactory() {

	}

	public Connection getConexao(ConexaoFactory conFactory) {
		try {
			url = "jdbc:" + conFactory.dbType + "://" + conFactory.host + "/" + conFactory.dbName;
			this.conn = DriverManager.getConnection(url, conFactory.usuario, conFactory.senha);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return this.conn;
	}
	
	public static class ConexaoFactoryBuilder {
		private String host, usuario, senha, dbType, dbName;

		public ConexaoFactoryBuilder() {
		}

		public ConexaoFactoryBuilder host(String host) {
			this.host = host;
			return this;
		}

		public ConexaoFactoryBuilder usuario(String usuario) {
			this.usuario = usuario;
			return this;
		}

		public ConexaoFactoryBuilder senha(String senha) {
			this.senha = senha;
			return this;
		}

		public ConexaoFactoryBuilder tipoDb(String dbType) {
			this.dbType = dbType;
			return this;
		}

		public ConexaoFactoryBuilder nomeDb(String dbName) {
			this.dbName = dbName;
			return this;
		}

		public ConexaoFactory build() {
			return new ConexaoFactory(host, usuario, senha, dbType, dbName);
		}
	}


	public void setConn(Connection conn) {
		this.conn = conn;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getDbType() {
		return dbType;
	}

	public void setDbType(String dbType) {
		this.dbType = dbType;
	}

}
