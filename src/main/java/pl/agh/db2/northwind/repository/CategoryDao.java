package pl.agh.db2.northwind.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.agh.db2.northwind.model.Category;

@Transactional
@Repository
public interface CategoryDao extends CrudRepository<Category,Integer> {

    public List<Category> findByProduct(String category);

    @Query(value = "select c from Category c")
    public List<Category> getByCategory(String category);
}
