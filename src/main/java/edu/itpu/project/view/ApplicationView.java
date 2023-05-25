package edu.itpu.project.view;

/**
 * Interface for view of the application.
 */
public interface ApplicationView {
    /**
     * Method to display Launch Message to the user.
     * @param applicationName Name of the app.
     * @param version Version of the app.
     * @param creationDate Date of creation of the app.
     */
    void displayLaunchMessage(String applicationName, String version, String creationDate);
    /**
     * Method to display information about developer.
     * @param developerName Name of the dev.
     * @param email Email of the dev.
     */
    void displayDeveloperInformation(String developerName, String email);
    /**
     * Method to display menu of the commands.
     */
    void displayMenu();
}
