package edu.itpu.project.main;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    private final String lineSeparator = System.lineSeparator();

    @Test
    void mainTest() {
        String input = "6\n0\n";
        InputStream stdin = System.in;
        PrintStream stdout = System.out;

        try {
            // Redirect the standard input and output
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outputStream));

            // Call the main method
            Main.main(null);

            // Assert the output
            String expectedOutput = "Welcome to Clothes and footwear warehouse" + lineSeparator +
                    "Version: 1.0" + lineSeparator +
                    "Created on: 2023-05-16" + lineSeparator +
                    lineSeparator +
                    "Developer Information:" + lineSeparator +
                    "Name: Sarvar Ilyasov" + lineSeparator +
                    "Email: sarvar_ilyasov@student.itpu.uz" + lineSeparator +
                    lineSeparator +
                    "Available Commands (Menu):" + lineSeparator +
                    "1. Display products by ID" + lineSeparator +
                    "2. Display products by name" + lineSeparator +
                    "3. Display sorted products" + lineSeparator +
                    "4. Display purchasable products" + lineSeparator +
                    "0. Exit" + lineSeparator +
                    lineSeparator +
                    "Enter your choice: Invalid choice! Please try again." + lineSeparator +
                    lineSeparator +
                    "Available Commands (Menu):" + lineSeparator +
                    "1. Display products by ID" + lineSeparator +
                    "2. Display products by name" + lineSeparator +
                    "3. Display sorted products" + lineSeparator +
                    "4. Display purchasable products" + lineSeparator +
                    "0. Exit" + lineSeparator +
                    lineSeparator +
                    "Enter your choice: " + lineSeparator +
                    "Exiting the application. Goodbye!" + lineSeparator;
            assertEquals(expectedOutput, outputStream.toString());
        } finally {
            // Restore the standard input and output
            System.setIn(stdin);
            System.setOut(stdout);
        }
    }
}
