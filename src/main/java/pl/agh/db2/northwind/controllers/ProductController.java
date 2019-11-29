package pl.agh.db2.northwind.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.agh.db2.northwind.model.Product;
import pl.agh.db2.northwind.repository.ProductDao;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductDao productDao;

    @GetMapping("/product/id")
    @ResponseBody
    public Product product(@PathVariable Integer id){

        Product byProduct = productDao.getProductById(id);

        return byProduct;

    }

    @GetMapping("/product/all")
    @ResponseBody
    public List<Product> productList(){

        List<Product> products = (List<Product>) productDao.findAll();

        return products;
    }
}
