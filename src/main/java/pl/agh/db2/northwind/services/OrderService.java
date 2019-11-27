package pl.agh.db2.northwind.services;


import pl.agh.db2.northwind.repository.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;


public class OrderService {

    @Autowired
    private OrderDao orderDeo;
}
