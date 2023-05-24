package edu.itpu.project.bean;

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

    public int getQuantity() {
        return quantity;
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        Product product = (Product) o;
        return quantity == product.quantity && price == product.price && Objects.equals(name, product.name) && id.equals(product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, quantity, price);
    }

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
