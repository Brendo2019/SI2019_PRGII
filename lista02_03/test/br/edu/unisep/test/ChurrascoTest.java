package br.edu.unisep.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.edu.unisep.churrasco.Churrasco;

public class ChurrascoTest {

	public Churrasco churras;

	@BeforeEach
	public void iniciar() {
		this.churras = new Churrasco();
		this.churras.setHomens(10);
		this.churras.setMulheres(5);
		this.churras.setCriancas(3);
	}
	
	@Test
	public void testarQtdePessoas() {
		var c = new Churrasco();

		c.setHomens(-1);
		assertEquals(0, c.getHomens());
		
		c.setMulheres(-1);
		assertEquals(0, c.getMulheres());
		
		c.setCriancas(-1);
		assertEquals(0, c.getCriancas());
	}
	
	@Test
	public void testarQtdeCarne() {
		var qtde = churras.calcularQtdeCarne();
		assertEquals(7.1, qtde);
	}
	
	@Test
	public void testarQtdeCerveja() {
		var qtde = churras.calcularQtdeCerveja();
		assertEquals(9.0, qtde);
	}
	
}
