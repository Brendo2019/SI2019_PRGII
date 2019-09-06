package br.edu.unisep.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.edu.unisep.atividades.AtividadesComplementares;

public class AtividadesComplementaresTest {

	private AtividadesComplementares atv;
	
	@BeforeEach
	public void iniciar() {
		this.atv = new AtividadesComplementares();
	}
	
	@Test
	public void horasCursosTest() {
		atv.registrarHoras(10, 1);
		assertEquals(10, atv.getHorasCursos());
	}

	@Test
	public void horasCursosExcedRegTest() {
		atv.registrarHoras(24, 1);
		assertEquals(20, atv.getHorasCursos());
	}

	@Test
	public void horasCursosAcumTest() {
		atv.registrarHoras(10, 1);
		atv.registrarHoras(20, 1);
		assertEquals(30, atv.getHorasCursos());
	}

	@Test
	public void horasCursosAcumExcedTest() {
		atv.registrarHoras(20, 1);
		atv.registrarHoras(20, 1);
		atv.registrarHoras(30, 1);
		
		assertEquals(60, atv.getHorasCursos());
	}

	@Test
	public void horasVisitasTest() {
		atv.registrarHoras(2, 2);
		assertEquals(2, atv.getHorasVisitas());
	}

	@Test
	public void horasVisitasExcedRegTest() {
		atv.registrarHoras(6, 2);
		assertEquals(4, atv.getHorasVisitas());
	}

	@Test
	public void horasVisitasAcumTest() {
		atv.registrarHoras(2, 2);
		atv.registrarHoras(4, 2);
		assertEquals(6, atv.getHorasVisitas());
	}

	@Test
	public void horasVisitasAcumExcedTest() {
		atv.registrarHoras(4, 2);
		atv.registrarHoras(4, 2);
		atv.registrarHoras(4, 2);
		atv.registrarHoras(4, 2);
		atv.registrarHoras(4, 2);
		atv.registrarHoras(4, 2);
		atv.registrarHoras(4, 2);
		atv.registrarHoras(4, 2);
		
		assertEquals(30, atv.getHorasVisitas());
	}
	
	@Test
	public void horasEventosTest() {
		atv.registrarHoras(8, 3);
		assertEquals(8, atv.getHorasEventos());
	}

	@Test
	public void horasEventosExcedRegTest() {
		atv.registrarHoras(10, 3);
		assertEquals(8, atv.getHorasEventos());
	}

	@Test
	public void horasEventosAcumTest() {
		atv.registrarHoras(8, 3);
		atv.registrarHoras(6, 3);
		assertEquals(14, atv.getHorasEventos());
	}

	@Test
	public void horasEventosAcumExcedTest() {
		atv.registrarHoras(8, 3);
		atv.registrarHoras(8, 3);
		atv.registrarHoras(8, 3);
		atv.registrarHoras(8, 3);
		atv.registrarHoras(6, 3);
		atv.registrarHoras(4, 3);
		
		assertEquals(40, atv.getHorasEventos());
	}
	
	@Test
	public void horasPesquisaTest() {
		atv.registrarHoras(10, 4);
		assertEquals(10, atv.getHorasPesquisa());
	}

	@Test
	public void horasPesquisaExcedRegTest() {
		atv.registrarHoras(24, 4);
		assertEquals(20, atv.getHorasPesquisa());
	}

	@Test
	public void horasPesquisaAcumTest() {
		atv.registrarHoras(10, 4);
		atv.registrarHoras(20, 4);
		assertEquals(30, atv.getHorasPesquisa());
	}

	@Test
	public void horasPesquisaAcumExcedTest() {
		atv.registrarHoras(20, 4);
		atv.registrarHoras(20, 4);
		atv.registrarHoras(30, 4);
		
		assertEquals(60, atv.getHorasPesquisa());
	}
}
