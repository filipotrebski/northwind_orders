package pl.agh.db2.northwind.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ORDERS")
public class Order {

    private int orderID;
    private Customer customerID;
    private Employee employeeID;
    private Date orderDate;
    private Date requiredDate;
    private Date shippedDate;
    private Shipper shipVia;
    private String freight;
    private String shipName;
    private String shipAddress;
    private String shipCity;
    private String shipRegion;
    private String shipPostalCode;
    private String shipCountry;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "ORDERID", unique = true)
    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    @ManyToOne
    @JoinColumn(name = "CUSTOMERID")
    public Customer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Customer customerID) {
        this.customerID = customerID;
    }

    @ManyToOne
    @JoinColumn(name = "EMPLOYID")
    public Employee getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Employee employeeID) {
        this.employeeID = employeeID;
    }

    @Column(name = "ORDERDATE")
    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    @Column(name = "REQUIREDDATE")
    public Date getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(Date requiredDate) {
        this.requiredDate = requiredDate;
    }

    @Column(name = "SHIPPEDDATE")
    public Date getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Date shippedDate) {
        this.shippedDate = shippedDate;
    }

    @ManyToOne
    @JoinColumn(name = "SHIPPERID")
    public Shipper getShipVia() {
        return shipVia;
    }

    public void setShipVia(Shipper shipVia) {
        this.shipVia = shipVia;
    }

    @Column(name = "FREIGHT")
    public String getFreight() {
        return freight;
    }

    public void setFreight(String freight) {
        this.freight = freight;
    }

    @Column(name = "SHIPNAME")
    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    @Column(name = "SHIPADDRESS")
    public String getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }

    @Column(name = "SHIPCITY")
    public String getShipCity() {
        return shipCity;
    }

    public void setShipCity(String shipCity) {
        this.shipCity = shipCity;
    }

    @Column(name = "SHIPREGION")
    public String getShipRegion() {
        return shipRegion;
    }

    public void setShipRegion(String shipRegion) {
        this.shipRegion = shipRegion;
    }

    @Column(name = "SHIPPOSTALCODE")
    public String getShipPostalCode() {
        return shipPostalCode;
    }

    public void setShipPostalCode(String shipPostalCode) {
        this.shipPostalCode = shipPostalCode;
    }

    @Column(name = "SHIOPCOUNTRY")
    public String getShipCountry() {
        return shipCountry;
    }

    public void setShipCountry(String shipCountry) {
        this.shipCountry = shipCountry;
    }

}
