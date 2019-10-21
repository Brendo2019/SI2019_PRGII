package br.edu.unisep.product;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Equipment extends Product {

    private Double icms;
    private Double ipi;

    @Override
    public Double calculatePrice() {
        return price + (price * icms / 100) + (price * ipi / 100);
    }
}
