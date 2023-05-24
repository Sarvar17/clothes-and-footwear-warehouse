package edu.itpu.project.view;

public interface ApplicationView {
    void displayLaunchMessage(String applicationName, String version, String creationDate);
    void displayDeveloperInformation(String developerName, String email);
    void displayMenu();
}
