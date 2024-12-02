package lesson5.discount;

public class DiscountStrategyHandler {

    public DiscountStrategy getStrategy(CustomerType customerType) { // фабрика
        switch (customerType) {
            case REGULAR -> {
                return new DiscountRegularStrategy();
            }
            case VIP -> {
                return new DiscountVIPStrategy();
            }
            case EMPLOYEE -> {
                return new DiscountEmployeeStrategy();
            }
            default -> {
                throw new IllegalArgumentException("Unknown customer type");
            }
        }
    }

}
