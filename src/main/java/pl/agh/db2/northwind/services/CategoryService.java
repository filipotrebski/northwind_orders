package pl.agh.db2.northwind.services;

import pl.agh.db2.northwind.model.Category;
import pl.agh.db2.northwind.repository.CategoryDao;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    public Category save(Category c) {

        categoryDao.save(c);

        return c;
    }

    public void delete(Category c){

        categoryDao.delete(c);
    }

}
