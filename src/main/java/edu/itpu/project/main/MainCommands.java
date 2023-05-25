package edu.itpu.project.main;

import edu.itpu.project.controller.AbstractController;
import edu.itpu.project.controller.ClothesController;
import edu.itpu.project.controller.ConcreteController;
import edu.itpu.project.controller.FootwearController;
import edu.itpu.project.dao.ClothesDao;
import edu.itpu.project.dao.ClothesDaoImpl;
import edu.itpu.project.dao.FootwearDao;
import edu.itpu.project.dao.FootwearDaoImpl;
import edu.itpu.project.service.ClothesService;
import edu.itpu.project.service.ClothesServiceImpl;
import edu.itpu.project.service.FootwearService;
import edu.itpu.project.service.FootwearServiceImpl;

import java.util.Scanner;

public class MainCommands {
    protected static ConcreteController createConcreteController() {
        // Create instances of ClothesService, FootwearService, ClothesDao, FootwearDao, and other necessary dependencies
        ClothesDao clothesDao = new ClothesDaoImpl();
        FootwearDao footwearDao = new FootwearDaoImpl();

        ClothesService clothesService = new ClothesServiceImpl(clothesDao);
        FootwearService footwearService = new FootwearServiceImpl(footwearDao);

        // Instantiate the ClothesController and FootwearController with the respective services
        ClothesController clothesController = new ClothesController(clothesService);
        FootwearController footwearController = new FootwearController(footwearService);

        // Create an instance of ConcreteController with the ClothesController and FootwearController
        return new ConcreteController(clothesController, footwearController);
    }

    protected static void displayProductsById(Scanner scanner, AbstractController controller) {
        System.out.print("Enter product ID: ");
        Long id = scanner.nextLong();

        controller.displayProductsById(id);
    }

    protected static void displayProductsByName(Scanner scanner, AbstractController controller) {
        System.out.print("Enter product name: ");
        scanner.nextLine();
        String name = scanner.nextLine();

        controller.displayProductsByName(name);
    }

    protected static void displaySortedProducts(AbstractController controller) {
        controller.displaySortedProducts();
    }

    protected static void displayPurchasableProducts(Scanner scanner, AbstractController controller) {
        System.out.print("Enter maximum price: ");
        int price = scanner.nextInt();

        controller.displayPurchasableProducts(price);
    }
}
