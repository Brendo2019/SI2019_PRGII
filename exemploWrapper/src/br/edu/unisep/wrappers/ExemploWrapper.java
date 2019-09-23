package br.edu.unisep.wrappers;

public class ExemploWrapper {

    public static void main(String[] args) {
        Integer x = 5;
        Integer y = 10;
        Integer z = x + y;

        System.out.println(z);

        var valor = "12.3";
        var v = Double.parseDouble(valor) * 10;
        System.out.println(v);
    }

}
