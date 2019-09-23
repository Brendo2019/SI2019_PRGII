package br.edu.unisep.arrays;

public class Carta {

    private Integer valor;

    private String naipe;

    public Carta() {

    }

    public Carta(Integer valor, String naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }
}
