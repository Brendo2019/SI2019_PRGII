package br.edu.unisep.company;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee extends Person {

    private Double salary;

    private String pis;
    private String ctps;

    @Override
    public double getIncome() {
        var result = salary - (salary * 0.11);
        var ir = 0d;

        if (result >= 1903.99 && result <= 2826.65) {
            ir = result * 0.075;
            ir = ir - 142.8;
        } else if (result >= 2826.66 && result <= 3751.05) {
            ir = result * 0.15;
            ir = ir - 354.8;
        } else if (result >= 3751.06 && result <= 4664.68) {
            ir = result * 0.225;
            ir = ir - 636.13;
        } else if (result > 4664.68) {
            ir = result * 0.275;
            ir = ir - 869.36;
        }

        return result - ir;
    }
}
