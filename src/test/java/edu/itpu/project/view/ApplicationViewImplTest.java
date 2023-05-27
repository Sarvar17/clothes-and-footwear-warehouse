package edu.itpu.project.view;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationViewImplTest {

    private final String lineSeparator = System.lineSeparator();

    @Test
    void displayLaunchMessage() {
        // Arrange
        ApplicationViewImpl view = new ApplicationViewImpl();
        String expectedOutput = "Welcome to MyApplication" + lineSeparator +
                "Version: 1.0" + lineSeparator +
                "Created on: 2023-05-27" + lineSeparator +
                lineSeparator;

        // Redirect standard output to capture the console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Act
        view.displayLaunchMessage("MyApplication", "1.0", "2023-05-27");

        // Assert
        assertEquals(expectedOutput, outputStream.toString());

        // Reset the standard output
        System.setOut(System.out);
    }

    @Test
    void displayDeveloperInformation() {
        // Arrange
        ApplicationViewImpl view = new ApplicationViewImpl();
        String expectedOutput = "Developer Information:" + lineSeparator +
                "Name: John Doe" + lineSeparator +
                "Email: john.doe@example.com" + lineSeparator +
                lineSeparator;

        // Redirect standard output to capture the console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Act
        view.displayDeveloperInformation("John Doe", "john.doe@example.com");

        // Assert
        assertEquals(expectedOutput, outputStream.toString());

        // Reset the standard output
        System.setOut(System.out);
    }

    @Test
    void displayMenu() {
        // Arrange
        ApplicationViewImpl view = new ApplicationViewImpl();
        String expectedOutput = "Available Commands (Menu):" + lineSeparator +
                "1. Display products by ID" + lineSeparator +
                "2. Display products by name" + lineSeparator +
                "3. Display sorted products" + lineSeparator +
                "4. Display purchasable products" + lineSeparator +
                "0. Exit" + lineSeparator +
                lineSeparator;

        // Redirect standard output to capture the console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Act
        view.displayMenu();

        // Assert
        assertEquals(expectedOutput, outputStream.toString());

        // Reset the standard output
        System.setOut(System.out);
    }
}