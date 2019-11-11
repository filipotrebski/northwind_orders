package pl.agh.db2.northwind.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "SHIPPERS")
public class Shipper {
    private int shipperId;
    private String companyName;
    private String phone;
    private List<Order> orders;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SHIPPERID")
    public int getShipperId() {
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

    @OneToMany(
            targetEntity = Order.class,
            mappedBy = "shipperId",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Order> getOrders() {
        return orders;
    }

    public void setShipperId(int shipperId) {
        this.shipperId = shipperId;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
