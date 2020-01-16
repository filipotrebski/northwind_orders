package pl.agh.db2.northwind.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;
import pl.agh.db2.northwind.controllers.OrderController;
import pl.agh.db2.northwind.repository.CustomerDao;
import pl.agh.db2.northwind.repository.EmployeeDao;
import pl.agh.db2.northwind.repository.OrderDao;
import pl.agh.db2.northwind.repository.ShipperDao;

import java.time.Instant;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

@Transactional
@TestPropertySource("classpath:application-test.properties")
@SpringBootTest
class OrderTest {

    @Autowired
    OrderDao orderDao;

    @Autowired
    OrderController orderController;

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    CustomerDao customerDao;

    @Autowired
    ShipperDao shipperDao;


    @Test
    void testOrderSavedInDatabase() {

        //given
        Customer customer = new Customer(null, "Chip corp", "Joe Black","Mr", "Colt Ave.", "Chicago", "IL", "425664","USA", "123123123", "123123123");
        Shipper shipper = new Shipper(null, "Super Delivery Corp.", "123456789");
        Employee employee = new Employee( null, "last Name", "first bame", "title", "title of", Date.from(Instant.now()), Date.from(Instant.now()), "Addres", "city",
                "region", "postal code", "country", "home phone", "extention", "photo", "wowo", 1, "23123");


        //when
        Customer savedCustomer = customerDao.save(customer);
        Shipper savedShipper = shipperDao.save(shipper);
        Employee savedEmployee = employeeDao.save(employee);
        Order savedOrder = orderDao.save(new Order(null, savedCustomer,savedEmployee, Date.from(Instant.now()),
                Date.from(Instant.now()), Date.from(Instant.now()), savedShipper, "Freight", customer.getCompanyName(), customer.getAddress(),
                customer.getCity(), customer.getRegion(), customer.getPostalCode(), customer.getCountry()));

        //then
        Optional<Order> loaded = Optional.of(orderDao.getOne(savedOrder.getOrderID()));
        assertEquals(loaded, Optional.of(new Order(savedOrder.getOrderID(), savedCustomer,savedEmployee, savedOrder.getOrderDate(),
                savedOrder.getRequiredDate(), savedOrder.getShippedDate(), savedShipper, "Freight", customer.getCompanyName(), customer.getAddress(),
                customer.getCity(), customer.getRegion(), customer.getPostalCode(), customer.getCountry())));
    }
}