package model;

public class Produto {
	private String id,descricao,tipoEmbalagem,qtdEmbalagem,fornecedor,tipoAquisicao,tipoDestinacao;

	private Produto(String id, String descricao, String tipoEmbalagem, String qtdEmbalagem, String fornecedor,
			String tipoAquisicao, String tipoDestinacao) {
		this.id = id;
		this.descricao = descricao;
		this.tipoEmbalagem = tipoEmbalagem;
		this.qtdEmbalagem = qtdEmbalagem;
		this.fornecedor = fornecedor;
		this.tipoAquisicao = tipoAquisicao;
		this.tipoDestinacao = tipoDestinacao;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipoEmbalagem() {
		return tipoEmbalagem;
	}

	public void setTipoEmbalagem(String tipoEmbalagem) {
		this.tipoEmbalagem = tipoEmbalagem;
	}

	public String getQtdEmbalagem() {
		return qtdEmbalagem;
	}

	public void setQtdEmbalagem(String qtdEmbalagem) {
		this.qtdEmbalagem = qtdEmbalagem;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getTipoAquisicao() {
		return tipoAquisicao;
	}

	public void setTipoAquisicao(String tipoAquisicao) {
		this.tipoAquisicao = tipoAquisicao;
	}

	public String getTipoDestinacao() {
		return tipoDestinacao;
	}

	public void setTipoDestinacao(String tipoDestinacao) {
		this.tipoDestinacao = tipoDestinacao;
	}

	
}
