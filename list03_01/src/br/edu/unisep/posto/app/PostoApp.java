package br.edu.unisep.posto.app;

import java.util.Scanner;

import br.edu.unisep.posto.Cliente;

public class PostoApp {

	private Scanner sc = new Scanner(System.in);
	private Cliente cliente = new Cliente();
	
	public void executar() {
		obterDadosBasicos();
		
		var opcao = 0;
		
		do {
			opcao = exibirMenu();
			tratarOpcaoMenu(opcao);
		} while(opcao != 6);
	}
	
	private void tratarOpcaoMenu(int opcao) {
		
		if (opcao == 1) {
			System.out.println("Informe a quantidade abastecida: ");
			var qtde = sc.nextDouble();
			
			cliente.registrarAbastecimento(qtde);
		} else if (opcao >= 2 && opcao <= 4) {
			cliente.registrarServico(opcao);
		} else if (opcao == 5){
			System.out.println("Sua pontuação atual é: " + cliente.getPontuacao());
		} else if (opcao != 6) {
			System.out.println("Opção inválida!");
		}
	}

	private int exibirMenu() {
		System.out.println("** Menu **");
		System.out.println("1 - Abastecimento");
		System.out.println("2 - Troca de Óleo");
		System.out.println("3 - Lavagem");
		System.out.println("4 - Calibragem de Pneus");
		System.out.println("5 - Pontuação");
		System.out.println("6 - Sair");
		System.out.print("=> ");
		
		return sc.nextInt();
	}

	private void obterDadosBasicos() {
		System.out.println("Informe o seu nome: ");
		cliente.setNome(sc.nextLine());
		
		System.out.println("Informe o mês: ");
		cliente.setMes(sc.nextInt());

		System.out.println("Informe o ano: ");
		cliente.setAno(sc.nextInt());
	}
	
}
