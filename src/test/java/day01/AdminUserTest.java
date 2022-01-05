package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminUserTest {

    @Test
    void getUserEmailTest() {
        AdminUser adminUser = new AdminUser("email","password");
        assertEquals("email", adminUser.getUserEmail());
    }

    @Test
    void getPasswordTest() {
        AdminUser adminUser = new AdminUser("email","password");
        assertEquals("********", adminUser.getPassword());
    }
}