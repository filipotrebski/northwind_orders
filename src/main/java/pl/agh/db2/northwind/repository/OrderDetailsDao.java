package pl.agh.db2.northwind.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.agh.db2.northwind.model.OrderDetails;
import pl.agh.db2.northwind.model.OrderDetailsId;

@Transactional
@Repository
public interface OrderDetailsDao extends JpaRepository<OrderDetails, OrderDetailsId> {

    OrderDetails findByOrderIdAndProductId(Integer orderId, Integer productId);
}
