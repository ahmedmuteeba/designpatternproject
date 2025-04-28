import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        ThreadForTime timeThread = new ThreadForTime();
        Thread t = new Thread(timeThread);
        t.start();

        Scanner sc = new Scanner(System.in);
        Shop shop = Shop.getShop(); // Singleton Pattern

        Customer customer = Customer.getCustomer("Andrew", "Giant", true); // Factory Method
        Article jeans = Jeans.getJeans(10, "BLUE", true); // Factory Method

        System.out.println("Welcome to FiberSync Fashion Store!");
        System.out.println("Customer: " + customer.getFirstName() + " " + customer.getLastName());
        System.out.println("Type one of the following commands to proceed:\n");

        while (true) {
            printMenu();

            System.out.print(">> ");
            String input = sc.nextLine().trim().toUpperCase();

            try {
                switch (input) {
                    case "USEDRESSING":
                        shop.useDressingRoom(customer);
                        System.out.println("Customer entered the dressing room.");
                        break;
                    case "FREEUPDRESSING":
                        shop.freeUpDressingRoom();
                        System.out.println("Dressing room freed.");
                        break;
                    case "ADDCUSTOMERINSHOP":
                        Command addCustomer = new AddCustomerCommand(shop, customer); // Command Pattern
                        addCustomer.execute();
                        System.out.println("Customer added to shop.");
                        break;
                    case "SHOWCUSTOMERSSHOP":
                        System.out.println("Customers in shop:");
                        shop.showAllCustomersFromShop();
                        break;
                    case "SHOWARTICLESSHOP":
                        System.out.println("Articles in shop:");
                        shop.showAllTheArticlesFromShop();
                        break;
                    case "SHOWCUSTOMERARTICLES":
                        System.out.println("Customer's articles:");
                        shop.showCustomerArticles(customer);
                        break;
                    case "ADDARTICLEFORCUSTOMER":
                        shop.addArticleForCustomer(customer, jeans);
                        System.out.println("Article added for customer.");
                        break;
                    case "ADDARTICLEINSHOP":
                        Command addArticle = new AddArticleCommand(shop, jeans); // Command Pattern
                        addArticle.execute();
                        System.out.println("Article added to shop.");
                        break;
                    case "CUSTOMERBILL":
                        int total = shop.moneySpentByCustomer(customer); // Strategy Pattern
                        System.out.println("Total amount spent by customer: $" + total);
                        break;
                    case "EXIT":
                        System.out.println("Thank you for visiting FiberSync! Exiting...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid command. Please choose from the menu.");
                }
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }

            System.out.println("--------------------------------------------------\n");
        }
    }

    private static void printMenu() {
        System.out.println("\n==================== MENU ====================");
        System.out.println("USEDRESSING            - Use dressing room");
        System.out.println("FREEUPDRESSING         - Free up dressing room");
        System.out.println("ADDCUSTOMERINSHOP      - Add customer to shop");
        System.out.println("SHOWCUSTOMERSSHOP      - Show all customers");
        System.out.println("SHOWARTICLESSHOP       - Show all articles");
        System.out.println("SHOWCUSTOMERARTICLES   - Show customer's articles");
        System.out.println("ADDARTICLEFORCUSTOMER  - Add article for customer");
        System.out.println("ADDARTICLEINSHOP       - Add article to shop");
        System.out.println("CUSTOMERBILL           - Show customer bill");
        System.out.println("EXIT                   - Exit the application");
        System.out.println("==============================================");
    }
}