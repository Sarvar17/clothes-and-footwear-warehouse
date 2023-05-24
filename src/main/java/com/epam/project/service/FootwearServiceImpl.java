package com.epam.project.service;

import com.epam.project.bean.Footwear;
import com.epam.project.dao.FootwearDao;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FootwearServiceImpl implements FootwearService {

    private List<Footwear> footwears;
    private final FootwearDao footwearDaoImpl;

    public FootwearServiceImpl(FootwearDao footwearDaoImpl) {
        this.footwearDaoImpl = footwearDaoImpl;
    }

    private void setProducts() {
        footwears = footwearDaoImpl.all();
    }

    private void sortProducts() {
        Collections.sort(footwears);
    }

    @Override
    public List<Footwear> getProductsById(Long id) {
        setProducts();
        sortProducts();
        return footwears
                .stream()
                .filter(e -> id.compareTo(e.getId()) == 0)
                .collect(Collectors.toList());
    }

    @Override
    public List<Footwear> getProductsByName(String name) {
        setProducts();
        sortProducts();
        return footwears
                .stream()
                .filter(e -> name.compareTo(e.getName()) == 0)
                .collect(Collectors.toList());
    }

    @Override
    public List<Footwear> getSortedProducts() {
        setProducts();
        sortProducts();

        return footwears;
    }
}
