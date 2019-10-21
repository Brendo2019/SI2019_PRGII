package br.edu.unisep.product;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Product {

    private String name;
    protected Double price;

    public abstract Double calculatePrice();
}
