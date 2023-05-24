package com.epam.project.service;

import com.epam.project.bean.Clothes;

public interface ClothesService extends ProductService, Nameable<Clothes>,
                                        Identifiable<Clothes>, Sortable<Clothes> {
}
