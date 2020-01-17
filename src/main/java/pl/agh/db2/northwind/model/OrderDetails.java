package pl.agh.db2.northwind.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@IdClass(OrderDetailsId.class)
@Table(name = "ORDERDETAILS")
public class OrderDetails {

    @Id
    private Integer orderId;
    @Id
    private Integer productId;
    private double unitPrice;
    private int quantity;
    private float discount;

//    public OrderDetails() {
//    }
//
//    public OrderDetails(Integer orderId, Integer productId, float unitPrice, int quantity, float discount) {
//        this.orderId = orderId;
//        this.productId = productId;
//        this.unitPrice = unitPrice;
//        this.quantity = quantity;
//        this.discount = discount;
//    }
}
