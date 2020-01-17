package pl.agh.db2.northwind.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "CATEGORIES")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Table(name = "CATEGORIES")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoryId", unique = true)
    private int categoryId;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "description")
    private String description;

    @Column(name = "picture")
    private String picture;
//    private Set<Product> products;

//    @OneToMany(
//            targetEntity = Product.class,
//            mappedBy = "productId",
//            cascade = CascadeType.ALL,
//            fetch = FetchType.EAGER
//    )
//    public Set<Product> getProducts() {
//        return products;
//    }

   
//    public void setProducts(Set<Product> products) {
//        this.products = products;
//    }
}
