package pl.agh.db2.northwind.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.agh.db2.northwind.model.Customer;
import pl.agh.db2.northwind.repository.CustomerDao;

import java.util.List;
import java.util.Optional;

@Controller
public class CustomerController {

    @Autowired
    CustomerDao customerDaoX;

    @GetMapping("/customer")
    @ResponseBody
    List<Customer> customerList(){
        return (List<Customer>) customerDao.findAll();
    }

    @GetMapping("customer/{id}")
    @ResponseBody
    public Optional<Customer> getCustomerById(@PathVariable Integer id){
        return customerDao.findById(id);
    }
}
