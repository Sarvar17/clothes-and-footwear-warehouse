package edu.itpu.project.view;

/**
 * Implementation of ApplicationView interface.
 */
public class ApplicationViewImpl implements ApplicationView {

    /**
     * Method to display Launch Message to the user.
     * @param applicationName Name of the app.
     * @param version Version of the app.
     * @param creationDate Date of creation of the app.
     */
    @Override
    public void displayLaunchMessage(String applicationName, String version, String creationDate) {
        System.out.println("Welcome to " + applicationName);
        System.out.println("Version: " + version);
        System.out.println("Created on: " + creationDate);
        System.out.println();
    }

    /**
     * Method to display information about developer.
     * @param developerName Name of the dev.
     * @param email Email of the dev.
     */
    @Override
    public void displayDeveloperInformation(String developerName, String email) {
        System.out.println("Developer Information:");
        System.out.println("Name: " + developerName);
        System.out.println("Email: " + email);
        System.out.println();
    }

    /**
     * Method to display menu of the commands.
     */
    @Override
    public void displayMenu() {
        System.out.println("Available Commands (Menu):");
        System.out.println("1. Display products by ID");
        System.out.println("2. Display products by name");
        System.out.println("3. Display sorted products");
        System.out.println("4. Display purchasable products");
        System.out.println("0. Exit");
        System.out.println();
    }
}
