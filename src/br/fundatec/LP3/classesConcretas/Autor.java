package br.fundatec.LP3.classesConcretas;

public class Autor{
	private String nome;
	private String email;
	private String website;
	
	public Autor() {
		super();
	}
	public String getNome() {
		return nome;
	}
	public String setNome(String nome) {
		return this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
}