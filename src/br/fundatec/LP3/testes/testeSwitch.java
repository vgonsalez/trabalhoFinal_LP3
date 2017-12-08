package br.fundatec.LP3.testes;

import java.util.Scanner;

public class testeSwitch {

	public static void main(String[] args) {
		//Estante estante = new Estante();
		Scanner entrada = new Scanner (System.in);
		int op;
		op = entrada.nextInt();
		if(op != 0){
			//Executar opcao 
			switch(op){
			case 1:
				//adiciona livro
				//estante.adicionarLivro();
				System.out.println("opcao 1");
				break;

			case 2:
				//remove livro
				//estante.removerLivro();
				System.out.println("opcao 2");
				break;

			case 3:
				//imprime relatorio
				//estante.mostraLista();
				System.out.println("opcao 3");
				System.out.println("Relatorio: ");
				break;

			default:
				System.out.println("opcao invalida!");
				break;
			}
			entrada.close();

		}

	}
}