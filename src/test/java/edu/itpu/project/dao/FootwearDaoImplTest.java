package edu.itpu.project.dao;

import edu.itpu.project.bean.Footwear;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FootwearDaoImplTest {

    @Test
    void all() {
        FootwearDaoImpl dao = new FootwearDaoImpl("src/main/resources/footwear.csv");
        List<Footwear> footwearList = dao.all();

        // Assert that the list is not null
        assertNotNull(footwearList);

        // Assert that the list size is as expected
        assertEquals(4, footwearList.size());

        // Assert the details of the first footwear in the list
        Footwear firstFootwear = footwearList.get(0);
        assertEquals("Nike Air Jordan 1 Low", firstFootwear.getName());
        assertEquals(123L, firstFootwear.getId());
        assertEquals("Sneakers", firstFootwear.getCategory());
        assertEquals("Lucky Green", firstFootwear.getColor());
        assertEquals(40, firstFootwear.getSize());
        assertEquals(2, firstFootwear.getQuantity());
        assertEquals(110, firstFootwear.getPrice());
    }
}