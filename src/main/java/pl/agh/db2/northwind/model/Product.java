package pl.agh.db2.northwind.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "PRODUCTS")
public class Product {
    private int productId;
    private String productName;
    private Supplier supplierId;
    private Category categoryId;
    private String quantityPerUnit;
    private double unitPrice;
    private int unitsInStock;
    private int unitsInOrder;
    private int reorderLevel;
    private int discountinued;

    //TODO Order details connection


    public Product() {
    }

    public Product(String productName, Supplier supplierId, Category categoryId,
                   String quantityPerUnit, double unitPrice, int unitsInStock,
                   int unitsInOrder, int reorderLevel, int discountinued) {
        this.productName = productName;
        this.supplierId = supplierId;
        this.categoryId = categoryId;
        this.quantityPerUnit = quantityPerUnit;
        this.unitPrice = unitPrice;
        this.unitsInStock = unitsInStock;
        this.unitsInOrder = unitsInOrder;
        this.reorderLevel = reorderLevel;
        this.discountinued = discountinued;
    }

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "PRODUCTID", unique = true)
    public int getProductId() {
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

    public void setProductId(int productId) {
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