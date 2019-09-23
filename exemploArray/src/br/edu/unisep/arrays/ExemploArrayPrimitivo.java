package br.edu.unisep.arrays;

public class ExemploArrayPrimitivo {

    public static void main(String[] args) {
        // declarou um array de inteiros de 5 posições
        var num = new int[5];
        System.out.println("Tamanho do array: " + num.length);

        // para manipular valores no array é sempre necessário
        // definir a posição que se deseja manipular
        num[0] = 10;
        num[1] = 3;
        num[2] = -1;
        num[3] = 6;
        num[4] = 8;

        // define um array e inicializa com o conteúdo
        var alunos = new String[] {"Alexandre", "Eduardo", "Hernan", "Brendo"};
        System.out.println("Alunos: " + alunos.length);

        // pode-se percorrer o array, usando um for tradicional
        for (int i = 0; i < num.length; i++) {
            System.out.println("num[" + i + "] = " + num[i]);
        }

        // para percorrer um array, é possível utilizar o enhanced for
        for (var a : alunos) {
            System.out.println(a);
        }
    }

}
