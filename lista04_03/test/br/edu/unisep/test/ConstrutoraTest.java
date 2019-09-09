package br.edu.unisep.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.edu.unisep.obra.Construtora;
import br.edu.unisep.obra.Obra;

public class ConstrutoraTest {

	@Test
	public void custoObraEquipe1Test() {
		var o = new Obra("Aparício", 5000);
		var c = new Construtora();
		
		var custo = c.calcularValorObra(o, 1);
		assertEquals(7500000, custo, 0.01);
	}
	
	@Test
	public void prazoObraEquipe1Test() {
		var o = new Obra("Aparício", 5000);
		var c = new Construtora();
		
		var prazo = c.calcularPrazoObra(o, 1);
		assertEquals(100, prazo);
	}

}
