package pl.agh.db2.northwind.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CUSTOMERS")
public class Customer {
    private String customerId;
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
    private List<Order> orders;

    @Id
    @NotNull
    @Column(name = "CUSTOMERID")
    public String getCustomerId() {
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

    @OneToMany (
            targetEntity = Order.class,
            mappedBy = "orderID",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Order> getOrders() {
        return orders;
    }

    private void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    private void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    private void setContactName(String contactName) {
        this.contactName = contactName;
    }

    private void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    private void setCity(String city) {
        this.city = city;
    }

    private void setRegion(String region) {
        this.region = region;
    }

    private void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    private void setCountry(String country) {
        this.country = country;
    }

    private void setPhone(String phone) {
        this.phone = phone;
    }

    private void setFax(String fax) {
        this.fax = fax;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
