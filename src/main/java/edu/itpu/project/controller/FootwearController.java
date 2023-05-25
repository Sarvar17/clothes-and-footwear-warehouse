package edu.itpu.project.controller;

import edu.itpu.project.service.FootwearService;

/**
 * Controller for footwear.
 */
public class FootwearController implements AbstractController {
    private final FootwearService footwearService;

    /**
     * Constructor.
     * @param footwearService Service of the footwear.
     */
    public FootwearController(FootwearService footwearService) {
        this.footwearService = footwearService;
    }

    /**
     * Method to display footwear by id.
     * @param id ID.
     */
    @Override
    public void displayProductsById(Long id) {
        footwearService.getProductsById(id).forEach(System.out::println);
    }

    /**
     * Method to display footwear by name.
     * @param name Name.
     */
    @Override
    public void displayProductsByName(String name) {
        footwearService.getProductsByName(name).forEach(System.out::println);
    }

    /**
     * Method to display sorted footwear.
     */
    @Override
    public void displaySortedProducts() {
        footwearService.getSortedProducts().forEach(System.out::println);
    }

    /**
     * Method to display purchasable footwear.
     * @param price Price.
     */
    @Override
    public void displayPurchasableProducts(int price) {
        footwearService.getPurchasableProducts(price).forEach(System.out::println);
    }
}
