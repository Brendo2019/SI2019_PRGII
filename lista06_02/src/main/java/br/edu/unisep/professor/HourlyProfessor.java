package br.edu.unisep.professor;

public class HourlyProfessor extends Professor{

    private static final double WEEKS_PER_MONTH = 4.5;

    @Override
    public double getIncome() {
        return salary * workload * WEEKS_PER_MONTH;
    }
}
