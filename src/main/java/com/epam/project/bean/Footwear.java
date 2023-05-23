package com.epam.project.bean;

import java.util.Objects;

/**
 * Footwear class to store information about the product.
 *
 * @author Sarvar Ilyasov
 */
public class Footwear extends  Product {
    protected final String category;

    /**
     * Class constructor to set attributes about the footwear.
     * @param name Name of the footwear.
     * @param id ID of the footwear.
     * @param category Category of the footwear.
     * @param quantity Quantity of the footwear.
     * @param price Price of the footwear.
     */
    public Footwear(String name, Long id, String category, int quantity, int price) {
        super(name, id, quantity, price);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Footwear footwear = (Footwear) o;
        return Objects.equals(category, footwear.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), category);
    }

    @Override
    public String toString() {
        return "Footwear{" +
                "category='" + category + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
