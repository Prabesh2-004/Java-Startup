package Generics;

public class ProductMain {
    public static void main(String[] args) {

        Product<String, Double> product1 = new Product<>();
        product1.setProduct("Apple", 10.99);
        System.out.println(product1.getItems());
        System.out.println(product1.getPrice());



        Product<Boolean, Integer> product2 = new Product<>();
        product2.setProduct(true, 5);
        System.out.println(product2.getItems());
        System.out.println(product2.getPrice());
    }
}
