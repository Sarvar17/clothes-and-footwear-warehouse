package com.epam.project.bean;

import java.util.Objects;

/**
 * Footwear class to store information about the product.
 *
 * @author Sarvar Ilyasov
 */
public class Footwear extends  Product implements Comparable<Footwear> {
    private final String category;
    private final String color;
    private final int size;

    /**
     * Class constructor to set attributes about the footwear.
     * @param name Name of the footwear.
     * @param id ID of the footwear.
     * @param category Category of the footwear.
     * @param color Color of the footwear.
     * @param size Size of the footwear.
     * @param quantity Quantity of the footwear.
     * @param price Price of the footwear.
     */
    public Footwear(String name, Long id, String category,
                    String color, int size, int quantity, int price) {
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

    public int getSize() {
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Footwear footwear = (Footwear) o;
        return size == footwear.size && Objects.equals(category, footwear.category) && Objects.equals(color, footwear.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), category, color, size);
    }

    @Override
    public String toString() {
        return "Footwear{" +
                "category='" + category + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Footwear o) {
        return this.getName().compareTo(o.getName());
    }
}
