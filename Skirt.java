public class Skirt implements Article {
    private int priceOfArticle;
    private String colorOfArticle;

    private Skirt(int priceOfArticle, String colorOfArticle) {
        this.priceOfArticle = priceOfArticle;
        this.colorOfArticle = colorOfArticle;
    }

    public static Skirt getSkirt(int priceOfArticle, String colorOfArticle) {
        return new Skirt(priceOfArticle, colorOfArticle);
    }

    public int getPriceOfArticle() { return this.priceOfArticle; }
    public String getColorOfArticle() { return this.colorOfArticle; }

    @Override
    public String toString() {
        return this.priceOfArticle + "~" + this.colorOfArticle + "~";
    }
}
