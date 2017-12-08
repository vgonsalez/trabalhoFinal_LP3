package br.fundatec.LP3.testes;

import java.util.Scanner;

import org.junit.Test;

public class testeMain {

	@Test
	public void test() {

		ListaDeLivrosSingleton listSing = new ListaDeLivrosSingleton();
		Scanner entra = new Scanner (System.in);
		int op;
		op = entra.nextInt();

		do{
			System.out.println("Digite: \n1 - adicionar livro\n"
					+ "2 - deletar livro\n"
					+ "3 - imprimir relatorio\n"
					+ "0 - sair do sistema");
			
			//Executar opcao 
			switch(op){
			case 1:
				//adiciona livro
				AdicionarLivro adiciona = new AdicionarLivro();
				adiciona.adicionaLivro();
				break;
				
			case 2:
				//remove livro
				RemoverLivro remove = new RemoverLivro();
				remove.deletaLivro();
				break;

			case 3:
				//imprime relatorio
				Relatorio print = new Relatorio();
				print.print();
				break;

			case 0:
				System.out.println("Voce saiu do sistema. Ate mais!");
				break;
			}
			
		}while(op != 0);
		entra.close();
	}
}