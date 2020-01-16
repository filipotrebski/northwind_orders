package pl.agh.db2.northwind.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.agh.db2.northwind.mapper.EmployeeMapper;
import pl.agh.db2.northwind.model.CategoryDto;
import pl.agh.db2.northwind.model.Employee;
import pl.agh.db2.northwind.model.EmployeeDto;
import pl.agh.db2.northwind.service.DbService;

import java.util.List;
import java.util.Optional;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1")
public class EmployeeController {

    @Autowired
    private DbService service;

    @Autowired
    private EmployeeMapper employeeMapper;

    @RequestMapping(method = RequestMethod.GET, value = "/employee")
    public List<EmployeeDto> getEmployees() {
        return employeeMapper.mapToEmployeeDtoList(service.getEmployeeDao().findAll());
    }

    @RequestMapping(method = RequestMethod.GET, value = "/employee/{id}")
    public EmployeeDto getEmployee(@RequestParam Integer id) {
        return employeeMapper.mapToEmployeeDto(service.getEmployeeDao().getOne(id));
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/employee/{id}")
    public void deleteEmployee(@RequestParam Integer id) {
        service.getEmployeeDao().deleteById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/employee")
    public EmployeeDto updateEmployee(@RequestBody EmployeeDto employeeDto) {
        return employeeMapper.mapToEmployeeDto(service.getEmployeeDao().save(employeeMapper.mapToEmployee(employeeDto)));
    }

    @RequestMapping(method = RequestMethod.POST, value = "/employee", consumes = APPLICATION_JSON_VALUE)
    public void createEmployee(@RequestBody EmployeeDto employeeDto) {
        service.getEmployeeDao().save(employeeMapper.mapToEmployee(employeeDto));
    }
}
