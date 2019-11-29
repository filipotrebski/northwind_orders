package pl.agh.db2.northwind.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.agh.db2.northwind.model.Product;
import pl.agh.db2.northwind.repository.ProductDao;

import java.util.List;
import java.util.Optional;

@Controller
public class ProductController {

    @Autowired
    private ProductDao productDao;

    @GetMapping("/product/id")
    @ResponseBody
    public Optional<Product> product(@PathVariable Integer id){

        return  productDao.findById(id);

    }

    @GetMapping("/product/all")
    @ResponseBody
    public List<Product> productList(){

        List<Product> products = (List<Product>) productDao.findAll();

        return products;
    }
}
