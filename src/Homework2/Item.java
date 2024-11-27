package Homework2;

public class Item {

    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void sell(int amount) {
        if (quantity < amount) {
            System.out.println("Not enough items.");
        } else {
            quantity -= amount;
        }
    }

    public void restock(int amount) {
        quantity += amount;
    }

    public String getInfo() {
        return "Item name: " + name + ", Item price: " + price + ", Item quantity: " + quantity;
    }

}
