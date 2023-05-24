package com.epam.project.service;

import com.epam.project.bean.Product;

import java.util.List;

public interface Identifiable<T extends Product> {
    List<T> getProductsById(Long id);
}
