package br.edu.unisep.product;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Service extends Product{

    public static final String SERVICE_CLASS_A = "A";
    public static final String SERVICE_CLASS_B = "B";
    public static final String SERVICE_CLASS_C = "C";

    public static final double EXTRA_CLASS_A = 0.10;
    public static final double EXTRA_CLASS_B = 0.05;
    public static final double EXTRA_CLASS_C = 0.03;

    private Double iss;
    private String category;
    private Double duration;

    @Override
    public Double calculatePrice() {
        var total = price * duration;
        var extra = 0d;

        if (category.equals(SERVICE_CLASS_A)) {
            extra = total * EXTRA_CLASS_A;
        } else if (category.equals(SERVICE_CLASS_B)) {
            extra = total * EXTRA_CLASS_B;
        } else if (category.equals(SERVICE_CLASS_C)) {
            extra = total * EXTRA_CLASS_C;
        }

        return total + (total * iss / 100d) + extra;
    }
}
