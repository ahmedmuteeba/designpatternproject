import java.util.*;

public interface ShopInterface {
    void useDressingRoom(Customer c) throws NotEnoughArticlesException;
    void freeUpDressingRoom();
    void addCustomerInShop(Customer c) throws TooManyCustomersException;
    void showAllCustomersFromShop();
    void showAllTheArticlesFromShop();
    void showCustomerArticles(Customer c);
    void addArticleForCustomer(Customer c, Article a);
    void addArticleInShop(Article a);
    int moneySpentByCustomer(Customer c);
}
