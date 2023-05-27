package edu.itpu.project.bean;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    private Product product;

    @BeforeEach
    void setUp() {
        product = new Footwear("Shoes", 1L, "Casual", "Black", 42, 10, 50);
    }

    @Test
    void getName() {
        assertEquals("Shoes", product.getName());
    }

    @Test
    void setName() {
        product.setName("Boots");
        assertEquals("Boots", product.getName());
    }

    @Test
    void getId() {
        assertEquals(1L, product.getId());
    }

    @Test
    void setId() {
        product.setId(2L);
        assertEquals(2L, product.getId());
    }

    @Test
    void getQuantity() {
        assertEquals(10, product.getQuantity());
    }

    @Test
    void setQuantity() {
        product.setQuantity(20);
        assertEquals(20, product.getQuantity());
    }

    @Test
    void getPrice() {
        assertEquals(50, product.getPrice());
    }

    @Test
    void setPrice() {
        product.setPrice(60);
        assertEquals(60, product.getPrice());
    }
}