package br.fundatec.LP3.classesFuncionais;

import java.util.Scanner;

import br.fundatec.LP3.interfaces.IRemoverLivro;
import br.fundatec.LP3.singleton.ListaDeLivrosSingleton;

public class RemoverLivro implements IRemoverLivro{

	Scanner entra = new Scanner(System.in);

	@Override
	public void deletaLivro() {
		boolean pesquisa = false;
		ListaDeLivrosSingleton delLivro = ListaDeLivrosSingleton.getInstance();

		System.out.println("Informe o livro a ser excluido: ");
		String nomeLivro = entra.next();

		for (int i = 0; i < delLivro.getLivros().size(); i++) {
			if (delLivro.getLivros().get(i).getTituloLivro().equals(nomeLivro)){
				System.out.println("O livro " + nomeLivro + " foi excluido.");
				delLivro.getLivros().remove(i);
				pesquisa = true; 
				break;
			}
		}
		if (pesquisa == false) {
			System.out.println("O livro " + nomeLivro + " nao existe na lista.");			
		}
	}
}