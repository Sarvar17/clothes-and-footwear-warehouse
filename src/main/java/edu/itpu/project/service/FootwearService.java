package edu.itpu.project.service;

import edu.itpu.project.bean.Footwear;

public interface FootwearService extends ProductService, Nameable<Footwear>,
                                            Identifiable<Footwear>, Sortable<Footwear> {
}
