package br.edu.unisep;

import java.util.Scanner;

public class ExemploEntrada {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o seu nome: ");
		var nome = sc.nextLine();

		System.out.println("Olá, " + nome);
		
		sc.close();
	}
}
