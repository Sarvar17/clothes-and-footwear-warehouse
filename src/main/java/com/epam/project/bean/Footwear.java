package com.epam.project.bean;

import java.util.Objects;

/**
 * Footwear class to store information about the product.
 *
 * @author Sarvar Ilyasov
 */
public class Footwear extends  Product {
    protected final String category;
    protected int quantity;
    protected int price;

    /**
     * Class constructor to set attributes about the footwear.
     * @param name Name of the footwear.
     * @param id ID of the footwear.
     * @param category Category of the footwear.
     * @param quantity Quantity of the footwear.
     * @param price Price of the footwear.
     */
    public Footwear(String name, Long id, String category, int quantity, int price) {
        super(name, id);
        this.category = category;
        this.quantity = quantity;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Footwear footwear = (Footwear) o;
        return quantity == footwear.quantity && price == footwear.price
                && Objects.equals(category, footwear.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), category, quantity, price);
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
