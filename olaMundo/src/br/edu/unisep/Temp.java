package br.edu.unisep;

public class Temp {

	public static void main(String[] args) {
		
		var x = 5; // x é do tipo int
		var valor = 10.54343; // valor é do tipo double

		var total = 10; // total é do tipo int

		/* Aqui, a variável valor é convertida para int
		   para que o resultado da multiplicação seja int */
		total = total * (int) valor;
		
		
		var total2 = 10d; // a letra 'd' apos o valor indica que total2 será double
		total2 = total2 * valor;
		
		double total3 = 10;
		total3 = total3 * valor;
		
		//total3 = (int) total3;
		
		System.out.println(total3);
		System.out.printf("%.1f \n", total3);
	}
	
}
