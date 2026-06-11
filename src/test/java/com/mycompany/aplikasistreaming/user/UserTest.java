package com.mycompany.aplikasistreaming.user;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    public void testUserLoginSuccessWithEmail() {
        User user = new User("test@example.com", "testuser", "password123");
        assertTrue(user.login("test@example.com", "password123"));
    }

    @Test
    public void testUserLoginSuccessWithUsername() {
        User user = new User("test@example.com", "testuser", "password123");
        assertTrue(user.login("testuser", "password123"));
    }

    @Test
    public void testUserLoginFailureWrongPassword() {
        User user = new User("test@example.com", "testuser", "password123");
        assertFalse(user.login("testuser", "wrongpassword"));
    }

    @Test
    public void testGetters() {
        User user = new User("test@example.com", "testuser", "password123");
        assertEquals("test@example.com", user.getEmail());
        assertEquals("testuser", user.getUsername());
    }
}
