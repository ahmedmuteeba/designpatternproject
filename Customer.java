import java.util.ArrayList;

public class Customer {
    public String lastName;
    public String firstName;
    public boolean discountCard;
    public ArrayList<Article> listOfCustomerArticles;

    public Customer(String lastName, String firstName, boolean discountCard) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.discountCard = discountCard;
        this.listOfCustomerArticles = new ArrayList<>();
    }

    public String toString() {
        return lastName + "~" + firstName + "~" + discountCard;
    }
}
