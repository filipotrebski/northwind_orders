package pl.agh.db2.northwind.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.agh.db2.northwind.model.Category;

import java.util.List;

@Transactional
@Repository
public interface CategoryDao extends JpaRepository<Category,Integer> {

    @Query(value = "SELECT c FROM Category c")
    public List<Category> showAllCategory();

    @Override
    public Category save(Category c);

    @Override
    public void delete(Category c);
}

