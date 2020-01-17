package pl.agh.db2.northwind.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import pl.agh.db2.northwind.controllers.CategoryController;
import pl.agh.db2.northwind.controllers.ProductController;
import pl.agh.db2.northwind.controllers.SupplierController;
import pl.agh.db2.northwind.repository.CategoryDao;
import pl.agh.db2.northwind.repository.ProductDao;
import pl.agh.db2.northwind.repository.SupplierDao;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@TestPropertySource("classpath:application-test.properties")
@SpringBootTest
class ProductTest {

    @Autowired
    ProductDao productDao;

    @Autowired
    ProductController productController;

    @Autowired
    CategoryDao categoryDao;

    @Autowired
    CategoryController categoryController;

    @Autowired
    SupplierDao supplierDao;

    @Autowired
    SupplierController supplierController;

    @Test
    void testProductSaveToDatabase() {

        //given
        Supplier supplier = new Supplier(null, "Apple Street", "Brass Town", "Pearl", "Johnr Beach", "Mr", "USA", "123456789", "www.fruitcorp.com", "123456789", "11111", "CAL");
        Category category = new Category(null, "Seafood", "Sera producrs", "some picture");
        Product product = new Product(null, "Shrimp", null, null, "12", 10.5, 1000, 1000, 10, 0);

        //when
        Supplier savedSupplier = supplierDao.save(supplier);
        Category categorySave = categoryDao.save(category);
        product.setCategoryId(categorySave);
        product.setSupplierId(savedSupplier);

        Product saveProduct = productDao.save(product);
        //then
        Optional<Product> loaded = productDao.findById(saveProduct.getProductId());
        Assertions.assertEquals(loaded, Optional.of(new Product(saveProduct.getProductId(), "Shrimp", savedSupplier, categorySave, "12", 10.5, 1000, 1000, 10, 0)));
    }
}