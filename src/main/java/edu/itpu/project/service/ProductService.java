package edu.itpu.project.service;

import edu.itpu.project.bean.Product;
import java.util.List;

/**
 * Interface for service of the product.
 * @param <T> Product.
 */
public interface ProductService<T extends Product> {
    /**
     * Method to get products by name.
     * @param name Name which was input by user.
     * @return List of products with the name.
     */
    List<T> getProductsByName(String name);
    /**
     * Method to get products by ID.
     * @param id ID which added by user.
     * @return List of products with this ID.
     */
    List<T> getProductsById(Long id);
}
