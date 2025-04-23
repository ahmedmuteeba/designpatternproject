public class AddCustomerCommand implements Command {
    private Shop shop;
    private Customer customer;

    public AddCustomerCommand(Shop shop, Customer customer) {
        this.shop = shop;
        this.customer = customer;
    }

    public void execute() {
        try {
            shop.addCustomerInShop(customer);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
