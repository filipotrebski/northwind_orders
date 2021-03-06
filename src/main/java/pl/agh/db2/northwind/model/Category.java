package pl.agh.db2.northwind.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@EqualsAndHashCode
@Table(name = "CATEGORIES")
public class Category {

    private Integer categoryId;
    private String categoryName;
    private String description;
    private String picture;
//    private Set<Product> products;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoryId", unique = true)
    public Integer getCategoryId() {
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

//    @OneToMany(
//            targetEntity = Product.class,
//            mappedBy = "productId",
//            cascade = CascadeType.ALL,
//            fetch = FetchType.EAGER
//    )
//    public Set<Product> getProducts() {
//        return products;
//    }

    public void setCategoryId(Integer categoryId) {
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

//    public void setProducts(Set<Product> products) {
//        this.products = products;
//    }
}
