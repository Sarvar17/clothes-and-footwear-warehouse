package com.epam.project.bean;

import java.util.Objects;

/**
 * Product class to store information about the product.
 *
 * @author Sarvar Ilyasov
 */
public abstract class Product {
    protected String name;
    protected Long id;

    /**
     * Class constructor to set attributes about the product.
     * @param name Name of the product.
     * @param id ID of the product.
     */
    public Product(String name, Long id) {
        this.name = name;
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return  Objects.equals(name, product.name) && id.equals(product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
