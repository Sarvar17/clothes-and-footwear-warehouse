package edu.itpu.project.service;

import edu.itpu.project.bean.Product;

import java.util.List;

public interface Sortable<T extends Product> {
    List<T> getSortedProducts();
}
