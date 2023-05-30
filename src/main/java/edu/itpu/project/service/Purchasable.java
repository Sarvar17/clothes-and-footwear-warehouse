package edu.itpu.project.service;

import edu.itpu.project.model.Product;

import java.util.List;

/**
 * Interface for purchasable products.
 * @param <T> Product.
 */
public interface Purchasable<T extends Product> {
    /**
     * Method to get products which user can afford.
     * @param price Price which is okay for user.
     * @return List of purchasable products.
     */
    List<T> getPurchasableProducts(int price);
}
