package br.edu.unisep.churrasco.app;

import java.util.Scanner;

import br.edu.unisep.churrasco.Churrasco;

public class ChurrascoApp2 {

	private Scanner sc = new Scanner(System.in);
	private Churrasco churras = new Churrasco();
	
	private void receberEntrada() {
		System.out.println("** Churrasco **");
		
		System.out.println("Informe a quantidade de homens: ");
		churras.setHomens(sc.nextInt()); 
		
		System.out.println("Informe a quantidade de mulheres: ");
		churras.setMulheres(sc.nextInt()); 

		System.out.println("Informe a quantidade de crianças: ");
		churras.setCriancas(sc.nextInt());
	}
	
	private void tratarSaida() {
		var qtdeCarne = churras.calcularQtdeCarne();
		var qtdeCerveja = churras.calcularQtdeCerveja();
		
		System.out.printf("Quantidade de carne: %.1f Kg \n", qtdeCarne);
		System.out.printf("Quantidade de cerveja: %.1f l", qtdeCerveja);
	}
	
	public void executar() {
		receberEntrada();
		tratarSaida();
	}

}
