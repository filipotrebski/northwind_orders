package pl.agh.db2.northwind.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.agh.db2.northwind.model.Supplier;

import java.util.Optional;

@Transactional
@Repository
public interface SupplierDao extends CrudRepository<Supplier, Integer> {

    @Override
    Optional<Supplier> findById(Integer integer);
}
