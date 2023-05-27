package edu.itpu.project.service;

import edu.itpu.project.bean.Clothes;
import edu.itpu.project.dao.ClothesDao;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Implementation of ClothesService interface.
 */
public class ClothesServiceImpl implements ClothesService {

    private List<Clothes> clothes;
    private final ClothesDao clothesDaoImpl;

    /**
     * Constructor.
     * @param clothesDaoImpl Dao of clothes.
     */
    public ClothesServiceImpl(ClothesDao clothesDaoImpl) {
        this.clothesDaoImpl = clothesDaoImpl;
    }

    /**
     * Method to set the clothes.
     */
    private void setProducts() {
        clothes = clothesDaoImpl.all();
    }

    /**
     * Method to sort clothes.
     */
    private void sortProducts() {
        Collections.sort(clothes);
    }

    /**
     * Method to get clothes by ID.
     * @param id ID which added by user.
     * @return List of clothes with this ID.
     */
    @Override
    public List<Clothes> getProductsById(Long id) {
        setProducts();
        sortProducts();
        return clothes
                .stream()
                .filter(e -> id.compareTo(e.getId()) == 0)
                .collect(Collectors.toList());
    }

    /**
     * Method to get clothes by name.
     * @param name Name which was input by user.
     * @return List of clothes with the name.
     */
    @Override
    public List<Clothes> getProductsByName(String name) {
        setProducts();
        sortProducts();
        return clothes
                .stream()
                .filter(e -> e.getName().contains(name))
                .collect(Collectors.toList());
    }

    /**
     * Method to get all sorted clothes.
     * @return Sorted clothes.
     */
    @Override
    public List<Clothes> getSortedProducts() {
        setProducts();
        sortProducts();

        return clothes;
    }

    /**
     * Method to get clothes which user can purchase.
     * @param price Price which is okay for user.
     * @return Purchasable clothes.
     */
    @Override
    public List<Clothes> getPurchasableProducts(int price) {
        setProducts();
        sortProducts();
        return clothes
                .stream()
                .filter(e -> e.getPrice() <= price)
                .collect(Collectors.toList());
    }
}
