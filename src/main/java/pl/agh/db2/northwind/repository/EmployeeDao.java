package pl.agh.db2.northwind.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.agh.db2.northwind.model.Employee;

import java.util.Optional;

@Transactional
@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {


    @Override
    Optional<Employee> findById(Integer integer);

    //    public Employee getById(Integer id);
//    public Employee getAllEmployee();
}
