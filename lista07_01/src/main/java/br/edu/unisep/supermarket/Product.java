package br.edu.unisep.supermarket;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Product {

    private String name;

    protected Double stock;
    protected Double price;

    public abstract Double calculatePrice();
}
