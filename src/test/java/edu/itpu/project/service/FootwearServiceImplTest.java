package edu.itpu.project.service;

import edu.itpu.project.model.Footwear;
import edu.itpu.project.dao.FootwearDao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class FootwearServiceImplTest {

    private FootwearServiceImpl footwearService;
    private FootwearDao footwearDao;

    @BeforeEach
    void setUp() {
        footwearDao = Mockito.mock(FootwearDao.class);
        footwearService = new FootwearServiceImpl(footwearDao);
    }

    @Test
    void getProductsById() {
        // Mock the data
        List<Footwear> mockFootwearList = Arrays.asList(
                new Footwear("Nike Air Jordan 1 Low", 123L, "Sneakers",
                        "Lucky Green", 40, 2, 110),
                new Footwear("Adidas Samba Classic", 234L, "Sneakers",
                        "Black", 42, 1, 90)
        );
        when(footwearDao.all()).thenReturn(mockFootwearList);

        // Call the method under test
        List<Footwear> result = footwearService.getProductsById(123L);

        // Verify the result
        assertEquals(1, result.size());
        assertEquals("Nike Air Jordan 1 Low", result.get(0).getName());
        assertEquals(123L, result.get(0).getId());
    }

    @Test
    void getProductsByName() {
        // Mock the data
        List<Footwear> mockFootwearList = Arrays.asList(
                new Footwear("Nike Air Jordan 1 Low", 123L, "Sneakers",
                        "Lucky Green", 40, 2, 110),
                new Footwear("Nike Air Jordan 1 Low", 567L, "Sneakers",
                        "Lucky Green", 41, 1, 120)
        );
        when(footwearDao.all()).thenReturn(mockFootwearList);

        // Call the method under test
        List<Footwear> result = footwearService.getProductsByName("Nike Air Jordan 1 Low");

        // Verify the result
        assertEquals(2, result.size());
        assertEquals("Nike Air Jordan 1 Low", result.get(0).getName());
        assertEquals("Nike Air Jordan 1 Low", result.get(1).getName());
    }

    @Test
    void getSortedProducts() {
        // Mock the data
        List<Footwear> mockFootwearList = Arrays.asList(
                new Footwear("Nike Air Jordan 1 Low", 123L, "Sneakers",
                        "Lucky Green", 40, 2, 110),
                new Footwear("Adidas Samba Classic", 234L, "Sneakers",
                        "Black", 42, 1, 90),
                new Footwear("Adidas Samba Classic", 1234L, "Sneakers",
                        "White", 40, 1, 90)
        );
        when(footwearDao.all()).thenReturn(mockFootwearList);

        // Call the method under test
        List<Footwear> result = footwearService.getSortedProducts();

        // Verify the result
        assertEquals(3, result.size());
        assertEquals("Adidas Samba Classic", result.get(0).getName());
        assertEquals("Adidas Samba Classic", result.get(1).getName());
        assertEquals("Nike Air Jordan 1 Low", result.get(2).getName());
    }

    @Test
    void getPurchasableProducts() {
        // Mock the data
        List<Footwear> mockFootwearList = Arrays.asList(
                new Footwear("Nike Air Jordan 1 Low", 123L, "Sneakers",
                        "Lucky Green", 40, 2, 110),
                new Footwear("Adidas Samba Classic", 234L, "Sneakers",
                        "Black", 42, 1, 90),
                new Footwear("Adidas Samba Classic", 1234L, "Sneakers",
                        "White", 40, 1, 90)
        );
        when(footwearDao.all()).thenReturn(mockFootwearList);

        // Call the method under test
        List<Footwear> result = footwearService.getPurchasableProducts(100);

        // Verify the result
        assertEquals(2, result.size());
        assertEquals("Adidas Samba Classic", result.get(0).getName());
        assertEquals("Adidas Samba Classic", result.get(1).getName());
    }
}
