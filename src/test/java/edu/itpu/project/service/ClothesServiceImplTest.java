package edu.itpu.project.service;

import edu.itpu.project.model.Clothes;
import edu.itpu.project.dao.ClothesDao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class ClothesServiceImplTest {

    private ClothesServiceImpl clothesService;
    private ClothesDao clothesDao;

    @BeforeEach
    void setUp() {
        clothesDao = Mockito.mock(ClothesDao.class);
        clothesService = new ClothesServiceImpl(clothesDao);
    }

    @Test
    void getProductsById() {
        // Mock the data
        List<Clothes> mockClothesList = Arrays.asList(
                new Clothes("Ocean Blue Shirt", 1234L, "Shirt",
                        "Ocean blue", "L", 2, 30),
                new Clothes("Yellow Wool Jumper", 2345L, "Jumper",
                        "Yellow", "M", 1, 60)
        );
        when(clothesDao.all()).thenReturn(mockClothesList);

        // Call the method under test
        List<Clothes> result = clothesService.getProductsById(1234L);

        // Verify the result
        assertEquals(1, result.size());
        assertEquals("Ocean Blue Shirt", result.get(0).getName());
        assertEquals(1234L, result.get(0).getId());
    }

    @Test
    void getProductsByName() {
        // Mock the data
        List<Clothes> mockClothesList = Arrays.asList(
                new Clothes("Ocean Blue Shirt", 1234L, "Shirt",
                        "Ocean blue", "L", 2, 30),
                new Clothes("Ocean Blue Shirt", 5678L, "Shirt",
                        "Ocean blue", "M", 1, 40)
        );
        when(clothesDao.all()).thenReturn(mockClothesList);

        // Call the method under test
        List<Clothes> result = clothesService.getProductsByName("Ocean Blue Shirt");

        // Verify the result
        assertEquals(2, result.size());
        assertEquals("Ocean Blue Shirt", result.get(0).getName());
        assertEquals("Ocean Blue Shirt", result.get(1).getName());
    }

    @Test
    void getSortedProducts() {
        // Mock the data
        List<Clothes> mockClothesList = Arrays.asList(
                new Clothes("Ocean Blue Shirt", 1234L, "Shirt",
                        "Ocean blue", "L", 2, 30),
                new Clothes("Yellow Wool Jumper", 2345L, "Jumper",
                        "Yellow", "M", 1, 60),
                new Clothes("Black Wool Jumper", 123L, "Jumper",
                        "Black", "XL", 1, 60)
        );
        when(clothesDao.all()).thenReturn(mockClothesList);

        // Call the method under test
        List<Clothes> result = clothesService.getSortedProducts();

        // Verify the result
        assertEquals(3, result.size());
        assertEquals("Black Wool Jumper", result.get(0).getName());
        assertEquals("Ocean Blue Shirt", result.get(1).getName());
        assertEquals("Yellow Wool Jumper", result.get(2).getName());
    }

    @Test
    void getPurchasableProducts() {
        // Mock the data
        List<Clothes> mockClothesList = Arrays.asList(
                new Clothes("Ocean Blue Shirt", 1234L, "Shirt",
                        "Ocean blue", "L", 2, 30),
                new Clothes("Yellow Wool Jumper", 2345L, "Jumper",
                        "Yellow", "M", 1, 60),
                new Clothes("Black Wool Jumper", 123L, "Jumper",
                        "Black", "XL", 1, 60),
                new Clothes("White Shirt", 234L, "Shirt",
                        "White", "L", 2, 25)
        );
        when(clothesDao.all()).thenReturn(mockClothesList);

        // Call the method under test
        List<Clothes> result = clothesService.getPurchasableProducts(50);

        // Verify the result
        assertEquals(2, result.size());
        assertEquals("Ocean Blue Shirt", result.get(0).getName());
        assertEquals("White Shirt", result.get(1).getName());
    }
}
