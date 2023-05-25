import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String restaurant_name = "Brampton Hamburgers";
        double bill_of_all_customer = 0.0;
        System.out.println("Welcome to " + restaurant_name);
        System.out.println("------------------------------");
        System.out.println("Menu:");
        System.out.println("Type of Burger\t\tPrice");
        System.out.println("1. Veggie Burger\t\t$5.95");
        System.out.println("2. Deluxe Veggie Burger\t\t$7.95");
        System.out.println("3. Chicken Burger\t\t$6.45");
        System.out.println("4. Cheese Chicken Burger\t$8.50");
        System.out.println("5. Cheese Bacon Burger\t\t$9.25");
        System.out.println("6. Deluxe Bacon Burger\t\t10.95");
        System.out.println("7. Healthy Organic Burger\t$12.45");
        System.out.println("8. Quit");
        System.out.println("------------------------------");

        for (int customer = 1; customer <= 5; customer++) {
            System.out.println("Customer " + customer);
           

           double total_bill=0;
            while (true) {
                try {
                    System.out.print("Select an item (1-8): ");
                    int choice = scanner.nextInt();

                    if (choice < 1 || choice > 8) {
                        throw new Exception("Invalid choice. Please select an item between 1 and 8.");
                    }

                    if (choice == 8) {
                        break; // Exit the loop if choice is 8 (Quit)
                    }

                    System.out.print("Enter the quantity: ");
                    int quantity = scanner.nextInt();

                    double price = 0.0;

                    switch (choice) {
                        case 1:
                            price = 5.95;
                            break;
                        case 2:
                            price = 7.95;
                            break;
                        case 3:
                            price = 6.45;
                            break;
                        case 4:
                            price = 8.50;
                            break;
                        case 5:
                            price = 9.25;
                            break;
                        case 6:
                            price = 10.95;
                            break;
                        case 7:
                            price = 12.45;
                            break;
                    }

                    double bill = price * quantity;
                       double tax =0.13*bill;
                        total_bill=bill+tax;
                       if (total_bill > 100) {
                        total_bill *= 0.9; 
                    } else if (total_bill > 50) {
                        total_bill *= 0.95;
                    }

                                   
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    scanner.nextLine(); 
                }
            }
        
        System.out.printf("Total bill is %.2f \n", total_bill);
        
        bill_of_all_customer+=total_bill;
          

           
        }
        System.out.println("------------------------------");
        System.out.printf("Total bill of 5 customer  is : $ %.2f \n" ,bill_of_all_customer);
       
       
    }
}
