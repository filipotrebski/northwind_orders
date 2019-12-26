package pl.agh.db2.northwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.agh.db2.northwind.model.Category;
import pl.agh.db2.northwind.model.Customer;

@SpringBootApplication
public class NorthwindApplication {

    public static void main(String[] args) {
        SpringApplication.run(NorthwindApplication.class, args);
    }

}
