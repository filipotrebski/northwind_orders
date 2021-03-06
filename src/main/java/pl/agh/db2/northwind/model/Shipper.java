package pl.agh.db2.northwind.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "SHIPPERS")
public class Shipper {
    private Integer shipperId;
    private String companyName;
    private String phone;
//    private List<Order> orders;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SHIPPERID")
    public Integer getShipperId() {
        return shipperId;
    }

    @Column(name = "COMPANYNAME")
    public String getCompanyName() {
        return companyName;
    }

    @Column(name = "PHONE")
    public String getPhone() {
        return phone;
    }

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

    public void setShipperId(Integer shipperId) {
        this.shipperId = shipperId;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
