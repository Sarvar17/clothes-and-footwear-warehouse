package edu.itpu.project.controller;

import edu.itpu.project.model.Clothes;
import edu.itpu.project.service.ClothesService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class ClothesControllerTest {

    private ClothesController clothesController;
    private ClothesService clothesService;

    @BeforeEach
    void setUp() {
        clothesService = Mockito.mock(ClothesService.class);
        clothesController = new ClothesController(clothesService);
    }

    @Test
    void displayProductsById() {
        // Mock the data
        List<Clothes> mockClothesList = Arrays.asList(
                new Clothes("Ocean Blue Shirt", 1234L, "Shirt",
                        "Ocean blue", "L", 2, 30),
                new Clothes("Yellow Wool Jumper", 2345L, "Jumper",
                        "Yellow", "M", 1, 60)
        );
        when(clothesService.getProductsById(1234L)).thenReturn(mockClothesList);

        // Redirect console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalPrintStream = System.out;
        System.setOut(new PrintStream(outputStream));

        // Call the method under test
        clothesController.displayProductsById(1234L);

        // Restore console output
        System.setOut(originalPrintStream);

        // Verify the console output against the expected data
        String expectedOutput = "Clothes{name='Ocean Blue Shirt', id=1234, category='Shirt', " +
                "color='Ocean blue', size='L', quantity=2, price=30}" + System.lineSeparator() +
                "Clothes{name='Yellow Wool Jumper', id=2345, category='Jumper', " +
                "color='Yellow', size='M', quantity=1, price=60}" + System.lineSeparator();
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    void displayProductsByName() {
        // Mock the data
        List<Clothes> mockClothesList = Arrays.asList(
                new Clothes("Ocean Blue Shirt", 1234L, "Shirt",
                        "Ocean blue", "L", 2, 30),
                new Clothes("Ocean Blue Shirt", 5678L, "Shirt",
                        "Ocean blue", "XL", 1, 35)
        );
        when(clothesService.getProductsByName("Ocean Blue Shirt")).thenReturn(mockClothesList);

        // Redirect console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalPrintStream = System.out;
        System.setOut(new PrintStream(outputStream));

        // Call the method under test
        clothesController.displayProductsByName("Ocean Blue Shirt");

        // Restore console output
        System.setOut(originalPrintStream);

        // Verify the console output against the expected data
        String expectedOutput = "Clothes{name='Ocean Blue Shirt', id=1234, category='Shirt', " +
                "color='Ocean blue', size='L', quantity=2, price=30}" + System.lineSeparator() +
                "Clothes{name='Ocean Blue Shirt', id=5678, category='Shirt', " +
                "color='Ocean blue', size='XL', quantity=1, price=35}" + System.lineSeparator();
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    void displaySortedProducts() {
        // Mock the data
        List<Clothes> mockClothesList = Arrays.asList(
                new Clothes("Yellow Wool Jumper", 2345L, "Jumper",
                        "Yellow", "M", 1, 60),
                new Clothes("Ocean Blue Shirt", 1234L, "Shirt",
                        "Ocean blue", "L", 2, 30)
        );
        when(clothesService.getSortedProducts()).thenReturn(mockClothesList);

        // Redirect console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalPrintStream = System.out;
        System.setOut(new PrintStream(outputStream));

        // Call the method under test
        clothesController.displaySortedProducts();

        // Restore console output
        System.setOut(originalPrintStream);

        // Verify the console output against the expected data
        String expectedOutput = "Clothes{name='Yellow Wool Jumper', id=2345, category='Jumper', " +
                "color='Yellow', size='M', quantity=1, price=60}" + System.lineSeparator() +
                "Clothes{name='Ocean Blue Shirt', id=1234, category='Shirt', " +
                "color='Ocean blue', size='L', quantity=2, price=30}" + System.lineSeparator();
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    void displayPurchasableProducts() {
        // Mock the data
        List<Clothes> mockClothesList = Arrays.asList(
                new Clothes("Ocean Blue Shirt", 1234L, "Shirt",
                        "Ocean blue", "L", 2, 30),
                new Clothes("White Shirt", 5678L, "Shirt",
                        "White", "L", 1, 25)
        );
        when(clothesService.getPurchasableProducts(40)).thenReturn(mockClothesList);

        // Redirect console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalPrintStream = System.out;
        System.setOut(new PrintStream(outputStream));

        // Call the method under test
        clothesController.displayPurchasableProducts(40);

        // Restore console output
        System.setOut(originalPrintStream);

        // Verify the console output against the expected data
        String expectedOutput = "Clothes{name='Ocean Blue Shirt', id=1234, category='Shirt', " +
                "color='Ocean blue', size='L', quantity=2, price=30}" + System.lineSeparator() +
                "Clothes{name='White Shirt', id=5678, category='Shirt', " +
                "color='White', size='L', quantity=1, price=25}" + System.lineSeparator();
        assertEquals(expectedOutput, outputStream.toString());
    }
}
