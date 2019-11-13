package pl.agh.db2.northwind.model;

import javax.persistence.Column;
import javax.persistence.JoinColumn;

public class
OrderDetails {

    private int orderID;
    private Product productID;
    private float unitPrice;
    private int quantity;
    private float discount;

    public OrderDetails(int orderID, Product productID, float unitPrice, int quantity, float discount) {
        this.orderID = orderID;
        this.productID = productID;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.discount = discount;
    }

    @JoinColumn(name = "orderId")
    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    @JoinColumn(name = "productId")
    public Product getProductID() {
        return productID;
    }

    public void setProductID(Product productID) {
        this.productID = productID;
    }

    @Column(name = "unitPrice")
    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Column(name = "quantity")
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Column(name = "discount")
    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }
}
