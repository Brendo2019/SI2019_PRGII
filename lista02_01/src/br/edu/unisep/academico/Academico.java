package br.edu.unisep.academico;

public class Academico {

	public String registro;
	public String nome;
	public String curso;
	public String disciplina;
	
	public double nota1;
	public double nota2;
	public double nota3;
	public double nota4;
	

	public double calcularMedia() {
		var media = (this.nota1 + this.nota2 + this.nota3 + this.nota4) / 4;
		return media;
	}

	public boolean verificarAprovacao(double media) {
		return (media >= 7);
	}
	
}
