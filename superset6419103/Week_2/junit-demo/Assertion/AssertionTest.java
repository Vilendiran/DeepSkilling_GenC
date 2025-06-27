package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AssertionTest {
    @Test
    public void testAssertion() {
        assertEquals(13, 10 + 3);
        assertTrue(13 > 10);
        assertFalse(13 < 10);
        assertNull(null);
        assertNotNull(new object());
    }
}
