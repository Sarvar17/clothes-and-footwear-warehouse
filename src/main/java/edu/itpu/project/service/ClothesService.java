package edu.itpu.project.service;

import edu.itpu.project.bean.Clothes;

/**
 * Interface of service of Clothes.
 */
public interface ClothesService extends ProductService, Sortable<Clothes>, Purchasable<Clothes> {
}
