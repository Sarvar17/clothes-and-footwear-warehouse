package edu.itpu.project.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FootwearTest {
    private Footwear footwear1;
    private Footwear footwear2;

    @BeforeEach
    void setUp() {
        footwear1 = new Footwear("Shoes", 1L, "Casual", "Black", 42, 10, 50);
        footwear2 = new Footwear("Boots", 2L, "Formal", "Brown", 41, 5, 80);
    }

    @Test
    void getCategory() {
        assertEquals("Casual", footwear1.getCategory());
    }

    @Test
    void getColor() {
        assertEquals("Black", footwear1.getColor());
    }

    @Test
    void getSize() {
        assertEquals(42, footwear1.getSize());
    }

    @Test
    void testEquals() {
        // Footwear with different attributes but same ID should not be equal
        assertNotEquals(footwear1, footwear2);

        // Footwear with the same attributes should be equal
        Footwear footwear1Copy = new Footwear("Shoes", 1L, "Casual", "Black",
                                            42, 10, 50);
        assertEquals(footwear1.getName(), footwear1Copy.name);
        assertEquals(footwear1, footwear1Copy);
    }

    @Test
    void testHashCode() {
        // Equal objects should have the same hashCode
        Footwear footwear1Copy = new Footwear("Shoes", 1L, "Casual", "Black",
                                            42, 10, 50);
        assertEquals(footwear1.hashCode(), footwear1Copy.hashCode());

        // Unequal objects may have the same hashCode, but it is not a requirement
        assertNotEquals(footwear1.hashCode(), footwear2.hashCode());
    }

    @Test
    void testToString() {
        String expected = "Footwear{name='Shoes', id=1, category='Casual', color='Black', size=42, quantity=10, price=50}";
        assertEquals(expected, footwear1.toString());
    }

    @Test
    void compareTo() {
        // Footwear with different names should be compared based on name
        assertTrue(footwear1.compareTo(footwear2) > 0);
        assertTrue(footwear2.compareTo(footwear1) < 0);

        // Footwear with the same name should return 0
        Footwear footwear1Copy = new Footwear("Shoes", 1L, "Casual", "Black",
                42, 10, 50);
        assertEquals(0, footwear1.compareTo(footwear1Copy));
    }
}