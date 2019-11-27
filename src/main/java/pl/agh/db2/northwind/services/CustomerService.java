package pl.agh.db2.northwind.services;

import pl.agh.db2.northwind.model.Customer;
import pl.agh.db2.northwind.repository.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerService  {

    @Autowired
    private CustomerDao customerDao;
}
