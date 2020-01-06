package pl.agh.db2.northwind.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.agh.db2.northwind.model.Order;

import java.util.List;

@Transactional
@Repository
public interface OrderDao extends CrudRepository<Order, Integer> {

    @Query(value = "SELECT o FROM Order o")
    public List<Order> showAllOrders();

    @Override
    public Order save(Order o);

    @Override
    public void delete(Order o);
}
