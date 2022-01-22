package day03;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WebShopTest {

    @Test
    void getUsersTest() {
        Product product = new Product("Alma", 100);
        Good good = new Good("Alma", 100);
        Service service = new Service("Alma", 100);
        User user = new User("Jhony", new ArrayList<>(), 100000000000D);
        WebShop ws = new WebShop(List.of(user), List.of(product));
        ws.userBuyProduct("Jhony", "Alma");
        System.out.println(user.getBoughtProducts());
        assertThrows(IllegalArgumentException.class, () -> ws.userBuyProduct("nemtudom", "miértnem"));
    }
}