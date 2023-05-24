package edu.itpu.project.view;

public class ApplicationViewImpl implements ApplicationView {

    @Override
    public void displayLaunchMessage(String applicationName, String version, String creationDate) {
        System.out.println("Welcome to " + applicationName);
        System.out.println("Version: " + version);
        System.out.println("Created on: " + creationDate);
        System.out.println();
    }

    @Override
    public void displayDeveloperInformation(String developerName, String email) {
        System.out.println("Developer Information:");
        System.out.println("Name: " + developerName);
        System.out.println("Email: " + email);
        System.out.println();
    }

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
