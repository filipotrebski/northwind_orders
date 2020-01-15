package pl.agh.db2.northwind.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.agh.db2.northwind.mapper.CategoryMapper;
import pl.agh.db2.northwind.model.CategoryDto;
import pl.agh.db2.northwind.service.DbService;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/")
public class CategoryController {

    @Autowired
    private DbService dbService;

    @Autowired
    private CategoryMapper categoryMapper;

    @RequestMapping(method = RequestMethod.GET, value = "/category/{id}")
    public CategoryDto getCategory(@RequestParam Integer id) {
        return categoryMapper.mapToCategoryDto(dbService.getCategoryDao().getOne(id));
    }

    @RequestMapping(method = RequestMethod.GET, value = "/category")
    public List<CategoryDto> getGategories() {
        return categoryMapper.maoToCategoryDyoList(dbService.getCategoryDao().findAll());
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/category/{id}")
    public void deleteCategory(@RequestParam Integer id) {
        dbService.getCategoryDao().deleteById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/category")
    private CategoryDto updateCategory(@RequestBody CategoryDto categoryDto) {
        return categoryMapper.mapToCategoryDto(dbService.getCategoryDao().save(categoryMapper.mapToCategory(categoryDto)));
    }

    @RequestMapping(method = RequestMethod.POST, value = "/category", consumes = APPLICATION_JSON_VALUE)
    public void createCategory(@RequestBody CategoryDto categoryDto) {
        dbService.getCategoryDao().save(categoryMapper.mapToCategory(categoryDto));
    }
}
