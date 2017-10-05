package model;

import java.util.ArrayList;
import java.util.List;

public class Usuario  {
	
	private String id,senha,nome,cpf,endereco,telefone;
	private List<String> acessos = new ArrayList<>();
	private Usuario(String id, String senha, String nome, String cpf, String endereco, String telefone,
			List<String> acessos) {
		this.id = id;
		this.senha = senha;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
		this.acessos = acessos;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public List<String> getAcessos() {
		return acessos;
	}
	public void setAcessos(List<String> acessos) {
		this.acessos = acessos;
	}
	
	

}
