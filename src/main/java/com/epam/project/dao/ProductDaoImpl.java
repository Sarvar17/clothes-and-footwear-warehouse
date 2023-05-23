package com.epam.project.dao;

import com.epam.project.bean.Product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class to transfer data.
 *
 * @author Tomas Dominauskas
 */
public class ProductDaoImpl implements ProductDao {

    private final String FILE_PATH = "csv/sample-original.csv";

    private List<Product> products;
    private final String COMMA_DELIMITER = ",";

    /**
     * Reads the csv file, sorts the list and removes duplicates.
     */
    @Override
    public List<Product> all() {
        try {
            products = new BufferedReader(new FileReader(FILE_PATH))
                    .lines()
                    .skip(1)
                    .map(e -> createProduct(e.split(COMMA_DELIMITER)))
                    .collect(Collectors.toList());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return products;
    }


    /**
     * Return the csv file line array as Product object.
     * @param product csv file line as array.
     * @return the Product object.
     */
    private Product createProduct(String[] product) {
        return new Product(
                product[0],
                Long.parseLong(product[1]),
                Integer.parseInt(product[2]),
                Integer.parseInt(product[3])
        ) {
        };
    }
}

