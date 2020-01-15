package pl.agh.db2.northwind.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CategoryDto {
    private Integer categoryId;
    private String categoryName;
    private String description;
    private String picture;
}
