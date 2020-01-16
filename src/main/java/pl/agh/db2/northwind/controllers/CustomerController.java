package pl.agh.db2.northwind.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.agh.db2.northwind.mapper.CustomerMapper;
import pl.agh.db2.northwind.model.CategoryDto;
import pl.agh.db2.northwind.model.Customer;
import pl.agh.db2.northwind.model.CustomerDto;
import pl.agh.db2.northwind.repository.CustomerDao;
import pl.agh.db2.northwind.service.DbService;

import java.util.List;
import java.util.Optional;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1")
public class CustomerController {

    @Autowired
    private DbService service;

    @Autowired
    private CustomerMapper customerMapper;

    @RequestMapping(method = RequestMethod.GET, value = "/customer")
    List<CustomerDto> getCustomers() {
        return customerMapper.mapToCustomerDtoList(service.getCustomerDao().findAll());
    }


    @RequestMapping(method = RequestMethod.GET, value = "/customer/{id}")
    public CustomerDto getCustomer(@RequestParam  Integer id){
        return customerMapper.mapToCustomerDto(service.getCustomerDao().getOne(id));
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/customer/{id}")
    public void deleteCategory(@RequestParam Integer id) {
        service.getCustomerDao().deleteById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/customer")
    private CustomerDto updateCustomer(@RequestBody CustomerDto customerDto) {
        return customerMapper.mapToCustomerDto(service.getCustomerDao().save(customerMapper.mapToCustomer(customerDto)));
    }

    @RequestMapping(method = RequestMethod.POST, value = "/customer", consumes = APPLICATION_JSON_VALUE)
    public void createCustomer(@RequestBody CustomerDto customerDto) {
        service.getCustomerDao().save(customerMapper.mapToCustomer(customerDto));
    }
}
