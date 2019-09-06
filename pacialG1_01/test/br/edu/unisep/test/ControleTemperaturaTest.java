package br.edu.unisep.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.edu.unisep.temperatura.ControleTemperatura;

public class ControleTemperaturaTest {

	@Test
	public void calculoSensacaoTermicaTest() {
		var ct = new ControleTemperatura();
		ct.setTemperatura(30);
		ct.setVelocidadeAr(40);
		
		ct.calcularSensacaoTermica();
		
		assertEquals(28.4, ct.getSensacaoTermica(), 0.01);
	}

	@Test
	public void zeroVentiladoresTest() {
		var ct = new ControleTemperatura();
		ct.setSensacaoTermica(20);
		
		assertEquals(0, ct.obterQtdeVentiladores());
	}
	
	@Test
	public void umVentiladorTest() {
		var ct = new ControleTemperatura();
		ct.setSensacaoTermica(26.2);
		
		assertEquals(1, ct.obterQtdeVentiladores());
	}

	@Test
	public void doisVentiladoresTest() {
		var ct = new ControleTemperatura();
		ct.setSensacaoTermica(30.1);
		
		assertEquals(2, ct.obterQtdeVentiladores());
	}


	@Test
	public void tresVentiladoresTest() {
		var ct = new ControleTemperatura();
		ct.setSensacaoTermica(33.1);
		
		assertEquals(3, ct.obterQtdeVentiladores());
	}
}
