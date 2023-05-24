package edu.itpu.project.service;

import edu.itpu.project.bean.Clothes;

public interface ClothesService extends ProductService, Nameable<Clothes>,
                                        Identifiable<Clothes>, Sortable<Clothes> {
}
