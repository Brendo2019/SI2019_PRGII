package br.edu.unisep.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.edu.unisep.eletrodomestico.Eletrodomestico;

public class EletrodomesticoTest {

	@Test
	public void calculoConsumoTest() {
		var e = new Eletrodomestico("Epson", "Powerlite S31", 300);
		
		assertEquals(0.9, e.calcularValorConsumo(4), 0.01);
	}

}
