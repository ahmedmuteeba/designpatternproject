public class Jeans extends Article {
    public boolean Pockets;

    public Jeans(int price, String color, boolean pockets) {
        this.priceOfArticle = price;
        this.colorOfArticle = color;
        this.Pockets = pockets;
    }

    public String toString() {
        return this.priceOfArticle + "~" + this.colorOfArticle + "~" + this.Pockets;
    }
}
