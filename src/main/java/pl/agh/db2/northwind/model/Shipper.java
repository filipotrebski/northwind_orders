package pl.agh.db2.northwind.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "SHIPPERS")
public class Shippers {
    private int shipperId;
    private String companyName;
    private String phone;

    public Shippers() {
    }

    public Shippers(String companyName, String phone) {
        this.companyName = companyName;
        this.phone = phone;
    }

    public int getShipperId() {
        return shipperId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getPhone() {
        return phone;
    }

    public void setShipperId(int shipperId) {
        this.shipperId = shipperId;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
