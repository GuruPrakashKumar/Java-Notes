import java.util.Scanner;

public class RestaurantBookingSystem {
    static final String DATE = "27/08/22";
    static final int A = -1;
    static int collection = 0;
    static int NoOfCustomers = 0;
    static int high = 0;

    // Menu
    static class MenuItem {
        String name;
        int price;

        MenuItem(String name, int price) {
            this.name = name;
            this.price = price;
        }
    }

    static MenuItem[] menu = {
        new MenuItem("1.Chicken Biryani", 200),
        new MenuItem("2.Mutton Biryani", 350),
        new MenuItem("3.Biryani ", 130),
        new MenuItem("4.Butter Chicken and Naan", 399),
        new MenuItem("5.Tandoori Chicken ", 249),
        new MenuItem("6.Punjabi Chicken with Lachha Paratha", 359),
        new MenuItem("7.Masala Kulcha ", 110),
        new MenuItem("8.Chilli Paneer ", 269),
        new MenuItem("9.Chicken Hakka noodles", 210),
        new MenuItem("10.Fish Finger", 99),
        new MenuItem("11.Ice Cream", 89),
        new MenuItem("12.Soft Drink ", 59)
    };

    // Customer
    static int CId = 100;
    static int[] table = new int[84];
    
    static class Customer {
        String name;
        int number;
        String date = DATE;
        int[] ord = new int[5];
        int amount;
        int tab;
        int cust;
        int TS;
    }

    static Customer[] customers = new Customer[100];

    // Menu displaying function
    static void displayMenu() {
        System.out.println("--------------------------Menu------------------------\n\n\n");
        for (int i = 0; i < 12; i++) {
            System.out.printf("%-23s %-6d\n", menu[i].name, menu[i].price);
        }
    }

    // Booking status
    static void check(int n, int m) {
        for (int i = n; i < m; i++) {
            System.out.printf("%-23d ", i % 7 + 1);
            if (table[i] == 1) {
                System.out.println("Booked");
            } else {
                System.out.println("Not Booked");
            }
        }
    }

    // Adding a new customer function
    static void booking(int T, int S) {
        NoOfCustomers++;
        CId++;
        customers[CId - 101] = new Customer();
        Customer currentCustomer = customers[CId - 101];

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        currentCustomer.name = scanner.nextLine();
        System.out.print("Enter your phone number: ");
        currentCustomer.number = scanner.nextInt();
        
        currentCustomer.tab = T;
        currentCustomer.TS = S;

        int play = 1;
        displayMenu();
        System.out.print("Do you want to order something: ");
        int i = 0;
        currentCustomer.amount = 0;

        while (play == 1 && i < 5) {
            currentCustomer.ord[i] = scanner.nextInt();
            currentCustomer.amount += menu[currentCustomer.ord[i] - 1].price;
            collection += menu[currentCustomer.ord[i] - 1].price;
            i++;
            System.out.print("Do you want to order something else(1-yes, 0-No): ");
            play = scanner.nextInt();
        }

        currentCustomer.ord[i] = 0;
        i = 0;
        System.out.println("Customer ID - " + CId + "\n\n");
    }


    public static void main(String[] args) {
        int An;
        String luckyCustomer = "";
        int flag = 1;
        int c;

        Scanner scanner = new Scanner(System.in);

        while (flag == 1) {
            System.out.println("--------------------------Restaurant----------------------\n--\n\n\n");
            System.out.println("1. %-15s \t 2. %-15s \t 3. %-15s\n"+
                "4. %-15s \t 5. %-15s \t 6. %-15s \n" +
                "7. %-15s \t 0. %-15s \n","Booking","Check Table Availability","Collection","Total Customers","Highest Bill","Customer Details",
                "Menu","Exit");
            c = scanner.nextInt();

            // Booking Case
            if (c == 1) {
                System.out.println("In which time slot do you want to book-\n\n");
                System.out.println("1. 11:00 to 12:00\t2. 12:00 to 13:00\t3. 13:00 to 14:00\n" +
                    "4. 14:00 to 15:00\t5. 15:00 to 16:00\t6. 16:00 to 17:00\n" +
                    "7. 17:00 to 18:00\t8. 18:00 to 19:00\t9. 19:00 to 20:00\n" +
                    "10. 20:00 to 21:00\t11. 21:00 to 22:00\t12.22:00 to 23:00\n\n");
                int TS = scanner.nextInt();
                System.out.println("Available Tables-\n\n");
                System.out.println("Table Number- Status-\n");

                switch (TS) {
                    case 1:
                        check(0, 7);
                        break;
                    case 2:
                        check(7, 14);
                        break;
                    case 3:
                        check(14, 21);
                        break;
                    case 4:
                        check(21, 28);
                        break;
                    case 5:
                        check(28, 35);
                        break;
                    case 6:
                        check(35, 42);
                        break;
                    case 7:
                        check(42, 49);
                        break;
                    case 8:
                        check(49, 56);
                        break;
                    case 9:
                        check(56, 63);
                        break;
                    case 10:
                        check(63, 70);
                        break;
                    case 11:
                        check(70, 77);
                        break;
                    case 12:
                        check(77, 84);
                        break;
                    default:
                        System.out.println("Invalid Input\n");
                }

                System.out.println("Which table number do you want to book: ");
                int TN = scanner.nextInt();
                An = A + (TS - 1) * 7;

                if (table[An + TN] == 0) {
                    booking(TN, TS);
                    table[An + TN] = 1;
                    System.out.println("Booking Successful!\n\n");
                } else {
                    System.out.println("Sorry, this table is already booked\n");
                }
            }
        }
    }
}