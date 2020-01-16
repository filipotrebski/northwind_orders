package pl.agh.db2.northwind.service;

import lombok.Getter;
import pl.agh.db2.northwind.model.OrderDetails;
import pl.agh.db2.northwind.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Getter
@Service
public class DbService {

    @Autowired
    private CategoryDao categoryDao;

    @Autowired
    private CustomerDao customerDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private OrderDetailsDao detailsDao;

    @Autowired
    private ProductDao productDao;

    @Autowired
    private ShipperDao shipperDao;

    @Autowired
    private SupplierDao supplierDao;
}
