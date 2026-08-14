package Constructors;

public class Constructors {
    public static void main(String[] args) {
        Product product = new Product();
        Product product1 = new Product("Phone", 99.99);
        System.out.println(product.getName() + " : " + product.getPrice());
        System.out.println(product1.getName() + " : " + product1.getPrice());
    }
}
