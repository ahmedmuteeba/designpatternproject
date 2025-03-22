import java.util.*;

public class Shop implements ShopInterface{

    static Shop SINGLETON = null;
    ArrayList<Article> listOfArticles = null;
    ArrayList<Customer> listOfCustomers = null;
    private int dressingRooms = 3;

    private Shop(){
        this.listOfArticles = new ArrayList<>();
        this.listOfCustomers = new ArrayList<>();
    }

    //Thread-safe Singleton
    private static final class SingletonHolder {
        public static final Shop INSTANCE = new Shop();
    }

    public static Shop getShop() {
        return SingletonHolder.INSTANCE;
    }

    @Override
    public void useDressingRoom(Customer c) throws NotEnoughArticlesException {
        if(this.dressingRooms >0 && this.dressingRooms < 4){
            if(c.listOfCustomerArticles.size() < 1 && c.listOfCustomerArticles.size() > 3){
                throw new NotEnoughArticlesException();
            }else{
                this.dressingRooms--;
            }
        }else{
            System.out.println("There are no dressing rooms!");
        }
    }

    @Override
    public void freeUpDressingRoom(){
        if(this.dressingRooms < 0 && this.dressingRooms >4) {
            System.out.println("Problem!");
        }else if(this.dressingRooms < 3){
            this.dressingRooms++;
        }
    }

    @Override
    public void addCustomerInShop(Customer c) throws TooManyCustomersException {
        if(listOfCustomers.size()<100){
            listOfCustomers.add(c);
        }else{
            throw new TooManyCustomersException();
        }
    }

    @Override
    public void showAllCustomersFromShop() {
        this.listOfCustomers.stream().forEach(System.out::println);
    }

    @Override
    public void showAllTheArticlesFromShop() {
        this.listOfArticles.stream().forEach(System.out::println);
    }

    @Override
    public void addArticleForCustomer(Customer c, Article a) {
        c.listOfCustomerArticles.add(a);
    }

    @Override
    public void showCustomerArticles(Customer c) {
        c.listOfCustomerArticles.stream().forEach(System.out::println);
    }

    @Override
    public void addArticleInShop(Article a){
        this.listOfArticles.add(a);
    }

    @Override
    public int moneySpentByCustomer(Customer c) {
        int sum = 0;
        int price = 0;
        if(!c.listOfCustomerArticles.isEmpty()){
            for(int i = 0; i < c.listOfCustomerArticles.size(); i++){
                Article a = c.listOfCustomerArticles.get(i);
                price = a.getPriceOfArticle();
                if(a instanceof TShirt  && c.isDiscountCard() == true ){
                    price = 15/100*price;
                }
                return sum += price;
            }
        }else{
            System.out.println("The customer has 0 articles");
        }
        return sum;
    }
}
