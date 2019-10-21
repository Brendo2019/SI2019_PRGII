package br.edu.unisep.company;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Person {

    private String name;
    private String rg;
    private String cpf;
    private String sex;

    private Integer age;

    public abstract double getIncome();

}
