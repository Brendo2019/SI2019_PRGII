package br.edu.unisep.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CaloriesCalculator {

    private Integer age;
    private Double weight;
    private Double height;
    private String sex;

    public Double calculate() {
        var result = 0d;
        if (sex.equalsIgnoreCase("M")) {
            result = 66.5 + (13.7 * weight) + (5 * height) + (6.76 * age);
        } else {
            result = 655.1 + (9.56 * weight) + (1.85 * height) + (4.68 * age);
        }

        return result;
    }
}
