package day03;

import java.time.LocalDate;

public class Service extends Product {
    public Service(Product product, boolean warranty) {
        super(product, warranty);
        LocalDate now = LocalDate.now();
        setBestBefore(LocalDate.of(now.getYear() + 1, now.getMonth(), now.getDayOfMonth()));
    }

    public Service(String name, int price) {
        super(name, price);
    }
}
