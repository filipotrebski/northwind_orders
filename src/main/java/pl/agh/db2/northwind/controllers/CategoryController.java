package pl.agh.db2.northwind.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.agh.db2.northwind.model.Category;
import pl.agh.db2.northwind.repository.CategoryDao;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    private CategoryDao categoryDao;

    @GetMapping("/category/id")
    @ResponseBody
    public Category category(@PathVariable Integer id){

        Category byCategory = categoryDao.getByCategoryId(id);

        return byCategory;

    }

    @GetMapping("/category/all")
    @ResponseBody
    public List<Category> categoryList(){

        List<Category> categories = (List<Category>) categoryDao.findAll();

        return categories;
    }
}
