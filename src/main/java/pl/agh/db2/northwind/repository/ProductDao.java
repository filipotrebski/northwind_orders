package pl.agh.db2.northwind.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.agh.db2.northwind.model.Product;

import java.util.List;

@Transactional
@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {

//    @Query
//    List<String> findProductFromSupplier(Integer supplierId);
//
//    @Query
//    List<Product> getProductsInCategory(Integer supplierId);
//
//    @Query
//    List<Product> findProductOrderedByCustomer(Integer customerId);
}
