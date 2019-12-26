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
}