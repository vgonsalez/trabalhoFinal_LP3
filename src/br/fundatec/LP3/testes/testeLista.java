package br.fundatec.LP3.testes;

import java.util.ArrayList;
import java.util.Scanner;

public class testeLista {

	public static void main(String[] args) {
		Scanner entra;
		ArrayList<String> listaDeLivros = new ArrayList<>();
		int y = 0;
		while(y == 0){
			entra = new Scanner(System.in);
			System.out.println("Digite um livro: ");     
			String livro = entra.nextLine();     
			listaDeLivros.add(livro);
			System.out.print("Deseja informar mais valores? Digite: 0 para Sim / 1 para Não");  
			y = entra.nextInt();
		}
		for (int i = 0; i < listaDeLivros.size(); i++) 
			System.out.println(listaDeLivros.get(i));
	}
}
