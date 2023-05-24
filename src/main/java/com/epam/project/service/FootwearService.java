package com.epam.project.service;

import com.epam.project.bean.Footwear;

public interface FootwearService extends ProductService, Nameable<Footwear>,
                                            Identifiable<Footwear>, Sortable<Footwear> {
}
