package edu.itpu.project.service;

import edu.itpu.project.bean.Footwear;
import edu.itpu.project.dao.FootwearDao;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Implementation of FootwearService interface.
 */
public class FootwearServiceImpl implements FootwearService {

    private List<Footwear> footwear;
    private final FootwearDao footwearDaoImpl;

    /**
     * Constructor.
     * @param footwearDaoImpl Dao of footwear.
     */
    public FootwearServiceImpl(FootwearDao footwearDaoImpl) {
        this.footwearDaoImpl = footwearDaoImpl;
    }

    /**
     * Method to set the footwear.
     */
    private void setProducts() {
        footwear = footwearDaoImpl.all();
    }

    /**
     * Method to sort footwear.
     */
    private void sortProducts() {
        Collections.sort(footwear);
    }

    /**
     * Method to get footwear by ID.
     * @param id ID which added by user.
     * @return List of footwear with this ID.
     */
    @Override
    public List<Footwear> getProductsById(Long id) {
        setProducts();
        sortProducts();
        return footwear
                .stream()
                .filter(e -> id.compareTo(e.getId()) == 0)
                .collect(Collectors.toList());
    }

    /**
     * Method to get footwear by name.
     * @param name Name which was input by user.
     * @return List of footwear with the name.
     */
    @Override
    public List<Footwear> getProductsByName(String name) {
        setProducts();
        sortProducts();
        return footwear
                .stream()
                .filter(e -> e.getName().contains(name))
                .collect(Collectors.toList());
    }

    /**
     * Method to get all sorted footwear.
     * @return Sorted footwear.
     */
    @Override
    public List<Footwear> getSortedProducts() {
        setProducts();
        sortProducts();

        return footwear;
    }

    /**
     * Method to get footwear which user can purchase.
     * @param price Price which is okay for user.
     * @return Purchasable footwear.
     */
    @Override
    public List<Footwear> getPurchasableProducts(int price) {
        setProducts();
        sortProducts();
        return footwear
                .stream()
                .filter(e -> e.getPrice() <= price)
                .collect(Collectors.toList());
    }
}
