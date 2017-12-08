package br.fundatec.LP3.testes;

public class Relatorio {
	ListaDeLivrosSingleton listaDoRelatorio = ListaDeLivrosSingleton.getInstance();

	public void print(){
		for(int i = 0 ; i < listaDoRelatorio.getLivros().size(); i++){
			System.out.println(listaDoRelatorio.getLivros().get(i).getTituloLivro());
		}
	}
}