package pl.agh.db2.northwind.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

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

    public Order(int orderID, Customer customerID,
                 Employee employeeID, Date orderDate,
                 Date requiredDate, Date shippedDate,
                 Shipper shipVia, String freight,
                 String shipName, String shipAddress,
                 String shipCity, String shipRegion,
                 String shipPostalCode, String shipCountry) {
        this.orderID = orderID;
        this.customerID = customerID;
        this.employeeID = employeeID;
        this.orderDate = orderDate;
        this.requiredDate = requiredDate;
        this.shippedDate = shippedDate;
        this.shipVia = shipVia;
        this.freight = freight;
        this.shipName = shipName;
        this.shipAddress = shipAddress;
        this.shipCity = shipCity;
        this.shipRegion = shipRegion;
        this.shipPostalCode = shipPostalCode;
        this.shipCountry = shipCountry;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Column(name = "orderId", unique = true)
    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    @ManyToOne
    @JoinColumn(name = "customerID")
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

    @Column(name = "orderDate")
    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    @Column(name = "requiredDate")
    public Date getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(Date requiredDate) {
        this.requiredDate = requiredDate;
    }

    @Column(name = "shippedDate")
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

    @Column(name = "freight")
    public String getFreight() {
        return freight;
    }

    public void setFreight(String freight) {
        this.freight = freight;
    }

    @Column(name = "shipName")
    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    @Column(name = "shipAddress")
    public String getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }

    @Column(name = "shipCity")
    public String getShipCity() {
        return shipCity;
    }

    public void setShipCity(String shipCity) {
        this.shipCity = shipCity;
    }

    @Column(name = "shipRegion")
    public String getShipRegion() {
        return shipRegion;
    }

    public void setShipRegion(String shipRegion) {
        this.shipRegion = shipRegion;
    }

    @Column(name = "shipPostalCode")
    public String getShipPostalCode() {
        return shipPostalCode;
    }

    public void setShipPostalCode(String shipPostalCode) {
        this.shipPostalCode = shipPostalCode;
    }

    @Column(name = "shipCountry")
    public String getShipCountry() {
        return shipCountry;
    }

    public void setShipCountry(String shipCountry) {
        this.shipCountry = shipCountry;
    }
}
