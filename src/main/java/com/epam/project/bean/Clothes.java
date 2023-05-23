package com.epam.project.bean;

import java.util.Objects;

/**
 * Clothes class to store information about the product.
 *
 * @author Sarvar Ilyasov
 */
public class Clothes extends Product {
    protected final String category;
    protected int quantity;
    protected int price;

    /**
     * Class constructor to set attributes about the clothes.
     * @param name Name of the clothes.
     * @param id ID of the clothes.
     * @param category Category of the clothes.
     * @param quantity Quantity of the clothes.
     * @param price Price of the clothes.
     */
    public Clothes(String name, Long id, String category, int quantity, int price) {
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
        Clothes clothes = (Clothes) o;
        return quantity == clothes.quantity && price == clothes.price && Objects.equals(category, clothes.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), category, quantity, price);
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "category='" + category + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
