package pl.agh.db2.northwind.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.agh.db2.northwind.model.Supplier;
import pl.agh.db2.northwind.repository.SupplierDao;

import java.util.Optional;

@Controller
public class SupplierController {

    @Autowired
    SupplierDao supplierDao;

    @GetMapping("/supplier")
    @ResponseBody
    public String supplier() {

        return "supplier";
    }

    @GetMapping("/supplier/{id}")
    @ResponseBody
    public Optional<Supplier> getSupplierById(@PathVariable Integer id) {
        return supplierDao.findById(id);
    }

    @GetMapping("/supplier/all")
    @ResponseBody
    public String allCategory(){

        StringBuilder response = new StringBuilder();

        for(Supplier s: supplierDao.showAllSuppliers()){

            response.append(s.getSupplierID()).append(" ")
                    .append(s.getCompanyName()).append(" ")
                    .append(s.getAddress()).append(" ")
                    .append(s.getCity()).append(" ")
                    .append(s.getContactName()).append(" ")
                    .append(s.getContactTitle()).append(" ")
                    .append(s.getSupplierID()).append(" ")
                    .append(s.getCountry()).append(" ")
                    .append(s.getFax()).append(" ")
                    .append(s.getPhone()).append(" ")
                    .append(s.getPostalCode()).append(" ")
                    .append(s.getRegion()).append(" ")
                    .append("<br>");
        }

        return response.toString();
    }
}