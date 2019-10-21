package br.edu.unisep.supermarket;

public class IndustrializedProduct extends Product {

    private static final double IPI = 0.05;
    private static final double ICMS = 0.12;

    private static final int STOCK_TIER_1 = 50;
    private static final int STOCK_TIER_2 = 200;

    private static final double PROFIT_TIER_1 = 1.12;
    private static final double PROFIT_TIER_2 = 1.105;
    private static final double PROFIT_TIER_3 = 1.09;
    private static final double TRANSPORT_TIER_1 = 0.35;
    private static final double TRANSPORT_TIER_2 = 0.3;
    private static final double TRANSPORT_TIER_3 = 0.25;

    @Override
    public Double calculatePrice() {

        var taxes = (price * IPI) + (price * ICMS);

        if (stock <= STOCK_TIER_1) {
            return (price * PROFIT_TIER_1) + taxes + TRANSPORT_TIER_1;
        } else if (stock <= STOCK_TIER_2) {
            return (price * PROFIT_TIER_2) + taxes + TRANSPORT_TIER_2;
        } else {
            return (price * PROFIT_TIER_3) + taxes + TRANSPORT_TIER_3;
        }
    }
}