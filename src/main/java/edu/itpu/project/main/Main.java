package edu.itpu.project.main;

import edu.itpu.project.controller.ConcreteController;
import edu.itpu.project.view.ApplicationView;
import edu.itpu.project.view.ApplicationViewImpl;

import java.util.Scanner;

public class Main extends MainCommands {
    public static void main(String[] args) {
        ApplicationView applicationView = new ApplicationViewImpl();
        ConcreteController concreteController = createConcreteController(); // Create an instance of ConcreteController

        // Display application launch message
        applicationView.displayLaunchMessage("Clothes and footwear warehouse",
                                        "1.0", "2023-05-16");

        // Display developer information
        applicationView.displayDeveloperInformation("Sarvar Ilyasov",
                                                "sarvar_ilyasov@student.itpu.uz");

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
}