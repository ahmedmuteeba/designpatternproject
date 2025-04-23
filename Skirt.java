public class Skirt extends Article {
    public Skirt(int price, String color) {
        this.priceOfArticle = price;
        this.colorOfArticle = color;
    }

    public String toString() {
        return this.priceOfArticle + "~" + this.colorOfArticle + "~";
    }
}
