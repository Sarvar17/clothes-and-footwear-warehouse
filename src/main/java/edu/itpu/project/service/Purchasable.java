package edu.itpu.project.service;

import edu.itpu.project.bean.Product;

import java.util.List;

public interface Purchasable<T extends Product> {
    List<T> getPurchasableProducts(int price);
}
