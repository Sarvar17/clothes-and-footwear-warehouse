package edu.itpu.project.controller;

/**
 * Interface of the abstract controller.
 */
public interface AbstractController {
    /**
     * Method to display products by id.
     * @param id ID.
     */
    void displayProductsById(Long id);

    /**
     * Method to display products by name.
     * @param name Name.
     */
    void displayProductsByName(String name);

    /**
     * Method to display sorted products.
     */
    void displaySortedProducts();

    /**
     * Method to display purchasable products.
     * @param price Price.
     */
    void displayPurchasableProducts(int price);
}
