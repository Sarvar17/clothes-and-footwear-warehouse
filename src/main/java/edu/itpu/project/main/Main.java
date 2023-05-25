package edu.itpu.project;

import edu.itpu.project.controller.AbstractController;
import edu.itpu.project.controller.ConcreteController;
import edu.itpu.project.controller.ClothesController;
import edu.itpu.project.controller.FootwearController;
import edu.itpu.project.dao.ClothesDao;
import edu.itpu.project.dao.ClothesDaoImpl;
import edu.itpu.project.dao.FootwearDao;
import edu.itpu.project.dao.FootwearDaoImpl;
import edu.itpu.project.service.ClothesService;
import edu.itpu.project.service.ClothesServiceImpl;
import edu.itpu.project.service.FootwearService;
import edu.itpu.project.service.FootwearServiceImpl;
import edu.itpu.project.view.ApplicationView;
import edu.itpu.project.view.ApplicationViewImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ApplicationView applicationView = new ApplicationViewImpl();
        ConcreteController concreteController = createConcreteController(); // Create an instance of ConcreteController

        // Display application launch message
        applicationView.displayLaunchMessage("Clothes and footwear warehouse", "1.0", "2023-05-16");

        // Display developer information
        applicationView.displayDeveloperInformation("Sarvar Ilyasov", "sarvar_ilyasov@student.itpu.uz");

        // Read user input
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            // Display menu
            applicationView.displayMenu();
            
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> displayProductsById(scanner, concreteController);
                case 2 -> displayProductsByName(scanner, concreteController);
                case 3 -> displaySortedProducts(concreteController);
                case 4 -> displayPurchasableProducts(scanner, concreteController);
                case 0 -> exit = true;
                default -> System.out.println("Invalid choice! Please try again.");
            }

            System.out.println();
        }

        System.out.println("Exiting the application. Goodbye!");
        scanner.close();
    }

    private static ConcreteController createConcreteController() {
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


    private static void displayProductsById(Scanner scanner, AbstractController controller) {
        System.out.print("Enter product ID: ");
        Long id = scanner.nextLong();

        controller.displayProductsById(id);
    }

    private static void displayProductsByName(Scanner scanner, AbstractController controller) {
        System.out.print("Enter product name: ");
        scanner.nextLine();
        String name = scanner.nextLine();

        controller.displayProductsByName(name);
    }

    private static void displaySortedProducts(AbstractController controller) {
        controller.displaySortedProducts();
    }

    private static void displayPurchasableProducts(Scanner scanner, AbstractController controller) {
        System.out.print("Enter maximum price: ");
        int price = scanner.nextInt();

        controller.displayPurchasableProducts(price);
    }
}