package Encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Phone");
        product.setPrice(100.99);
        System.out.println(product.getName() + " : " + product.getPrice());
    }
}
