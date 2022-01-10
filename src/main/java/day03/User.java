package day03;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Product> boughtProducts = new ArrayList<>();
    private double money;

    public User(String name, List<Product> boughtProducts, double money) {
        this.name = name;
        this.boughtProducts = boughtProducts;
        this.money = money;
    }

    public void buyProduct(Product product, boolean warrantyExtra) {
        boughtProducts.add(new Product(product, warrantyExtra));
        if (warrantyExtra) {
            money -= product.getPrice() * 1.1;
        } else money -= product.getPrice();
    }

    public double getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getBoughtProducts() {
        return boughtProducts;
    }

    public void setBoughtProducts(List<Product> boughtProducts) {
        this.boughtProducts = boughtProducts;
    }
}
