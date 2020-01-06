package pl.agh.db2.northwind.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.agh.db2.northwind.model.Category;
import pl.agh.db2.northwind.repository.CategoryDao;

import java.util.Optional;


@Controller
public class CategoryController {

    @Autowired
    private CategoryDao categoryDao;

    @GetMapping("/category/{id}")
    @ResponseBody
    public Optional<Category> category(@PathVariable Integer id){
        return categoryDao.findById(id);
    }

    @GetMapping("/category")
    @ResponseBody
    public Iterable<Category> categoryList(){
        return  categoryDao.findAll();
    }

    @GetMapping("/category/all")
    @ResponseBody
    public String allCategory(){

        StringBuilder response = new StringBuilder();

        for(Category c: categoryDao.showAllCategory()){

            response.append(c.getCategoryId()).append(" ")
                    .append(c.getCategoryName()).append(" ")
                    .append(c.getDescription()).append(" ")
                    .append("<br>");
        }

        return response.toString();
    }
}
