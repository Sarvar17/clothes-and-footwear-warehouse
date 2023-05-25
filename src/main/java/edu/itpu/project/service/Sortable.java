package edu.itpu.project.service;

import edu.itpu.project.bean.Product;

import java.util.List;

/**
 * Interface for sortable products.
 * @param <T> Product.
 */
public interface Sortable<T extends Product> {
    /**
     * Method to get all sorted products.
     * @return Sorted products.
     */
    List<T> getSortedProducts();
}
