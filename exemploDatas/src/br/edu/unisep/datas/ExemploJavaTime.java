package br.edu.unisep.datas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ExemploJavaTime {

    public static void main(String[] args) {
        var hoje = LocalDate.now();
        System.out.println(hoje);

        var agora = LocalDateTime.now();
        System.out.println(agora);

        var natal = LocalDate.of(2019, Month.DECEMBER, 25);
        System.out.println(natal);

        var diasAteNatal = hoje.until(natal, ChronoUnit.DAYS);
        System.out.println("Faltam " + diasAteNatal + " dias até o natal");

        var mesesAteNatal = hoje.until(natal, ChronoUnit.MONTHS);
        System.out.println("Faltam " + mesesAteNatal + " meses até o natal");

        var maisDez = hoje.plusDays(10);
        System.out.println("Hoje + 10 dias: " + maisDez);

        var maisVinte = hoje.plusDays(20);
        System.out.println("Hoje + 20 dias: " + maisVinte);

        var diaAno = hoje.getDayOfYear();
        System.out.println("Dia do ano: " + diaAno);

        var diaSemana = hoje.getDayOfWeek();
        System.out.println("Dia da semana: " + diaSemana);

    }
}
