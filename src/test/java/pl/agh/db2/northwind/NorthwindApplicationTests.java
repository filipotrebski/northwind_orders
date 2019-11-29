package pl.agh.db2.northwind;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@TestPropertySource("classpath:application-test.properties")
@SpringBootTest
class NorthwindApplicationTests {

    @Test
    void contextLoads() {
    }

}
