package com.epam.project.bean;

import java.util.Objects;

/**
 * Clothes class to store information about the product.
 *
 * @author Sarvar Ilyasov
 */
public class Clothes extends Product {
    protected final String category;

    /**
     * Class constructor to set attributes about the clothes.
     * @param name Name of the clothes.
     * @param id ID of the clothes.
     * @param category Category of the clothes.
     * @param quantity Quantity of the clothes.
     * @param price Price of the clothes.
     */
    public Clothes(String name, Long id, String category, int quantity, int price) {
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
        Clothes clothes = (Clothes) o;
        return Objects.equals(category, clothes.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), category);
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
