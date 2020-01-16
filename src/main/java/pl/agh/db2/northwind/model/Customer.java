package pl.agh.db2.northwind.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity(name = "CUSTOMERS")
@Table(n?ame = "CUSTOMERS")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CUSTOMERID")
    private Integer customerId;

    @Column(name = "COMPANYNAME")
    private String companyName;

    @Column(name = "CONTACTNAME")
    private String contactName;

    @Column(name = "CONTACTTITLE")
    private String contactTitle;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "CITY")
    private String city;

    @Column(name = "REGION")
    private String region;

    @Column(name = "POSTALCODE")
    private String postalCode;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "FAX")
    private String fax;
//    private List<Order> orders;


//    @OneToMany (
//            targetEntity = Order.class,
//            mappedBy = "orderID",
//            cascade = CascadeType.ALL,
//            fetch = FetchType.EAGER
//    )
//    public List<Order> getOrders() {
//        return orders;
//    }

    
//    public void setOrders(List<Order> orders) {
//        this.orders = orders;
//    }
}
