package shoppingCart;

public class ItemToPurchase {
	
	private String itemDescription;
    private String name;
    private Double price;
    private int quantity;


    public ItemToPurchase()
    {
        itemDescription = "none";
        name = "none";
        price = 0.0;
        quantity = 0;
    }


    public ItemToPurchase(String name, String itemDescription, Double price, int quantity)
    {
        this.itemDescription = itemDescription;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


    public void setDescription(String itemDescription) {this.itemDescription = itemDescription;}
    public String getDescription(){return itemDescription;}


    public String getName() { return name;}
    public void setName(String name) {this.name = name;}


    public Double getPrice() {return price;}
    public void setPrice(Double price) {this.price = price;}


    public int getQuantity() {return quantity;}
    public void setQuantity(int quantity) {this.quantity = quantity;}




    public void printItemCost(ItemToPurchase firstItem)
    {
        System.out.println(firstItem.getName() + " " + firstItem.getQuantity() + " @ $" + firstItem.getPrice() + " = $" + firstItem.getQuantity()*firstItem.getPrice());


    }


    public void printItemDescription(ItemToPurchase item)
    {
        System.out.println(item.getName() + ": " + item.getDescription());
    }


}
