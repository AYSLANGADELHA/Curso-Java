package util;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double conversion(double price, double dollar ){

        return (IOF + 1) * price * dollar;
    }

}
