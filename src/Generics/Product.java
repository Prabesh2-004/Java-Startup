package Generics;

public class Product<T, U> {
    T items;
    U price;

    public void setProduct(T items, U price) {
        this.items = items;
        this.price = price;
    }

    public T getItems() {
        return this.items;
    }

    public U getPrice() {
        return this.price;
    }
}
