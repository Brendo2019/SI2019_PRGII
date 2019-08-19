package br.edu.unisep.churrasco.app;

import java.util.Scanner;

import br.edu.unisep.churrasco.Churrasco;

public class ChurrascoApp {
	
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		System.out.println("** Churrasco **");
		
		System.out.println("Informe a quantidade de homens: ");
		var homens = sc.nextInt(); 
		
		System.out.println("Informe a quantidade de mulheres: ");
		var mulheres = sc.nextInt(); 

		System.out.println("Informe a quantidade de crianças: ");
		var criancas = sc.nextInt();
		
		var churras = new Churrasco();
		churras.setHomens(homens);
		churras.setMulheres(mulheres);
		churras.setCriancas(criancas);
		
		var qtdeCarne = churras.calcularQtdeCarne();
		var qtdeCerveja = churras.calcularQtdeCerveja();
		
		System.out.printf("Quantidade de carne: %.1f Kg \n", qtdeCarne);
		System.out.printf("Quantidade de cerveja: %.1f l", qtdeCerveja);
		
		sc.close();
	}
}