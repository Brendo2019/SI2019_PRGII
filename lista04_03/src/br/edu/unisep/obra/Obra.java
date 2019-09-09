package br.edu.unisep.obra;

public class Obra {

	private String proprietario;
	
	private double area;

	public Obra(String proprietario, double area) {
		this.proprietario = proprietario;
		this.area = area;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
}
