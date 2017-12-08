package br.fundatec.LP3.classesConcretas;

public class Livro{

	private String tituloLivro, isbn;
	private int paginas, anoPublicacao, edicaoNumero;
	private Autor autor;
	private Capitulo capitulo;
	private Editora editora;
	
	public Livro() {
		super();
	}
	public String getTituloLivro() {
		return tituloLivro;
	}
	public void setTituloLivro(String tituloLivro) {
		this.tituloLivro = tituloLivro;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	public int getEdicaoNumero() {
		return edicaoNumero;
	}
	public void setEdicaoNumero(int edicaoNumero) {
		this.edicaoNumero = edicaoNumero;
	}	
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor nomeAutor) {
		this.autor = nomeAutor;
	}
	public Capitulo getCapitulo() {
		return capitulo;
	}
	public void setCapitulo(Capitulo capitulo) {
		this.capitulo = capitulo;
	}
	public Editora getEditora() {
		return editora;
	}
	public void setEditora(Editora editora) {
		this.editora = editora;
	}
}