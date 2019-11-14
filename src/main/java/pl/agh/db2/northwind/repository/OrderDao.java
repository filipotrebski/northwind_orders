package pl.agh.db2.northwind.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.agh.db2.northwind.model.Order;

@Transactional
@Repository
public interface OrderDao extends CrudRepository<Order, Integer> {
}
