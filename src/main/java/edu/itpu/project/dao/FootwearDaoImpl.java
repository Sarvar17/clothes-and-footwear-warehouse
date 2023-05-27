package edu.itpu.project.dao;

import edu.itpu.project.bean.Footwear;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class to transfer data of the footwear.
 *
 * @author Sarvar Ilyasov
 */
public class FootwearDaoImpl implements FootwearDao {
    private String path = "src/main/resources/footwear.csv";

    private List<Footwear> products;
    private final String COMMA_DELIMITER = ",";

    public FootwearDaoImpl() {}

    public FootwearDaoImpl(String path) {
        this.path = path;
    }

    /**
     * Reads the csv file, sorts the list.
     */
    @Override
    public List<Footwear> all() {
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
    private Footwear createProduct(String[] product) {
        return new Footwear(
                product[0],
                Long.parseLong(product[1]),
                product[2],
                product[3],
                Integer.parseInt(product[4]),
                Integer.parseInt(product[5]),
                Integer.parseInt(product[6])
        ) {
        };
    }
}

