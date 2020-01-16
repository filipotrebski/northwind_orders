package pl.agh.db2.northwind.model;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import pl.agh.db2.northwind.controllers.CustomerController;
import pl.agh.db2.northwind.repository.CustomerDao;

import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

@TestPropertySource("classpath:application-test.properties")
@SpringBootTest
public class CustomerTest {

    @Autowired
    CustomerController customerController;

    @Autowired
    CustomerDao customerDao;


    @Test
    void tetsCustemerSave() {

        //given
        Customer customer = new Customer(null, "Chip corp", "Joe Black","Mr", "Colt Ave.", "Chicago", "IL", "425664","USA", "123123123", "123123123");

        //when
        Customer save = customerDao.save(customer);

        //then
        Integer id = save.getCustomerId();
        Optional<Customer> loaded = customerDao.findById(save.getCustomerId());
        assertThat(loaded).isEqualTo(Optional.of(new Customer(save.getCustomerId(), "Chip corp", "Joe Black","Mr", "Colt Ave.", "Chicago", "IL", "425664","USA", "123123123", "123123123")));

    }
}