package com.epam.project.service;

import com.epam.project.bean.Product;

import java.util.List;

public interface Nameable<T extends Product> {
    List<T> getProductsByName(String name);
}
