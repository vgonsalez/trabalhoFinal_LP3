package br.fundatec.LP3.singleton;

import java.util.ArrayList;
import java.util.List;

import br.fundatec.LP3.classesConcretas.Livro;

public class ListaDeLivrosSingleton {
	
	
	private static ListaDeLivrosSingleton instance;
	private static List<Livro> livros;
	
	private ListaDeLivrosSingleton(){}

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

	//get
	public List<Livro> getLivros(){
		return ListaDeLivrosSingleton.livros;	
	}

	//return Array de livros
	//MeuSingletonExemplo.getInstance().setLivros(novaListaDeLivros);

}