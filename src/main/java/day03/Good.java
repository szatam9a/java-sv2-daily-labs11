package day03;

import java.time.LocalDate;

public class Good extends Product{
    public Good(Product product , boolean warranty) {
        super(product, warranty);
        LocalDate now = LocalDate.now();
        if (warranty) {
            this.setBestBefore(LocalDate.of(now.getYear() + 3, now.getMonth(), now.getDayOfMonth()));
        } else {
            if (now.getMonth().getValue() > 9) {
                this.setBestBefore(LocalDate.of(now.getYear(), now.getMonth().getValue() - 12 + 3, now.getDayOfMonth()));
            } else
                this.setBestBefore(LocalDate.of(now.getYear(), now.getMonth().getValue() + 3, now.getDayOfMonth()));
        }
    }

    public Good(String name, int price) {
        super(name, price);
    }
}
