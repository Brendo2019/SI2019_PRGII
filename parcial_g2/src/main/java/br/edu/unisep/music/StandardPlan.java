package br.edu.unisep.music;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StandardPlan extends Plan{

    private Integer type;
    private Integer devices;

    @Override
    public Double calculateValue() {
        var price = 0d;

        if (type == 1) {
            price = 5.99 + (0.599 * (devices - 1));
        } else if (type == 2) {
            price = 9.99 + (0.999 * (devices - 1));
        } else if (type == 3) {
            price = 14.99 + (1.499 * (devices - 1));
        }

        return price;
    }
}
