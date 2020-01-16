package pl.agh.db2.northwind.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.agh.db2.northwind.model.Employee;

import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

    @Override
    public Employee save(Employee e);

    @Override
    public void delete(Employee e);
}
