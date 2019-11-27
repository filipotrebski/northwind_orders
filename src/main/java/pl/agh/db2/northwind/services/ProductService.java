package pl.agh.db2.northwind.services;

import pl.agh.db2.northwind.model.Product;
import pl.agh.db2.northwind.repository.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductService {

    @Autowired
    private ProductDao productDao;
}
