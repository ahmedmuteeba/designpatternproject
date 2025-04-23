import java.util.*;

public class Shop implements ShopInterface {
    static Shop SINGLETON = null;
    ArrayList<Article> listOfArticles = new ArrayList<>();
    ArrayList<Customer> listOfCustomers = new ArrayList<>();
    private int dressingRooms = 3;

    private Shop() {}

    private static final class SingletonHolder {
        public static final Shop INSTANCE = new Shop();
    }

    public static Shop getShop() {
        return SingletonHolder.INSTANCE;
    }

    public void useDressingRoom(Customer c) throws NotEnoughArticlesException {
        if (dressingRooms > 0 && dressingRooms < 4) {
            if (c.listOfCustomerArticles.size() < 1) {
                throw new NotEnoughArticlesException();
            } else {
                dressingRooms--;
            }
        } else {
            System.out.println("There are no dressing rooms!");
        }
    }

    public void freeUpDressingRoom() {
        if (dressingRooms < 3) {
            dressingRooms++;
        }
    }

    public void addCustomerInShop(Customer c) throws TooManyCustomersException {
        if (listOfCustomers.size() < 100) {
            listOfCustomers.add(c);
        } else {
            throw new TooManyCustomersException();
        }
    }

    public void showAllCustomersFromShop() {
        this.listOfCustomers.forEach(System.out::println);
    }

    public void showAllTheArticlesFromShop() {
        this.listOfArticles.forEach(System.out::println);
    }

    public void addArticleForCustomer(Customer c, Article a) {
        c.listOfCustomerArticles.add(a);
    }

    public void showCustomerArticles(Customer c) {
        c.listOfCustomerArticles.forEach(System.out::println);
    }

    public void addArticleInShop(Article a) {
        this.listOfArticles.add(a);
    }

    public int moneySpentByCustomer(Customer c) {
        int sum = 0;
        for (Article a : c.listOfCustomerArticles) {
            int price = a.getPriceOfArticle();
            DiscountStrategy strategy = new NoDiscount();

            if (a instanceof TShirt && c.isDiscountCard()) {
                strategy = new PercentageDiscount(15);
            }

            sum += strategy.applyDiscount(price);
        }
        return sum;
    }
}
