package edu.itpu.project.bean;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClothesTest {
    private Clothes clothes1;
    private Clothes clothes2;

    @BeforeEach
    void setUp() {
        clothes1 = new Clothes("Shirt", 1L, "Tops", "Blue", "M", 5, 30);
        clothes2 = new Clothes("Pants", 2L, "Bottoms", "Black", "L", 10, 50);
    }

    @Test
    void getCategory() {
        assertEquals("Tops", clothes1.getCategory());
    }

    @Test
    void getColor() {
        assertEquals("Blue", clothes1.getColor());
    }

    @Test
    void getSize() {
        assertEquals("M", clothes1.getSize());
    }

    @Test
    void testEquals() {
        // Clothes with different attributes should not be equal
        assertNotEquals(clothes1, clothes2);

        // Clothes with the same attributes should be equal
        Clothes clothes1Copy = new Clothes("Shirt", 1L, "Tops",
                                        "Blue", "M", 5, 30);
        assertEquals(clothes1, clothes1Copy);
    }

    @Test
    void testHashCode() {
        // Equal objects should have the same hashCode
        Clothes clothes1Copy = new Clothes("Shirt", 1L, "Tops",
                                        "Blue", "M", 5, 30);
        assertEquals(clothes1.hashCode(), clothes1Copy.hashCode());

        // Unequal objects may have the same hashCode, but it is not a requirement
        assertNotEquals(clothes1.hashCode(), clothes2.hashCode());
    }

    @Test
    void testToString() {
        String expected = "Clothes{name='Shirt', id=1, category='Tops', color='Blue', size='M', quantity=5, price=30}";
        assertEquals(expected, clothes1.toString());
    }

    @Test
    void compareTo() {
        // Clothes with different names should be compared based on name
        assertTrue(clothes1.compareTo(clothes2) > 0);
        assertTrue(clothes2.compareTo(clothes1) < 0);

        // Clothes with the same name should return 0
        Clothes clothes1Copy = new Clothes("Shirt", 1L, "Tops",
                                        "Blue", "M", 5, 30);
        assertEquals(0, clothes1.compareTo(clothes1Copy));
    }
}