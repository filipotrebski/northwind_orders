package pl.agh.db2.northwind.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.agh.db2.northwind.model.Employee;

@Transactional
@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {

    public Employee getEmployeeById(int id);
    public Employee getAllEmployee();
}
