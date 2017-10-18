package model;

public class Usuario {
	private Integer id;
	private String login, senha, nome, cpf, endereco, telefone;

	private Usuario(Integer id, String login, String senha, String nome, String cpf,
			String endereco, String telefone) {
		this.login = login;
		this.id = id;
		this.senha = senha;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public Usuario() {
	}

	public static class UsuarioBuilder {
		private Integer id;
		private String login, senha, nome, cpf, endereco, telefone;

		public UsuarioBuilder id(Integer id) {
			this.id = id;
			return this;
		}

		public UsuarioBuilder login(String login) {
			this.login = login;
			return this;
		}

		public UsuarioBuilder senha(String senha) {
			this.senha = senha;
			return this;
		}

		public UsuarioBuilder cpf(String cpf) {
			this.cpf = cpf;
			return this;
		}

		public UsuarioBuilder endereco(String endereco) {
			this.endereco = endereco;
			return this;
		}

		public UsuarioBuilder telefone(String telefone) {
			this.telefone = telefone;
			return this;
		}

		public UsuarioBuilder nome(String nome) {
			this.nome = nome;
			return this;
		}

		public Usuario build() {
			return new Usuario(id, login, senha, nome, cpf, endereco, telefone);
		}
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

}
