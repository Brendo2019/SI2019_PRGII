package br.edu.unisep.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.edu.unisep.livro.Livro;

public class LivroTest {

	@Test
	public void testarTempoLeitura() {
		var l = new Livro("Titulo Teste", "Autor Teste", 400);
		var tempo = l.calcularTempoLeitura(1.7);

		assertEquals(680, tempo);
	}
}