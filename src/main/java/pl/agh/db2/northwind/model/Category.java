package pl.agh.db2.northwind.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "CATEGORIES")
public class Category {
    private int categoryId;
    private String categoryName;
    private String description;
    private String picture;
    private List<Product> products;

    public Category(String categoryName, String description, String picture) {
        this.categoryName = categoryName;
        this.description = description;
        this.picture = picture;
    }

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "CATEGORYID", unique = true)
    public int getCategoryId() {
        return categoryId;
    }

    @Column(name = "CATEGORYNAME")
    public String getCategoryName() {
        return categoryName;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    @Column(name = "PICTURE")
    public String getPicture() {
        return picture;
    }

    @OneToMany(
            targetEntity = Product.class,
            mappedBy = "categoryId"
    )
    public List<Product> getProducts() {
        return products;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
