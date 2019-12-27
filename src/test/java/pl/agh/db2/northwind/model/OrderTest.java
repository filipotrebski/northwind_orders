package pl.agh.db2.northwind.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import pl.agh.db2.northwind.controllers.OrderController;
import pl.agh.db2.northwind.repository.CustomerDao;
import pl.agh.db2.northwind.repository.EmployeeDao;
import pl.agh.db2.northwind.repository.OrderDao;
import pl.agh.db2.northwind.repository.ShipperDao;

import static org.junit.jupiter.api.Assertions.*;

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

    void testOrderSaverdInDatabse() {

        //given
        Customer customer = new Customer(null, "Chip corp", "Joe Black","Mr", "Colt Ave.", "Chicago", "IL", "425664","USA", "123123123", "123123123");
        Shipper shipper = new Shipper(null, "Super Delivery Corp.", "123456789");
        Employee employee = new Employee();
        //when

        //then
    }
}