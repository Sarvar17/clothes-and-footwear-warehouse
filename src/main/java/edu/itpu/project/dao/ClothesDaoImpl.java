package edu.itpu.project.dao;

import edu.itpu.project.model.Clothes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class to transfer data of the clothes.
 *
 * @author Sarvar Ilyasov
 */
public class ClothesDaoImpl implements ClothesDao {
    private String path = "resources/clothes.csv";

    private List<Clothes> products;
    private final String COMMA_DELIMITER = ",";

    public ClothesDaoImpl() {}

    public ClothesDaoImpl(String path) {
        this.path = path;
    }

    /**
     * Reads the csv file, sorts the list.
     */
    @Override
    public List<Clothes> all() {
        try {
            products = new BufferedReader(new FileReader(path))
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
    private Clothes createProduct(String[] product) {
        return new Clothes(
                product[0],
                Long.parseLong(product[1]),
                product[2],
                product[3],
                product[4],
                Integer.parseInt(product[5]),
                Integer.parseInt(product[6])
        ) {
        };
    }
}

