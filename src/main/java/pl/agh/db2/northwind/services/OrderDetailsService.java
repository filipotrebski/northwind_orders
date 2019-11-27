package pl.agh.db2.northwind.services;

import org.springframework.beans.factory.annotation.Autowired;
import pl.agh.db2.northwind.repository.OrderDetailsDao;

public class OrderDetailsService {

    @Autowired
    private OrderDetailsDao orderDetailsDao;
}
