package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NormalUserTest {

    @Test
    void getUserEmailTest() {
        NormalUser normalUser = new NormalUser("email","password");
        assertEquals("email", normalUser.getUserEmail());
    }

    @Test
    void getPasswordTest() {
        NormalUser normalUser = new NormalUser("email","password");
        assertEquals("password", normalUser.getPassword());
    }

}