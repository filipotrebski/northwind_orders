package pl.agh.db2.northwind.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.agh.db2.northwind.mapper.ProductMapper;
import pl.agh.db2.northwind.model.Product;
import pl.agh.db2.northwind.model.ProductDto;
import pl.agh.db2.northwind.service.DbService;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/v1")
public class ProductController {

    @Autowired
    private DbService service;

    @Autowired
    private ProductMapper productMapper;

    @RequestMapping(method = RequestMethod.GET, value = "/product")
    public List<ProductDto> getProducts() {
        return productMapper.mapToProductDtoList(service.getProductDao().findAll());
    }

    @RequestMapping(method = RequestMethod.GET, value = "/product/{id}")
    public ProductDto getProduct(@RequestParam Integer id) {
        return productMapper.mapToProductDto(service.getProductDao().getOne(id));
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/products/{id}")
    public void deleteProduct(@RequestParam Integer id) {
        service.getProductDao().deleteById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/product")
    public ProductDto updateProduct(@RequestBody ProductDto productDto) {
        return productMapper.mapToProductDto(service.getProductDao().save(productMapper.mapToProduct(productDto)));
    }
}
