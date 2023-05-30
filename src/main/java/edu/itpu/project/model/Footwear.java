package edu.itpu.project.model;

import java.util.Objects;

/**
 * Footwear class to store information about the footwear.
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
    public int getSize() {
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
        Footwear footwear = (Footwear) o;
        return size == footwear.size && Objects.equals(category, footwear.category) && Objects.equals(color, footwear.color);
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
        return "Footwear{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", category='" + category + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
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
    public int compareTo(Footwear o) {
        return this.getName().compareTo(o.getName());
    }
}
