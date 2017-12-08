package br.fundatec.LP3.classesFuncionais;

import br.fundatec.LP3.interfaces.IPrintRelatorio;
import br.fundatec.LP3.singleton.ListaDeLivrosSingleton;

public class PrintRelatorio implements IPrintRelatorio{

	@Override
	public void printLivro() {

		ListaDeLivrosSingleton livro = ListaDeLivrosSingleton.getInstance();
		System.out.println("    Nome    |    Autor    |    Editora    ");

		for (int i = 0; i < livro.getLivros().size(); i++) {

			System.out.println("    " + livro.getLivros().get(i).getTituloLivro() 
							+ "      " + livro.getLivros().get(i).getAutor().getNome()
							+ "     " + livro.getLivros().get(i).getEditora().getNomeEditora());
		}

	}
}