package br.fundatec.LP3.testes;

import java.util.ArrayList;
import java.util.List;

public class ListaDeLivrosSingleton {
	private static ListaDeLivrosSingleton instance;
	private static List<Livro> livros;
	
	public ListaDeLivrosSingleton(){}

	public static ListaDeLivrosSingleton getInstance(){
		if(instance == null){
			instance = new ListaDeLivrosSingleton();
			livros = new ArrayList<>();
		}
		return instance;
	}

	//set
	public void setLivros(List<Livro> novosLivros){
		ListaDeLivrosSingleton.livros = novosLivros;
	}
	
//	List<testeEstante> listaDeLivros = new ArrayList<testeEstante>();
	//List<testeEstante> livrosNovos = new ArrayList<testeEstante>();


	//get
	public List<Livro> getLivros(){
		return ListaDeLivrosSingleton.livros;	
	}

	//return Array de livros
	//MeuSingletonExemplo.getInstance().setLivros(novaListaDeLivros);

}