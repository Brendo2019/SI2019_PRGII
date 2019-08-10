package br.edu.unisep.exemplo.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.edu.unisep.exemplo.Pessoa;


public class PessoaTest {

	public Pessoa p;
	
	@BeforeEach
	public void iniciar() {
		p = new Pessoa();
		
		p.nome = "Roberto";
		p.email = "roberto@unisep.edu.br";
		p.idade = 34;
		p.sexo = "M";
	}
	
	@Test
	public void testarApresentacao() {
		var apres = p.apresentar();
		
		assertEquals("Olá, meu nome é Roberto, tenho 34 anos. "
				+ "Meu e-mail é roberto@unisep.edu.br", apres);
	}
	
	@Test
	public void testarApresentacaoInformal() {
		var apres = p.apresentarInformal();
		
		assertEquals("E ae! Roberto aqui!", apres);
	}
	
	
}