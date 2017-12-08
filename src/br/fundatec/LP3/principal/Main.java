package br.fundatec.LP3.principal;

import java.util.Scanner;

import br.fundatec.LP3.classesFuncionais.AdicionarLivro;
import br.fundatec.LP3.classesFuncionais.PrintRelatorio;
import br.fundatec.LP3.classesFuncionais.RemoverLivro;

public class Main {

	public static void main(String[] args) {
		
		Scanner entra = new Scanner (System.in); //tem uma instancia nova a cada vez
		
		int op = 0;

		do{
			System.out.println("Digite:\n"
					+ "1 - adicionar livro\n"
					+ "2 - deletar livro\n"
					+ "3 - imprimir relatorio\n"
					+ "0 - sair do sistema");

			op = entra.nextInt();
			
			//Executar opcao 
			switch(op){
			case 1:
				//adiciona livro
				AdicionarLivro adicLivro = new AdicionarLivro();
				adicLivro.incluindoLivro();
				//adicLivro.adicionaLivro(tituloLivro, nomeAutor, nomeCapitulo, nomeEditora);
				break;
				
			case 2:
				//remove livro
				RemoverLivro delLivro = new RemoverLivro();
				delLivro.deletaLivro();
				break;
				
			case 3:
				//imprime relatorio
				PrintRelatorio print = new PrintRelatorio();
				print.printLivro();
				break;

			case 0:
				System.out.println("Voce saiu do sistema. Ate mais!");
				break;
			}
			
		}while(op != 0);
		entra.close();
	}
}