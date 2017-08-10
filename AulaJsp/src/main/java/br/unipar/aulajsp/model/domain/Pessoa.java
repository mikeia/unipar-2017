package br.unipar.aulajsp.model.domain;

public class Pessoa {
	private String nome;
	private String endereco;
	private String email;
	
	@Override
	public String toString() {
		return "Nome: "+nome+"<br/>"+
			   "Endereço: "+endereco+"<br/>"+
			   "E-mail: "+email;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
