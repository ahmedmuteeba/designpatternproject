import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        ThreadForTime tft = new ThreadForTime();
        Thread t = new Thread(tft);
        t.start();

        Scanner sc = new Scanner(System.in);
        String[] commandsArr;
        Shop shop = Shop.getShop();
        Customer c = Customer.getCustomer("Andrew", "Giant", true);
        Article a = Jeans.getJeans(10, "BLUE", true);

        while(true) {
            System.out.println("Type a command");
            commandsArr = sc.nextLine().toUpperCase().split("\s+");
            try {
                switch (commandsArr[0]) {
                    case "EXIT": System.out.println("Exit from shop!"); System.exit(0); break;
                    case "USEDRESSING": shop.useDressingRoom(c); break;
                    case "FREEUPDRESSING": shop.freeUpDressingRoom(); break;
                    case "ADDCUSTOMERINSHOP": shop.addCustomerInShop(c); break;
                    case "SHOWCUSTOMERSSHOP": shop.showAllCustomersFromShop(); break;
                    case "SHOWARTICLESSHOP": shop.showAllTheArticlesFromShop(); break;
                    case "SHOWCUSTOMERARTICLES": shop.showCustomerArticles(c); break;
                    case "ADDARTICLEFORCUSTOMER": shop.addArticleForCustomer(c, a); break;
                    case "ADDARTICLEINSHOP": shop.addArticleInShop(a); break;
                    case "CUSTOMERBILL": System.out.println("Customer spent: " + shop.moneySpentByCustomer(c)); break;
                    default: System.out.println("WRONG COMMAND!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
