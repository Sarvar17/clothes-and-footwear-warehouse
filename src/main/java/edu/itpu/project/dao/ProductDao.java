package edu.itpu.project.dao;

import edu.itpu.project.bean.Product;

import java.util.List;

/**
 * Interface to transfer data.
 *
 * @author Ilyasov Sarvar
 */
public interface ProductDao<T extends Product> {
    List<T> all();
}
