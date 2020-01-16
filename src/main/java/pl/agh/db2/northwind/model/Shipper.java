package pl.agh.db2.northwind.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Getter
@Setter
@Table(name = "SHIPPERS")
public class Shipper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SHIPPERID")
    private Integer shipperId;

    @Column(name = "COMPANYNAME")
    private String companyName;

    @Column(name = "PHONE")
    private String phone;
//    private List<Order> orders;


//    @OneToMany(
//            targetEntity = Order.class,
//            mappedBy = "orderID",
//            cascade = CascadeType.ALL,
//            fetch = FetchType.LAZY
//    )
//    public List<Order> getOrders() {
//        return orders;
//    }
//
//    public void setOrders(List<Order> orders) {
//        this.orders = orders;
//    }

}
