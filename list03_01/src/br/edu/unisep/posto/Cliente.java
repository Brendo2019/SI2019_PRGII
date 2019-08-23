package br.edu.unisep.posto;

public class Cliente {

	private String nome;
	
	private int mes;
	private int ano;
	
	private double combustivel;
	
	private int pontuacao;
	
	public void registrarAbastecimento(double qtde) {
		var pontos = (combustivel >= 100) ? 5 : 2;
		
		pontuacao = pontuacao + ((int) qtde * pontos); 
		combustivel = combustivel + qtde;
	}
	
	public void registrarServico(int tipo) {
		
		switch (tipo) {
		
		case 2:
			pontuacao += 300;
			break;
			
		case 3:
			pontuacao += 100;
			break;
		
		case 4:
			pontuacao += 50;
			break;
		}
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getCombustivel() {
		return combustivel;
	}

	public int getPontuacao() {
		return pontuacao;
	}
	
}
