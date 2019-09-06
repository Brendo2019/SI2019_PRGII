package br.edu.unisep.atividades;

public class AtividadesComplementares {

	private String aluno;

	private int horasCursos;
	private int horasVisitas;
	private int horasEventos;
	private int horasPesquisa;

	public int registrarHoras(int horas, int categoria) {
		switch (categoria) {
		case 1:
			horasCursos = registrar(horasCursos, horas, 20, 60);
			return horasCursos;
		
		case 2:
			horasVisitas = registrar(horasVisitas, horas, 4, 30);
			return horasVisitas;

		case 3:
			horasEventos = registrar(horasEventos, horas, 8, 40);
			return horasEventos;
		
		default:
			horasPesquisa = registrar(horasPesquisa, horas, 20, 60);
			return horasPesquisa;
		}
	}
	
	private int registrar(int horasCat, int horas, int limiteReg, int limiteCat) {
		horasCat = horasCat + (horas > limiteReg ? limiteReg : horas);
		
		if (horasCat > limiteCat) {
			horasCat = limiteCat;
		}
		
		return horasCat;
	}
	
	public String getAluno() {
		return aluno;
	}

	public void setAluno(String aluno) {
		this.aluno = aluno;
	}

	public int getHorasCursos() {
		return horasCursos;
	}

	public void setHorasCursos(int horasCursos) {
		this.horasCursos = horasCursos;
	}

	public int getHorasVisitas() {
		return horasVisitas;
	}

	public void setHorasVisitas(int horasVisitas) {
		this.horasVisitas = horasVisitas;
	}

	public int getHorasEventos() {
		return horasEventos;
	}

	public void setHorasEventos(int horasEventos) {
		this.horasEventos = horasEventos;
	}

	public int getHorasPesquisa() {
		return horasPesquisa;
	}

	public void setHorasPesquisa(int horasPesquisa) {
		this.horasPesquisa = horasPesquisa;
	}

}
