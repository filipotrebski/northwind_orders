package pl.agh.db2.northwind.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.agh.db2.northwind.model.Customer;

@Transactional
@Repository
public interface CustomerDao extends CrudRepository<Customer, Integer> {
}
