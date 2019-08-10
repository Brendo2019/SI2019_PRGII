package br.edu.unisep;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro: ");
		var x = sc.nextInt();

		var quad = x * x;
		var dobro = x * 2;
		
		var dif = quad - dobro;
		
		System.out.println("A diferença entre o quadrado e o dobro é " + dif);
		
		sc.close();
	}
	
}
