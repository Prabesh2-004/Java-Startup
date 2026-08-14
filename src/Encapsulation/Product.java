package Encapsulation;

public class Product {
//    String name;
//    double price; // if you do this every file can access this variable so we need to make it private so only by methods can access

    private String name;
    private double price;

    public void setName(String name) {
        this.name = name;  // this.name mean is the object "Product" which is calling private String name
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
