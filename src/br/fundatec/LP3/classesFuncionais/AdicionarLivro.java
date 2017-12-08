package br.fundatec.LP3.classesFuncionais;

import java.util.Scanner;

import br.fundatec.LP3.classesConcretas.Autor;
import br.fundatec.LP3.classesConcretas.Capitulo;
import br.fundatec.LP3.classesConcretas.Editora;
import br.fundatec.LP3.classesConcretas.Livro;
import br.fundatec.LP3.interfaces.IAdicionarLivros;
import br.fundatec.LP3.singleton.ListaDeLivrosSingleton;

public class AdicionarLivro implements IAdicionarLivros {
	//SRP
	Scanner entra = new Scanner(System.in);
	int opcao = 0;
	
	@Override
	public void incluindoLivro() {

		do{
			Livro livro = new Livro();
			System.out.print("Informe o titulo do livro: ");
			livro.setTituloLivro(entra.next());
			System.out.print("Informe o isbn do livro: ");
			livro.setIsbn(entra.next());
			System.out.print("Informe o numero total de páginas: ");
			livro.setPaginas(entra.nextInt());
			System.out.print("Informe o ano de publicação: ");
			livro.setAnoPublicacao(entra.nextInt());
			System.out.print("Informe o numero da edicao: ");
			livro.setEdicaoNumero(entra.nextInt());
			System.out.print("\n");

			Autor autor = new Autor();
			System.out.print("Informe o nome do autor: ");
			autor.setNome(entra.next());
			System.out.print("Informe o e-mail do autor: ");
			autor.setEmail(entra.next());
			System.out.print("Informe o website do autor: ");
			autor.setWebsite(entra.next());
			System.out.print("\n");

			Capitulo cap = new Capitulo();
			System.out.print("informe o titulo do capitulo: ");
			cap.setCap(entra.next());
			System.out.print("Informe o numero do capitulo: ");
			cap.setNumeroCapitulo(entra.nextInt());
			System.out.print("Informe a pagina inicial do capitulo: ");
			cap.setPaginaInicial(entra.nextInt());
			System.out.print("Informe a pagina final do capitulo: ");
			cap.setPaginaFinal(entra.nextInt());
			System.out.print("\n");

			Editora edit = new Editora();
			System.out.print("Informe o nome da editora: ");
			edit.setNomeEditora(entra.next());
			System.out.print("Informe o telefone da editora: ");
			edit.setTelefone(entra.nextInt());
			System.out.print("Informe o e-mail da editora: ");
			edit.setEmail(entra.next());
			System.out.println("Informe o website da editora: ");
			edit.setWebsite(entra.next());


			// chegou ate aqui com as classes Feitas Capitulo, Autor, Editora

			livro.setCapitulo(cap);
			livro.setAutor(autor);
			livro.setEditora(edit);


			ListaDeLivrosSingleton.getInstance().getLivros().add(livro);
			System.out.print("Continuar cadastro? 1 - Sim / 2 - Nao ");
			opcao = entra.nextInt();

		}while(opcao != 2);
	}
}