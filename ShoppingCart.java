package shoppingCart;

import java.util.*;

public class ShoppingCart {
	
	private String customerName;
    private String currentDate;
    private ArrayList<ItemToPurchase> cartItems;


    public ShoppingCart() {
        customerName = "none";
        currentDate = "January 1, 2016";
        cartItems = new ArrayList<>();
    }


    public ShoppingCart(String name, String date) {
        customerName = name;
        currentDate = date;
        cartItems = new ArrayList<>();
    }


    public String getCustomerName() {
        return customerName;
    }


    public String getDate() {
        return currentDate;
    }


    public void addItem(ItemToPurchase item) {
        cartItems.add(item);
    }


    public void removeItem(String itemName) {
        boolean found = false;
        for (int i = 0; i < cartItems.size(); i++) {
            if (cartItems.get(i).getName().equals(itemName)) {
                cartItems.remove(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found in cart. Nothing removed.");
        }
    }


    public void modifyItem(ItemToPurchase item) {
        boolean found = false;
        for (ItemToPurchase cartItem : cartItems) {
            if (cartItem.getName().equals(item.getName())) {
                if (!item.getDescription().equals("none")) {
                    cartItem.setDescription(item.getDescription());
                }
                if (item.getPrice() != 0) {
                    cartItem.setPrice(item.getPrice());
                }
                if (item.getQuantity() != 0) {
                    cartItem.setQuantity(item.getQuantity());
                }
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found in cart. Nothing modified.");
        }
    }


    public int getNumItemsInCart() {
        int total = 0;
        for (ItemToPurchase item : cartItems) {
            total += item.getQuantity();
        }
        return total;
    }


    public Double getCostOfCart() {
        double totalCost = 0.0;
        for (ItemToPurchase item : cartItems) {
            totalCost += item.getPrice() * item.getQuantity();
        }
        return totalCost;
    }


    public void printTotal() {
        System.out.println(customerName + "'s Shopping Cart - " + currentDate);
        System.out.println("Number of Items: " + getNumItemsInCart());
        System.out.println();
        if (cartItems.isEmpty()) {
            System.out.println("SHOPPING CART IS EMPTY");
        } else {
            for (ItemToPurchase item : cartItems) {
               // item.printItemCost();
               System.out.println(item.getName() + " " + item.getQuantity() + " @ $" + item.getPrice() + " = $" + item.getPrice() * item.getQuantity());
            }
        }
        System.out.println("\nTotal: $" + getCostOfCart());
    }


    public void printDescriptions() {
        System.out.println(customerName + "'s Shopping Cart - " + currentDate);
        System.out.println("\nItem Descriptions");
        if (cartItems.isEmpty()) {
            System.out.println("SHOPPING CART IS EMPTY");
        } else {
            for (ItemToPurchase item : cartItems) {
                System.out.println(item.getName() + ": " + item.getDescription());
            }
        }
    }
}


