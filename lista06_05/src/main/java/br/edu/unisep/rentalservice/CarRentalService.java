package br.edu.unisep.rentalservice;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarRentalService {

    public static final double FINE_EXCEEDED_DISTANCE = 1.2;
    public static final double INSURANCE_FEE = 1.15;

    private String customer;

    private boolean insurance;

    private Double rateByKm;
    private Double rateByDay;

    public Double calculateRentalCost(Double hiredDistance, Double actualDistance) {
        var total = hiredDistance * rateByKm;
        var difference = actualDistance - hiredDistance;

        if (difference > 0) {
            total = total + (difference * rateByKm * FINE_EXCEEDED_DISTANCE);
        }

        if (insurance) {
            total = total * INSURANCE_FEE;
        }

        return total;
    }

    public Double calculateRentalCost(Integer numberOfDays) {
        var total = numberOfDays * rateByDay;

        if (insurance) {
            total = total * INSURANCE_FEE;
        }

        return total;
    }

}
