package br.fundatec.LP3.testes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdicionarLivro {
	
	List<testeEstante> listaDeLivros = new ArrayList<testeEstante>();
		
	Scanner entra = new Scanner (System.in);
	
	public void adicionaLivro() {
		
		int opcao = 0;
		
		
		do{
			testeEstante estante = new testeEstante();
		
			System.out.println("Informe o titulo do livro: ");
			String tituloLivro = entra.next();
			estante.printLivro();

			System.out.println("Informe o nome do autor: ");
			String nomeAutor = entra.next();
			estante.chamaAutor();

			System.out.println("informe o titulo do capitulo: ");
			String tituloCap = entra.next();
			estante.chamaCap();

			System.out.println("Informe o nome da editora: ");
			String nomeEditora = entra.next();
			estante.chamaEditora();

			listaDeLivros.add(estante);
			System.out.println("Continuar cadastro? 1 - Sim / 2 - Nao");
			opcao = entra.nextInt();

		}while(opcao == 1 ); 
	}
}