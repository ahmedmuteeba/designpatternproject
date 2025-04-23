public class AddArticleCommand implements Command {
    private Shop shop;
    private Article article;

    public AddArticleCommand(Shop shop, Article article) {
        this.shop = shop;
        this.article = article;
    }

    public void execute() {
        shop.addArticleInShop(article);
    }
}
