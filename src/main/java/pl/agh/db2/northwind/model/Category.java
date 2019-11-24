package pl.agh.db2.northwind.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CATEGORIES")
public class Category {

    private int categoryId;
    private String categoryName;
    private String description;
    private String picture;
    private Set<Product> products;

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoryId", unique = true)
    public int getCategoryId() {
        return categoryId;
    }

    @Column(name = "category_name")
    public String getCategoryName() {
        return categoryName;
    }

    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    @Column(name = "picture")
    public String getPicture() {
        return picture;
    }

    @OneToMany(
            targetEntity = Product.class,
            mappedBy = "productId",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public Set<Product> getProducts() {
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

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
