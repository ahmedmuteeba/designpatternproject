public class Skirt implements Article{

    private int priceOfArticle;
    private String colorOfArticle;

    private Skirt(int priceOfArticle, String colorOfArticle) {
        this.priceOfArticle = priceOfArticle;
        this.colorOfArticle = colorOfArticle;
    }

    public static Skirt getSkirt(int priceOfArticle, String colorOfArticle){
        Skirt s = new Skirt(priceOfArticle, colorOfArticle);
        return s;
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