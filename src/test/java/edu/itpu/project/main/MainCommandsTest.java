package edu.itpu.project.main;

import edu.itpu.project.controller.AbstractController;
import edu.itpu.project.controller.ConcreteController;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

class MainCommandsTest {

    @Test
    void createConcreteController() {
        ConcreteController concreteController = MainCommands.createConcreteController();
        assertNotNull(concreteController);
    }

    @Test
    void displayProductsById() {
        Scanner scanner = new Scanner("123\n");
        AbstractController controller = Mockito.mock(ConcreteController.class);

        MainCommands.displayProductsById(scanner, controller);

        verify(controller).displayProductsById(123L);
    }

    @Test
    void displayProductsByName() {
        Scanner scanner = new Scanner("\nNike\n");
        AbstractController controller = Mockito.mock(ConcreteController.class);

        MainCommands.displayProductsByName(scanner, controller);

        verify(controller).displayProductsByName("Nike");
    }

    @Test
    void displaySortedProducts() {
        AbstractController controller = Mockito.mock(ConcreteController.class);

        MainCommands.displaySortedProducts(controller);

        verify(controller).displaySortedProducts();
    }

    @Test
    void displayPurchasableProducts() {
        Scanner scanner = new Scanner("100\n");
        AbstractController controller = Mockito.mock(ConcreteController.class);

        MainCommands.displayPurchasableProducts(scanner, controller);

        verify(controller).displayPurchasableProducts(100);
    }
}
