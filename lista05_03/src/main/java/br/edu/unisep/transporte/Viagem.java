package br.edu.unisep.transporte;

public class Viagem {

    private Double[] trechos;

    private Double valorKm;

    public Viagem(Double[] trechos, Double valorKm) {
        this.trechos = trechos;
        this.valorKm = valorKm;
    }

    public ResultadoFrete calcularFrete() {
        var total = 0d;

        var kmTotal = 0;
        var valorTrecho = new Double[trechos.length];

        for (var i = 0; i < trechos.length; i++) {
            var frete = trechos[i] * valorKm;
            total = total + frete;
            kmTotal += trechos[i];

            valorTrecho[i] = frete;
        }

        var qtdePedagios = kmTotal / 200;
        total = total + (qtdePedagios * 25);

        var retorno = new ResultadoFrete(total, valorTrecho);
        return retorno;
    }

    public Double[] getTrechos() {
        return trechos;
    }

    public void setTrechos(Double[] trechos) {
        this.trechos = trechos;
    }

    public Double getValorKm() {
        return valorKm;
    }

    public void setValorKm(Double valorKm) {
        this.valorKm = valorKm;
    }
}
