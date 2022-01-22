package day03;

import java.util.ArrayList;
import java.util.List;

public class WebShop {
    private List<User> users = new ArrayList<>();
    private List<Product> products = new ArrayList<>();


    public void userBuyProduct(String user, String product) {
        User userUser = findUser(user);
        Product productProduct = findProduct(product);

        if (userUser.getMoney() > productProduct.getPrice()) {
            if (userUser.getMoney() >= productProduct.getPrice() * 3) {
                userUser.buyProduct(productProduct, true);
            } else {
                userUser.buyProduct(productProduct, false);
            }
        }
    }

    private User findUser(String user) {
        for (User u : users) {
            if (u.getName().equals(user)) {
                return u;
            }
        }
        throw new IllegalArgumentException("no user with this name");
    }

    private Product findProduct(String product) {
        for (Product p : products) {
            if (p.getName().equals(product)) {
                return p;
            }
        }
        throw new IllegalArgumentException("no product with this name");
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Product> getProducts() {
        return products;
    }

    public WebShop(List<User> users, List<Product> products) {
        this.users = users;
        this.products = products;
    }
}
