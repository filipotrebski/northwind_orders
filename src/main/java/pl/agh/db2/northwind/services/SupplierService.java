package pl.agh.db2.northwind.services;

import pl.agh.db2.northwind.model.Supplier;
import pl.agh.db2.northwind.repository.SupplierDao;
import org.springframework.beans.factory.annotation.Autowired;

public class SupplierService {

    @Autowired
    private SupplierDao supplierDao;
}
