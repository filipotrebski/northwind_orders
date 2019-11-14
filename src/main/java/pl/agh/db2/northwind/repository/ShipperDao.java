package pl.agh.db2.northwind.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.agh.db2.northwind.model.Shipper;


@Transactional
@Repository
public interface ShipperDao extends CrudRepository<Shipper, Integer> {
}
