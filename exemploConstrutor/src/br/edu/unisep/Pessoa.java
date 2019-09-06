package br.edu.unisep;

public class Pessoa {

	private String nome;
	
	private String email;
	
	private int idade;

	public Pessoa() {
		
	}

	public Pessoa(String n, String e) {
		// Executa o construtor da própria classe, passando 0 para a idade		
		this(n, e, 0);
	}
	
	public Pessoa(String n, String e, int i) {
		this.nome = n;
		this.email = e;
		this.idade = i;
	}
	
	public Pessoa(String n, int i) {
		// Executa o construtor da própria classe, passando null para o e-mail
		this(n, null, i);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
