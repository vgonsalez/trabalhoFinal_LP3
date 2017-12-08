package br.fundatec.LP3.testes;

import java.util.Scanner;

public class RemoverLivro {
	ListaDeLivrosSingleton delLivro = ListaDeLivrosSingleton.getInstance();
	Scanner entra = new Scanner(System.in);
	String tituloLivro;
	boolean pesquisa;
	
	public void deletaLivro(){ 
		System.out.println("Informe o livro a ser excluido: \n");
		tituloLivro = entra.next();

		for (int i = 0; i < delLivro.getLivros().size(); i++) {
			if (delLivro.getLivros().get(i).getTituloLivro() == tituloLivro){
				delLivro.getLivros().remove(i);
				System.out.println("O livro " + tituloLivro + " foi excluido.");
				pesquisa = true; 
				break;
			}
		}
		if (pesquisa == false) {
			System.out.println("O livro " + tituloLivro + " nao existe na lista.");			
		}
	}
}