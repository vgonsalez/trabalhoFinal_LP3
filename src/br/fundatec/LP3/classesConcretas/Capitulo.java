package br.fundatec.LP3.classesConcretas;

public class Capitulo {
	private String cap;
	private int paginaInicial;
	private int paginaFinal;
	private int numeroCapitulo;
		
	public Capitulo() {
		super();
	}
	public String getCap() {
		return cap;
	}
	public String setCap(String cap) {
		return this.cap = cap;
	}
	public int getPaginaInicial() {
		return paginaInicial;
	}
	public void setPaginaInicial(int paginaInicial) {
		this.paginaInicial = paginaInicial;
	}
	public int getPaginaFinal() {
		return paginaFinal;
	}
	public void setPaginaFinal(int paginaFinal) {
		this.paginaFinal = paginaFinal;
	}
	public int getNumeroCapitulo() {
		return numeroCapitulo;
	}
	public void setNumeroCapitulo(int numeroCapitulo) {
		this.numeroCapitulo = numeroCapitulo;
	}
}