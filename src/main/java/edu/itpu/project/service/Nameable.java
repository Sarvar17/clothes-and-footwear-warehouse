package edu.itpu.project.service;

import edu.itpu.project.bean.Product;

import java.util.List;

public interface Nameable<T extends Product> {
    List<T> getProductsByName(String name);
}
