package br.edu.unisep.temperatura;

public class ControleTemperatura {

	private double temperatura;
	private double velocidadeAr;
	private double sensacaoTermica;

	public ControleTemperatura() {
		System.out.println("criou objeto ControleTemperatura");
	}
	
	public void calcularSensacaoTermica() {
		sensacaoTermica = 33 + (10 * Math.sqrt(velocidadeAr) + 
				10.45 - velocidadeAr) * (temperatura - 33) / 22;
	}
	
	public int obterQtdeVentiladores() {
		if (sensacaoTermica <= 25) {
			return 0;
		} else if (sensacaoTermica <= 30) {
			return 1;
		} else if (sensacaoTermica <= 33) {
			return 2;
		} else {
			return 3;
		}
	}
	
	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public double getVelocidadeAr() {
		return velocidadeAr;
	}

	public void setVelocidadeAr(double velocidadeAr) {
		this.velocidadeAr = velocidadeAr;
	}

	public double getSensacaoTermica() {
		return sensacaoTermica;
	}

	public void setSensacaoTermica(double sensacaoTermica) {
		this.sensacaoTermica = sensacaoTermica;
	}

}