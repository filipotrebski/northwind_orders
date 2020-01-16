package pl.agh.db2.northwind.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@EqualsAndHashCode
@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDERID", unique = true)
    private Integer orderID;

    @ManyToOne
    @JoinColumn(name = "CUSTOMERID")
    private Customer customerID;

    @ManyToOne
    @JoinColumn(name = "EMPLOYID")
    private Employee employeeID;

    @Column(name = "ORDERDATE")
    private Date orderDate;

    @Column(name = "REQUIREDDATE")
    private Date requiredDate;

    @Column(name = "SHIPPEDDATE")
    private Date shippedDate;

    @ManyToOne
    @JoinColumn(name = "SHIPPERID")
    private Shipper shipVia;

    @Column(name = "FREIGHT")
    private String freight;

    @Column(name = "SHIPNAME")
    private String shipName;

    @Column(name = "SHIPADDRESS")
    private String shipAddress;

    @Column(name = "SHIPCITY")
    private String shipCity;

    @Column(name = "SHIPREGION")
    private String shipRegion;

    @Column(name = "SHIPPOSTALCODE")
    private String shipPostalCode;

    @Column(name = "SHIOPCOUNTRY")
    private String shipCountry;
}
