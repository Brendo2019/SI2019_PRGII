package br.edu.unisep.obra;

public class Construtora {

	public double calcularValorObra(Obra obra, int equipe) {
		
		if (equipe == 1) {
			return obra.getArea() * 1500;
		} else if (equipe == 2) {
			return obra.getArea() * 2200;
		} else if (equipe == 3) {
			return obra.getArea() * 2800;
		} else if (equipe == 4) {
			return obra.getArea() * 4500;
		}
		
		return 0;
	}
	
	public double calcularPrazoObra(Obra obra, int equipe) {
		if (equipe == 1) {
			return obra.getArea() / 50;
		} else if (equipe == 2) {
			return obra.getArea() / 75;
		} else if (equipe == 3) {
			return obra.getArea() / 100;
		} else if (equipe == 4) {
			return obra.getArea() / 200;
		}
		
		return 0;
	}
}