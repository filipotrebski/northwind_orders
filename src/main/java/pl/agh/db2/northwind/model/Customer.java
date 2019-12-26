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
@Entity
@Table(name = "CUSTOMERS")
public class Customer {
    private Integer customerId;
    private String companyName;
    private String contactName;
    private String contactTitle;
    private String address;
    private String city;
    private String region;
    private String postalCode;
    private String country;
    private String phone;
    private String fax;
//    private List<Order> orders;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CUSTOMERID")
    public Integer getCustomerId() {
        return customerId;
    }

    @Column(name = "COMPANYNAME")
    public String getCompanyName() {
        return companyName;
    }

    @Column(name = "CONTACTNAME")
    public String getContactName() {
        return contactName;
    }

    @Column(name = "CONTACTTITLE")
    public String getContactTitle() {
        return contactTitle;
    }

    @Column(name = "ADDRESS")
    public String getAddress() {
        return address;
    }

    @Column(name = "CITY")
    public String getCity() {
        return city;
    }

    @Column(name = "REGION")
    public String getRegion() {
        return region;
    }

    @Column(name = "POSTALCODE")
    public String getPostalCode() {
        return postalCode;
    }

    @Column(name = "COUNTRY")
    public String getCountry() {
        return country;
    }

    @Column(name = "PHONE")
    public String getPhone() {
        return phone;
    }

    @Column(name = "FAX")
    public String getFax() {
        return fax;
    }

//    @OneToMany (
//            targetEntity = Order.class,
//            mappedBy = "orderID",
//            cascade = CascadeType.ALL,
//            fetch = FetchType.EAGER
//    )
//    public List<Order> getOrders() {
//        return orders;
//    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

//    public void setOrders(List<Order> orders) {
//        this.orders = orders;
//    }
}
