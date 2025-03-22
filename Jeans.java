public class Jeans implements Article{

    private int priceOfArticle;
    private String colorOfArticle;
    private boolean Pockets;


    private Jeans(int priceOfArticle, String colorOfArticle, boolean Pockets) {
        this.priceOfArticle = priceOfArticle;
        this.colorOfArticle = colorOfArticle;
        this.Pockets = Pockets;
    }

    public static Jeans getJeans(int priceOfArticle, String colorOfArticle, boolean Pockets){
        Jeans j = new Jeans(priceOfArticle, colorOfArticle, Pockets);
        return j;
    }

    @Override
    public String toString() {
        return this.priceOfArticle + "~" + this.colorOfArticle + "~" + this.Pockets;
    }

    @Override
    public int getPriceOfArticle() {
        return  this.priceOfArticle;
    }

    @Override
    public String getColorOfArticle() {
        return this.colorOfArticle;
    }

    public boolean isPockets() {
        return this.Pockets;
    }
}