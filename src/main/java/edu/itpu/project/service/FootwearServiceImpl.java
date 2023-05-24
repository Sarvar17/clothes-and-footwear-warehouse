package edu.itpu.project.service;

import edu.itpu.project.bean.Footwear;
import edu.itpu.project.dao.FootwearDao;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FootwearServiceImpl implements FootwearService {

    private List<Footwear> footwear;
    private final FootwearDao footwearDaoImpl;

    public FootwearServiceImpl(FootwearDao footwearDaoImpl) {
        this.footwearDaoImpl = footwearDaoImpl;
    }

    private void setProducts() {
        footwear = footwearDaoImpl.all();
    }

    private void sortProducts() {
        Collections.sort(footwear);
    }

    @Override
    public List<Footwear> getProductsById(Long id) {
        setProducts();
        sortProducts();
        return footwear
                .stream()
                .filter(e -> id.compareTo(e.getId()) == 0)
                .collect(Collectors.toList());
    }

    @Override
    public List<Footwear> getProductsByName(String name) {
        setProducts();
        sortProducts();
        return footwear
                .stream()
                .filter(e -> name.compareTo(e.getName()) == 0)
                .collect(Collectors.toList());
    }

    @Override
    public List<Footwear> getSortedProducts() {
        setProducts();
        sortProducts();

        return footwear;
    }
}
