package com.epam.project.service;

import com.epam.project.bean.Product;

import java.util.List;

public interface Sortable<T extends Product> {
    List<T> getSortedProducts();
}
