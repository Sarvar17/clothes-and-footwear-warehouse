package com.epam.project.bean;

import java.util.Objects;

/**
 * Clothes class to store information about the product.
 *
 * @author Sarvar Ilyasov
 */
public class Clothes extends Product implements Comparable<Clothes> {
    private final String category;
    private final String color;
    private final String size;

    /**
     * Class constructor to set attributes about the clothes.
     * @param name Name of the clothes.
     * @param id ID of the clothes.
     * @param category Category of the clothes.
     * @param color Color of the footwear.
     * @param size Size of the footwear.
     * @param quantity Quantity of the clothes.
     * @param price Price of the clothes.
     */
    public Clothes(String name, Long id, String category, String color,
                   String size, int quantity, int price) {
        super(name, id, quantity, price);
        this.category = category;
        this.color = color;
        this.size = size;
    }

    public String getCategory() {
        return category;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Clothes clothes = (Clothes) o;
        return Objects.equals(category, clothes.category) && Objects.equals(color, clothes.color) && Objects.equals(size, clothes.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), category, color, size);
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "category='" + category + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Clothes o) {
        return this.getName().compareTo(o.getName());
    }
}
