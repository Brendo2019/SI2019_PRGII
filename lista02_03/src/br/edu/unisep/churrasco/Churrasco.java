package br.edu.unisep.churrasco;

public class Churrasco {

	private int homens;
	private int mulheres;
	private int criancas;
	
	public double calcularQtdeCarne() {
		return (homens * 0.5) + (mulheres * 0.3) + (criancas * 0.2);
	}
	
	public double calcularQtdeCerveja() {
		return (homens * 0.75) + (mulheres * 0.3);
	}

	public int getHomens() {
		return homens;
	}

	public void setHomens(int homens) {
		this.homens = (homens >= 0) ? homens : 0;
	}

	public int getMulheres() {
		return mulheres;
	}

	public void setMulheres(int mulheres) {
		this.mulheres = (mulheres >= 0) ? mulheres : 0;
	}

	public int getCriancas() {
		return criancas;
	}

	public void setCriancas(int criancas) {
		this.criancas = (criancas >= 0) ? criancas : 0;
	}
	
}
