package pl.agh.db2.northwind.mapper;

import org.springframework.stereotype.Component;
import pl.agh.db2.northwind.model.Category;
import pl.agh.db2.northwind.model.CategoryDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CategoryMapper {

    public Category mapToCategory(final CategoryDto categoryDto) {
        return new Category(
                categoryDto.getCategoryId(),
                categoryDto.getCategoryName(),
                categoryDto.getDescription(),
                categoryDto.getPicture()
        );
    }

    public CategoryDto mapToCategoryDto(final Category category) {
        return new CategoryDto(
                category.getCategoryId(),
                category.getCategoryName(),
                category.getDescription(),
                category.getPicture()
        );
    }

    public List<CategoryDto> mapToCategoryDtoList(final List<Category> categoryList) {
        return categoryList.stream()
                .map(t -> new CategoryDto(t.getCategoryId(), t.getCategoryName(), t.getDescription(), t.getPicture()))
                .collect(Collectors.toList());
    }
}
