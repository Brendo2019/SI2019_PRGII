package br.edu.unisep.eletrodomestico;

public class Eletrodomestico {

	private String marca;
	private String modelo;
	
	private int potencia;
	
	public Eletrodomestico(String marca, String modelo, int potencia) {
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = potencia;
	}

	public double calcularValorConsumo(double tempo) {
		return (potencia * tempo) / 1000 * 0.75;
	}
	
	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getPotencia() {
		return potencia;
	}
	
}
