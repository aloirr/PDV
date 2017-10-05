package model;

public class Cliente {
	
	private String id,razaoSocial,nomeFantasia,endereco,telefone,email,nomeContato,prazo,cpf,cnpj,inscEstadual,inscMunic,inscSuframa;

	private Cliente(String id, String razaoSocial, String nomeFantasia, String endereco, String telefone, String email,
			String nomeContato, String prazo, String cpf, String cnpj, String inscEstadual, String inscMunic,
			String inscSuframa) {
		super();
		this.id = id;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.nomeContato = nomeContato;
		this.prazo = prazo;
		this.cpf = cpf;
		this.cnpj = cnpj;
		this.inscEstadual = inscEstadual;
		this.inscMunic = inscMunic;
		this.inscSuframa = inscSuframa;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomeContato() {
		return nomeContato;
	}

	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}

	public String getPrazo() {
		return prazo;
	}

	public void setPrazo(String prazo) {
		this.prazo = prazo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscEstadual() {
		return inscEstadual;
	}

	public void setInscEstadual(String inscEstadual) {
		this.inscEstadual = inscEstadual;
	}

	public String getInscMunic() {
		return inscMunic;
	}

	public void setInscMunic(String inscMunic) {
		this.inscMunic = inscMunic;
	}

	public String getInscSuframa() {
		return inscSuframa;
	}

	public void setInscSuframa(String inscSuframa) {
		this.inscSuframa = inscSuframa;
	}
	
	

}
