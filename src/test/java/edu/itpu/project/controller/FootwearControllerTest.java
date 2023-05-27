package edu.itpu.project.controller;

import edu.itpu.project.bean.Footwear;
import edu.itpu.project.service.FootwearService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class FootwearControllerTest {

    private FootwearController footwearController;
    private FootwearService footwearService;

    @BeforeEach
    void setUp() {
        footwearService = Mockito.mock(FootwearService.class);
        footwearController = new FootwearController(footwearService);
    }

    @Test
    void displayProductsById() {
        // Mock the data
        List<Footwear> mockFootwearList = Arrays.asList(
                new Footwear("Nike Air Jordan 1 Low", 123L, "Sneakers",
                        "Lucky Green", 40, 2, 110),
                new Footwear("Adidas Samba Classic", 234L, "Sneakers",
                        "Black", 42, 1, 90)
        );
        when(footwearService.getProductsById(123L)).thenReturn(mockFootwearList);

        // Redirect console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalPrintStream = System.out;
        System.setOut(new PrintStream(outputStream));

        // Call the method under test
        footwearController.displayProductsById(123L);

        // Restore console output
        System.setOut(originalPrintStream);

        // Verify the console output against the expected data
        String expectedOutput = "Footwear{name='Nike Air Jordan 1 Low', id=123, category='Sneakers', " +
                "color='Lucky Green', size=40, quantity=2, price=110}" + System.lineSeparator() +
                "Footwear{name='Adidas Samba Classic', id=234, category='Sneakers', " +
                "color='Black', size=42, quantity=1, price=90}" + System.lineSeparator();
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    void displayProductsByName() {
        // Mock the data
        List<Footwear> mockFootwearList = Arrays.asList(
                new Footwear("Adidas Samba Classic", 1234L, "Sneakers",
                        "White", 40, 1, 90),
                new Footwear("Adidas Samba Classic", 2345L, "Sneakers",
                        "Blue", 43, 1, 90)
        );
        when(footwearService.getProductsByName("Adidas Samba Classic")).thenReturn(mockFootwearList);

        // Redirect console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalPrintStream = System.out;
        System.setOut(new PrintStream(outputStream));

        // Call the method under test
        footwearController.displayProductsByName("Adidas Samba Classic");

        // Restore console output
        System.setOut(originalPrintStream);

        // Verify the console output against the expected data
        String expectedOutput = "Footwear{name='Adidas Samba Classic', id=1234, category='Sneakers', " +
                "color='White', size=40, quantity=1, price=90}" + System.lineSeparator() +
                "Footwear{name='Adidas Samba Classic', id=2345, category='Sneakers', " +
                "color='Blue', size=43, quantity=1, price=90}" + System.lineSeparator();
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    void displaySortedProducts() {
        // Mock the data
        List<Footwear> mockFootwearList = Arrays.asList(
                new Footwear("Adidas Samba Classic", 234L, "Sneakers",
                        "Black", 42, 1, 90),
                new Footwear("Nike Air Jordan 1 Low", 123L, "Sneakers",
                        "Lucky Green", 40, 2, 110)
        );
        when(footwearService.getSortedProducts()).thenReturn(mockFootwearList);

        // Redirect console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalPrintStream = System.out;
        System.setOut(new PrintStream(outputStream));

        // Call the method under test
        footwearController.displaySortedProducts();

        // Restore console output
        System.setOut(originalPrintStream);

        // Verify the console output against the expected data
        String expectedOutput = "Footwear{name='Adidas Samba Classic', id=234, category='Sneakers', " +
                "color='Black', size=42, quantity=1, price=90}" + System.lineSeparator() +
                "Footwear{name='Nike Air Jordan 1 Low', id=123, category='Sneakers', " +
                "color='Lucky Green', size=40, quantity=2, price=110}" + System.lineSeparator();
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    void displayPurchasableProducts() {
        // Mock the data
        List<Footwear> mockFootwearList = Arrays.asList(
                new Footwear("Adidas Samba Classic", 1234L, "Sneakers",
                        "White", 40, 1, 90),
                new Footwear("Nike Air Jordan 1 Low", 5678L, "Sneakers",
                        "Black", 42, 2, 110)
        );
        when(footwearService.getPurchasableProducts(100)).thenReturn(mockFootwearList);

        // Redirect console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalPrintStream = System.out;
        System.setOut(new PrintStream(outputStream));

        // Call the method under test
        footwearController.displayPurchasableProducts(100);

        // Restore console output
        System.setOut(originalPrintStream);

        // Verify the console output against the expected data
        String expectedOutput = "Footwear{name='Adidas Samba Classic', id=1234, category='Sneakers', " +
                "color='White', size=40, quantity=1, price=90}" + System.lineSeparator() +
                "Footwear{name='Nike Air Jordan 1 Low', id=5678, category='Sneakers', " +
                "color='Black', size=42, quantity=2, price=110}" + System.lineSeparator();
        assertEquals(expectedOutput, outputStream.toString());
    }
}
