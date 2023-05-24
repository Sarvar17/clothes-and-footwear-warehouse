package edu.itpu.project.controller;

public class ConcreteController implements AbstractController {
    private final ClothesController clothesController;
    private final FootwearController footwearController;

    public ConcreteController(ClothesController clothesController, FootwearController footwearController) {
        this.clothesController = clothesController;
        this.footwearController = footwearController;
    }

    @Override
    public void displayProductsById(Long id) {
        clothesController.displayProductsById(id);
        footwearController.displayProductsById(id);
    }

    @Override
    public void displayProductsByName(String name) {
        clothesController.displayProductsByName(name);
        footwearController.displayProductsByName(name);
    }

    @Override
    public void displaySortedProducts() {
        clothesController.displaySortedProducts();
        footwearController.displaySortedProducts();
    }

    @Override
    public void displayPurchasableProducts(int price) {
        clothesController.displayPurchasableProducts(price);
        footwearController.displayPurchasableProducts(price);
    }
}
