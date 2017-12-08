package br.fundatec.LP3.testes;

public class testeEstante extends Livro{
	
	//livro
	public String printLivro(){
		Livro printLivro = new Livro();
		String livro = printLivro.getTituloLivro();
		return livro;
	}
	
	//autor
	public String chamaAutor(){
		Autor autor = new Autor();
		String nomeAutor = autor.getNomeAutor();
		return nomeAutor;
	}
	
	//capitulo
	public String chamaCap(){
		Capitulo cap = new Capitulo();
		String nomeCap = cap.getTituloCap();
		return nomeCap;
	}
	
	//editora
	public String chamaEditora(){
		Editora edit = new Editora();
		String nomeEdit = edit.getNomeEditora();
		return nomeEdit;
	}
}