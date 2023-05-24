package edu.itpu.project.service;

import edu.itpu.project.bean.Product;
import java.util.List;

public interface ProductService<T extends Product> {
    List<T> getProductsByName(String name);
    List<T> getProductsById(Long id);
}
