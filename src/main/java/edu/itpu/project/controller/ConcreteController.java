package edu.itpu.project.controller;

/**
 * Class of concrete controller.
 */
public class ConcreteController implements AbstractController {
    private final ClothesController clothesController;
    private final FootwearController footwearController;

    /**
     * Constructor.
     * @param clothesController Clothes controller.
     * @param footwearController Footwear controller.
     */
    public ConcreteController(ClothesController clothesController, FootwearController footwearController) {
        this.clothesController = clothesController;
        this.footwearController = footwearController;
    }

    /**
     * Method to display products by id.
     * @param id ID.
     */
    @Override
    public void displayProductsById(Long id) {
        clothesController.displayProductsById(id);
        footwearController.displayProductsById(id);
    }

    /**
     * Method to display products by name.
     * @param name Name.
     */
    @Override
    public void displayProductsByName(String name) {
        clothesController.displayProductsByName(name);
        footwearController.displayProductsByName(name);
    }

    /**
     * Method to display sorted products.
     */
    @Override
    public void displaySortedProducts() {
        clothesController.displaySortedProducts();
        footwearController.displaySortedProducts();
    }

    /**
     * Method to display purchasable products.
     * @param price Price.
     */
    @Override
    public void displayPurchasableProducts(int price) {
        clothesController.displayPurchasableProducts(price);
        footwearController.displayPurchasableProducts(price);
    }
}
