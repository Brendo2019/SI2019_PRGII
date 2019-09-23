package br.edu.unisep.arrays;

public class ExemploArrayObjeto {

    public static void main(String[] args) {
        var mao = new Carta[5];

        mao[0] = new Carta(1, "C");
        System.out.println(mao[0].getValor());
        System.out.println(mao[0].getNaipe());

        mao[1] = new Carta();
        mao[1].setValor(10);
        mao[1].setNaipe("H");

        mao[2] = new Carta(1, "H");
        mao[3] = new Carta(1, "S");
        mao[4] = new Carta(10, "D");

        for (var c : mao) {
            System.out.println("Carta: " + c.getValor() + " " + c.getNaipe());
        }
    }
}
