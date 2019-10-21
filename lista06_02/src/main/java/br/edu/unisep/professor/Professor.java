package br.edu.unisep.professor;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Professor {

    private Integer id;

    private String name;

    protected Double salary;

    protected Integer workload;

    public double getIncome() {
        return salary;
    }

}
