package Fixacao;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double converter(double dollarPrice, double quantity) {
        return (dollarPrice * quantity) * (1 + IOF); 
    }
}
