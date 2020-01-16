package pl.agh.db2.northwind.model;

import javax.persistence.*;

@Entity
@IdClass(OrderDetailsId.class)
@Table(name = "ORDERDETAILS")
public class OrderDetails {

    private Integer orderId;
    private Integer productId;
    private float unitPrice;
    private int quantity;
    private float discount;

    public OrderDetails() {
    }

    public OrderDetails(Integer orderId, Integer productId, float unitPrice, int quantity, float discount) {
        this.orderId = orderId;
        this.productId = productId;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.discount = discount;
    }

    @Id
//    @ManyToOne
//    @JoinColumn(name = "ORDERID", referencedColumnName = "orderId")
    public Integer getOrderId() {
        return orderId;
    }

    @Id
//    @ManyToOne
//    @JoinColumn (name = "PRODUCTID", referencedColumnName = "productId")
    public Integer getProductId() {
        return productId;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getDiscount() {
        return discount;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }
}
