package lesson5.discount;

public class DiscountVIPStrategy implements DiscountStrategy {

    @Override
    public double calculate(double amount) {
        return amount * 0.10;
    }
}
