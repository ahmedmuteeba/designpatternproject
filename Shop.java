import java.util.ArrayList;

public class Shop {
    public ArrayList<Article> listOfArticles = new ArrayList<>();
    public ArrayList<Customer> listOfCustomers = new ArrayList<>();
    public int dressingRooms = 3;

    public void useDressingRoom(Customer c) throws Exception {
        if (dressingRooms > 0) {
            if (c.listOfCustomerArticles.size() < 1) {
                throw new Exception("Not enough articles!");
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

    public void addCustomerInShop(Customer c) throws Exception {
        if (listOfCustomers.size() < 100) {
            listOfCustomers.add(c);
        } else {
            throw new Exception("Too many customers!");
        }
    }

    public void showAllCustomersFromShop() {
        for (Customer c : listOfCustomers) {
            System.out.println(c);
        }
    }

    public void showAllTheArticlesFromShop() {
        for (Article a : listOfArticles) {
            System.out.println(a);
        }
    }

    public void addArticleForCustomer(Customer c, Article a) {
        c.listOfCustomerArticles.add(a);
    }

    public void showCustomerArticles(Customer c) {
        for (Article a : c.listOfCustomerArticles) {
            System.out.println(a);
        }
    }

    public void addArticleInShop(Article a) {
        listOfArticles.add(a);
    }

    public int moneySpentByCustomer(Customer c) {
        int sum = 0;
        for (Article a : c.listOfCustomerArticles) {
            int price = a.priceOfArticle;
            if (a instanceof TShirt && c.discountCard) {
                price -= (15 * price / 100);
            }
            sum += price;
        }
        return sum;
    }
}
