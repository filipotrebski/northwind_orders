package pl.agh.db2.northwind.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ORDERS")
public class Order {
    private int orderId;
    private Customer customerId;
    private Employee employee;
    private Date orderDate;
    private Date requiredDate;
    private Date shippedDate;
    private Shipper shipVia;
    private int freight;
    private String shipName;
    private String shipAddress;
    private String shipCity;
    private String shipRegion;
    private String shipPostalCode;
    private String shipCountry;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ORDERID")
    public int getOrderId() {
        return orderId;
    }

    @ManyToOne
    @JoinColumn(name = "CUSTOMERID")
    public Customer getCustomerId() {
        return customerId;
    }

    @ManyToOne
    @JoinColumn(name = "EMPLOYEEID")
    public Employee getEmployee() {
        return employee;
    }

    @Column(name = "ORDERDATE")
    public Date getOrderDate() {
        return orderDate;
    }

    @Column(name = "REQUIREDDATE")
    public Date getRequiredDate() {
        return requiredDate;
    }

    @Column(name = "SHIPPEDDATE")
    public Date getShippedDate() {
        return shippedDate;
    }

    @Column
    @JoinColumn(name = "SHIPVIA")
    public Shipper getShipVia() {
        return shipVia;
    }

    @Column(name = "FREIGHT")
    public int getFreight() {
        return freight;
    }

    @Column(name = "SHIPNAME")
    public String getShipName() {
        return shipName;
    }

    @Column(name = "SHIPADDRES")
    public String getShipAddress() {
        return shipAddress;
    }

    @Column(name = "SHIPCITY")
    public String getShipCity() {
        return shipCity;
    }

    @Column(name = "SHIPNAME")
    public String getShipRegion() {
        return shipRegion;
    }

    @Column(name = "SHIPPOSTALCODE")
    public String getShipPostalCode() {
        return shipPostalCode;
    }

    @Column(name = "SHIPCOUNTRY")
    public String getShipCountry() {
        return shipCountry;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public void setRequiredDate(Date requiredDate) {
        this.requiredDate = requiredDate;
    }

    public void setShippedDate(Date shippedDate) {
        this.shippedDate = shippedDate;
    }

    public void setShipVia(Shipper shipVia) {
        this.shipVia = shipVia;
    }

    public void setFreight(int freight) {
        this.freight = freight;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }

    public void setShipCity(String shipCity) {
        this.shipCity = shipCity;
    }

    public void setShipRegion(String shipRegion) {
        this.shipRegion = shipRegion;
    }

    public void setShipPostalCode(String shipPostalCode) {
        this.shipPostalCode = shipPostalCode;
    }

    public void setShipCountry(String shipCountry) {
        this.shipCountry = shipCountry;
    }
}
