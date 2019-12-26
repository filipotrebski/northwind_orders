package pl.agh.db2.northwind.model;




import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import pl.agh.db2.northwind.controllers.ShipperController;
import pl.agh.db2.northwind.repository.ShipperDao;

import java.util.Optional;




@TestPropertySource("classpath:application-test.properties")
@SpringBootTest
public class ShipperTest {

    @Autowired
    ShipperDao shipperDao;

    @Autowired
    ShipperController shipperController;

    @Test
    public void testShpperSaveToDatabase() {
        //given
        Shipper shipper = new Shipper(null, "Super Delivery Corp.", "123456789");

        //when
        Shipper save = shipperDao.save(shipper);

        //then
        
        Optional<Shipper> loaded = shipperController.grtShipperById(save.getShipperId());
        Assertions.assertThat(loaded).isEqualTo((Optional.of(new Shipper(save.getShipperId(),"Super Delivery Corp.", "123456789"))));
    }
}