package edu.itpu.project.model;

import java.util.Objects;

/**
 * Clothes class to store information about the clothes.
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

    /**
     * Getter of category.
     * @return Category.
     */
    public String getCategory() {
        return category;
    }

    /**
     * Getter of color.
     * @return Color.
     */
    public String getColor() {
        return color;
    }

    /**
     * Getter of size.
     * @return Size.
     */
    public String getSize() {
        return size;
    }

    /**
     * Method equals.
     * @param o Object.
     * @return Is equals.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Clothes clothes = (Clothes) o;
        return Objects.equals(category, clothes.category) && Objects.equals(color, clothes.color) && Objects.equals(size, clothes.size);
    }

    /**
     * HashCode.
     * @return HashCode.
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), category, color, size);
    }

    /**
     * ToString method.
     * @return String.
     */
    @Override
    public String toString() {
        return "Clothes{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", category='" + category + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    /**
     * CompareTo method to sort.
     * @param o The object to be compared.
     * @return Comparing result.
     */
    @Override
    public int compareTo(Clothes o) {
        return this.getName().compareTo(o.getName());
    }
}
