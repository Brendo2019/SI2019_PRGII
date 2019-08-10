package br.edu.unisep.exemplo;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		
		var p = new Pessoa();
		p.nome = "Aparício";
		p.idade = 20;
		p.email = "aparicio@gmail.com";
		p.sexo = "M";
		
		System.out.println("--- p ---");
		System.out.println(p.nome);
		System.out.println(p.idade);
		System.out.println(p.sexo);
		System.out.println(p.email);
	
		var p2 = new Pessoa();
		p2.nome = "Maria";
		p2.idade = 21;
		p2.sexo = "F";
		p2.email = "maria@gmail.com";
		
		System.out.println("--- p2 ---");
		System.out.println(p2.nome);
		System.out.println(p2.idade);
		System.out.println(p2.sexo);
		System.out.println(p2.email);
		
		var p3 = p;
		p3.nome = "Joaozinho";

		System.out.println("--- p3 ---");
		System.out.println(p3.nome);
		System.out.println(p3.email);

		System.out.println("--- p ---");
		System.out.println(p.nome);

		System.out.println("--- Apresentações ---");
		System.out.println(p.apresentar());
		JOptionPane.showMessageDialog(null, p2.apresentar());
		
	}
	
}
