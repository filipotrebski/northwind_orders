package pl.agh.db2.northwind.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//@AllArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity // adnotacja że klasa będzię encją bazy danych
@Table(name = "SUPPLIERS") // tablica i jej właściwości
public class Supplier {
    private Integer supplierID;
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
    private String homePage;
//    private List<Product> products = new ArrayList<>();

    @Id // oznaczamy kolumnę z kluczem
    // tu że nie może być 0
    @GeneratedValue(strategy = GenerationType.IDENTITY) // generowany automatycznie jak coś dodamy
    @Column(name = "SUPPLIERID", unique = true)
    // tu że pole jest kolumną oraż jej właściwości, nzwa oraz ze zaweiera unikalnre wartości
    //te adnotacje tylko przy getterach
    public Integer getSupplierID() {
        return supplierID;
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

    @Column(name = "HOMEPAGE")
    public String getHomePage() {
        return homePage;
    }

    //Określenie powiązania pomędzy tabelami -> jeden supplier wiele produtów, od drugiej też mapujemy
//    @OneToMany(
//            targetEntity = Product.class, //klasa docelowa
//            mappedBy = "supplierId", // mapujemy po supplierID
//            cascade = CascadeType.ALL,
//            fetch = FetchType.LAZY
//    )
//    public List<Product> getProducts() {
//        return products;
//    }


    public void setSupplierID(Integer supplierID) {
        this.supplierID = supplierID;
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

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

//    public void setProducts(List<Product> products) {
//        this.products = products;
//    }
}
