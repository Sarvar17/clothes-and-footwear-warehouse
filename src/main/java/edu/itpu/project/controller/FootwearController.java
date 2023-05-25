package edu.itpu.project.controller;

import edu.itpu.project.service.FootwearService;

public class FootwearController implements AbstractController {
    private final FootwearService footwearService;

    public FootwearController(FootwearService footwearService) {
        this.footwearService = footwearService;
    }

    @Override
    public void displayProductsById(Long id) {
        footwearService.getProductsById(id).forEach(System.out::println);
    }

    @Override
    public void displayProductsByName(String name) {
        footwearService.getProductsByName(name).forEach(System.out::println);
    }

    @Override
    public void displaySortedProducts() {
        footwearService.getSortedProducts().forEach(System.out::println);
    }

    @Override
    public void displayPurchasableProducts(int price) {
        footwearService.getPurchasableProducts(price).forEach(System.out::println);
    }
}
