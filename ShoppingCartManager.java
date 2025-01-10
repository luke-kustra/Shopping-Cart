package shoppingCart;

import java.util.*;

public class ShoppingCartManager {

	
    public static void printMenu(ShoppingCart cart, Scanner scanner) {
        while (true) {
            System.out.println();
            System.out.println("MENU");
            System.out.println("a - Add item to cart");
            System.out.println("d - Remove item from cart");
            System.out.println("c - Change item quantity");
            System.out.println("i - Output items' descriptions");
            System.out.println("o - Output shopping cart");
            System.out.println("q - Quit");
            System.out.println();
            System.out.println("Choose an option:");
            char option = scanner.next().charAt(0);
            while ((option != 'a') && (option != 'd') && (option != 'c') && (option != 'i') && (option != 'o') && (option != 'q')) {
                System.out.println("Choose an option:");
                option = scanner.next().charAt(0);
            }
            if (option == 'q') {
                break;
            }


            scanner.nextLine();


            switch (option) {
                case 'a':
                    System.out.println("ADD ITEM TO CART");
                    System.out.println("Enter the item name:");
                    String name = scanner.nextLine();


                    System.out.println("Enter the item description:");
                    String desc = scanner.nextLine();


                    System.out.println("Enter the item price:");
                    double price = scanner.nextDouble();


                    System.out.println("Enter the item quantity:");
                    int quan = scanner.nextInt();


                    scanner.nextLine();


                    ItemToPurchase item = new ItemToPurchase(name, desc, price, quan);
                    cart.addItem(item);
                    break;


                case 'd':
                    System.out.println("REMOVE ITEM FROM CART");
                    System.out.println("Enter name of item to remove:");
                   
                    name = scanner.nextLine();
                    cart.removeItem(name);
                    break;


                case 'c':
                    System.out.println("CHANGE ITEM QUANTITY");
                    System.out.println("Enter the item name:");
                    name = scanner.nextLine();


                    System.out.println("Enter the new quantity:");
                    quan = scanner.nextInt();


                    scanner.nextLine();


                    item = new ItemToPurchase();
                    item.setName(name);
                    item.setQuantity(quan);
                    cart.modifyItem(item);
                    break;


                case 'i':
                    System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
                    cart.printDescriptions();
                    break;


                case 'o':
                    System.out.println("OUTPUT SHOPPING CART");
                    cart.printTotal();
                    break;
            }
        }
    }
    
    public static void executeMenu(char option, ShoppingCart cart, Scanner scanner) {
        switch (option) {
            case 'a':
                System.out.println("ADD ITEM TO CART");
                System.out.println("Enter the item name:");
                String name = scanner.nextLine();
                System.out.println("Enter the item description:");
                String desc = scanner.nextLine();
                System.out.println("Enter the item price:");
                Double price = scanner.nextDouble();
                System.out.println("Enter the item quantity:");
                int quan = scanner.nextInt();
                scanner.nextLine();
                ItemToPurchase item = new ItemToPurchase(name, desc, price, quan);
                cart.addItem(item);
                break;


            case 'd':
                System.out.println("REMOVE ITEM FROM CART");
                System.out.println("Enter name of item to remove:");
                name = scanner.nextLine();
                cart.removeItem(name);
                break;


            case 'c':
                System.out.println("CHANGE ITEM QUANTITY");
                System.out.println("Enter the item name:");
                name = scanner.nextLine();
                System.out.println("Enter the new quantity:");
                quan = scanner.nextInt();
                scanner.nextLine();
                ItemToPurchase item1 = new ItemToPurchase();
                item1.setName(name);
                item1.setQuantity(quan);
                cart.modifyItem(item1);
                break;


            case 'i':
                System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
                cart.printDescriptions();
                break;


            case 'o':
                System.out.println("OUTPUT SHOPPING CART");
                cart.printTotal();
                break;


            default:
                System.out.println("Choose a valid option.");
                break;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter customer's name:");
        String customerName = scanner.nextLine();


        System.out.println("Enter today's date:");
        String date = scanner.nextLine();


        System.out.println();
        ShoppingCart cart = new ShoppingCart(customerName, date);


        System.out.println("Customer name: " + cart.getCustomerName());
        System.out.println("Today's date: " + cart.getDate());


        printMenu(cart, scanner);
    }
}

	

