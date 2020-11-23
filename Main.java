import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Buyer[] buyer = new Buyer[3];
        buyer[0] = new Buyer("Mike", 18, "Male");
        buyer[1] = new Buyer("Emma", 23, "Female");
        buyer[2] = new Buyer("Jack", 35, "Male");
        Product[] phone = new Product[3];
        phone[0] = new Product("Samsung Galaxy S20", 299, "Samsung");
        phone[1] = new Product("iPhone 12 Pro", 999, "Apple");
        phone[2] = new Product("Xiaomi Redmi Note 8", 199, "Xiaomi Corporation");
        Order[] orders = new Order[20];
        orders[0] = new Order(buyer[0], phone[0]);
        orders[1] = new Order(buyer[2], phone[2]);
        orders[2] = new Order(buyer[1], phone[0]);
        orders[3] = new Order(buyer[0], phone[1]);
        orders[4] = new Order(buyer[1], phone[2]);
        while (true) {
            System.out.println("1 - information about all orders\n" +
                    "2 - enter new order\n" +
                    "3 - leave from the program\n" +
                    "Enter a number: ");
            int num = sc.nextInt();
            System.out.println("------------------------------------------------------------------");

            if (num == 1) {
                for (int i = 0; i < 20; i++) {
                    if (orders[i] != null) {
                        System.out.println(orders[i].getBuyer() + " bought " + orders[i].getProduct());
                    } else break;
                }
            }
            else if (num == 2) {
                System.out.println("Select the person who placed the order:");
                for (int i = 0; i < 3; i++) {
                    System.out.println((i + 1) + " - " + buyer[i].getName() + " ");
                }
                int numBuyer = (sc.nextInt()) - 1;
                System.out.println("Choose what " + buyer[numBuyer] + " bought");
                for (int i = 0; i < 3; i++) {
                    System.out.println((i + 1) + " - " + phone[i].getName());
                }
                int numPhone = (sc.nextInt()) - 1;
                System.out.println("Information that " + buyer[numBuyer].getName()
                        + " bought the "+ phone[numPhone].getName()
                        + " is entered");
                for (int i = 0; i < 20; i++) {
                    if (orders[i] == null) {
                        orders[i] = new Order(buyer[numBuyer], phone[numPhone]);
                        break;
                    }
                }
            }
            else if (num == 3)
                break;
            System.out.println("------------------------------------------------------------------");
        }
    }
}
