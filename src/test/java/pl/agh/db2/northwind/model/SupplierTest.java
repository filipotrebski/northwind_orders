package pl.agh.db2.northwind.model;

import jdk.nashorn.internal.runtime.regexp.joni.constants.OPCode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import pl.agh.db2.northwind.controllers.SupplierController;
import pl.agh.db2.northwind.repository.SupplierDao;

import java.util.ArrayList;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@TestPropertySource("classpath:application-test.properties")
@SpringBootTest
class SupplierTest {

    @Autowired
    SupplierDao supplierDao;

    @Autowired
    SupplierController supplierController;

    @Test
    void testSupplierSaveToDatabase(){

        //given
        Supplier supplier = new Supplier(null, "Apple Street", "Brass Town", "Pearl", "Johnr Beach", "Mr", "USA", "123456789", "www.fruitcorp.com", "123456789", "11111", "CAL");

        //when
        Supplier save = supplierDao.save(supplier);

        //then
        Optional<Supplier> loaded = supplierController.getSupplierById(save.getSupplierID());
        Assertions.assertEquals(loaded, Optional.of(new Supplier( save.getSupplierID(), "Apple Street", "Brass Town", "Pearl", "Johnr Beach", "Mr", "USA", "123456789", "www.fruitcorp.com", "123456789", "11111", "CAL")));
    }
}