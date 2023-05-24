package edu.itpu.project.controller;

public interface AbstractController {
    void displayProductsById(Long id);
    void displayProductsByName(String name);
    void displaySortedProducts();
    void displayPurchasableProducts(int price);
}
