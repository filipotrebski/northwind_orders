package pl.agh.db2.northwind.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.agh.db2.northwind.model.Customer;

import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {

    @Override
    List<Customer> findAll();

    @Override
    long count();

    @Override
    <S extends Customer> S save(S s);

    @Override
    void delete(Customer customer);
}
