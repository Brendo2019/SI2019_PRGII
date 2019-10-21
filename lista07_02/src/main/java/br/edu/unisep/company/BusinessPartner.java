package br.edu.unisep.company;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BusinessPartner extends Person {

    private Integer stocks;

    private Double stockValue;
    private Double companyShare;

    @Override
    public double getIncome() {
        var capital = stocks * stockValue;

        if (companyShare <= 25) {
            return capital * 0.01;
        } else if (companyShare <= 50) {
            return capital * 0.05;
        } else {
            return capital * 0.1;
        }
    }
}
