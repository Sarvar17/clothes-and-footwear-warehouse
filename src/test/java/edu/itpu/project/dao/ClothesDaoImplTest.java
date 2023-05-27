package edu.itpu.project.dao;

import edu.itpu.project.bean.Clothes;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClothesDaoImplTest {

    @Test
    void all() {
        ClothesDaoImpl dao = new ClothesDaoImpl("src/test/resources/clothes.csv");
        List<Clothes> clothesList = dao.all();

        // Assert that the list is not null
        assertNotNull(clothesList);

        // Assert that the list size is as expected
        assertEquals(4, clothesList.size());

        // Assert the details of the first clothes in the list
        Clothes firstClothes = clothesList.get(0);
        assertEquals("Ocean Blue Shirt", firstClothes.getName());
        assertEquals(1234L, firstClothes.getId());
        assertEquals("Shirt", firstClothes.getCategory());
        assertEquals("Ocean blue", firstClothes.getColor());
        assertEquals("L", firstClothes.getSize());
        assertEquals(2, firstClothes.getQuantity());
        assertEquals(30, firstClothes.getPrice());
    }
}