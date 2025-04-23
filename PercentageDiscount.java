public class PercentageDiscount implements DiscountStrategy {
    private int percent;

    public PercentageDiscount(int percent) {
        this.percent = percent;
    }

    public int applyDiscount(int price) {
        return price - (price * percent / 100);
    }
}
