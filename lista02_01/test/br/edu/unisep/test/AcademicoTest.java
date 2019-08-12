package br.edu.unisep.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.edu.unisep.academico.Academico;

class AcademicoTest {

	public Academico academico;
	
	@BeforeEach
	public void iniciar() {
		this.academico = new Academico();
		this.academico.nome = "Aparício";
		this.academico.disciplina = "Programação";
		this.academico.curso = "Sistemas";
	}
	
	@Test
	public void testarMedia() {
		this.academico.nota1 = 8.5;
		this.academico.nota2 = 6.5;
		this.academico.nota3 = 7.0;
		this.academico.nota4 = 8.0;
		
		var media = academico.calcularMedia();
		
		assertEquals(7.5, media);
	}
	
	@Test
	public void testarAprovacao() {
		boolean aprovado = academico.verificarAprovacao(8.0);
		assertTrue(aprovado);
	}
	

	@Test
	public void testarReprovacao() {
		boolean aprovado = academico.verificarAprovacao(6.0);
		assertFalse(aprovado);
	}
}
