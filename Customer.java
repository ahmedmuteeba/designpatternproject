import java.util.*;
public class Customer{
    private String lastName;
    private String firstName;
    private boolean discountCard;
    ArrayList <Article> listOfCustomerArticles = null;

    private Customer(String lastName, String firstName, boolean discountCard){
        this.lastName = lastName;
        this.firstName = firstName;
        this.discountCard = discountCard;
        this.listOfCustomerArticles = new ArrayList<>();
    }

    public static Customer getCustomer(String lastName, String firstName, boolean discountCard) {
        return new Customer(lastName, firstName, discountCard);
    }

    @Override
    public String toString(){
        return this.lastName + "~" + this.firstName + "~" + this.discountCard;
    }

    public String getLastName() {
        return  this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public boolean isDiscountCard() {
        return this.discountCard;
    }
}