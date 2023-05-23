package com.epam.project.dao;

import com.epam.project.bean.Product;
import java.util.List;

/**
 * Interface to transfer data.
 *
 * @author Ilyasov Sarvar
 */
public interface ProductDao<T extends Product> {
    List<T> all();
}
