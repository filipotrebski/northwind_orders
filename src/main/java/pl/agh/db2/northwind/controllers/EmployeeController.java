package pl.agh.db2.northwind.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.agh.db2.northwind.model.Employee;
import pl.agh.db2.northwind.repository.EmployeeDao;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @GetMapping("/employee/id")
    @ResponseBody
    public Employee employee(@PathVariable Integer id){

        Employee byEmployee = employeeDao.getEmployeeById(id);

        return byEmployee;

    }

    @GetMapping("/employee/all")
    @ResponseBody
    public List<Employee> employeeList(){

        List<Employee> employes = (List<Employee>) employeeDao.findAll();

        return employes;
    }
}
