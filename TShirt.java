public class TShirt extends Article {
    public TShirt(int price, String color) {
        this.priceOfArticle = price;
        this.colorOfArticle = color;
    }

    public String toString() {
        return this.priceOfArticle + "~" + this.colorOfArticle + "~";
    }
}
