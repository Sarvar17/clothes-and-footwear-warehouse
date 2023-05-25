package edu.itpu.project.service;

import edu.itpu.project.bean.Footwear;

/**
 * Interface of service of Footwear.
 */
public interface FootwearService extends ProductService, Sortable<Footwear>, Purchasable<Footwear> {
}
