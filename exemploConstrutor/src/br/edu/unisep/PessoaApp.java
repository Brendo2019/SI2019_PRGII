package br.edu.unisep;

public class PessoaApp {

	public static void main(String[] args) {
		
		// Executa o construtor com parâmetros
		var p = new Pessoa("Aparicio", "aparicio@gmail.com");
		
		// Executa o construtor padrão - sem parâmetros
		var p2 = new Pessoa();
		
		// Executa o construtor com nome, email e idade
		var p3 = new Pessoa("Aparício", "aparicio@gmail.com", 30);

		// Executa o construtor com nome e idade
		var p4 = new Pessoa("Aparício", 30);
	}
	
}