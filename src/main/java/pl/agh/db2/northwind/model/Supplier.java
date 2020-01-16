package pl.agh.db2.northwind.model;

import lombok.*;

import javax.persistence.*;

//@AllArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@EqualsAndHashCode
@Entity // adnotacja że klasa będzię encją bazy danych
@Table(name = "SUPPLIERS") // tablica i jej właściwości
public class Supplier {

    @Id // oznaczamy kolumnę z kluczem
    // tu że nie może być 0
    @GeneratedValue(strategy = GenerationType.IDENTITY) // generowany automatycznie jak coś dodamy
    @Column(name = "SUPPLIERID", unique = true)
    // tu że pole jest kolumną oraż jej właściwości, nzwa oraz ze zaweiera unikalnre wartości
    //te adnotacje tylko przy getterach
    private Integer supplierID;

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

    @Column(name = "HOMEPAGE")
    private String homePage;
//    private List<Product> products = new ArrayList<>();
    
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


//    public void setProducts(List<Product> products) {
//        this.products = products;
//    }
}
