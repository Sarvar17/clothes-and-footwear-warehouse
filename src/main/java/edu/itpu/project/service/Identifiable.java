package edu.itpu.project.service;

import edu.itpu.project.bean.Product;

import java.util.List;

public interface Identifiable<T extends Product> {
    List<T> getProductsById(Long id);
}
