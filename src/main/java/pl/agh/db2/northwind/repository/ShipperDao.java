package pl.agh.db2.northwind.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.agh.db2.northwind.model.Shipper;

import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface ShipperDao extends CrudRepository<Shipper, Integer> {

    @Override
    Optional<Shipper> findById(Integer integer);

    @Query(value = "SELECT s FROM Shipper s")
    public List<Shipper> showAllShipper();

    @Override
    public Shipper save(Shipper s);

    @Override
    public void delete(Shipper s); 
}
