package br.edu.unisep.music;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GroupPlan extends Plan{

    private Integer members;
    private boolean multipleAccess;

    @Override
    public Double calculateValue() {
        var price = 0d;

        if (members <= 3) {
            price = 19.99;
        } else if (members <= 6) {
            price = 26.99;
        } else if (members <= 10) {
            price = 34.99;
        }

        if (multipleAccess) {
            price = price * 1.2;
        }

        return price;
    }
}
