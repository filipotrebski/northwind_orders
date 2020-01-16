package pl.agh.db2.northwind.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "EMPLOYEES")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMPLOYEEID", unique = true)
    private Integer employeeId;

    @NotNull
    @Column(name = "LASTNAME")
    private String lastName;

    @NotNull
    @Column(name = "FIRSTNAME")
    private String firstName;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "TITLEOFCOURTESY")
    private String titleOfCourtesy;

    @Column(name = "BIRTHDATE")
    private Date birthDate;

    @Column(name = "HIREDATE")
    private Date hireDate;

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

    @Column(name = "HOMEPHONE")
    private String homePhone;

    @Column(name = "EXTENSION")
    private String extension;

    @Column(name = "PHOTO")
    private String photo;

    @Column(name = "NOTES")
    private String notes;

    @Column(name = "REPORTSTO", insertable = false, updatable = false)
    private Integer reportsto;

    @Column(name = "PHOTOPATH")
    private String photoPath;

    @OneToMany(mappedBy = "employeeId")
    private Set<Employee> subordinates;
    
}
