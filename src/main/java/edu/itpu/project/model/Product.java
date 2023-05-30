package edu.itpu.project.model;

import java.util.Objects;

/**
 * Product class to store information about the product.
 *
 * @author Sarvar Ilyasov
 */
public abstract class Product {
    protected String name;
    protected Long id;
    protected int quantity;
    protected int price;

    /**
     * Class constructor to set attributes about the product.
     * @param name Name of the product.
     * @param id ID of the product.
     * @param quantity Quantity of the clothes.
     * @param price Price of the clothes.
     */
    public Product(String name, Long id, int quantity, int price) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
    }

    /**
     * Getter of name.
     * @return Name.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter of name.
     * @param name Name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter of ID.
     * @return ID.
     */
    public Long getId() {
        return id;
    }

    /**
     * Setter for ID.
     * @param id ID.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Method to get quantity.
     * @return Quantity.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Setter for quantity.
     * @param quantity Quantity.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter for price.
     * @return Price.
     */
    public int getPrice() {
        return price;
    }

    /**
     * Setter for price.
     * @param price Price.
     */
    public void setPrice(int price) {
        this.price = price;
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
        Product product = (Product) o;
        return quantity == product.quantity && price == product.price && Objects.equals(name, product.name)
                && id.equals(product.id);
    }

    /**
     * HashCode.
     * @return HashCode.
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, id, quantity, price);
    }

    /**
     * ToString method.
     * @return String.
     */
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
