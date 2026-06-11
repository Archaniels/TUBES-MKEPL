package com.mycompany.aplikasistreaming.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    private User user;

    @BeforeEach
    public void setUp() {
        user = new User("test@example.com", "testuser", "password123");
    }

    @Test
    public void testUserLoginSuccessWithEmail() {
        assertTrue(user.login("test@example.com", "password123"));
    }

    @Test
    public void testUserLoginSuccessWithUsername() {
        assertTrue(user.login("testuser", "password123"));
    }

    @Test
    public void testUserLoginFailureWrongPassword() {
        assertFalse(user.login("testuser", "password123"));
    }

    @Test
    public void testGetEmailAndUsername() {
        assertEquals("test@example.com", user.getEmail());
        assertEquals("testuser", user.getUsername());
    }
}
