package br.edu.unisep;

public class OlaMundo {

	public static void main(String[] args) {
		System.out.println("Olá Mundo!");
		
		// Declaração de uma variável do tipo int
		int num = 5;
		System.out.println(num);
		
		// A partir do Java 10, pode-se usar a sintaxe abaixo:
		var valor = 100;
		System.out.println(valor);
		
		// A variável nome terá o tipo String
		var nome = "Aparício";
		System.out.println(nome);
		
		// Quando a variável não for iniciada no momento da declaração
		// deve-se utilizar a sintaxe abaixo:
		double y;
		y = 11.23;
		
		System.out.println("Valor " + y + " eh a variavel y");
	}
	
}