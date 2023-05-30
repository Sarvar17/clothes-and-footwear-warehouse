package edu.itpu.project.dao;

import edu.itpu.project.model.Product;

import java.util.List;

/**
 * Interface to transfer data.
 *
 * @author Ilyasov Sarvar
 */
public interface ProductDao<T extends Product> {
    /**
     * Reads the csv file, sorts the list.
     */
    List<T> all();
}
