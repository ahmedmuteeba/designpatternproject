public class TShirt implements Article{

    private int priceOfArticle;
    private String colorOfArticle;

    private TShirt(int priceOfArticle, String colorOfArticle) {
        this.priceOfArticle = priceOfArticle;
        this.colorOfArticle = colorOfArticle;
    }

    public static TShirt getTShirt(int priceOfArticle, String colorOfArticle){
        TShirt ts = new TShirt(priceOfArticle, colorOfArticle);
        return ts;
    }

    @Override
    public String toString() {
        return this.priceOfArticle + "~" + this.colorOfArticle + "~";
    }

    @Override
    public int getPriceOfArticle() {
        return  this.priceOfArticle;
    }

    @Override
    public String getColorOfArticle() {
        return this.colorOfArticle;
    }
}