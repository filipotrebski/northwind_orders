package pl.agh.db2.northwind.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;


@NamedQueries({
        @NamedQuery(
                name = "Product.findProductFromSupplier",
                query = "SELECT Product.productName, Supplier.companyName  " +
                        "FROM Product " +
                        "INNER JOIN Supplier " +
                        "WHERE Product.supplierId = :SUPPLIERID"
        ),
        @NamedQuery(
                name = "Product.getProductsInCategory",
                query = "SELECT Product.productName, Product.unitsInStock, Category.categoryName " +
                        "FROM Product " +
                        "INNER JOIN  Category " +
                        "WHERE Product.categoryId = :SUPPLIERID"
        ),
        @NamedQuery(
                name = "Product.findProductOrderedByCustomer",
                query = "SELECT Product.productName, Customer.customerId FROM Product " +
                        "INNER JOIN OrderDetails " +
                        "INNER JOIN Order " +
                        "WHERE Product.productId = OrderDetails.productId " +
                        "AND OrderDetails.orderId = Order.orderID " +
                        "AND Customer.customerId = :CUSTOMERID"

        )
})

@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "PRODUCTS")
public class Product {

    private Integer productId;
    private String productName;
    private Supplier supplierId;
    private Category categoryId;
    private String quantityPerUnit;
    private double unitPrice;
    private int unitsInStock;
    private int unitsInOrder;
    private int reorderLevel;
    private int discountinued;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRODUCTID", unique = true)
    public Integer getProductId() {
        return productId;
    }

    @Column(name = "PRODUCTNAME")
    public String getProductName() {
        return productName;
    }

    @ManyToOne
    @JoinColumn(name = "SUPPLIERID")
    public Supplier getSupplierId() {
        return supplierId;
    }

    @ManyToOne
    @JoinColumn(name="categoryId")
    public Category getCategoryId() {
        return categoryId;
    }

    public String getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public int getUnitsInOrder() {
        return unitsInOrder;
    }

    public int getReorderLevel() {
        return reorderLevel;
    }

    public int getDiscountinued() {
        return discountinued;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setSupplierId(Supplier supplierId) {
        this.supplierId = supplierId;
    }

    public void setCategoryId(Category categoryId) {
        this.categoryId = categoryId;
    }

    public void setQuantityPerUnit(String quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public void setUnitsInOrder(int unitsInOrder) {
        this.unitsInOrder = unitsInOrder;
    }

    public void setReorderLevel(int reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    public void setDiscountinued(int discountinued) {
        this.discountinued = discountinued;
    }
}
