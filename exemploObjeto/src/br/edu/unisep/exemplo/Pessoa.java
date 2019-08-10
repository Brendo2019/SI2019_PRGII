package br.edu.unisep.exemplo;

public class Pessoa {

	public String nome;
	
	public int idade;
	
	public String sexo;
	public String email;
	
	public String apresentar() {
		return "Olá, meu nome é " + nome + 
				", tenho " + idade + " anos. Meu e-mail é " + email;
	}
	
	public String apresentarInformal() {
		return "E ae! " + nome + " aqui!";
	}
	
}
