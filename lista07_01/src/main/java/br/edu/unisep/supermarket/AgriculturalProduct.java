package br.edu.unisep.supermarket;

public class AgriculturalProduct extends Product {

    @Override
    public Double calculatePrice() {
        if (stock <= 100) {
            return (price * 1.08) + 0.1;
        } else if (stock <= 200) {
            return (price * 1.05) + 0.08;
        } else {
            return (price * 1.035) + 0.05;
        }
    }
}
