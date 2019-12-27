package pl.agh.db2.northwind;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import pl.agh.db2.northwind.controllers.CategoryController;
import pl.agh.db2.northwind.model.Category;
import pl.agh.db2.northwind.repository.CategoryDao;

import java.util.HashSet;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

@TestPropertySource("classpath:application-test.properties")
@SpringBootTest
class NorthwindApplicationTests {

    @Autowired
    private CategoryController categoryController;

    @Autowired
    private CategoryDao categoryDao;

    @Test
    void contextLoads() {
        Category s = new Category(null, "name", "desc", "pic");
        Category save = categoryDao.save(s);

        Optional<Category> loaded = categoryController.category(save.getCategoryId());
        loaded.toString();
        assertThat(loaded).isEqualTo(Optional.of(new Category(save.getCategoryId(), "name", "desc", "pic")));
    }

}
