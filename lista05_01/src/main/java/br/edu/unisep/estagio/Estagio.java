package br.edu.unisep.estagio;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Estagio {

    private String academico;
    private LocalDate inicio;
    private Integer periodo;
    private Integer tempo;

    public Estagio(String academico, LocalDate inicio, Integer periodo, Integer tempo) {
        this.academico = academico;
        this.inicio = inicio;
        this.periodo = periodo;
        this.tempo = tempo;
    }

    public LocalDate calcularDataTermino() {
        var horas = 0;
        var data = inicio;

        while (horas < 100) {
            var dia = data.getDayOfWeek();

            if (ehDiaValido(dia)) {
                horas += tempo;
            }

            if (horas < 100) {
                data = data.plusDays(dia == DayOfWeek.FRIDAY ? 3 : 1);
            }
        }

        return data;
    }

    private boolean ehDiaValido(DayOfWeek dia) {
        return periodo == 1 ||

                (periodo == 2 && (dia == DayOfWeek.MONDAY ||
                dia == DayOfWeek.WEDNESDAY ||
                dia == DayOfWeek.FRIDAY)) ||

                (periodo == 3 && (dia == DayOfWeek.TUESDAY ||
                dia == DayOfWeek.THURSDAY));
    }

    public String getAcademico() {
        return academico;
    }

    public void setAcademico(String academico) {
        this.academico = academico;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public Integer getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }

    public Integer getTempo() {
        return tempo;
    }

    public void setTempo(Integer tempo) {
        this.tempo = tempo;
    }
}
