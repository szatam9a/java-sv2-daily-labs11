package day03;

import java.time.LocalDate;

public class Product {
    private String name;
    private int price;
    private LocalDate bestBefore;

    public Product(Product product,boolean warranty) {
        this.name = product.name;
        this.price = product.price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getBestBefore() {
        return LocalDate.now();
    }

    public void setBestBefore(LocalDate bestBefore) {
        this.bestBefore = bestBefore;
    }


    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", bestBefore=" + bestBefore +
                '}';
    }

}
