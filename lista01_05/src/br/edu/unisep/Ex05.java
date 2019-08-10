package br.edu.unisep;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		var sc = new Scanner(System.in);
		
		System.out.println("Informe um ano: ");
		var ano = sc.nextInt();
		
		if (ano % 4 == 0 && (ano % 400 == 0 || ano % 100 != 0)) { 
			System.out.println("Ano bissexto!");
		} else { 
			System.out.println("Não é bissexto!");
		}
		
		sc.close();
	}
	
}
