public class NoDiscount implements DiscountStrategy {
    public int applyDiscount(int price) {
        return price;
    }
}
