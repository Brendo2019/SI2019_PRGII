package br.edu.unisep;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		var sc = new Scanner(System.in);

		var soma = 0;
		var qtHomens = 0;
		var qtMulheres = 0;
		var maiorIdade = 0;
		var maisVelho = "";

		for (var i = 0; i < 3; i++) {
			System.out.println("Informe o nome: ");
			var nome = sc.nextLine();

			System.out.println("Informe o sexo: ");
			var sexo = sc.nextLine();

			System.out.println("Informe a idade: ");
			var idade = sc.nextInt();

			sc.nextLine();

			soma = soma + idade;

			// Compara a variável com "M", ignorando se é maiúsculo ou minúsculo
			if (sexo.equalsIgnoreCase("M")) {
				qtHomens++;
			} else {
				qtMulheres++;
			}

			if (idade > maiorIdade) {
				maiorIdade = idade;
				maisVelho = nome;
			}
		}

		System.out.println("Qtde de Homens: " + qtHomens);
		System.out.println("Qtde de Mulheres: " + qtMulheres);
		System.out.println("Média de Idade: " + (soma / 3));
		System.out.println("Pessoa Mais Velha: " + maisVelho);

		sc.close();
	}

}
