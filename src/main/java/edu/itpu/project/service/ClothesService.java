package edu.itpu.project.service;

import edu.itpu.project.model.Clothes;

/**
 * Interface of service of Clothes.
 */
public interface ClothesService extends ProductService, Sortable<Clothes>, Purchasable<Clothes> {
}
