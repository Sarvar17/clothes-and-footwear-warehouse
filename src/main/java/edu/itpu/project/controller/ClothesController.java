package edu.itpu.project.controller;

import edu.itpu.project.service.ClothesService;

public class ClothesController implements AbstractController {
    private final ClothesService clothesService;

    public ClothesController(ClothesService clothesService) {
        this.clothesService = clothesService;
    }

    @Override
    public void displayProductsById(Long id) {
        System.out.println("Clothes:");
        clothesService.getProductsById(id).forEach(System.out::println);
    }

    @Override
    public void displayProductsByName(String name) {
        System.out.println("Clothes:");
        clothesService.getProductsByName(name).forEach(System.out::println);
    }

    @Override
    public void displaySortedProducts() {
        System.out.println("Clothes (sorted):");
        clothesService.getSortedProducts().forEach(System.out::println);
    }

    @Override
    public void displayPurchasableProducts(int price) {
        System.out.println("Clothes (purchasable within $" + price + "):");
        clothesService.getPurchasableProducts(price).forEach(System.out::println);
    }
}
