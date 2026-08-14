package Constructors;

public class Product {
    private String name;
    private double price;

    // Constructors are just like class but when object of class are created it will auto execute not need to call them specially

    public Product() {  // Default Constructors
        this.name = "Grocery";
        this.price = 12.99;
    }

    public Product(String name, double price) { // Parameterize Constructors
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return  price;
    }
}
