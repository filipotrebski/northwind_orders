package pl.agh.db2.northwind.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "EMPLOYEES")
public class Employee {
    private Integer employeeId;
    private String lastName;
    private String firstName;
    private String title;
    private String titleOfCourtesy;
    private Date birthDate;
    private Date hireDate;
    private String address;
    private String city;
    private String region;
    private String postalCode;
    private String country;
    private String homePhone;
    private String extension;
    private String photo;
    private String notes;
    private Integer reportsto;
    private String photoPath;
    //private Set<Integer> subordinates = new HashSet<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMPLOYEEID", unique = true)
    public Integer getEmployeeId() {
        return employeeId;
    }

    @NotNull
    @Column(name = "LASTNAME")
    public String getLastName() {
        return lastName;
    }

    @NotNull
    @Column(name = "FIRSTNAME")
    public String getFirstName() {
        return firstName;
    }

    @Column(name = "TITLE")
    public String getTitle() {
        return title;
    }

    @Column(name = "TITLEOFCOURTESY")
    public String getTitleOfCourtesy() {
        return titleOfCourtesy;
    }

    @Column(name = "BIRTHDATE")
    public Date getBirthDate() {
        return birthDate;
    }

    @Column(name = "HIREDATE")
    public Date getHireDate() {
        return hireDate;
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

    @Column(name = "HOMEPHONE")
    public String getHomePhone() {
        return homePhone;
    }

    @Column(name = "EXTENSION")
    public String getExtension() {
        return extension;
    }

    @Column(name = "PHOTO")
    public String getPhoto() {
        return photo;
    }

    @Column(name = "NOTES")
    public String getNotes() {
        return notes;
    }

    @Column(name = "REPORTSTO", insertable = false, updatable = false)
    public Integer getReportsto() {
        return reportsto;
    }

    @Column(name = "PHOTOPATH")
    public String getPhotoPath() {
        return photoPath;
    }


    //@OneToMany(mappedBy = "employeeId")
//    public Set getSubordinates() {
//        return subordinates;
//    }


    private void setEmployeeId(int id) {
        this.employeeId = id;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private void setTitleOfCourtesy(String titleOfCourtesy) {
        this.titleOfCourtesy = titleOfCourtesy;
    }

    private void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    private void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
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

    private void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    private void setExtension(String extension) {
        this.extension = extension;
    }

    private void setPhoto(String photo) {
        this.photo = photo;
    }

    private void setNotes(String notes) {
        this.notes = notes;
    }

    private void setReportsto(Integer reportsTo) {
        this.reportsto = reportsTo;
    }

    private void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }


//    private void setSubordinates(Set subordinates) {
//        this.subordinates = subordinates;
//    }

}
