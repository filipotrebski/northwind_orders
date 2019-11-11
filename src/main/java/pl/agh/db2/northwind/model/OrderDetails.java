package pl.agh.db2.northwind.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ORDERDETAILS")
public class OrderDetails {
    private int odId;
    private Order orderID;
    private Product productId;
    private Double unitPrice;
    private int quantity;
    private int discount;

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getOdId() {
        return odId;
    }

    @ManyToOne
    @JoinColumn (name = "ORDDERID")
    public Order getOrderID() {
        return orderID;
    }

    @ManyToOne
    @JoinColumn(name = "PRODUCTID")
    public Product getProductId() {
        return productId;
    }

    @Column(name = "UNITPRICE")
    public Double getUnitPrice() {
        return unitPrice;
    }

    @Column(name = "QUANTITY")
    public int getQuantity() {
        return quantity;
    }

    @Column(name = "DISCOUNT")
    public int getDiscount() {
        return discount;
    }

    public void setOdId(int odId) {
        this.odId = odId;
    }

    public void setOrderID(Order orderID) {
        this.orderID = orderID;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
