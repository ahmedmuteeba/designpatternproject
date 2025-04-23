public class TShirt implements Article {
    private int priceOfArticle;
    private String colorOfArticle;

    private TShirt(int priceOfArticle, String colorOfArticle) {
        this.priceOfArticle = priceOfArticle;
        this.colorOfArticle = colorOfArticle;
    }

    public static TShirt getTShirt(int priceOfArticle, String colorOfArticle) {
        return new TShirt(priceOfArticle, colorOfArticle);
    }

    public int getPriceOfArticle() { return this.priceOfArticle; }
    public String getColorOfArticle() { return this.colorOfArticle; }

    @Override
    public String toString() {
        return this.priceOfArticle + "~" + this.colorOfArticle + "~";
    }
}
