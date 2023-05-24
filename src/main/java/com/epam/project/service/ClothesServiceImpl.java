package com.epam.project.service;

import com.epam.project.bean.Clothes;
import com.epam.project.dao.ClothesDao;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ClothesServiceImpl implements ClothesService {

    private List<Clothes> clothes;
    private final ClothesDao clothesDaoImpl;

    public ClothesServiceImpl(ClothesDao clothesDaoImpl) {
        this.clothesDaoImpl = clothesDaoImpl;
    }

    private void setProducts() {
        clothes = clothesDaoImpl.all();
    }

    private void sortProducts() {
        Collections.sort(clothes);
    }

    @Override
    public List<Clothes> getProductsById(Long id) {
        setProducts();
        sortProducts();
        return clothes
                .stream()
                .filter(e -> id.compareTo(e.getId()) == 0)
                .collect(Collectors.toList());
    }

    @Override
    public List<Clothes> getProductsByName(String name) {
        setProducts();
        sortProducts();
        return clothes
                .stream()
                .filter(e -> name.compareTo(e.getName()) == 0)
                .collect(Collectors.toList());
    }

    @Override
    public List<Clothes> getSortedProducts() {
        setProducts();
        sortProducts();

        return clothes;
    }
}
