package model;

public class Produto {
	// USE store;
	// CREATE TABLE produto (
	// id INT(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	// nome VARCHAR(100) NOT NULL,
	// unidadeMedida VARCHAR(10) NOT NULL,
	// tipoEmbalagem VARCHAR(10),
	// qtdPorEmbalagem INT,
	// fornecedor VARCHAR(100) NOT NULL,
	// armazem VARCHAR(100) NOT NULL
	// );

	private Integer id, qtdPorEmbalagem;
	private String nome, unidadeMedida, tipoEmbalagem, fornecedor, armazem;

	private Produto(Integer id, String nome, String unidadeMedida, String tipoEmbalagem,
			Integer qtdPorEmbalagem, String fornecedor, String armazem) {
		super();
		this.id = id;
		this.nome = nome;
		this.unidadeMedida = unidadeMedida;
		this.tipoEmbalagem = tipoEmbalagem;
		this.qtdPorEmbalagem = qtdPorEmbalagem;
		this.fornecedor = fornecedor;
		this.armazem = armazem;
	}

	public Produto() {
	}

	public static class ProdutoBuilder {
		private Integer id, qtdPorEmbalagem;
		private String nome, unidadeMedida, tipoEmbalagem, fornecedor,
				armazem;

		public ProdutoBuilder id(Integer id) {
			this.id = id;
			return this;
		}

		public ProdutoBuilder unidadeMedida(String unidadeMedida) {
			this.unidadeMedida = unidadeMedida;
			return this;
		}

		public ProdutoBuilder tipoEmbalagem(String tipoEmbalagem) {
			this.tipoEmbalagem = tipoEmbalagem;
			return this;
		}

		public ProdutoBuilder qtdPorEmbalagem(Integer qtdPorEmbalagem) {
			this.qtdPorEmbalagem = qtdPorEmbalagem;
			return this;
		}

		public ProdutoBuilder fornecedor(String fornecedor) {
			this.fornecedor = fornecedor;
			return this;
		}

		public ProdutoBuilder armazem(String armazem) {
			this.armazem = armazem;
			return this;
		}

		public ProdutoBuilder nome(String nome) {
			this.nome = nome;
			return this;
		}

		public Produto build() {
			return new Produto(id, nome, unidadeMedida, tipoEmbalagem, qtdPorEmbalagem,
					fornecedor, armazem);
		}
	}

	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public String getTipoEmbalagem() {
		return tipoEmbalagem;
	}

	public void setTipoEmbalagem(String tipoEmbalagem) {
		this.tipoEmbalagem = tipoEmbalagem;
	}

	public Integer getQtdPorEmbalagem() {
		return qtdPorEmbalagem;
	}

	public void setQtdPorEmbalagem(Integer qtdPorEmbalagem) {
		this.qtdPorEmbalagem = qtdPorEmbalagem;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getArmazem() {
		return armazem;
	}

	public void setArmazem(String armazem) {
		this.armazem = armazem;
	}

}
