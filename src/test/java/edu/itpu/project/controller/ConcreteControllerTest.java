package edu.itpu.project.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

class ConcreteControllerTest {

    private ConcreteController concreteController;
    private ClothesController clothesController;
    private FootwearController footwearController;

    @BeforeEach
    void setUp() {
        clothesController = Mockito.mock(ClothesController.class);
        footwearController = Mockito.mock(FootwearController.class);
        concreteController = new ConcreteController(clothesController, footwearController);
    }

    @Test
    void displayProductsById() {
        // Call the method under test
        concreteController.displayProductsById(123L);

        // Verify that the corresponding methods in clothesController and footwearController were called
        verify(clothesController).displayProductsById(123L);
        verify(footwearController).displayProductsById(123L);
    }

    @Test
    void displayProductsByName() {
        // Call the method under test
        concreteController.displayProductsByName("Nike");

        // Verify that the corresponding methods in clothesController and footwearController were called
        verify(clothesController).displayProductsByName("Nike");
        verify(footwearController).displayProductsByName("Nike");
    }

    @Test
    void displaySortedProducts() {
        // Call the method under test
        concreteController.displaySortedProducts();

        // Verify that the corresponding methods in clothesController and footwearController were called
        verify(clothesController).displaySortedProducts();
        verify(footwearController).displaySortedProducts();
    }

    @Test
    void displayPurchasableProducts() {
        // Call the method under test
        concreteController.displayPurchasableProducts(100);

        // Verify that the corresponding methods in clothesController and footwearController were called
        verify(clothesController).displayPurchasableProducts(100);
        verify(footwearController).displayPurchasableProducts(100);
    }
}
