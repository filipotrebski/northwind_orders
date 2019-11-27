package pl.agh.db2.northwind.services;

import pl.agh.db2.northwind.model.Employee;
import pl.agh.db2.northwind.repository.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService  {

    @Autowired
    private EmployeeDao employeeDao;
}
