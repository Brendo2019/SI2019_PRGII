package br.edu.unisep.lavanderia;

public class Lavanderia {

	private String cliente;

	private int qtdeNormais;
	private int qtdeDelicadas;
	private int qtdePesadas;
	private int tipoServico;

	
	public double calcularTotal() {
		
		var total = (qtdeNormais * 3) + (qtdeDelicadas * 1.5) + (qtdePesadas * 5);
		
		if (tipoServico == 2) {
			var qtde = qtdeNormais + qtdeDelicadas + qtdePesadas;
			
			if (qtde >= 50) {
				total = total * 1.2;
			} else {
				total = total * 1.3;
			}
		}
		
		return total;
	}
	
	
	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getQtdeNormais() {
		return qtdeNormais;
	}

	public void setQtdeNormais(int qtdeNormais) {
		this.qtdeNormais = qtdeNormais;
	}

	public int getQtdeDelicadas() {
		return qtdeDelicadas;
	}

	public void setQtdeDelicadas(int qtdeDelicadas) {
		this.qtdeDelicadas = qtdeDelicadas;
	}

	public int getQtdePesadas() {
		return qtdePesadas;
	}

	public void setQtdePesadas(int qtdePesadas) {
		this.qtdePesadas = qtdePesadas;
	}

	public int getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(int tipoServico) {
		this.tipoServico = tipoServico;
	}

}
