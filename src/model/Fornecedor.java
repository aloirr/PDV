package model;

public class Fornecedor {
	private int id;
	private String razaoSocial, nomeFantasia, endereco, telefone, nomeContato, email, prazo, representante;

	private Fornecedor(int id, String razaoSocial, String nomeFantasia, String endereco, String telefone,
			String nomeContato, String email, String prazo, String representante) {
		super();
		this.id = id;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.endereco = endereco;
		this.telefone = telefone;
		this.nomeContato = nomeContato;
		this.email = email;
		this.prazo = prazo;
		this.representante = representante;
	}

	public Fornecedor() {
	};

	public static class FornecedorBuilder {
		private int id;
		private String razaoSocial, nomeFantasia, endereco, telefone, nomeContato, email, prazo, representante;

		public FornecedorBuilder id(int id) {
			this.id = id;
			return this;
		}

		public FornecedorBuilder razaoSocial(String razaoSocial) {
			this.razaoSocial = razaoSocial;
			return this;
		}

		public FornecedorBuilder nomeFantasia(String nomeFantasia) {
			this.nomeFantasia = nomeFantasia;
			return this;
		}

		public FornecedorBuilder endereco(String endereco) {
			this.endereco = endereco;
			return this;
		}

		public FornecedorBuilder telefone(String telefone) {
			this.telefone = telefone;
			return this;
		}

		public FornecedorBuilder nomeContato(String nomeContato) {
			this.nomeContato = nomeContato;
			return this;
		}

		public FornecedorBuilder email(String email) {
			this.email = email;
			return this;
		}

		public FornecedorBuilder prazo(String prazo) {
			this.prazo = prazo;
			return this;
		}

		public FornecedorBuilder representante(String representante) {
			this.representante = representante;
			return this;
		}

		public Fornecedor build() {
			return new Fornecedor(id, razaoSocial, nomeFantasia, endereco, telefone, nomeContato, email, prazo,
					representante);
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
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

	public String getNomeContato() {
		return nomeContato;
	}

	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPrazo() {
		return prazo;
	}

	public void setPrazo(String prazo) {
		this.prazo = prazo;
	}

	public String getRepresentante() {
		return representante;
	}

	public void setRepresentante(String representante) {
		this.representante = representante;
	}

}
