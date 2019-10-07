package br.edu.unisep.transporte;

public class ResultadoFrete {

    private Double total;

    private Double[] valorTrecho;

    public ResultadoFrete(Double total, Double[] valorTrecho) {
        this.total = total;
        this.valorTrecho = valorTrecho;
    }

    public Double getTotal() {
        return total;
    }

    public Double[] getValorTrecho() {
        return valorTrecho;
    }

}
