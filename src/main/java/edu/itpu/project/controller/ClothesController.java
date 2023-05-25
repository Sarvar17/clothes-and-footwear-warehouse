package edu.itpu.project.controller;

import edu.itpu.project.service.ClothesService;

/**
 * Controller for clothes.
 */
public class ClothesController implements AbstractController {
    private final ClothesService clothesService;

    /**
     * Constructor.
     * @param clothesService Service of the clothes.
     */
    public ClothesController(ClothesService clothesService) {
        this.clothesService = clothesService;
    }

    /**
     * Method to display clothes by id.
     * @param id ID.
     */
    @Override
    public void displayProductsById(Long id) {
        clothesService.getProductsById(id).forEach(System.out::println);
    }

    /**
     * Method to display clothes by name.
     * @param name Name.
     */
    @Override
    public void displayProductsByName(String name) {
        clothesService.getProductsByName(name).forEach(System.out::println);
    }

    /**
     * Method to display sorted clothes.
     */
    @Override
    public void displaySortedProducts() {
        clothesService.getSortedProducts().forEach(System.out::println);
    }

    /**
     * Method to display purchasable clothes.
     * @param price Price.
     */
    @Override
    public void displayPurchasableProducts(int price) {
        clothesService.getPurchasableProducts(price).forEach(System.out::println);
    }
}
