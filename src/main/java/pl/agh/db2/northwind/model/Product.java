package pl.agh.db2.northwind.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "PRODUCTS")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRODUCTID", unique = true)
    private Integer productId;

    @Column(name = "PRODUCTNAME")
    private String productName;

    @ManyToOne
    @JoinColumn(name = "SUPPLIERID")
    private Supplier supplierId;

    @ManyToOne
    @JoinColumn(name="categoryId")
    private Category categoryId;

    @Column(name = "QUANTITYPERUNIT")
    private String quantityPerUnit;

    @Column(name = "UNITPRICE")
    private double unitPrice;

    @Column(name = "UNITINSTOCK")
    private int unitsInStock;

    @Column(name = "UNITSINORDER")
    private int unitsInOrder;

    @Column(name = "REORDERLEVEL")
    private int reorderLevel;

    @Column(name = "DISCOUNTINUED")
    private int discountinued;
    
}
