package br.fundatec.LP3.classesConcretas;

public class Editora {
	private String nomeEditora;
	private String email;
	private int telefone;
	private String website;
	
	public Editora() {
		super();
	}
	public String getNomeEditora() {
		return nomeEditora;
	}
	public String setNomeEditora(String nomeEditora) {
		return this.nomeEditora = nomeEditora;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
}